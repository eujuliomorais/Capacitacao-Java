package atividade2;

/**
 *
 * @author julio mateus morais
 */
public class Atividade2 {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        
        aluno.setNome("Julio Mateus Morais");
        aluno.setNota(10);
        
        if(aluno.getValidadeNota()){
            System.out.println("A nota de " + aluno.getNome() + " é " + aluno.getNota());
        }
    }
    
}
