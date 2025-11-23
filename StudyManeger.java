package studyManeger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudyManeger {
   private List<Subjects> listSubject = new ArrayList<>();

    public void menu(){
        System.out.println("\n=== GERENCIADOR DE ESTUDOS ===");
        System.out.println("1. Adicionar matéria");
        System.out.println("2. Listar matérias");
        System.out.println("3. Atualizar tempo de estudo");
        System.out.println("4. Excluir matéria");
        System.out.println("5. Tempo total de estudos");
        System.out.println("6. adcionar anotações ");
        System.out.println("7. listar anotações ");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    public void adicionarMateria(String nome, int tempo,String info) {
        listSubject.add(new Subjects(nome, tempo, info));
        System.out.println("Matéria adicionada com sucesso!");
    }

   void listar(){
       if(listSubject.isEmpty()){
           System.out.println("Sem  materias cadastradas. ");
       }else {
           listSubject.forEach(System.out::println);
       }
   }

   public void atualizar(String nome, int NovoTempo){
       for(Subjects l: listSubject ){
           if (l.getName().equalsIgnoreCase(nome)) {
               l.setTime(NovoTempo);
               System.out.println("tempo atualizado.  ");
                return;
           }
       }
   }

   public void removerMateria(String nome){
       boolean removida = listSubject.removeIf(l -> l.getName().equalsIgnoreCase(nome));
       if (removida){
           System.out.println("materia removida. ");
       }else {
           System.out.println("materia nao encontrada. ");
       }
   }

   public void calculartempoTotal(){
       int total = listSubject.stream().mapToInt(Subjects::getTime).sum();
       System.out.println("tempo total em minutos: " + total);
   }
}


