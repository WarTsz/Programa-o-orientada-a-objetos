package erros;

public class ValorInvalidoException extends RuntimeException {
    static final String msg = "O valor do pagamento não pode ser nulo ou negativo";
    public ValorInvalidoException() {
        super(msg);
    }
}
