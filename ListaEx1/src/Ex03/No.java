package Ex03;

public class No {
    String acao;
    No proximo;

    public No(String acao) {
        this.acao = acao;
        this.proximo = null;
    }

    public No(String acao, No proximo) {
        this.acao = acao;
        this.proximo = proximo;
    }
}
