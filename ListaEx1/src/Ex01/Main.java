package Ex01;

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas novoGerenciador = new GerenciadorTarefas();

        novoGerenciador.adicionarTarefa("commitar isso aqui");
        novoGerenciador.adicionarTarefa("ver a aula");

        System.out.println("Todas Tarefas:");
        novoGerenciador.verTarefas();

        novoGerenciador.removerTarefa("ver a aula");
        novoGerenciador.completarTarefa("commitar isso aqui");

        System.out.println("Todas Tarefas:");
        novoGerenciador.verTarefas();
    }
}
