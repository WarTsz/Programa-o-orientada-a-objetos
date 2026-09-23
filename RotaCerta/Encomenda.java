public class Encomenda {
    protected  boolean entregue = false;
    protected  int codigo;
    protected  Destinatario destinatario;
    protected  double peso;
    protected double preco;
    Encomenda(int newcodigo,Destinatario newDestinatario,double newpeso) throws IllegalArgumentException {
        if (newpeso<=0) {
            throw new IllegalArgumentException("Peso inapropriado");
        }
        this.codigo = newcodigo;
        this.destinatario = newDestinatario;
        this.peso = newpeso;
        this.preco = newpeso*1.20;
    }
    
}