package Lista7.Ex04;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        editor.escreverTexto("Primeiro texto.");
        editor.mostrarTextoAtual();

        editor.escreverTexto("Segundo texto.");
        editor.mostrarTextoAtual();

        editor.escreverTexto("Terceiro texto.");
        editor.mostrarTextoAtual();

        editor.desfazer();
        editor.mostrarTextoAtual();

        editor.desfazer();
        editor.mostrarTextoAtual();

        editor.refazer();
        editor.mostrarTextoAtual();

        editor.refazer();
        editor.mostrarTextoAtual();

        editor.desfazer();
        editor.mostrarTextoAtual();

        editor.desfazer();
        editor.mostrarTextoAtual();

        editor.refazer();
        editor.mostrarTextoAtual();
    }
}
