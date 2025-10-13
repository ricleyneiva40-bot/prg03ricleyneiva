/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03ricleyneiva;

import br.com.ifba.atividade07.ContaBanco;



/**
 *
 * @author ricle
 */

public class Prg03ricleyneiva {
    public static void main(String[] args){
        //Informacoes e dados do Objeto 1
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(1100);
        conta1.setDono("Ricley");
        conta1.abrirConta("CC");
        conta1.depositar(200);
        conta1.sacar(100);
        conta1.pagarMensal();
        
        //Informacoes de dados do Objeto 2
        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(2200);
        conta2.setDono("Geovana");
        conta2.abrirConta("CP");
        conta2.depositar(200);
        conta2.sacar(50);
        conta2.pagarMensal();
      
        
        
        conta1.informacoesConta();
        conta2.informacoesConta();
        
    }
}
