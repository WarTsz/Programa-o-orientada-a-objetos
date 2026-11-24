package transportadora;
import java.time.LocalDate;

import produto.*;
public class EnvioEconomico extends Envio {
    public EnvioEconomico(Encomenda encomenda,LocalDate data,double preco_base) {
        super(encomenda,data,preco_base);
    }
    @Override
    public double calcularTotal() {
        return this.preco_base;
    }
}