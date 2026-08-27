import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
    static void lp() {
        System.out.print("\033[H\033[2J");
        System.out.flush();}
    public void adicionar_conta(Banco banco, ArrayList arr,Scanner input) {
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite seu CPF: ");
        String CPF = input.nextLine();
        System.out.println("Sua data de nascimento: ");
        String data = input.nextLine();
        banco.adicionar_conta(nome,CPF,data);
        arr.add("Nome:"+nome+"   "+"Banco:"+banco.getNome());
        lp();
        System.out.println("Você criou a conta: "+nome+"\nNo banco: "+banco.getNome()+"\n");}
    public void adicionar_banco(ArrayList bancos,Scanner input) {
        System.out.println("Digite um nome: ");
        String nome = input.nextLine();
        Banco novo_banco = new Banco(nome);
        bancos.add(novo_banco);
        System.out.println("Você adicionou o banco: "+nome);}
    public void exibir_contas(ArrayList arr) {
        for (int i = 0; i<arr.size();i++) {
            System.out.println(arr.get(i));
        }
    }
    public void exibir_bancos(ArrayList bancos) {
        for (int i = 0; i<bancos.size();i++) {
            System.out.println(bancos.get(i).getNome()+"\n");
        }
    }
    private boolean validar(Conta_Bancaria conta,int senha) {
        if (conta == null) {
            System.out.println("Conta inexistente");
            return false;}
        boolean flag = conta.autenticar(conta, senha);
        if (flag == false) {
            return false;}
        return true;
    }
    public void exibir_informacoes(String nome,int senha,Banco banco) {
        Conta_Bancaria conta = banco.pesquisar_conta(nome);
        if (validar(conta,senha) == false) {
            return;
        }  
        conta.exibir_dados(conta);
    }
    public void conta_management(String nome,int senha,Banco banco,Scanner input) {
        Conta_Bancaria conta = banco.pesquisar_conta(nome);
        if (validar(conta,senha) == false) {
            return;
        }  
        while (true) {
            lp();
            System.out.println("Bem vindo a sua conta:\nInformações pessoais:\nNome:"+conta.getNome()+"\nBanco:"+conta.getBanco().getNome()+"\nSaldo:"+conta.getSaldo()+"\nDigite 1 para sacar\nDigite 2 para depositar\nDigite 3 para mostrar informações da conta\nDigite 4 para transferir\nDigite 5 para sair");
            int codigo = input.nextInt();
            input.nextLine();
            if (codigo == 1) {
                System.out.println("Digite a quantidade que você deseja sacar ");
                Double quantidade = input.nextDouble();
                conta.sacar(conta, quantidade,0.0);
                input.nextLine();
                String wait = input.nextLine();
                continue;
            }
            else if (codigo == 2) {
                System.out.println("Digite a quantidade que você deseja depositar");
                double quantidade = input.nextDouble();
                conta.depositar(conta, quantidade);
                input.nextLine();
                String wait = input.nextLine();
                continue;}
            else if (codigo==3) {
                conta.exibir_dados(conta);
                String wait = input.nextLine();
                continue;
            }
            else if (codigo==4) {
                System.out.println("Digite o nome da conta do recebedor: ");
                String recebedor = input.nextLine();
                System.out.println("Digite a quantidade que você deseja colocar na conta dessa pessoa: ");
                Double quantidade = input.nextDouble();
                conta.transferir(conta, recebedor, quantidade);
                input.nextLine();
                String wait = input.nextLine();
                continue;
            }
            else if (codigo==5) {
                return;
            }}
    }
    public void main(String[] args) {
        ArrayList<Banco> bancos = new ArrayList<>();
        ArrayList<String> arr = new ArrayList<>();
        // Banco Bradesco = new Banco("Bradesco");
        // Bradesco.adicionar_conta("Pedrin", "", "");
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println(Colors.AZUL+"╔═══════════════════════════════════════════════════════╗");
            System.out.println("║BEM-VINDO AO MENU BANCARIO                             ║\n║Digite 1 para adicionar banco                          ║\n║Digite 2 para adicionar conta                          ║\n║Digite 3 para exibir contas                            ║\n║Digite 4 para exibir bancos                            ║\n║Digite 5 para exibir informações de uma dada conta     ║\n║Digite 6 para gerenciar conta                          ║\n║Digite 7 para sair                                     ║");
            System.out.println("╚═══════════════════════════════════════════════════════╝");
            int codigo = input.nextInt();
            input.nextLine();
            System.out.println(Colors.RESET);
            lp();
            if (codigo == 1) {
                adicionar_banco(bancos,input);
                continue;
            }
            else if (codigo == 2) {
                System.out.println("Digite o nome do banco");
                String nome_bank = input.nextLine();
                int flag = -1;
                for (int i = 0; i<bancos.size();i++) {
                    if (bancos.get(i).getNome().equals(nome_bank)) {
                        flag = i;
                        break;
                    }}
                if (flag == -1) {
                    System.out.println("Esse banco não existe");}
                else {
                adicionar_conta(bancos.get(flag), arr,input);}
                continue;}
            else if (codigo==3) {
                exibir_contas(arr);
                continue;
            }
            else if (codigo==4) {
                exibir_bancos(bancos);
                continue;
            }
            else if (codigo==5) {
                System.out.println("Digite seu nome: ");
                String nome = input.nextLine();
                System.out.println("Digite seu banco: ");
                String banco_atual = input.nextLine();
                System.out.println("Sua senha: ");
                int senha = input.nextInt();
                int flag = -1;
                for (int i = 0; i<bancos.size();i++) {
                    if (bancos.get(i).getNome().equals(banco_atual)) {
                        flag = i;
                        break;}
                }
                if (flag == -1) {
                    System.out.println("Esse banco não existe");}
                else {
                exibir_informacoes(nome,senha,bancos.get(flag));}
                continue;}
            else if (codigo == 6) {
                System.out.println("Digite seu nome: ");
                String nome = input.nextLine();
                System.out.println("Digite seu banco: ");
                String banco_atual = input.nextLine();
                System.out.println("Sua senha: ");
                int senha = input.nextInt();
                int flag = -1;
                for (int i = 0; i<bancos.size();i++) {
                    if (bancos.get(i).getNome().equals(banco_atual)) {
                        flag = i;
                        break;}
                }
                if (flag == -1) {
                    System.out.println("Esse banco não existe");}
                else {
                conta_management(nome,senha,bancos.get(flag),input);}
                continue;
                
            }
            else if (codigo == 7) {
                break;
            }


        }
    }
}