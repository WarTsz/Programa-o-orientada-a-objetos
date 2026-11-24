package transportadora;
import produto.*;

import java.time.LocalDate;

import erros.*;
public abstract class Envio {
    protected Encomenda encomenda;
    protected  LocalDate data;
    protected double preco_base;
    public Envio(Encomenda encomenda,LocalDate data,double preco_base) throws PrecoInvalidoException,IllegalArgumentException {
        if (preco_base <=0) {
            throw new PrecoInvalidoException();
        }
        else if (encomenda == null) {
            throw new IllegalArgumentException();
        }
        this.encomenda = encomenda;
        this.data = data;
        this.preco_base = preco_base;
    }
    public abstract double calcularTotal();
}
// Principio de Liskov (L): Toda classe filha de Envio não possui nenhuma limitação que a classe mãe não tenha
// Em resumo: As classes filhas de Envio honram o contrato que tem com a classe mãe, possuem capacidades extras não limitações extras.

// Principio Aberto-Fechado (O): A cada nova subclasse de Envio, nada dos códigos já produzidos será mudado, ou seja, aberto para extensão e fechado para mudança.
// Só seria necessário mudar um arquivo para adicionar um novo tipo de Envio