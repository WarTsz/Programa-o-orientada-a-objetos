import Aplicacao.Cliente;
import Aplicacao.Funcionario;
import Central.Historico;
import Central.Loja;
import Modelo.Produto;
import Caixa.Atendimento;
public class Principal {
    public static void main(String[] args) {
        Loja LojaDeRoupas = new Loja();
        Cliente maria = new Cliente("Maria", "001", "123");
        Cliente joao = new Cliente("Joao", "002", "123");
        Funcionario pedro = new Funcionario("Pedro", "003", "123", 123);
        Produto tenis = new Produto("CorridaMaster", "Adidas", 40, 300);
        Atendimento atendimento01 = new Atendimento(joao, pedro, tenis);
        atendimento01.PagarProduto(300);
        Historico historico01 = new Historico(atendimento01);
        LojaDeRoupas.RegistrarOperacao(historico01);
        System.out.println(LojaDeRoupas.getHistoricos().getFirst().getValorpago());
    }
}