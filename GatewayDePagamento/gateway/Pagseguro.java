package gateway;

import java.time.LocalDate;

import fintech.pagamento.Pagamento;


public class Pagseguro implements Gateway{
    @Override
    public void validarPagamento(Pagamento pagamento) {
        pagamento.aplicarTaxa(pagamento.getValor()*(0.035));
    }
}