import java.util.ArrayList;
public class Banco {
    private String nome;
    private ArrayList<ArrayList<Conta_Bancaria>> contas = new ArrayList();
    private int size = 11;
    private int preenchidos = 0;
    private Double rendimento = 0.01;
    Banco(String nome_do_banco) {
        nome = nome_do_banco;
        this.adicionar_elementos();
    }
    public ArrayList<ArrayList<Conta_Bancaria>> getContas() {
        return contas;
    }
    public String getNome() {
        return nome;
    }
    public Double getRendimento() {
        return rendimento;
    }
    int calcular_hash(String nome_da_conta){
        int[] num_arr = nome_da_conta.chars().toArray();
        long num = 0;
        for (int i = 0; i<num_arr.length; i++) {
            num+= num_arr[i]*Math.pow(10,3*(num_arr.length-(i+1)));
        }
        int out = (int)(num % this.size);
        return out;
    }
    Conta_Bancaria pesquisar_conta(String contaString) {
        int code = calcular_hash(contaString);
        for (int i = 0; i<this.contas.get(code).size();i++) {
            if (contaString.equals(this.contas.get(code).get(i).getNome())){
                return this.contas.get(code).get(i);
            }}
        return null;
    }
    void adicionar_conta(String nome,String cpf, String datanasc) {
        Titular newtitular = new Titular(nome, cpf, datanasc);
        Conta_Bancaria newconta = new Conta_Bancaria(newtitular,this);
        this.Inserir_na_tabela(newconta,newconta.getNome());
    }
    void adicionar_elementos(){
        for (int i = 0; i<this.size;i++) {
            ArrayList ind = new ArrayList<>();
            this.contas.add(ind);
        }
    }
    void RefazerTabela() {
        ArrayList<ArrayList<Conta_Bancaria>> arr = new ArrayList<>();
        int tmp = this.size;
        this.size = this.size*2 + 2;
        for (int i = 0; i<this.size;i++) {
            ArrayList ind = new ArrayList<>();
            arr.add(ind);}
        this.preenchidos = 0;
        int index = 0;
        while (index<tmp) {
            for (int i = this.contas.get(index).size();i>0;i-=1) {
                Conta_Bancaria num = this.contas.get(index).get(i-1);
                arr.get(this.calcular_hash(num.getNome())%this.size).add(num);
                this.preenchidos+=1;
                }
            index+=1;
            }
        this.contas = arr;
        }
    void Inserir_na_tabela(Conta_Bancaria conta,String nome_da_conta) {
        int index = calcular_hash(nome_da_conta);
        this.contas.get(index).add(conta);
        this.preenchidos+=1;
        if (this.preenchidos<this.size*7/10) {
            return;
        }
        else {
            RefazerTabela();
        }
    }
}