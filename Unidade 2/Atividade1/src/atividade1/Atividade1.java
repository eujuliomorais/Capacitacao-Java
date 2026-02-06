package atividade1;

/**
 *
 * @author julio mateus morais
 */
public class Atividade1 {

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria(123,"Julio Mateus Morais", 0);
        
        conta.depositar(500);
        conta.sacar(50);
        
        System.out.println("Olá " + conta.getTitular() + " \nSeu saldo atual é de: " + conta.getSaldo());
    }
    
}
