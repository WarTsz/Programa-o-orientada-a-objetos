package transportadora;
import java.time.LocalDate;

import produto.*;
public class EnvioExpresso extends Envio {
    public EnvioExpresso(Encomenda encomenda,LocalDate data,double preco_base) {
        super(encomenda,data,preco_base);
    }
    @Override
    public double calcularTotal() {
        double valor = preco_base;
        if (this.encomenda.getPeso()>10) {
            valor+= 15*(10-this.encomenda.getPeso());
        }
        return valor;
    }
}