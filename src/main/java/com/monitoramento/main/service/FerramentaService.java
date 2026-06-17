/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.monitoramento.main.service;

import com.monitoramento.main.model.FerramentaDTO;
import com.monitoramento.main.repository.FerramentaDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author Aluno
 */
@Service
public class FerramentaService {
    
    @Autowired
    private FerramentaDAO repository;
    
    public void criarFerramenta(FerramentaDTO f){
        if(f.getNome().equals("")){
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Campo 'nome' está vazio!");
        }
        if(f.getVidaUtilMaxima() <= 0){
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Campo 'vida útil máxima' útil máxima' está vazio!");
        }
        if(f.getHorasDeUso() < 0){
            f.setHorasDeUso(0);
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Campo 'horas de uso' está vazio!");
        }
        
        int linhas = repository.salvarFerram(f);
        if(linhas == 0){
        throw new ResponseStatusException(HttpStatusCode.valueOf(500), "Erro ao adicionar ao Banco de dados!");    
        }
        //repository.salvarFerram(f);
    }
    
    public List<FerramentaDTO> listarFerram(){
        return repository.listarFerramenta();
    }
    
       public void deletarFerramenta(FerramentaDTO ferramenta,
               int id){
        repository.deletarFerram(id);
    }
    
    public void atualizarFerramenta(int id){
        repository.atualizarFerram(id);
        
    }
    
    
}
