/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ricle
 */
public class Teste {
    public static void main(String[] args){
        PerfilUsuario perfilAdm = new PerfilUsuario(10L, "Administrador", Arrays.asList(
                "Criar usuario",
                "Excluir usuario",
                "Editar usuario"
        ));
        PerfilUsuario perfilUser = new PerfilUsuario(20L, "Usuario comum", Arrays.asList("Ver Perfil", "Configuracoes"));
        
        Usuario usuario1 = new Usuario(1001L, perfilAdm, "Ricley", "ricleyn6482@gmail.com", "***********", true);
        Usuario usuario2 = new Usuario(3002L, perfilUser, "Fernando", "fernanod383@gmail.com", "*******", true);
        
        Sessao s1 = new Sessao(5555L, usuario1, "TOKEN27849742");
        
        LogAuditoria log = new LogAuditoria(2233L, usuario1, "Tentativa de login", "17/10/2025, as 09:32", "192.433.0.");
        
        System.out.println(perfilAdm);
        System.out.println(perfilUser);
        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(s1);
        System.out.println(log);
        
        
        
    }
}
