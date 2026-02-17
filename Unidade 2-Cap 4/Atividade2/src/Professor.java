public class Professor {
    private String nome;
    private Departamento departamento;

    public Professor(String nome, Departamento departamento){
        this.nome = nome;
        this.departamento = departamento;
    }

    public void imprimirDepartamento(){
        System.out.println("O departamento do professor " + this.nome + " é " + departamento.getNome());
    }
}
