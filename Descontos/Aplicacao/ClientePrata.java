package Aplicacao;
public class ClientePrata extends Cliente {
    public ClientePrata(String Nome,String Cpf,String Senha) {
        super(Nome,Cpf,Senha);
        this.desconto = 0.05;
    }
}