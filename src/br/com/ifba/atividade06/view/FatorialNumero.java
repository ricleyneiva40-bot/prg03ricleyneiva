/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06.view;

/**
 *
 * @author ricle
 */
public class FatorialNumero {
    
    private int numero = 0; //Variavel numero
    private int fatorial = 1; //Varialvel do valor do fatorial
    private String formula = ""; //Formula do fatorial
    
    public void setValor(int n){
        numero = n;
        int f = 1;
        String s = "";
        
        //Contador para fazer o calculo do fatorial
        for(int c = n; c > 1; c--){
            f = f * c;
            s = s + c + " x ";
        }
        s = s + "1 = ";
        fatorial = f; //O campo fatorial recebe f
        formula = s; //O campo formula recebe s 
    }
    
    public int getFatorial(){
        //Retorna o fatorial
        return fatorial;
    }
    
    public String getFormula(){
        //Retorna a formula
        return formula;
    }
        
}
