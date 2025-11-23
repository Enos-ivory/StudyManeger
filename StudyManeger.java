package studyManeger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudyManeger {
   private List<Subjects> listSubject = new ArrayList<>();


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


