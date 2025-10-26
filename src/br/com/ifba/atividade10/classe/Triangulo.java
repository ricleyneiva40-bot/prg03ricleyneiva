/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classe;

/**
 *
 * @author ricle
 */
//a classe triangulo extende de Forma2D
public class Triangulo extends Forma2D{
    private double base;
    private double altura;
    //Construtor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //Getters e Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Metodo de obter area do triangulo
    @Override
    public double obterArea() {
        if(this.getBase() > 0 && this.getAltura() > 0){
            double area = (this.getBase() * this.getAltura()) / 2;
            return area;
        }else{
            System.out.println("Erro ao Calcular");
            return 0;
        }
    }
    //toString para mostar informacoes
    @Override
    public String toString() {
        return "Triangulo{" + "base = " + base + ", altura = " + altura + '}';
    }
    
    
    
}
