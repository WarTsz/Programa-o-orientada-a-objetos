package Veiculos;
public class Veiculo implements Entregavel {
    private String placa;
    private double capacidade;
    public Veiculo(String placa,double capacidade) {
        this.placa = placa;
        this.capacidade = capacidade;
    }
    @Override 
    public double CalcularCusto(double distancia) {
        return distancia*2;
    }
    public double getCapacidade() {
        return capacidade;
    }
    public String getPlaca() {
        return placa;
    }
}