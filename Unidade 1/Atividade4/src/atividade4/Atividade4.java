package atividade4;
import java.util.Scanner;
/**
 *
 * @author julio mateus morais
 */
public class Atividade4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número para exibir a tabuada");
        
        int a = scanner.nextInt();
        
        for(int i = 1; i < 11; i++){
            System.out.println(a + " x " + (i) + " = " + (a*i));
        }
        
        
    }
    
}
