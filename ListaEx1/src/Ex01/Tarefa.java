package Ex01;

public class Tarefa {
    String descricao;
    boolean completa;
    Tarefa next; //referencia o próximo nó na lista encadeada

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.completa = false;
        this.next = null;

    }

    void marcarCompleta() {
        this.completa = true;
    }

    @Override
    public String toString() {
        return descricao + " [" + (completa ? "Concluída" : "Pendente") + "]";
    }
}

