import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Aluno> alunos;

    Curso(String nome){
        this.nome = nome;
        alunos = new ArrayList<>();
    }

    public void addAlunos(Aluno aluno){
        alunos.add(aluno);
    }

    public void removeAlunos(Aluno aluno){
        if(alunos.contains(aluno)){
            alunos.remove(aluno);
        }else{
        System.out.println("O aluno não existe na lista");
        }
    }

    public void listarAluno(){
        for(Aluno a : alunos){
            System.out.println(a.getNomeAluno());
        }
    }

}
