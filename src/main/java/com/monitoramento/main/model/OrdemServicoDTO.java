/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.monitoramento.main.model;

import java.sql.Date;

/**
 *
 * @author Aluno
 */
public class OrdemServicoDTO {
    
    private Long id;
    private Long id_ferramenta;
    private Object id_usuario_tecnico;
    private String descricao;
    private Date data_abertura;
    private Date data_fechamento;
    private String status;

    public OrdemServicoDTO() {
    }

    public OrdemServicoDTO(Long id, Long id_ferramenta, Object id_usuario_tecnico, String descricao, Date data_abertura, Date data_fechamento, String status) {
        this.id = id;
        this.id_ferramenta = id_ferramenta;
        this.id_usuario_tecnico = id_usuario_tecnico;
        this.descricao = descricao;
        this.data_abertura = data_abertura;
        this.data_fechamento = data_fechamento;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_ferramenta() {
        return id_ferramenta;
    }

    public void setId_ferramenta(Long id_ferramenta) {
        this.id_ferramenta = id_ferramenta;
    }

    public Object getId_usuario_tecnico() {
        return id_usuario_tecnico;
    }

    public void setId_usuario_tecnico(Object id_usuario_tecnico) {
        this.id_usuario_tecnico = id_usuario_tecnico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(Date data_abertura) {
        this.data_abertura = data_abertura;
    }

    public Date getData_fechamento() {
        return data_fechamento;
    }

    public void setData_fechamento(Date data_fechamento) {
        this.data_fechamento = data_fechamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
