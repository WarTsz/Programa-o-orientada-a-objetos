package Exceptions;

public class CompraNaoRealizadaException extends RuntimeException{
    final static String msg = "A compra não foi concluída";
    public CompraNaoRealizadaException() {
        super(msg);
    }
    
}
