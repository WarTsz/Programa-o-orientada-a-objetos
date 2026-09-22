public class MensalidadeInvalidaExpection extends RuntimeException {
    final static String mensagem = "A mensalidade não se adequa aos termos da academia";
    MensalidadeInvalidaExpection() {
        super(mensagem);
    }
}