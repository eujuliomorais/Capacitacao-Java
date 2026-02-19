public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso("Capacitação em Java");

        Aluno aluno1 = new Aluno("Julio");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("João");

        curso.addAlunos(aluno1);
        curso.addAlunos(aluno2);
        curso.addAlunos(aluno3);

        curso.listarAluno();

        curso.removeAlunos(aluno1);

        curso.listarAluno();
    }
}