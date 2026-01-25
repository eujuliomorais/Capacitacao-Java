package atividade3;
import java.util.Scanner;
/**
 *
 * @author julio mateus morais
 */
public class Atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoEscolhida = 0;
        int a = 0;
        int b = 0;
        
        System.out.println("1 - Somar dois números\n" +
                           "2 - Subtrair dois números\n" +
                           "3 - Sair"); 
        
        opcaoEscolhida = scanner.nextInt();
        
        switch(opcaoEscolhida){
            case 1:
                System.out.println("Digite o primeiro numero");
                a = scanner.nextInt();
                System.out.println("Digite o segundo numero");
                b = scanner.nextInt();
                System.out.println("A soma de " + a + " + " + b + " é " + (a+b));
                break;
            case 2:
                System.out.println("Digite o primeiro numero");
                a = scanner.nextInt();
                System.out.println("Digite o segundo numero");
                b = scanner.nextInt();
                System.out.println("A subtração de " + a + " - " + b + " é " + (a-b));
                break;
            case 3:
                System.out.println("Saindo...");
                break;
        }
        
        
    }
    
}
