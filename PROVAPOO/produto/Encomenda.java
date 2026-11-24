package produto;
import user.*;
import erros.*;
public class Encomenda {
    private String descricao;
    private int peso;
    private Remetente remetente;
    public Encomenda(String descricao,int peso,Remetente remetente) throws PesoInvalidoException {
        if (peso<0) {
            throw new PesoInvalidoException();
        }
        this.descricao = descricao;
        this.peso = peso;
        this.remetente = remetente;

    }
    public int getPeso() {
        return this.peso;
    }
    public Remetente getRemetente() {
        return this.remetente;
    }
}