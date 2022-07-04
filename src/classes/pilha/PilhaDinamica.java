package classes.pilha;

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
}