package atividade8;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author julio mateus morais
 */
public class Atividade8 {

    public static void main(String[] args) {
        
        List<Funcionario> funcionarios = new ArrayList<>();
        
        funcionarios.add(new FuncionarioCLT("Julio Mateus", 20));
        funcionarios.add(new FuncionarioPJ("Maria", 20));
        funcionarios.add(new FuncionarioCLT("João", 22));
        funcionarios.add(new FuncionarioPJ("Pedro", 22));
        
        for(Funcionario a : funcionarios){
            System.out.println("Nome: " + a.getNome() + " | Salário: " + a.calcularSalario());
        }
        
    }
    
}
