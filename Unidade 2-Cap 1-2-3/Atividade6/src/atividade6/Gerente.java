package atividade6;

public class Gerente extends Funcionario{
    private String departamento;
    
    public Gerente(String nome, float salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
}
