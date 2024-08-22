package Ex04;

public class No {
    String acao;
    No proximo;
    No anterior;

    public No(String acao) {
        this.acao = acao;
        this.proximo = null;
        this.anterior = null;
    }
}
