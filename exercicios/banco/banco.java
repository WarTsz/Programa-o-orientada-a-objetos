public class banco {
    public class conta_bancaria {
        double saldo = 0;
        String nome = "";
    double sacar(conta_bancaria conta,double quantidade) {
        if (conta.saldo<quantidade) {
            return conta.saldo;}
        else {
            return conta.saldo-quantidade;
        }}
    void exibir (conta_bancaria conta) {
        System.out.println("Credenciais:\nNome:"+conta.nome+"\nSaldo:"+conta.saldo);
    }
    void transacao (conta_bancaria recebedor,conta_bancaria pagador,double quantidade) {
        if (pagador.saldo<quantidade) {
            System.out.println("Dinheiro insuficiente");
        }
        else {
            pagador.saldo = pagador.sacar(pagador,quantidade);
            recebedor.saldo = recebedor.saldo+quantidade;
        }
        
    }
    }
    public void main(String[] args) {
        conta_bancaria conta_1 = new conta_bancaria();
        conta_1.nome = "joão-da-silva-pinto";
        conta_1.saldo = 300;
        conta_1.exibir(conta_1);
        conta_bancaria conta_2 = new conta_bancaria();
        conta_2.nome = "serjão dos foguetes";
        conta_2.saldo = 40000;
        conta_2.exibir(conta_2);
        
        conta_2.transacao(conta_1, conta_2, 1000);
        conta_2.exibir(conta_2);
        conta_1.exibir(conta_1);
    }
}
