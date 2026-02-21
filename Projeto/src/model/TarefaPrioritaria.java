package model;

public class TarefaPrioritaria extends Tarefa{
    private boolean prioridade;

    public TarefaPrioritaria(int id, String titulo, String descricao, boolean concluida, boolean prioridade){
        super(id, titulo, descricao, concluida);
        this.prioridade = prioridade;
    }

}
