package classes.pilha;
import java.util.Stack;
import classes.Livro;

public class Pilha<T> extends Stack {

    private T[] elementos;
    private int tamanho;

    public Pilha(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Pilha(){
        this(10);
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    //metodo push da pilha
    public boolean empilha(Livro elemento){
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = (T) elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public T desempilha(){
        if(this.estaVazia()){
            return null;
        }
        /*
        T elemento = this.elementos[tamanho-1];
        tamanho--;
        return elemento;
        */
        return this.elementos[--tamanho];
    }

	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

    public int tamanho(){
        return this.tamanho;
    }

    @Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[ \n");
		
		for (int i = 0; i < this.tamanho - 1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
}