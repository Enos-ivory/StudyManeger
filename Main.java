package studyManeger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        StudyManeger study = new StudyManeger();
        Anotations text = new Anotations();
        int option;
        do {

            study.menu();
            option = scanner1.nextInt();
            scanner1.nextLine(); // limpar buffer

            switch (option) {
                case 1 -> {
                    System.out.println("_Nome_da_materia_: ");
                    String nome = scanner1.nextLine();

                    System.out.println("_quantidade_de_tempo_da_materia_: ");
                    int tempo = scanner1.nextInt();

                    System.out.println("_informações_sobre_a_mateira_: ");
                    String info = scanner1.next();

                    study.adicionarMateria(nome, tempo, info);
                }
                case 2 -> {
                    study.listar();
                }
                case 3 ->{
                    System.out.println("_nome_da_materia_: ");
                    String nome = scanner1.nextLine();
                    System.out.println("tempo: ");
                    int tempo = scanner1.nextInt();
                    study.atualizar(nome, tempo);
                }
                case 4 -> {
                    System.out.println("__nome_da_materia__: ");
                    String nome = scanner1.nextLine();
                    study.removerMateria(nome);
                }
                case 5 -> {
                    System.out.println("__soma_tempo_toatal__: ");
                    study.calculartempoTotal();
                }
                case 6 ->{
                    System.out.println("__adcionando__uma__anotação__ ");
                    System.out.println("digite a anotaçõe: ");
                    String anota = scanner1.nextLine();

                    text.adAnotacao(anota);
                    text.showAnotation();
                }
                case 7 ->{
                    System.out.println("\n___listando_as_anotações___");
                    text.showAnotation();
                }
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida!");
            }
        }while (option != 0);
       scanner1.close();

    }
}