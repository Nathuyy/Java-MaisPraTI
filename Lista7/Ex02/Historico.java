package Lista7.Ex02;

public class Historico {
    private String url;
    private Historico proximo;

    public Historico(String url) {
        this.url = url;
        this.proximo = null;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Historico getProximo() {
        return proximo;
    }

    public void setProximo(Historico proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Historico [url=" + url + ", proximo=" + proximo + "]";
    }

    


}
