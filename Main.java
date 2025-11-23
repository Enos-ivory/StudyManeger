package studyManeger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        StudyManeger study = new StudyManeger();
        int option;
        do {
            System.out.println("\n=== GERENCIADOR DE ESTUDOS ===");
            System.out.println("1. Adicionar matéria");
            System.out.println("2. Listar matérias");
            System.out.println("3. Atualizar tempo de estudo");
            System.out.println("4. Excluir matéria");
            System.out.println("5. Tempo total de estudos");
            System.out.println("6. anotacoes ");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner1.nextInt();
            scanner1.nextLine(); // limpar buffer

            switch (option) {
                case 1 -> {
                    System.out.println("Nome da materia: ");
                    String nome = scanner1.next();

                    System.out.println("quantidade de tempo da materia: ");
                    int tempo = scanner1.nextInt();

                    System.out.println("informações sobre a mateira: ");
                    String info = scanner1.next();

                    study.adicionarMateria(nome, tempo, info);
                }
                case 2 -> {
                    study.listar();
                }
                case 3 ->{
                    System.out.println("nome da materia: ");
                    String nome = scanner1.nextLine();
                    System.out.println("tempo: ");
                    int tempo = scanner1.nextInt();
                    study.atualizar(nome, tempo);
                }
                case 4 -> {
                    System.out.println("nome da materia: ");
                    String nome = scanner1.nextLine();
                    study.removerMateria(nome);
                }
                case 5 -> {
                    System.out.println("soma tempo toatal: ");
                    study.calculartempoTotal();
                }
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida!");
            }
        }while (option != 0);
       scanner1.close();

    }
}