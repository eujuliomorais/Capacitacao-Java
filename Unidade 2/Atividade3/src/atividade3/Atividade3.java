package atividade3;

/**
 *
 * @author julio mateus morais
 */
public class Atividade3 {

    public static void main(String[] args) {
        
        Produto produto = new Produto("Sabão", 10, 50);
        
        produto.setPreco(12);
        produto.setQuantidadeEstoque(49);
        
        System.out.println("Produto: " + produto.getNome() + "\nPreço: " + produto.getPreco() + "\nEstoque: " + produto.getQuantidadeEstoque());
        
    }
    
}
