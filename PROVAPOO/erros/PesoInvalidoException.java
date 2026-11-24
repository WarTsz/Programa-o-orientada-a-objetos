package erros;
public class PesoInvalidoException extends RuntimeException {
    final static String mensagem = "O peso não pode ser negativo";
    public PesoInvalidoException() {
        super(mensagem);
    }
}