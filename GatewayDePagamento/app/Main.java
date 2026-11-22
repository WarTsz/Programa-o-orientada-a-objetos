package app;

import java.time.LocalDate;

import fintech.pagamento.Pagamento;
import fintech.pagamento.ProcessadorDePagamento;
import fintech.pagamento.registrador.Arquivo;
import fintech.pagamento.registrador.Console;
import fintech.pagamento.registrador.GeradorLog;
import gateway.Pagseguro;

public class Main {
    public static void main(String[] args) {
        Colors.print("Inicio\n",null);
        GeradorLog gerador = new Console(); //Polimorfismo
        ProcessadorDePagamento processador = new ProcessadorDePagamento(new Pagseguro(), gerador);
        Pagamento pagamento01 = new Pagamento(104000, "Dinheiro que devo no serasa", LocalDate.now());
        processador.processarPagamento(pagamento01);

    }
}