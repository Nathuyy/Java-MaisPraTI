package Ex04;

public class Controle {
    private No cabeca;
    private No atual;

    public void ListaDuplamenteEncadeada() {
        this.cabeca = null;
        this.atual = null;
    }

    public void adicionarAcao(String acao) {
        No novoNo = new No(acao);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            atual.proximo = novoNo;
            novoNo.anterior = atual;
        }
        atual = novoNo;
    }

    public String desfazer() {
        if (atual == null) {
            return "Nenhuma ação para desfazer.";
        }
        String acaoDesfeita = atual.acao;
        atual = atual.anterior;
        return "Desfeito: " + acaoDesfeita;
    }

    public String refazer() {
        if (atual == null || atual.proximo == null) {
            return "Nenhuma ação para refazer.";
        }
        atual = atual.proximo;
        return "Refeito: " + atual.acao;
    }

    public void imprimirAcoes() {
        No temp = cabeca;
        System.out.println("Ações realizadas:");
        while (temp != null) {
            if (temp == atual) {
                System.out.print("(Atual) ");
            }
            System.out.println(temp.acao);
            temp = temp.proximo;
        }
    }
}
