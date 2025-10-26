/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author ricle
 */
//A classe cubo extende de Forma3D
public class Cubo extends Forma3D{
    private double aresta;
    //Construtor
    public Cubo(double aresta) {
        this.aresta = aresta;
    }
    //Getters e Setters
    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    //Metoddo para obter area do cubo
    @Override
    public double obterArea() {
        if(this.getAresta() > 0){
            double area = 6 * this.getAresta() * this.getAresta();
            return area;
        }
        System.out.println("Erro ao Calcular");
        return 0;
    }
    
    //Metodo pra obter o volume do cubo
    @Override
    public double obterVolume() {
        if(this.getAresta() > 0){
        double volume = Math.pow(this.getAresta(), 3);
        return volume;
        }else{
            System.out.println("Erro ao calcular");
            return 0;
        }
    }
    //toString para as informacoes
    @Override
    public String toString() {
        return "Cubo{" + "aresta = " + aresta + '}';
    }
    
    
}
