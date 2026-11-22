package fintech.pagamento;

import fintech.pagamento.registrador.GeradorLog;
import gateway.Gateway;

public class ProcessadorDePagamento {
    private Gateway metodoDePagamento;
    private GeradorLog registrador;
    public ProcessadorDePagamento(Gateway metodoDePagamento,GeradorLog registrador) throws IllegalArgumentException {
        if (metodoDePagamento == null || registrador == null) {
            throw new IllegalArgumentException();
        }
        this.metodoDePagamento = metodoDePagamento;
        this.registrador = registrador;
    }
    public void processarPagamento(Pagamento pagamento) {
        metodoDePagamento.validarPagamento(pagamento);
        pagamento.concluirPagamento();
        registrador.gerarLog(pagamento);

    }
}