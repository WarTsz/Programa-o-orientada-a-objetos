public class EncomendaFragil extends Encomenda{
    EncomendaFragil(int newcodigo,Destinatario newDestinatario,double newpeso) {
        super(newcodigo, newDestinatario, newpeso);
        this.preco += 0.8*newpeso;
    }
    
}