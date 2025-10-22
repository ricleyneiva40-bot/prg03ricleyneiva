/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.classe;

/**
 *
 * @author ricle
 */
public class PagamentoDinheiro implements Pagamento{
    private double valor;
    //Construtor
    public PagamentoDinheiro() {
        this.valor = valor;
    }
    //Getter e Setter
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        //Calcula o valor com o desconto
        if(this.getValor() > 0){
            double valorComDesconto = this.getValor() *0.90;
            return valorComDesconto;
        }
        System.out.println("Sem dinheiro na conta");
            return 0;
    }

    @Override
    public String imprimirRecibo() {
        //Imprimi o recibo de Pagamento em dinheiro
        double valorOriginal = this.getValor();
        double valorDesconto = valorOriginal * 0.10;
        double valorFinal = valorOriginal - valorDesconto;
        
        //Retona o que sera mostrado no Jframe
        return "<html>"+ "<h3>RECIBO DINHEIRO</h3> " + 
                "<p>Valor: " + String.format("%.2f", valorOriginal) + "R$</p>"+
                "<p>Desconto: "+ String.format("%.2f", valorDesconto) + "R$</p>"+ 
                "<p>Valor Final: "+ String.format("%.2f", valorFinal) + "R$</p>" + "</html>";
   
    } 
}
