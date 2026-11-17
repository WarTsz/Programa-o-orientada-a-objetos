package erros;

public class BimestreInvalidoException extends RuntimeException {
        public static final String msg = "O bimestre colocado é inválido\n";
    public BimestreInvalidoException() {
        super(msg);
    }
}
