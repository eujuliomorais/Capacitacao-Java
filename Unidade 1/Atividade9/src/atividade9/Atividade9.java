package atividade9;
import java.util.Scanner;
/**
 *
 * @author julio mateus morais
 */
public class Atividade9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome completo");
        
        String nome = scanner.nextLine();
        
        String[] nomeDividido = nome.split(" ");
        
        String primeiro = nomeDividido[0];
        String ultimo = nomeDividido[nomeDividido.length - 1];
        
        System.out.println("O primeiro nome é: " + primeiro +
                           " \nO último nome é: " + ultimo);
    }
    
}
