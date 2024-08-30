package Lista7.Ex02;

public class Navegacao {
    private Historico primeiro;

    public Navegacao() {
        this.primeiro = null;
    }

    public void adicionarUrl(String url) {
        Historico novoHistorico = new Historico(url);
        if (primeiro == null) {
            primeiro = novoHistorico;
        } else {
            Historico atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoHistorico);
        }
        System.out.println("Histórico adicionado " + url);
    }

    public void removerUrl(int indice) {
        if (primeiro == null) {
            System.out.println("Nenhum histórico para remover.");
            return;
        }

        if (indice == 0) {
            System.out.println("Histórico removido: " + primeiro.getUrl());
            primeiro = primeiro.getProximo();
            return;
        }

        Historico atual = primeiro;
        Historico anterior = null;
        int contador = 0;

        while (atual != null && contador < indice) {
            anterior = atual;
            atual = atual.getProximo();
            contador++;
        }

        if (atual != null) {
            anterior.setProximo(atual.getProximo());
            System.out.println("Histórico removido: " + atual.getUrl());
        } else {
            System.out.println("Histórico não encontrado no índice: " + indice);
        }
    }

    public void listarHistorico() {
        Historico atual = primeiro;
        int contador = 0;
        while (atual != null) {
            System.out.println(contador + ": " + atual);
            atual = atual.getProximo();
            contador++;
        }
    }
}
