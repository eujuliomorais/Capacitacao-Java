package model;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private boolean concluida;

    public Tarefa(int id, String titulo, String descricao, boolean concluida){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public int getId(){return this.id;}

    public String getTitulo(){return this.titulo;}

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public boolean getConcluida(){
        return concluida;
    }

    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }
}
