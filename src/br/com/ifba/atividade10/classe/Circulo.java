/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author ricle
 */
//A classe Circulo extende de Forma2D
public class Circulo extends Forma2D{
    private double raio;

    //Metodo de obter area do ciculo
    @Override
    public double obterArea(){
        if(this.getRaio() > 0){
            return Math.PI * this.getRaio() * this.getRaio();
        }else{
            System.out.println("Erro ao calcular");
            return 0;
        }
    }
    //Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }
    //Getter e Setter
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    //toString para mostrar as informacoes
    @Override
    public String toString() {
        return "Circulo{" + "raio = " + raio + '}';
    }
    
    
    
    
}
