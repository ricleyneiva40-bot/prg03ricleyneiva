/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import java.util.List;

/**
 *
 * @author ricle
 */
public class PerfilUsuario {
    private Long id;
    private String descricao;
    private List<String> permissoes;

    //Contrutor
    public PerfilUsuario(Long id, String descricao, List<String> permissoes) {
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }
    //Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }
    //Metodo to String, ele vai descrever o seu objeto em formato de String
    public String toString(){
        return "Perfil do Usuario{" + "id = "+ id + " ," + 
                "descricao: "+ descricao + " ," + 
                "permissoes "+ permissoes + "}";
    }
    
    
    
    
}
