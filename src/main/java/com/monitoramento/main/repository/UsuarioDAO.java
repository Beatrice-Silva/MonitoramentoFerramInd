/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.monitoramento.main.repository;

import com.monitoramento.main.model.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aluno
 */
@Repository
public class UsuarioDAO {
    
    public UsuarioDTO autenticar(String login, String senha){
        UsuarioDTO usuario = new UsuarioDTO();
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM usuarios WHERE login = ? AND senha = ?");
            
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return usuario;
    }
    
    public UsuarioDTO autenticar(String login, String senha){
        UsuarioDTO usuario = new UsuarioDTO();
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("INSERT INTO usuario(login, senha) VALUES (?,?);");
            
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return usuario;
    }
    
    
    
}
