package atividade5;
import java.time.LocalDate;

/**
 *
 * @author julio mateus morais
 */
public class Atividade5 {

    public static void main(String[] args) {
        
        ProdutoAlimenticio bolacha = new ProdutoAlimenticio("Bolacha", 5, LocalDate.of(2026, 2, 8));
        
        if(bolacha.estaVencido()){
            System.out.println("Produto vencido");
        }else{
            System.out.println("Produto dentro da validade");
        }
        
    }
    
}
