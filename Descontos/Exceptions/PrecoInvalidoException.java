package Exceptions;
public class PrecoInvalidoException extends RuntimeException{
    final static String msg = "O preco não pode ser negativo";
    public PrecoInvalidoException() {
        super(msg);
    }
}