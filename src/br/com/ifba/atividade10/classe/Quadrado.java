/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author ricle
 */
//A classe Quadrado extende de Forma2D
public class Quadrado extends Forma2D{
    private double lado;
    //Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }
    //Getter e Setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    //Metodo de obter area do quadrado
    @Override
    public double obterArea() {
        if(this.getLado() > 0){
            double area = this.getLado() * this.getLado();
            return area;
        }else{
            System.out.println("Erro ao calcular");
            return 0;
        }
    }
    //toString para mostrar informacoes
    @Override
    public String toString() {
        return "Quadrado{" + "lado = " + lado + '}';
    }
    
    
    
}
