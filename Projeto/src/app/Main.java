package app;

import controller.TaskManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        TaskManager listaTarefas = new TaskManager();

        int opcao;

        String titulo;
        String descricao;
        boolean concluida = false;

        while(true){
            System.out.println(
                    "\n=====GERENCIADOR DE TAREFAS=====" +
                            "\n1. Criar nova tarefa" +
                            "\n2. Listar tarefas" +
                            "\n3. Marcar tarefa como concluída" +
                            "\n4. Remover tarefa" +
                            "\n5. Sair" +
                            "\nEscolha uma opção:"
            );
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 1){
                titulo = scanner.nextLine();
                descricao = scanner.nextLine();
                listaTarefas.adicionarTarefa(titulo, descricao, concluida);
            }
            else if(opcao == 2){
                listaTarefas.listarTarefas();
            }
            else if(opcao == 3){

            }
        }
    }

}
