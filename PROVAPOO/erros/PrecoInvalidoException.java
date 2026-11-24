package erros;
public class PrecoInvalidoException extends RuntimeException {
    final static String mensagem = "O preço não pode ser nulo ou negativo";
    public PrecoInvalidoException() {
        super(mensagem);
    }
}