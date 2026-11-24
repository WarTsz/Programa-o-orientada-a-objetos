package user;
public class Remetente extends Pessoa{
    private String nome;
    private String telefone;
    public Remetente(String nome,String telefone) {
        super(nome);
        this.telefone = telefone; 
    }
}