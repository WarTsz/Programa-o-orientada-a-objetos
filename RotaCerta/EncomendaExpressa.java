public class EncomendaExpressa extends Encomenda {
    EncomendaExpressa(int newcodigo,Destinatario newDestinatario,double newpeso) throws EntregaAcimaDoPesoExpection {
        super(newcodigo, newDestinatario, newpeso);
        if (newpeso>10) {
            throw new EntregaAcimaDoPesoExpection("Peso inapropriado");
        }
        this.preco +=15;
    }
}