/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03ricleyneiva;


import br.com.ifba.atividade10.classe.Circulo;
import br.com.ifba.atividade10.classe.Cubo;
import br.com.ifba.atividade10.classe.Esfera;
import br.com.ifba.atividade10.classe.Forma;
import br.com.ifba.atividade10.classe.Forma2D;
import br.com.ifba.atividade10.classe.Forma3D;
import br.com.ifba.atividade10.classe.Piramide;
import br.com.ifba.atividade10.classe.Quadrado;
import br.com.ifba.atividade10.classe.Triangulo;



/**
 *
 * @author ricle
 */

public class Prg03ricleyneiva {
    public static void main(String[] args){
       //Cria im array de 6 posicoes do tipo Forma
       Forma formas[] = new Forma[6];
       
       //Preenche o array com os objetos das classes q Herdam de Forma
       formas[0] = new Circulo(4);
       formas[1] = new Quadrado(6);
       formas[2] = new Triangulo(5, 8);
       formas[3] = new Cubo(7);
       formas[4] = new Esfera(5);
       formas[5] = new Piramide(4, 6);
        
       //Percorre o array, utilizando o for-each
       for (Forma f : formas) {
           //Mostra as informacaoes
           System.out.println(f.toString());
           //Verifica se a forma é 2D
        if (f instanceof Forma2D) {
            System.out.println("Area: " + ((Forma2D) f).obterArea());
            //Se nao for 2D, é 3D
    }       else if (f instanceof Forma3D) {
                System.out.println("Area: " + ((Forma3D) f).obterArea());
                System.out.println("Volume: " + ((Forma3D) f).obterVolume());
    }

            System.out.println();
}
    }
}
