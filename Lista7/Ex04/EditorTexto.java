package Lista7.Ex04;

public class EditorTexto {
    private EstadoTexto estadoAtual;

    public EditorTexto() {
        this.estadoAtual = null;
    }

    public void escreverTexto(String texto) {
        EstadoTexto novoEstado = new EstadoTexto(texto);
        if (estadoAtual != null) {
            estadoAtual.setProximo(novoEstado);
            novoEstado.setAnterior(estadoAtual);
        }
        estadoAtual = novoEstado;
        System.out.println("Texto salvo: " + texto);
    }

    public void desfazer() {
        if (estadoAtual != null && estadoAtual.getAnterior() != null) {
            System.out.println("Desfazendo ação. Texto removido: " + estadoAtual.getTexto());
            estadoAtual = estadoAtual.getAnterior();
        } else {
            System.out.println("Não há ações para desfazer.");
        }
    }

    public void refazer() {
        if (estadoAtual != null && estadoAtual.getProximo() != null) {
            estadoAtual = estadoAtual.getProximo();
            System.out.println("Refazendo ação. Texto atual: " + estadoAtual.getTexto());
        } else {
            System.out.println("Não há ações para refazer.");
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
