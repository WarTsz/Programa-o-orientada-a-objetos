public class Moto extends Veiculo {
    public Moto(String placa,double capacidade) {
        super(placa,capacidade);
    }
    @Override
    public double CustoEntrega(double distancia) {
        return super.CustoEntrega(distancia)/2;
    }
}