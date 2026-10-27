package Aplicacao;
public class ClienteDiamante extends Cliente {
    public ClienteDiamante(String Nome,String Cpf,String Senha) {
        super(Nome,Cpf,Senha);
        this.desconto = 0.15;
    }
}