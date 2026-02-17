package atividade4;

/**
 *
 * @author julio mateus morais
 */
public class Atividade4 {

    public static void main(String[] args) {
        
        Engenheiro engenheiro = new Engenheiro();
        
        engenheiro.setNome("Julio Mateus Morais");
        engenheiro.setMatricula(123);
        engenheiro.setCrea(11111);
        
        System.out.println("Nome: " + engenheiro.getNome() + 
                            "\nMatricula: " + engenheiro.getMatricula() + 
                            "\nCREA: " + engenheiro.getCrea());
    }
    
}
