package Ex02;

public class Main {
    public static void main(String[] args) {
        HistoricoNavegacao novoHistorico = new HistoricoNavegacao(5);

        novoHistorico.adicionarNavegacao("https://classroom.google.com/w/NjcxNTM1OTA1NjE4/t/all");
        novoHistorico.adicionarNavegacao("https://web.whatsapp.com/");

        novoHistorico.verHistorico();

        novoHistorico.removerNavegacao("https://web.whatsapp.com/");
        novoHistorico.verHistorico();

    }
}
