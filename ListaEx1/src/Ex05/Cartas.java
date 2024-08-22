package Ex05;

public class Cartas {
    private String valor;
    private String naipe;

    public void Carta(String valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}
