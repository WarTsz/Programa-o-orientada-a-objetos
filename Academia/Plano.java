public class Plano {
    private double mensalidade;
    private int diagerador;
    Plano(double newmensalidade,int dia) throws MensalidadeInvalidaExpection,IllegalArgumentException {
        if (newmensalidade<80) {
            throw new MensalidadeInvalidaExpection();
        }
        else if (dia>6 || dia<0) {
            throw new IllegalArgumentException("Dia inválido");
        }
        this.diagerador = dia;
        this.mensalidade = newmensalidade;
    }
    public boolean PagarMensalidade(double valor) {
        if (valor != mensalidade) {
            return false;
        }
        return true;
    }
    public double getMensalidade() {
        return mensalidade;
    }
    public int getDia() {
        return diagerador;
    }
}