package atividade8;

public class FuncionarioCLT extends Funcionario{
    
    public FuncionarioCLT(String nome, int diasTrabalhados){
        super(nome, diasTrabalhados);
    }
    
    @Override
    public double calcularSalario(){
        return this.diasTrabalhados * 180;
    }
    
}
