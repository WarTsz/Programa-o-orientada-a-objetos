public class Caminhao extends Veiculo {

    public Caminhao(String placa,double capacidade) {
        super(placa,capacidade);
    }
    @Override 
    public double CustoEntrega(double distancia) {
        return super.CustoEntrega(distancia+this.getCapacidade()/1000*0.5);
    }
    
}