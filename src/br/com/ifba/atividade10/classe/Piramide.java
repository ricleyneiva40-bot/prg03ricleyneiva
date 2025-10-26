/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author ricle
 */
//A classe Piramide Extende de Forma3d
public class Piramide extends Forma3D{
    private double lado;
    private double base;
    //Construtor
    public Piramide(double lado, double base) {
        this.base = base;
        this.lado = lado;
    }
    //getters e setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    //Metodo pra obter a area da piramide 
    @Override
    public double obterArea() {
        if(this.getBase() <= 0 && this.getLado() <= 0){
            System.out.println("Erro ao calcular");
            return 0;
        }
        double a = this.lado;   
        double h = this.base;   

        // apotema da face lateral
        double l = Math.sqrt(Math.pow(a / 2.0, 2) + Math.pow(h, 2));

        
        double areaBase = a * a;

        // área lateral (4 triângulos) = 2 * a * l
        double areaLateral = 2.0 * a * l;

        // área total
        return areaBase + areaLateral;
    }

    //Metodo para obter o volume da piramide
    @Override
    public double obterVolume() {
        if(this.getBase() <= 0 && this.getLado() <= 0){
            System.out.println("Erro no Calculo");
            return 0;
        }
        double a = this.getLado();
        double h = this.getBase();
        
        double volume = (a * a * h) / 3;
        
        return volume;
        
    }
    //toStrig para as informacoes de piramide
    @Override
    public String toString() {
        return "Piramide{" + "lado = " + lado + ", base = " + base + '}';
    }

}
