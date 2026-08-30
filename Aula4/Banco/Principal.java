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
    public void adicionar_banco(ArrayList strbancos, ArrayList bancos,Scanner input) {
        System.out.println("Digite um nome: ");
        String nome = input.nextLine();
        Banco novo_banco = new Banco(nome);
        strbancos.add(nome);
        bancos.add(novo_banco);
        System.out.println("Você adicionou o banco: "+nome);}
    public void exibir_contas(ArrayList arr) {
        for (int i = 0; i<arr.size();i++) {
            System.out.println(arr.get(i));
        }
    }
    public void exibir_bancos(ArrayList strbancos) {
        for (int i = 0; i<strbancos.size();i++) {
            System.out.println(strbancos.get(i)+"\n");
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
        lp();
        conta.exibir_dados(conta);
    }
    public void conta_management(String nome,int senha,Banco banco,Scanner input) {
        Conta_Bancaria conta = banco.pesquisar_conta(nome);
        if (validar(conta,senha) == false) {
            return;
        }  
        lp();
        while (true) {
            lp();
            System.out.println("Bem vindo a sua conta:\nInformações pessoais:\nNome:"+conta.getNome()+"\nBanco:"+conta.getBanco().getNome()+"\nSaldo:"+conta.getSaldo()+"\nDigite 1 para sacar\nDigite 2 para depositar\nDigite 3 para mostrar informações da conta\nDigite 4 para transferir\nDigite 5 para aplicar rendimento\nDigite 6 para sair\n");
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
            else if (codigo ==5) {
                conta.aplicar_rendimento(conta);
                continue;
            }
            else if (codigo==6) {
                return;
            }}
    }
    public void main(String[] args) {
        boolean used = false;
        ArrayList<Banco> bancos = new ArrayList<>();
        ArrayList<String> strbancos = new ArrayList<>();
        ArrayList<String> arr = new ArrayList<>();
        lp();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nBEM VINDO AO MENU BANCARIO\n\nDigite 1 para adicionar banco\nDigite 2 para adicionar conta\nDigite 3 para exibir contas cadastradas\nDigite 4 para exibir bancos cadastrados\nDigite 5 para exibir dados de uma conta\nDigite 6 para menu de usuário\nDigite 7 para carregar configurações teste\nDigite 8 para sair\n");
            int codigo = input.nextInt();
            input.nextLine();
            System.out.println(Colors.RESET);
            lp();
            if (codigo == 1) {
                System.out.println("--Adicionar banco--");
                adicionar_banco(strbancos,bancos,input);
                continue;
            }
            else if (codigo == 2) {
                System.out.println("--Adicionar conta--");
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
                exibir_bancos(strbancos);
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
            else if (codigo == 7 && used == false) {
                strbancos.add("Itau");strbancos.add("Bradesco");strbancos.add("Banrisul");strbancos.add("Brasil");strbancos.add("Master");strbancos.add("Inter");strbancos.add("Nubank");
                Banco Itau = new Banco("Itau");
                Banco Bradesco= new Banco("Bradesco");
                Banco Banrisul= new Banco("Banrisul");
                Banco Brasil= new Banco("Brasil");
                Banco Master= new Banco("Master");
                Banco Inter= new Banco("Inter");
                Banco Nubank= new Banco("Nubank");
                bancos.add(Itau);bancos.add(Bradesco);bancos.add(Banrisul);bancos.add(Brasil);bancos.add(Master);bancos.add(Inter);bancos.add(Nubank);
                bancos.get(0).adicionar_conta("Joao Silva", "123.456.789-01", "15/03/1998");
                arr.add("Nome:"+"Joao Silva"+"   "+"Banco:"+bancos.get(0).getNome());

                bancos.get(5).adicionar_conta("Mariana Costa", "234.567.890-12", "22/07/2001");
                arr.add("Nome:"+"Mariana Costa"+"   "+"Banco:"+bancos.get(5).getNome());

                bancos.get(2).adicionar_conta("Carlos Oliveira", "345.678.901-23", "08/11/1995");
                arr.add("Nome:"+"Carlos Oliveira"+"   "+"Banco:"+bancos.get(2).getNome());

                bancos.get(6).adicionar_conta("Ana Souza", "456.789.012-34", "30/01/2000");
                arr.add("Nome:"+"Ana Souza"+"   "+"Banco:"+bancos.get(6).getNome());

                bancos.get(1).adicionar_conta("Pedro Santos", "567.890.123-45", "17/09/1992");
                arr.add("Nome:"+"Pedro Santos"+"   "+"Banco:"+bancos.get(1).getNome());

                bancos.get(3).adicionar_conta("Juliana Martins", "678.901.234-56", "04/05/1999");
                arr.add("Nome:"+"Juliana Martins"+"   "+"Banco:"+bancos.get(3).getNome());

                bancos.get(4).adicionar_conta("Lucas Pereira", "789.012.345-67", "19/12/1997");
                arr.add("Nome:"+"Lucas Pereira"+"   "+"Banco:"+bancos.get(4).getNome());

                bancos.get(0).adicionar_conta("Fernanda Alves", "890.123.456-78", "11/06/2002");
                arr.add("Nome:"+"Fernanda Alves"+"   "+"Banco:"+bancos.get(0).getNome());

                bancos.get(6).adicionar_conta("Rafael Rodrigues", "901.234.567-89", "26/02/1996");
                arr.add("Nome:"+"Rafael Rodrigues"+"   "+"Banco:"+bancos.get(6).getNome());

                bancos.get(2).adicionar_conta("Camila Ferreira", "012.345.678-90", "09/10/2003");
                arr.add("Nome:"+"Camila Ferreira"+"   "+"Banco:"+bancos.get(2).getNome());

                bancos.get(5).adicionar_conta("Gustavo Almeida", "111.222.333-44", "13/04/1994");
                arr.add("Nome:"+"Gustavo Almeida"+"   "+"Banco:"+bancos.get(5).getNome());

                bancos.get(1).adicionar_conta("Beatriz Gomes", "222.333.444-55", "28/08/2001");
                arr.add("Nome:"+"Beatriz Gomes"+"   "+"Banco:"+bancos.get(1).getNome());

                bancos.get(3).adicionar_conta("Thiago Ribeiro", "333.444.555-66", "07/01/1993");
                arr.add("Nome:"+"Thiago Ribeiro"+"   "+"Banco:"+bancos.get(3).getNome());

                bancos.get(4).adicionar_conta("Larissa Carvalho", "444.555.666-77", "21/11/1998");
                arr.add("Nome:"+"Larissa Carvalho"+"   "+"Banco:"+bancos.get(4).getNome());

                bancos.get(0).adicionar_conta("Bruno Teixeira", "555.666.777-88", "03/07/1991");
                arr.add("Nome:"+"Bruno Teixeira"+"   "+"Banco:"+bancos.get(0).getNome());

                bancos.get(5).adicionar_conta("Patricia Mendes", "666.777.888-99", "16/03/2000");
                arr.add("Nome:"+"Patricia Mendes"+"   "+"Banco:"+bancos.get(5).getNome());

                bancos.get(2).adicionar_conta("Diego Barbosa", "777.888.999-00", "25/12/1996");
                arr.add("Nome:"+"Diego Barbosa"+"   "+"Banco:"+bancos.get(2).getNome());

                bancos.get(6).adicionar_conta("Isabela Nunes", "888.999.000-11", "12/09/2002");
                arr.add("Nome:"+"Isabela Nunes"+"   "+"Banco:"+bancos.get(6).getNome());

                bancos.get(1).adicionar_conta("Andre Lopes", "999.000.111-22", "05/02/1990");
                arr.add("Nome:"+"Andre Lopes"+"   "+"Banco:"+bancos.get(1).getNome());

                bancos.get(3).adicionar_conta("Renata Moreira", "000.111.222-33", "18/06/1997");
                arr.add("Nome:"+"Renata Moreira"+"   "+"Banco:"+bancos.get(3).getNome());

                bancos.get(4).adicionar_conta("Felipe Castro", "101.202.303-44", "29/10/1995");
                arr.add("Nome:"+"Felipe Castro"+"   "+"Banco:"+bancos.get(4).getNome());

                bancos.get(0).adicionar_conta("Amanda Cardoso", "202.303.404-55", "14/01/2001");
                arr.add("Nome:"+"Amanda Cardoso"+"   "+"Banco:"+bancos.get(0).getNome());

                bancos.get(6).adicionar_conta("Vinicius Rocha", "303.404.505-66", "23/05/1993");
                arr.add("Nome:"+"Vinicius Rocha"+"   "+"Banco:"+bancos.get(6).getNome());

                bancos.get(5).adicionar_conta("Clara Dias", "404.505.606-77", "31/08/1999");
                arr.add("Nome:"+"Clara Dias"+"   "+"Banco:"+bancos.get(5).getNome());

                bancos.get(2).adicionar_conta("Rodrigo Monteiro", "505.606.707-88", "10/12/1994");
                arr.add("Nome:"+"Rodrigo Monteiro"+"   "+"Banco:"+bancos.get(2).getNome());

                bancos.get(1).adicionar_conta("Sofia Ramos", "606.707.808-99", "27/04/2002");
                arr.add("Nome:"+"Sofia Ramos"+"   "+"Banco:"+bancos.get(1).getNome());

                bancos.get(3).adicionar_conta("Eduardo Freitas", "707.808.909-00", "06/11/1989");
                arr.add("Nome:"+"Eduardo Freitas"+"   "+"Banco:"+bancos.get(3).getNome());

                bancos.get(4).adicionar_conta("Natalia Correia", "808.909.010-11", "20/07/1996");
                arr.add("Nome:"+"Natalia Correia"+"   "+"Banco:"+bancos.get(4).getNome());

                bancos.get(5).adicionar_conta("Marcelo Vieira", "909.010.121-22", "02/03/1992");
                arr.add("Nome:"+"Marcelo Vieira"+"   "+"Banco:"+bancos.get(5).getNome());

                bancos.get(0).adicionar_conta("Leticia Araujo", "010.121.232-33", "24/09/2000");
                arr.add("Nome:"+"Leticia Araujo"+"   "+"Banco:"+bancos.get(0).getNome());

                bancos.get(6).adicionar_conta("Henrique Duarte", "121.232.343-44", "15/06/1997");
                arr.add("Nome:"+"Henrique Duarte"+"   "+"Banco:"+bancos.get(6).getNome());

                bancos.get(2).adicionar_conta("Carolina Batista", "232.343.454-55", "09/01/2003");
                arr.add("Nome:"+"Carolina Batista"+"   "+"Banco:"+bancos.get(2).getNome());

                bancos.get(1).adicionar_conta("Leonardo Moraes", "343.454.565-66", "18/10/1991");
                arr.add("Nome:"+"Leonardo Moraes"+"   "+"Banco:"+bancos.get(1).getNome());

                bancos.get(3).adicionar_conta("Gabriela Farias", "454.565.676-77", "07/04/1998");
                arr.add("Nome:"+"Gabriela Farias"+"   "+"Banco:"+bancos.get(3).getNome());

                bancos.get(4).adicionar_conta("Mateus Pinto", "565.676.787-88", "26/12/1999");
                arr.add("Nome:"+"Mateus Pinto"+"   "+"Banco:"+bancos.get(4).getNome());

                bancos.get(5).adicionar_conta("Aline Tavares", "676.787.898-99", "13/08/1994");
                arr.add("Nome:"+"Aline Tavares"+"   "+"Banco:"+bancos.get(5).getNome());

                bancos.get(0).adicionar_conta("Daniel Viana", "787.898.909-00", "22/02/1996");
                arr.add("Nome:"+"Daniel Viana"+"   "+"Banco:"+bancos.get(0).getNome());

                bancos.get(6).adicionar_conta("Bianca Rezende", "898.909.010-11", "04/11/2001");
                arr.add("Nome:"+"Bianca Rezende"+"   "+"Banco:"+bancos.get(6).getNome());

                bancos.get(2).adicionar_conta("Samuel Cavalcanti", "909.010.121-32", "16/05/1990");
                arr.add("Nome:"+"Samuel Cavalcanti"+"   "+"Banco:"+bancos.get(2).getNome());

                bancos.get(1).adicionar_conta("Manuela Borges", "010.121.232-43", "28/09/1998");
                arr.add("Nome:"+"Manuela Borges"+"   "+"Banco:"+bancos.get(1).getNome());

                bancos.get(3).adicionar_conta("Arthur Guimaraes", "121.232.343-54", "11/01/2000");
                arr.add("Nome:"+"Arthur Guimaraes"+"   "+"Banco:"+bancos.get(3).getNome());

                bancos.get(4).adicionar_conta("Luana Peixoto", "232.343.454-65", "19/06/1995");
                arr.add("Nome:"+"Luana Peixoto"+"   "+"Banco:"+bancos.get(4).getNome());

                bancos.get(5).adicionar_conta("Igor Santana", "343.454.565-76", "03/10/1993");
                arr.add("Nome:"+"Igor Santana"+"   "+"Banco:"+bancos.get(5).getNome());

                bancos.get(0).adicionar_conta("Vanessa Neves", "454.565.676-87", "27/07/2002");
                arr.add("Nome:"+"Vanessa Neves"+"   "+"Banco:"+bancos.get(0).getNome());

                bancos.get(6).adicionar_conta("Caio Campos", "565.676.787-98", "08/12/1997");
                arr.add("Nome:"+"Caio Campos"+"   "+"Banco:"+bancos.get(6).getNome());

                bancos.get(2).adicionar_conta("Priscila Andrade", "676.787.898-09", "17/03/1999");
                arr.add("Nome:"+"Priscila Andrade"+"   "+"Banco:"+bancos.get(2).getNome());

                bancos.get(1).adicionar_conta("Ruan Fernandes", "787.898.909-10", "25/10/1994");
                arr.add("Nome:"+"Ruan Fernandes"+"   "+"Banco:"+bancos.get(1).getNome());

                bancos.get(3).adicionar_conta("Elisa Moura", "898.909.010-21", "06/02/2003");
                arr.add("Nome:"+"Elisa Moura"+"   "+"Banco:"+bancos.get(3).getNome());

                bancos.get(4).adicionar_conta("Murilo Pacheco", "909.010.121-32", "14/08/1992");
                arr.add("Nome:"+"Murilo Pacheco"+"   "+"Banco:"+bancos.get(4).getNome());
                used = true;
            }
            else if (codigo == 8) {
                break;
            }


        }
    }
}