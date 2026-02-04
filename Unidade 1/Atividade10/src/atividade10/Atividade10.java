package atividade10;
import java.util.Scanner;

/**
 *
 * @author julio mateus morais
 */
public class Atividade10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua frase");
        String frase = scanner.nextLine();
        String[] palavras = frase.trim().split(" ");
        int contador = palavras.length;
        
        System.out.println("A frase possui " + contador + " palavras");
    }
    
}
