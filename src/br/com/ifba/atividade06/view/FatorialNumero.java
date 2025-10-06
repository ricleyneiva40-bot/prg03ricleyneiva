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
    
    private int numero = 0;
    private int fatorial = 1;
    private String formula = "";
    
    public void setValor(int n){
        numero = n;
        int f = 1;
        String s = "";
        
        for(int c = n; c > 1; c--){
            f = f * c;
            s = s + c + " x ";
        }
        s = s + "1 = ";
        fatorial = f;
        formula = s;
    }
    
    public int getFatorial(){
        return fatorial;
    }
    
    public String getFormula(){
        return formula;
    }
        
}
