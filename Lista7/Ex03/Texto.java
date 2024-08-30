package Lista7.Ex03;

public class Texto {
    private String texto;
    private Texto proximo;

    public Texto(String texto) {
        this.texto = texto;
        this.proximo = null;
    }

    public String getTexto() {
        return texto;
    }

    public Texto getProximo() {
        return proximo;
    }

    public void setProximo(Texto proximo) {
        this.proximo = proximo;
    }
}
