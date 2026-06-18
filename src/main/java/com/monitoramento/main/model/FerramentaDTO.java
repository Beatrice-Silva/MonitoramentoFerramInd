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
    
    private Long id;
    private Object id_galpao;
    private Object id_usuario_responsavel;
    private String nome;
    private Integer horasDeUso;
    private Integer vidaUtilMaxima;
    private String status;
    
    public FerramentaDTO() {
    }

    public FerramentaDTO(Long id, Long id_galpao, Long id_usuario_responsavel, String nome, int horasDeUso, int vidaUtilMaxima, String status) {
        this.id = id;
        this.id_galpao = id_galpao;
        this.id_usuario_responsavel = id_usuario_responsavel;
        this.nome = nome;
        this.horasDeUso = horasDeUso;
        this.vidaUtilMaxima = vidaUtilMaxima;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Object getId_galpao() {
        return id_galpao;
    }

    public void setId_galpao(Long id_galpao) {
        this.id_galpao = id_galpao;
    }

    public Object getId_usuario_responsavel() {
        return id_usuario_responsavel;
    }

    public void setId_usuario_responsavel(Long id_usuario_responsavel) {
        this.id_usuario_responsavel = id_usuario_responsavel;
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

    public void setHorasDeUso(int horasDeUso) {
        this.horasDeUso = horasDeUso;
    }

    public int getVidaUtilMaxima() {
        return vidaUtilMaxima;
    }

    public void setVidaUtilMaxima(int vidaUtilMaxima) {
        this.vidaUtilMaxima = vidaUtilMaxima;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public double getPercentualDesgaste( ){
        
        double percenDesg = (horasDeUso / vidaUtilMaxima) * 100;
        return percenDesg;
    }
    
    
    
    
    
}
