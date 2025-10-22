/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.classe;

/**
 *
 * @author ricle
 */
public class PagamentoPix implements Pagamento{
    private double valor;
    
    //Contrutor
    public PagamentoPix() {
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
        if(this.getValor() > 0){
            double valorComCash = this.getValor();
            return valorComCash;
        }
        System.out.println("Sem dinheiro na conta");
        return 0;
    }

    @Override
    public String imprimirRecibo() {
        double valorOriginal = this.getValor();
        double valorCash = this.getValor() * 0.02;
        double valorFinal = valorOriginal;
        
        return "<html>"+ "<h3>RECIBO PIX</h3>"+ 
                "<p>Valor: " + String.format("%.2f", valorOriginal) + "R$</p>"+ 
                "<p>Cashback: "+ String.format("%.2f", valorCash) + "R$</p>"+
                "<p>Valor Final: "+ String.format("%.2f", valorFinal)+ "R$ " + "e mais "+ String.format("%.2f", valorCash) + " de cashback para sua conta!</p>"+ "</html>";

    }
    
    
}
