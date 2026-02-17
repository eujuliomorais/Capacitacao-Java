package atividade5;
import java.time.LocalDate;

public class ProdutoAlimenticio extends Produto{
    private LocalDate dataValidade;
    
    public ProdutoAlimenticio(String nome, float preco, LocalDate dataValidade){
        super(nome, preco);
        this.dataValidade = dataValidade;
    }
    
    public boolean estaVencido(){
        LocalDate hoje = LocalDate.now();
        
        return hoje.isAfter(dataValidade);
    }

    public LocalDate getDataValidade(){
        return this.dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade){
        this.dataValidade = dataValidade;
    }
}