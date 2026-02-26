package app;

import controller.TaskManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        TaskManager listaTarefas = new TaskManager();

        int opcao;
        int incrementeID = 0;

        String titulo;
        String descricao;
        boolean concluida = false;

        try {
            while (true) {
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

                if (opcao == 1) {
                    incrementeID += 1;

                    System.out.println("Digite o título da nova tarefa:");
                    titulo = scanner.nextLine();

                    System.out.println("Digite a descrição da tarefa");
                    descricao = scanner.nextLine();

                    listaTarefas.adicionarTarefa(incrementeID, titulo, descricao, concluida);
                } else if (opcao == 2) {
                    listaTarefas.listarTarefas();
                } else if (opcao == 3) {

                } else if (opcao == 4) {
                    int removerID = 0;
                    System.out.println("\nDigite o ID da tarefa a ser removida");
                    removerID = scanner.nextInt();
                    listaTarefas.removerTarefa(removerID);
                } else if (opcao == 5) {
                    System.out.println("\nPrograma encerrado!");
                    break;
                } else {
                    System.out.println("Digite uma opção válida");
                }
            }
        }
        catch(Exception e){
            System.out.println("Você digitou uma entrada inválida. Por essa razão o programa foi finalizado!");
        }
    }

}
