package classes;

public class Contato implements Comparable<Contato> {

    private String nome;
    private String telefone;
    private int prioridade;

    public Contato(String nome, String telefone,  int prioridade) {
        this.nome = nome;
        this.telefone = telefone;
        this.prioridade = prioridade;
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }  

    @Override
    public int compareTo(Contato o) {
        // obj1 > obj2 return > 0 (1)
        // obj1 < obj2 return < 0 (-1)
        // obj1 == obj2 return 0
        if(this.prioridade > o.getPrioridade()){
            return 1;
        }else if(this.prioridade < o.getPrioridade()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Contato [nome = " + nome + ", telefone = " + telefone + "]";
    }    

}
