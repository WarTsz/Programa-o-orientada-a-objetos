package fintech.pagamento;

import java.time.LocalDate;

import erros.ValorInvalidoException;
import gateway.Gateway;

public class Pagamento{
    protected double valor;
    protected String descricao;
    protected LocalDate data; 
    protected double taxa = 0;
    protected boolean concluido = false;
    public Pagamento(double valorLiquido,String descricao,LocalDate data) throws ValorInvalidoException{
        if (valorLiquido <=0) {
            throw new ValorInvalidoException();
        }
        this.valor = valorLiquido;
        this.descricao = descricao;
        this.data = data;
    }
    public LocalDate getData() {
        return data;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getTaxa() {
        return taxa;
    }
    public double getValor() {
        return valor;
    }
    public void aplicarTaxa(double taxa) {
        this.taxa = taxa;
        this.valor-=taxa;
    }
    public void concluirPagamento() {
        if (this.concluido == false) {
            this.concluido = true;
        }
        else {
            throw new IllegalArgumentException("O pagamento já foi concluido");
        }
    }
}
