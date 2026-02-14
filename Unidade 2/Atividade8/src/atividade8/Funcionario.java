package atividade8;

public abstract class Funcionario {
    protected String nome;
    protected int diasTrabalhados;
    
    public Funcionario(String nome, int diasTrabalhados){
        this.nome = nome;
        this.diasTrabalhados = diasTrabalhados;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public abstract double calcularSalario();
}
