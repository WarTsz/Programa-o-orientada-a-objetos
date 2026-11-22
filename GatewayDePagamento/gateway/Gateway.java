package gateway;

import fintech.pagamento.Pagamento;

public interface Gateway {
    public void validarPagamento(Pagamento pagamento);
}