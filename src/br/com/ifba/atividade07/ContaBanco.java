/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author ricle
 */
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Metodo auxiliar pra mostrar as informacoes
    public void informacoesConta(){
        System.out.println("---------------------------------------");
        System.out.println("Numero da conta: "+ getNumConta());
        System.out.println("Nome do Usuario: "+ getDono());
        System.out.println("Tipo da conta: "+ getTipo());
        System.out.println("Saldo da Conta: "+ getSaldo());
        System.out.println("Status da conta: "+ getStatus());
    }
    //Metodo pra abrir conta
    public void abrirConta(String tipoConta){
        this.setTipo(tipoConta);
        this.setStatus(true);
        
        if (this.getTipo() == "CP") {
            this.setSaldo(150);
        } else if (this.getTipo() == "CC") {
            this.setSaldo(50);
        }else{
            System.out.println("Erro, opcao invalida!");
        }
    }
    //Metodo pra fechar a conta
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Erro, voce ainda tem dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Erro, voce ainda possui debito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    //metodo de depositar
    public void depositar(float valor){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito feito com sucesso!");
        }else{
            System.out.println("Erro ao Depositar!");
        }
    }
    //Metodo de sacar
    public void sacar(float valor){
        if(this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso, pelo dono "+ this.getDono());
            }
        }
    }
    //Metodo de pagar
    public void pagarMensal(){
        int valor = 0;
                
        if(this.getTipo() == "CC"){
            valor = 12;
        } 
        else if(this.getTipo() == "CP"){
            valor = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade foi paga pelo dono: "+ this.getDono());
        }else{
            System.out.println("Impossivel fazer o pagamento!");
        }
    }
    //Metodo contrutor
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    //setters e getters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
