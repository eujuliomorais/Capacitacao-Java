package atividade2;

public class Aluno {
    private String nome;
    private float nota;
    private boolean validadeNota = true;
    
    public Aluno(String nome, float nota){
        this.nome = nome;
        this.nota = nota;
    }
    
    public Aluno(){}
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public float getNota(){
        return this.nota;
    }
    
    public void setNota(float nota){
        if(nota >= 0 && nota <= 10){
            this.nota = nota;
        }
        else{
            this.validadeNota = false;
            System.out.println("A nota digitada é inválida");
        }            
    }
    
    public boolean getValidadeNota(){
        return this.validadeNota;
    }
}
