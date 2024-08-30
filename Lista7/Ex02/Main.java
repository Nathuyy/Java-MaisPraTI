package Lista7.Ex02;

public class Main {
    public static void main(String[] args) {
        Navegacao novaNavegacao = new Navegacao();

        novaNavegacao.adicionarUrl("www.google.com");
        novaNavegacao.adicionarUrl("www.maisPraTI.com");
        novaNavegacao.adicionarUrl("www.linkedin.com");

        novaNavegacao.listarHistorico();

        novaNavegacao.removerUrl(2);
    }
    
}
