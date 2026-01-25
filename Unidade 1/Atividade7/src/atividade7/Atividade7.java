package atividade7;
import java.util.Scanner;
/**
 *
 * @author julio mateus morais
 */
public class Atividade7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro não-negativo");
        
        int numDigitado = scanner.nextInt();
        int acumulador = numDigitado;
        
        for(int i = (numDigitado - 1); i > 0; i--){
            acumulador *= i;
        }
        
        System.out.println("O fatorial de " + numDigitado + " é " + acumulador);
    }
    
}
