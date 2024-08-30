package Lista7.Ex04;

public class EstadoTexto {
    private String texto;
    private EstadoTexto anterior;
    private EstadoTexto proximo;

    public EstadoTexto(String texto) {
        this.texto = texto;
        this.anterior = null;
        this.proximo = null;
    }

    public String getTexto() {
        return texto;
    }

    public EstadoTexto getAnterior() {
        return anterior;
    }

    public void setAnterior(EstadoTexto anterior) {
        this.anterior = anterior;
    }

    public EstadoTexto getProximo() {
        return proximo;
    }

    public void setProximo(EstadoTexto proximo) {
        this.proximo = proximo;
    }
}
