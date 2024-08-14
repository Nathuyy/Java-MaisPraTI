package Ex01;

public class GerenciadorTarefas {
    private Tarefa head; //primeiro nó da lista simples encadeada

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        if (head == null){
            head = novaTarefa;
        } else {
            Tarefa atual = head;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = novaTarefa;
        }
    }

    public void removerTarefa(String descricao){
        if (head == null) {
            System.out.println("Sem tarefas.");
            return;
        } else if (head.descricao.equalsIgnoreCase(descricao)) {
            head = head.next;
            return;
        }

        Tarefa atual = head;
        while (atual.next != null){
            if (atual.next.descricao.equalsIgnoreCase(descricao)) {
                atual.next = atual.next.next;
                return;
            }
            atual = atual.next;
        }
    }

    public void completarTarefa(String descricao) {
        Tarefa atual = head;
        while(atual != null) {
            if (atual.descricao.equalsIgnoreCase(descricao)) {
                atual.marcarCompleta();
                return;
            }
            atual = atual.next;
        }
    }
}
