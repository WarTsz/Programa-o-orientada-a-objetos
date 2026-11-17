package erros;

public class NotaInvalidaException extends RuntimeException {
    public static final String msg = "Nota invalida\nA nota deve ser um valor entre 0 e 10";
    public NotaInvalidaException() {
        super(msg);
    }
}
