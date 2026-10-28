package Veiculos;
public class Van extends Veiculo implements  Motorizados{
    public Van(String placa,double capacidade) {
        super(placa, capacidade);
    }
    @Override 
    public double CalcularCusto(double distancia) {
        return super.CalcularCusto(distancia);
    }
}