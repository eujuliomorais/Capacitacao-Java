package atividade8;
import java.util.Scanner;
/**
 *
 * @author julio mateus morais
 */
public class Atividade8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1 - Dizer \"Olá\"\n" +
                               "2 - Dizer \"Tchau\"\n" +
                               "3 - Encerrar");
            int opcao = scanner.nextInt();
            
            if(opcao == 1){
                System.out.println("Olá");
            }
            else if(opcao == 2){
                System.out.println("Tchau");
            }
            else if(opcao == 3){
                break;
            }else{
                System.out.println("A opção digitada é inválida");
            }
        }
    }
    
}
