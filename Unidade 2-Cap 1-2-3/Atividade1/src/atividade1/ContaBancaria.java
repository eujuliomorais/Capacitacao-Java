package atividade1;

public class ContaBancaria {
    private int numero;
    private String titular; 
    private float saldo;
    
    public ContaBancaria(int numero, String titular, float saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void depositar(int valorDep){
        this.saldo += valorDep;
    }
    
    public void sacar(int valorSaq){
        this.saldo -= valorSaq;
    }
    
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public float getSaldo(){
        return saldo;
    }
}
