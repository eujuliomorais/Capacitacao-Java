package atividade5;
import java.util.Scanner;
/**
 *
 * @author julio mateus morais
 */
public class Atividade5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua frase");
        
        String frase = scanner.nextLine();
        
        String frasenova = frase.replace('e', '*').replace('E', '*');
        
        System.out.println(frasenova);
    }
    
}
