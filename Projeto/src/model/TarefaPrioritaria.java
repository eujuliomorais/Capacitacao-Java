package model;

public class TarefaPrioritaria extends Tarefa{
    private boolean prioridade;

    public TarefaPrioritaria(String titulo, String descricao, boolean concluida, boolean prioridade){
        super(titulo, descricao, concluida);
        this.prioridade = prioridade;
    }

}
