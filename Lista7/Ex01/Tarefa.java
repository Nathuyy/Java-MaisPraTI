package Lista7.Ex01;

public class Tarefa {
    private String descricao;
    private boolean completa;
    private Tarefa proxima;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.completa = false;
        this.proxima = null;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void completar() {
        this.completa = true;
    }

    public Tarefa getProxima() {
        return proxima;
    }

    public void setProxima(Tarefa proxima) {
        this.proxima = proxima;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", completa=" + completa +
                '}';
    }
}
