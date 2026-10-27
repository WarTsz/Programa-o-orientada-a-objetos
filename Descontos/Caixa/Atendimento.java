package Caixa;
import Aplicacao.Cliente;
import Aplicacao.Funcionario;
import Modelo.Produto;
import Central.Historico;
public class Atendimento {
    private Cliente cliente;
    private Funcionario funcionario;
    private Produto produto;
    private boolean status = false;
    public Atendimento(Cliente cliente,Funcionario funcionario, Produto produto) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.produto = produto;
        this.status = false;
    }
    public boolean getStatus() {
        return status;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public Produto getProduto() {
        return produto;
    }
    public void PagarProduto(double valor) {
        if (valor != this.produto.getPreco()*(1-this.cliente.getDesconto())) {
            return;
        }
        this.status = true;
    }
}