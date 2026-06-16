/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.monitoramento.main.controller;


import com.monitoramento.main.model.FerramentaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author Aluno
 */
@RestController
@RequestMapping("/api/editais")
public class FerramentaController {
  
    
    @GetMapping
    public String getPercentualDesgaste(
    @RequestBody FerramentaDTO ferramenta
    ){
        
        return "index";
        
    }
       
        
    
    
    
    
}
