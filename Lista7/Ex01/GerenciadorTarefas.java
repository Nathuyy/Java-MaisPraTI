package Lista7.Ex01;

public class GerenciadorTarefas {
    private Tarefa primeira;

    public GerenciadorTarefas() {
        this.primeira = null;
    }

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        if (primeira == null) {
            primeira = novaTarefa;
        } else {
            Tarefa atual = primeira;
            while (atual.getProxima() != null) {
                atual = atual.getProxima();
            }
            atual.setProxima(novaTarefa);
        }
        System.out.println("Tarefa adicionada: " + descricao);
    }

    public void removerTarefa(int indice) {
        if (indice == 0 && primeira != null) {
            System.out.println("Tarefa removida: " + primeira.getDescricao());
            primeira = primeira.getProxima();
        } else {
            Tarefa atual = primeira;
            Tarefa anterior = null;
            int contador = 0;
            while (atual != null && contador < indice) {
                anterior = atual;
                atual = atual.getProxima();
                contador++;
            }
            if (atual != null) {
                System.out.println("Tarefa removida: " + atual.getDescricao());
                anterior.setProxima(atual.getProxima());
            } else {
                System.out.println("Tarefa não encontrada no índice: " + indice);
            }
        }
    }

    public void completarTarefa(int indice) {
        Tarefa atual = primeira;
        int contador = 0;
        while (atual != null && contador < indice) {
            atual = atual.getProxima();
            contador++;
        }
        if (atual != null) {
            atual.completar();
            System.out.println("Tarefa marcada como completa: " + atual.getDescricao());
        } else {
            System.out.println("Tarefa não encontrada no índice: " + indice);
        }
    }

    public void listarTarefas() {
        Tarefa atual = primeira;
        int contador = 0;
        while (atual != null) {
            System.out.println(contador + ": " + atual);
            atual = atual.getProxima();
            contador++;
        }
    }
}
