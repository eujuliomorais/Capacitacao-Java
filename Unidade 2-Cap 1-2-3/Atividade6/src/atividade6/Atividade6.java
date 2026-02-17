package atividade6;

/**
 *
 * @author julio mateus morais
 */
public class Atividade6 {

    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Julio Mateus Morais", 2000, "TI");
                
        System.out.println("Nome: " + gerente.getNome() + 
                            "\nSalario: " + gerente.getSalario() + 
                            "\nDepartamento: " + gerente.getDepartamento());
    }
    
}
