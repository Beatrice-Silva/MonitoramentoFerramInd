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
        int linhas = 0;
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement("INSERT INTO tb_ferramenta(nome,horas_uso,vidautilmax) "
                    + "VALUES(?,?,?)");
               
                stmt.setString(1,ferramenta.getNome());
                stmt.setInt(2,ferramenta.getHorasDeUso());
                stmt.setInt(3,ferramenta.getVidaUtilMaxima());
                
            
                linhas = stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return linhas;
        
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
    
    public int deletarFerram(int id){
        int linhas = 0;
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement("DELETE \n" +
            "FROM tb_ferramenta\n" +
            "WHERE id = ? ;");
            stmt.setInt(1, id);
            
            linhas =stmt.executeUpdate();
          
        }catch(SQLException e){
            e.printStackTrace();
        }
        return linhas;
    }
    
    
    public int atualizarFerram(FerramentaDTO ferramenta){
        int linhas = 0;
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("UPDATE tb_ferramenta SET nome= ?, horas_uso = ?, vidautilmax = ? where id = ?");
            
                stmt.setString(1,ferramenta.getNome());
                stmt.setInt(2,ferramenta.getHorasDeUso());
                stmt.setInt(3,ferramenta.getVidaUtilMaxima());
               
                stmt.setInt(4,ferramenta.getId());
            linhas = stmt.executeUpdate();            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return linhas;
    }
    
    
}
