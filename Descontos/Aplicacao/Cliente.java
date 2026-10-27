package Aplicacao;
public class Cliente extends Pessoa{
    protected double desconto = 0;
    public Cliente(String nome,String cpf,String senha) {
        super(nome,cpf,senha);
    }
    public double getDesconto() {
        return desconto;
    }
}