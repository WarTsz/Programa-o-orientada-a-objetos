package transportadora;
import java.time.LocalDate;

import produto.*;
public class EnvioInternacional extends Envio {
    public EnvioInternacional(Encomenda encomenda,LocalDate data,double preco_base) {
        super(encomenda,data,preco_base);
    }
    @Override
    public double calcularTotal() {
        return preco_base*2.5;
    }
}   