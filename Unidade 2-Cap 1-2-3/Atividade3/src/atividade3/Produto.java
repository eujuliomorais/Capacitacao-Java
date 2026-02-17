package atividade3;

public class Produto {
    private String nome;
    private float preco;
    private int quantidadeEstoque;
    
    public Produto(String nome, float preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public int getQuantidadeEstoque(){
        return this.quantidadeEstoque;
    }
    
    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
