package fintech.pagamento.registrador;

import fintech.pagamento.Pagamento;

public interface GeradorLog {
    public void gerarLog(Pagamento pagamento);
}
