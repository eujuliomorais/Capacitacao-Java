package model;

public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean concluida;

    public Tarefa(String titulo, String descricao, boolean concluida){
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public String getTitulo(){
        return this.titulo;
    }

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
