/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import java.time.LocalDateTime;

/**
 *
 * @author ricle
 */
public class LogAuditoria {
    //Atributos
    private Long id;
    private Usuario usuario;
    private String acao;
    private String dataHora;
    private String ip;
    //Construtor
    public LogAuditoria(Long id, Usuario usuario, String acao, String dataHora, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.acao = acao;
        this.dataHora = dataHora;
        this.ip = ip;
    }
    //getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    //Metodo toString para fazer o objeto em formato de String
    public String toString(){
        return "Log de Auditoria{"+ "id: "+ id + " ,"
                + "Usuario: "+ (usuario != null ? usuario.getNomeUsuario(): "Sem nome") + 
                " ,"+ "Acao: "+ acao + " ,"
                + "Data e Hora: "+ dataHora + " ,"+ "IP "+ ip + "}";
    }
    
    
}
