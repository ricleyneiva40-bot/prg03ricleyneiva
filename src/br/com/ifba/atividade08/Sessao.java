/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author ricle
 */
public class Sessao {
    //Atributos
    private Long id;
    private Usuario usuario;
    private String token;
    //Construtor
    public Sessao(Long id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }
    //Getters e Setters
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    //Metodo toString para a escrita to objeto em String
    public String toString(){
        return "Sessao{"+ "id: "+ id + " ,"+ "Usuario: "+ (usuario != null ? usuario.getNomeUsuario(): "Sem nome")+ 
                " ,"+ "Token: "+ token + "}";
    }
    
    
    
}
