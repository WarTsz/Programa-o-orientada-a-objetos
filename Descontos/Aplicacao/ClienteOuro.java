package Aplicacao;
public class ClienteOuro extends Cliente {
    public ClienteOuro(String Nome,String Cpf,String Senha) {
        super(Nome,Cpf,Senha);
        this.desconto = 0.1;
    }
}