/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.monitoramento.main.repository;

import com.monitoramento.main.model.FerramentaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aluno
 */
@Repository
public class FerramentaDAO {
    
    
    public int salvarFerram(FerramentaDTO ferramenta){
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement("INSERT tb_ferramenta(nome,horas_uso,vidautilmax) VALUEs(?,?,?)");
               
                stmt.setString(1,ferramenta.getNome());
                stmt.setString(1,ferramenta.getNome());
                stmt.setString(1,ferramenta.getNome());
                stmt.setString(1,ferramenta.getNome());
                
            return stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
        
    }
    
    public List<FerramentaDTO> listarFerramenta(){
        List<FerramentaDTO> ferramentas = new ArrayList();
        
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM tb_ferramenta");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                FerramentaDTO ferramenta = new FerramentaDTO();
                
                ferramenta.setId(rs.getInt("id"));
                ferramenta.setNome(rs.getString("nome"));
                ferramenta.setHorasDeUso(rs.getInt("horas_uso"));
                ferramenta.setVidaUtilMaxima(rs.getInt("vidautilmax"));
                
                ferramentas.add(ferramenta);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return ferramentas;
    }
    
    public deletarFerram(){
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM tb_ferramenta");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                FerramentaDTO ferramenta = new FerramentaDTO();
                
                ferramenta.setId(rs.getInt("id"));
                ferramenta.setNome(rs.getString("nome"));
                ferramenta.setHorasDeUso(rs.getInt("horas_uso"));
                ferramenta.setVidaUtilMaxima(rs.getInt("vidautilmax"));
                
                ferramentas.add(ferramenta);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return ferramentas;
        
    }
    
    
    public deletarFerram(){
        
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM tb_ferramenta");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                FerramentaDTO ferramenta = new FerramentaDTO();
                
                ferramenta.setId(rs.getInt("id"));
                ferramenta.setNome(rs.getString("nome"));
                ferramenta.setHorasDeUso(rs.getInt("horas_uso"));
                ferramenta.setVidaUtilMaxima(rs.getInt("vidautilmax"));
                
                ferramentas.add(ferramenta);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return ferramentas;
    }
    
    
    
    
}
