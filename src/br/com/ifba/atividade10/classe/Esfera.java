/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author ricle
 */
//A classe Esfera extende de Forma3D
public class Esfera extends Forma3D{
    private double raio;
    //Construtor
    public Esfera(double raio) {
        this.raio = raio;
    }
    //getter e setters
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    //Metodo pra descobrir a area da esfera
    @Override
    public double obterArea() {
        if(this.getRaio() > 0){
            double area = Math.PI * 4 * this.getRaio() * this.getRaio();
            return area;
        }
        System.out.println("Erro ao Calcular");
        return 0;
    }

    //Metodo pra descobrir o volume da esfera
    @Override
    public double obterVolume() {
        if(this.getRaio() > 0){
            double volume = (4.0 / 3.0) * Math.PI * this.getRaio() * this.getRaio() * this.getRaio();
            return volume;
        }
        System.out.println("Erro ao calcular");
        return 0;
    }
    //toString para informacoes
    @Override
    public String toString() {
        return "Esfera{" + "raio = " + raio + '}';
    }
    
    
}
