public class Veiculo implements InterfaceVeiculo{
    private String placa;
    private double capacidade;
    public Veiculo(String placa,double capacidade) {
        this.placa = placa;
        this.capacidade = capacidade;
    }
    @Override
    public double CustoEntrega(double distancia) {
        return 2*distancia;
    }
    public double getCapacidade() {
        return this.capacidade;
    }
    public String getPlaca() {
        return this.placa;
    }
}