package Ex03;

public class Controle {
    private No head;

    public Controle() {
        this.head = null;
    }

    public void adicionarAcao(String acao) {
        No novoNo = new No(acao);
        novoNo.proximo = head;
        head = novoNo;
    }

    public String removerAcao(String acao) {
        No atual = head;
        No anterior = null;
        
        while (atual != null) {
            if (atual.acao.equalsIgnoreCase(acao)) {
                if (anterior == null) {
                    head = atual.proximo;
                } else {
                    anterior.proximo = atual.proximo;
                }
                return "Ação '" + acao + "' removida com sucesso.";
            }
            anterior = atual;
            atual = atual.proximo;
        }
        return "Ação '" + acao + "' não encontrada.";
    }
}
