package atividade6;
import java.util.Scanner;
/**
 *
 * @author julio mateus morais
 */
public class Atividade6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nomes = {"Maria", "João", "Carlos", "Ana", "Beatriz"};
        
        System.out.println("Digite um nome");
        
        String nomeDigitado = scanner.nextLine();
        
        boolean encontrado = false;
        
        for(String percorrer : nomes){
            if(percorrer.equalsIgnoreCase(nomeDigitado)){
                encontrado = true;
                break;
            }
        }
        
        if(encontrado){
            System.out.println("Sim, o nome " + nomeDigitado + " está no Array!");
        }else{
        System.out.println("O nome " + nomeDigitado + " não está no Array");
        }
    }
    
}
