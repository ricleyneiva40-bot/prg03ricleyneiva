/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prg03ricleyneiva;

import br.com.ifba.atividade09.classe.PagamentoCartao;
import br.com.ifba.atividade09.classe.PagamentoDinheiro;
import br.com.ifba.atividade09.classe.PagamentoPix;



/**
 *
 * @author ricle
 */

public class Prg03ricleyneiva {
    public static void main(String[] args){
        PagamentoDinheiro p = new PagamentoDinheiro();
        p.calcularTotal();
        p.imprimirRecibo();
        
        PagamentoCartao pag = new PagamentoCartao();
        pag.calcularTotal();
        pag.imprimirRecibo();
        
        PagamentoPix pagamento = new PagamentoPix();
        pagamento.calcularTotal();
        pagamento.imprimirRecibo();
    }
}
