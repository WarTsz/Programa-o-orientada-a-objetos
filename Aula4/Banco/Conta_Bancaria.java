import java.util.ArrayList;
import java.time;
public class Conta_Bancaria {
    private String nome = "";
    private Banco banco;
    private Double saldo = 0.0;
    private int Quantidade_Operacoes = 0;
    private int id;
    private int password = 123;
    private ArrayList<String> Operacoes = new ArrayList<>();
    Conta_Bancaria(Titular titular, Banco newbanco) {
        this.nome = titular.getNome();
        this.banco = newbanco;
    }
    public Banco getBanco() {
        return banco;
    }
    public String getNome() {
        return nome;
    }
    public ArrayList getOperacoes() {
        return Operacoes;
    }
    public int getQuantidade_Operacoes() {
        return Quantidade_Operacoes;
    }
    public Double getSaldo() {
        return saldo;
    }
    boolean autenticar(Conta_Bancaria conta, int password) {
        if (conta.password != password) {
            System.out.println("Senha invalida");
            return false;}
        return true;
    }
    boolean depositar(Conta_Bancaria conta, Double quantidade) {
        if (quantidade<=0) {
            System.out.println("Erro: O valor a ser depositado deve ser positivo");
            return false;}
        conta.saldo += quantidade;
        conta.Quantidade_Operacoes+=1;
        conta.Operacoes.add("\nOperacao: Deposito\n"+"Quantidade:"+quantidade+"\n");
        System.out.println("Você depositou "+quantidade+" Reais");
        return true;
    }
    boolean sacar(Conta_Bancaria conta, Double quantidade,Double tarifa) {
        if (quantidade+tarifa>conta.saldo) {
            System.out.println("Erro: O valor a ser sacado deve ser menor igual que o saldo");
            return false;}
        conta.saldo-=quantidade+tarifa;
        conta.Quantidade_Operacoes+=1;
        conta.Operacoes.add("\nOperacao: Saque\n"+"Quantidade:"+quantidade+"\nTarifa:"+tarifa+"\n");
        System.out.println("Você sacou "+quantidade+" Reais"+"\nTarifa:"+tarifa);
        return true;
        }
    void transferir(Conta_Bancaria Emissor, String Destinatário, double quantidade) {
       Conta_Bancaria recebedor = this.banco.pesquisar_conta(Destinatário);
        if (recebedor == null) {
            System.out.println("Nome não encontrado, tente novamente");
            return;}
        if (Emissor.sacar(Emissor,quantidade,0.0) == false) {
            return;
        }
        else {
            recebedor.depositar(recebedor,quantidade);
            recebedor.Quantidade_Operacoes+=1;
            Emissor.Quantidade_Operacoes+=1;
            recebedor.Operacoes.add("\nOperacao: Transferencia\nPapel: Recebedor"+"\nQuantidade:"+quantidade+"\n");
            Emissor.Operacoes.add("\nOperacao: Transferencia\nPapel: Emissor"+"\nQuantidade:"+quantidade+"\n");
        }
    }
    void aplicar_rendimento(Conta_Bancaria conta) {
        conta.saldo = (1+conta.getBanco().getRendimento())*conta.saldo;
    }
    void exibir_dados(Conta_Bancaria conta) {
        System.out.println("Nome: "+conta.nome+"\nSaldo: "+conta.saldo+"\nBanco: "+banco.getNome()+"\nNumero de operações: "+conta.Quantidade_Operacoes+"\nOperacoes :"+conta.Operacoes);
    }   
    }