public class Main {
    public static void main(String[] args) {

        Departamento departamento = new Departamento("TI");
        Departamento departamento2 = new Departamento("Comunicação");


        Professor professor = new Professor("João", departamento);
        Professor professor2 = new Professor("Pedro", departamento2);

        professor.imprimirDepartamento();
        professor2.imprimirDepartamento();
    }
}