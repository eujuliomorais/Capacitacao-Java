package atividade8;

public class FuncionarioPJ extends Funcionario{
    
    public FuncionarioPJ(String nome, int diasTrabalhados){
        super(nome, diasTrabalhados);
    }
    
    @Override
    public double calcularSalario(){
        return this.diasTrabalhados * 200;
    }
}
