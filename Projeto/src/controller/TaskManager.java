package controller;

import model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Tarefa> tarefas;

    public TaskManager(){
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(int id, String titulo, String descricao, boolean concluida){
        tarefas.add(new Tarefa(id, titulo, descricao, concluida));
        System.out.println("------------------------------------Tarefa adicionada com sucesso");
    }

    public void listarTarefas(){
        for(Tarefa a : tarefas){
            System.out.println("------------------------------------================================");
            System.out.println("------------------------------------ID: " + a.getId() +
                                "\n------------------------------------Título: " + a.getTitulo() +
                                "\n------------------------------------Descricao: " + a.getDescricao() +
                                "\n------------------------------------Status: " + (a.getConcluida() == true ? "Concluída" : "Não-Concluída"));
        }
    }

    public void concluirTarefa(Tarefa tarefa){
        if(tarefas.contains(tarefa)){
            tarefa.setConcluida(true);
        }else{
            System.out.println("------------------------------------Não foi possível concluir. Tarefa não localizada!");
        }
    }

    public void removerTarefa(int removerID){
        for(Tarefa a : tarefas){
            if(a.getId() == removerID){
                tarefas.remove(a);
                System.out.println("------------------------------------Tarefa " + a.getId() + " removida com sucesso");
                break;
            }
        }
    }
}
