package Lista7.Ex03;

public class EditorTexto {
    private Texto estadoAtual;

    public EditorTexto() {
        this.estadoAtual = null;
    }

    public void escreverTexto(String texto) {
        Texto novoEstado = new Texto(texto);
        novoEstado.setProximo(estadoAtual);
        estadoAtual = novoEstado;
        System.out.println("Texto salvo: " + texto);
    }

    public void desfazer() {
        if (estadoAtual != null) {
            System.out.println("Desfazendo ação. Texto removido: " + estadoAtual.getTexto());
            estadoAtual = estadoAtual.getProximo();
        } else {
            System.out.println("Não há ações para desfazer.");
        }
    }

    public void mostrarTextoAtual() {
        if (estadoAtual != null) {
            System.out.println("Texto atual: " + estadoAtual.getTexto());
        } else {
            System.out.println("Nenhum texto para mostrar.");
        }
    }
}
