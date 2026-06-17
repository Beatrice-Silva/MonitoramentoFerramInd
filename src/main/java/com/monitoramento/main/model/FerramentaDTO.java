/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.monitoramento.main.model;

/**
 *
 * @author Aluno
 */
public class FerramentaDTO {
    
    private int id;
    private String nome;
    private int horasDeUso;
    private int vidaUtilMaxima;

    public FerramentaDTO() {
    }

    public FerramentaDTO(int id, String nome, int horasDeUso, int vidaUtilMaxima) {
        this.id = id;
        this.nome = nome;
        this.horasDeUso = horasDeUso;
        this.vidaUtilMaxima = vidaUtilMaxima;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasDeUso() {
        return horasDeUso;
    }
    
    public double getPercentualDesgaste( ){
        
        double percenDesg = (horasDeUso / vidaUtilMaxima) * 100;
        return percenDesg;
    }

    public void setHorasDeUso(int horasDeUso) {
        this.horasDeUso = horasDeUso;
    }

    public int getVidaUtilMaxima() {
        return vidaUtilMaxima;
    }

    public void setVidaUtilMaxima(int vidaUtilMaxima) {
        this.vidaUtilMaxima = vidaUtilMaxima;
    }
    
    
    
    
    
}
