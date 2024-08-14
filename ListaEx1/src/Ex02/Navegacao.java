package Ex02;

public class Navegacao {
    String url;
    Navegacao next;

    public Navegacao(String url) {
        this.url = url;
        this.next = null;
    }

    @Override
    public String toString() {
        return url;
    }
}
