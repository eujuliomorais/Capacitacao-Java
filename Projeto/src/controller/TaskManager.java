package controller;

import model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Tarefa> tarefas;

    public TaskManager(){
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String titulo, String descricao, boolean concluida){
        tarefas.add(new Tarefa(titulo, descricao, concluida));
        System.out.println("Tarefa adicionada com sucesso");
    }

    public void listarTarefas(){
        for(Tarefa a : tarefas){
            System.out.println("================================");
            System.out.println("Título: " + a.getTitulo() +
                                "\nDescricao: " + a.getDescricao() +
                                "\nStatus: " + (a.getConcluida() == true ? "Concluída" : "Não-Concluída"));
        }
    }

    public void concluirTarefa(Tarefa tarefa){
        if(tarefas.contains(tarefa)){
            tarefa.setConcluida(true);
        }else{
            System.out.println("Não foi possível concluir. Tarefa não localizada!");
        }
    }

    public void removerTarefa(Tarefa tarefa){
        if(tarefas.contains(tarefa)){
            tarefas.remove(tarefa);
        }else{
            System.out.println("Não foi possível remover. Tarefa não localizada!");
        }
    }
}
