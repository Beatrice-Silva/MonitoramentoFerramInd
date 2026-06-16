/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.monitoramento.main.controller;


import com.monitoramento.main.model.FerramentaDTO;
import com.monitoramento.main.service.FerramentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



/**
 *
 * @author Aluno
 */
@Controller
public class FerramentaController {
    
    @Autowired 
    private FerramentaService service;
  
    @GetMapping("/ferramentas")
    public String listarFerramenta(
    @RequestBody FerramentaDTO ferramenta
    
    ){
        return "index";
    }
    
    @PostMapping("/ferramentas/salvar")
    public String receberFerramenta(@ModelAttribute FerramentaDTO ferramenta,
    RedirectAttributes redirectAttributes
    ){
        service.criarFerramenta(ferramenta);
        return "index";
        
        //chamar metodo persistencia manual
 
    }
       
        
    
    
    
    
}
