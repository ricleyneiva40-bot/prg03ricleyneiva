/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.classe;

/**
 *
 * @author ricle
 */
public class PagamentoCartao implements Pagamento{
    private double valor;
    private int getValor;
    
    //Construtor
    public PagamentoCartao() {
        this.valor = valor;
    }
    
    //Getter e Setter
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //Metodos da logica da interface
    @Override
    public double calcularTotal() {
        if(this.getValor() > 0){
            double valorComTaxa = this.getValor() + (this.getValor() * 0.05);
            return valorComTaxa;
        }
        System.out.println("Sem dinheiro na conta!");
        return 0;
    }

    @Override
    public String imprimirRecibo() {
        double valorOriginal = this.getValor();
        double valorTaxa = valorOriginal * 0.05;
        double valorFinal = valorOriginal + valorTaxa;
        
        return "<html> "+ "<h3>RECIBO CARTAO</h3>" + 
                "<p>Valor: " + String.format("%.2f", valorOriginal) + "R$</p>"+ 
                "<p>Taxa: "+ String.format("%.2f", valorTaxa) + "R$</p>"+
                "<p>Valor Final: "+ String.format("%.2f", valorFinal) + "R$</p>" + "</html>";
        
    }
}
