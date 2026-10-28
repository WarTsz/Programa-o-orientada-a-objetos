package Veiculos;
public class Bicicleta extends Veiculo{
    public Bicicleta(String placa,double capacidade) {
        super(placa, capacidade);
    }
    @Override 
    public double CalcularCusto(double distancia) throws IllegalArgumentException{
        if (distancia>5) {
            throw new IllegalArgumentException("A distância máxima deve ser menor ou igual a 5 km");
        }
        return super.CalcularCusto(distancia);
    }
}