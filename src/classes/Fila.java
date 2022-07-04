package classes;

public class Fila<T> {

    public T[] elementos;
    public T[] elementosJ;
    private int tamanho;

    public Fila() {
        this(10);
    }

    public Fila(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.elementosJ = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public boolean enfileirar(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean inverterFila() {
  
        int j = elementos.length - 1;
        if (this.tamanho < this.elementos.length) {
            for (int i = 0; i < elementos.length; i++) {
                this.elementosJ[i] = this.elementos[j];
                j--;
            } 
            j = 0;
            for (int i = 0; i < elementos.length; i++) {
                this.elementos[i] = this.elementosJ[j];
                j++;
            }   
            return true;        
        }   
        return true;     
    }
    
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileira() {

        final int POS = 0;

        if (this.estaVazia()) {
            return null;
        }
        T elementoRemovido = this.elementos[POS];
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return elementoRemovido;

    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho  - 1; i++) {
            if (this.elementos[i] != null && (i >= 1)){                
                s.append(this.elementos[i]);
                s.append(", ");
            }
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
