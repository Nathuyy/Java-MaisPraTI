package Ex02;

public class HistoricoNavegacao {
    private Navegacao head;
    private int tamanho;
    private int limite;

    public HistoricoNavegacao(int limite) {
        this.head = null;
        this.limite = limite;
        this.tamanho = 0;
    }

    public void adicionarNavegacao(String url) {
        if (tamanho >= limite) {
            System.out.println("Tamanha do histórico maior que o limite");
            return;
        }

        Navegacao novaUrl = new Navegacao(url);
        if (head == null) {
            head = novaUrl;
        } else {
            Navegacao atual = head;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = novaUrl;
        }
        tamanho++;
    }

    public void removerNavegacao(String url) {
        if (head == null) {
            System.out.println("Histórico vazio");
            return;
        }

        // Caso a URL a ser removida seja a primeira na lista
        if (head.url.equalsIgnoreCase(url)) {
            head = head.next;
            tamanho--;
            return;
        }

        Navegacao atual = head;
        while (atual.next != null) {
            if (atual.next.url.equalsIgnoreCase(url)) {
                atual.next = atual.next.next;
                tamanho--;
                return;
            }
            atual = atual.next;
        }

        System.out.println("URL não encontrada no histórico");
    }

    public void verHistorico() {
        Navegacao atual = head;
        while (atual != null){
            System.out.println(atual);
            atual = atual.next;
        }
    }
}