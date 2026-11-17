package erros;

public class AlunoNaoExistenteException extends RuntimeException {
    public static final String msg = "Você só pode atribuir nota a um aluno";
    public AlunoNaoExistenteException() {
        super(msg);
    }
}
