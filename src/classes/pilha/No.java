package classes.pilha;

public class No {

    private String data;
    private No prox;

    public No (String data){
        this.data = data;
    }

    public No (String data, No prox){
        this.data = data;
        this.prox = prox;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}