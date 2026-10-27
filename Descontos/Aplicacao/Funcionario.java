package Aplicacao;
public class Funcionario extends Pessoa{
    private int id;
    public Funcionario(String nome,String cpf,String senha,int id) {
        super(nome,cpf,senha);
        this.id = id;
    }
}