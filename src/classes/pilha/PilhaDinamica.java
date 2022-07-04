package classes.pilha;

import java.util.Stack;

public class PilhaDinamica {

    private No topo;
    private int tamanho; //o tamanho da pilha;

    //adiciona um elemento ao topo da pilha (push)
    public void empilhar(No novoElemento){
        if(topo == null){
            topo = novoElemento;
        }else{
            novoElemento.setProx(topo);
            topo = novoElemento;
        }
        tamanho++;
    }

    //remove o topo da pilha
    public No desempilhar(){
        if(topo == null){
            return null;
        }
        No aux = topo;
        topo = topo.getProx();
        aux.setProx(null);
        tamanho--;
        return aux;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void imprimir(){
        System.out.print("Topo ");
        No aux = topo;
        while(aux != null){
            System.out.print(aux.getData() + " -> ");
            aux = aux.getProx();
        }
        System.out.println("Fim\n\n\n");
    }
    
    public Stack<Integer> inverterPilha(Stack<Integer> pilha){

        Stack<Integer> pilhaInvertida = new Stack<>();

        for (int i = pilha.size() - 1; i >= 0; i--) {
            pilhaInvertida.add(pilha.get(i));
        }
        pilha.clear();
        for (int i = 0; i < pilhaInvertida.size(); i++) {
            pilha.add(pilhaInvertida.get(i));
        }
        return pilha;
    }

    public String inverterString(String str){
		char[] ch = str.toCharArray();
	    int begin = 0;
	    int end = ch.length-1;
	    char temp;
	    while(end>begin){
	        temp = ch[begin];
	        ch[begin] = ch[end];
	        ch[end] = temp;
	        end--;
	        begin++;
	    }
	    str = new String(ch);
        return str;
    }
}