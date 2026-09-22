public class PlanoFamilia extends Plano {
    int extras;
    PlanoFamilia(double newmensalidade,int diagerador,int newextras) throws IllegalArgumentException {
        super(newmensalidade+newextras*40,diagerador);
        if (newextras>4 || newextras<1) {
            throw new IllegalArgumentException("Valor de integrantes INVALIDO");
        }
    }
}