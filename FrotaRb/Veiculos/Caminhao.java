package Veiculos;
public class Caminhao extends Veiculo implements Motorizados{
    public Caminhao(String placa,double capacidade) {
        super(placa, capacidade);
    }
    @Override 
    public double CalcularCusto(double distancia) {
        return (2+0.5*this.getCapacidade()/1000)*distancia;
    }
}