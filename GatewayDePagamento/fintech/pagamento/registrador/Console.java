package fintech.pagamento.registrador;

import app.Colors;
import fintech.pagamento.Pagamento;

public class Console implements GeradorLog {
    @Override
    public void gerarLog(Pagamento pagamento) {
        Colors.print("Pagamento concluído:"+
                    "\nValor: "+pagamento.getValor()+
                    "\nDescrição: "+pagamento.getDescricao()+
                    "\nData do pagamento: "+pagamento.getData()+
                    "\nValor da taxa: "+pagamento.getTaxa()+"\n",
                    "CYAN");
                    
    }
}
