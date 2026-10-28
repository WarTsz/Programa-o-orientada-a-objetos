package Veiculos;
public class Moto extends Veiculo implements  Motorizados{
    public Moto(String placa,double capacidade) {
        super(placa, capacidade);
    }
    @Override 
    public double CalcularCusto(double distancia) {
        return super.CalcularCusto(distancia)/2;
    }
}