package Central;
import java.time.LocalDate;
import Aplicacao.Cliente;
import Aplicacao.Funcionario;
import Caixa.Atendimento;
import Modelo.Produto;
import Exceptions.CompraNaoRealizadaException;
public class Historico {
    private Atendimento atendimento;
    private double desconto;
    private double valorpago;
    private LocalDate data;
    public Historico(Atendimento atendimento) throws CompraNaoRealizadaException {
        if (atendimento.getStatus() == false) {
            throw new CompraNaoRealizadaException();
        }
        this.atendimento = atendimento;
        this.data = LocalDate.now();
        this.desconto = atendimento.getCliente().getDesconto();
        this.valorpago = (1-desconto)*atendimento.getProduto().getPreco();
    }
    public Atendimento getAtendimento() {
        return atendimento;
    }
    public LocalDate getData() {
        return data;
    }
    public double getDesconto() {
        return desconto;
    }
    public double getValorpago() {
        return valorpago;
    }
}