import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import classes.Contato;
import classes.Fila;
import classes.FilaDinamica;
import classes.Livro;
import classes.pilha.No;
import classes.pilha.Pilha;
import classes.pilha.PilhaDinamica;

public class App {
    public static void main(String[] args) throws Exception {
            
        
        List<Contato> contato = new ArrayList<>();
        List<Livro> livro = new ArrayList<>();
        Pilha<String> pilhaLivros = new Pilha<>(20);
        FilaDinamica<Integer> filaDinamica = new FilaDinamica<Integer>(10);
        Fila<Object> fila = new Fila<Object>(7);
        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        ///////////////////////////////////////////////////////////// EXERCICIO 3
        System.out.println("Exercicio 3");   
        Contato c1 = new Contato("Carlos", "3499999-9999", 1);
        Contato c2 = new Contato("João", "3496532-4523", 2);
        Contato c3 = new Contato("Lorraine", "3498512-7851", 3);
        Contato c4 = new Contato("Isabela", "3492167-5620");
        contato.add(c1);
        contato.add(c2);
        contato.add(c3);
        contato.add(c4);

        ///////////////////////////////////////////////////////////// EXERCICIO 4
        System.out.println("\n\nExercicio 4");         
        Livro l1 = new Livro("Nome 1", 2452, 2021, "Autor 1");
        Livro l2 = new Livro("Nome 2", 2987, 2020, "Autor 2");
        Livro l3 = new Livro("Nome 3", 3365, 2003, "Autor 3");
        Livro l4 = new Livro("Nome 4", 7924, 2019, "Autor 4");
        Livro l5 = new Livro("Nome 5", 7936, 2010, "Autor 5");
        Livro l6 = new Livro("Nome 6", 9452, 2022, "Autor 6");
        
        pilhaLivros.empilha(l1);
        pilhaLivros.empilha(l2);
        pilhaLivros.empilha(l3);
        pilhaLivros.empilha(l4);
        pilhaLivros.empilha(l5);
        pilhaLivros.empilha(l6);

        System.out.println(pilhaLivros);
        System.out.println("\nTamanho da pilha: "+ pilhaLivros.tamanho()+ "\n");
        pilhaLivros.desempilha();
        System.out.println(pilhaLivros);
        System.out.println("\nTamanho da pilha: "+ pilhaLivros.tamanho());
        System.out.println("A pilha está vazia? "+ pilhaLivros.estaVazia());
        pilhaLivros.empilha(l6);
        System.out.println("\nTamanho da pilha: "+ pilhaLivros.tamanho());
        System.out.println(pilhaLivros);

        ///////////////////////////////////////////////////////////// EXERCICIO 7
        System.out.println("\n\nExercicio 7");        
        filaDinamica.enfileirar(1);
        filaDinamica.enfileirar(4);
        filaDinamica.enfileirar(5);
        filaDinamica.enfileirar(2);
        System.out.println("Fila dinamica normal: " + filaDinamica.toString());
        filaDinamica.inverterFila();
        System.out.println("Fila dinamica invertida: " + filaDinamica.toString());

        fila.enfileirar(1);
        fila.enfileirar(4);
        fila.enfileirar(5);
        fila.enfileirar(2);
        System.out.println("Fila impressa normal: " + fila.toString());
        fila.inverterFila();
        System.out.println("Fila invertida: " + fila.toString());


        /////////////////////////////////////////////////////////////////// EXERCICIO 8
        System.out.println("\n\nExercicio 8");
        System.out.println("Digite um nome: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();         
        
        System.out.println("Nome: " + nome);

        System.out.println("Nome invertido: " + pilhaDinamica.inverterString(nome));
        
        

     }
}
