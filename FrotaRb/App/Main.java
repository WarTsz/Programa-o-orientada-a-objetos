package App;
import Entregas.Transportadora;
import Veiculos.*;
public class Main {
    public static void main(String[] args) {
        Transportadora FrotaLog = new Transportadora();
        FrotaLog.AdicionarEntregavel(new Caminhao("230203", 6000));
        FrotaLog.AdicionarEntregavel(new Van("3213",800));
        FrotaLog.AdicionarEntregavel(new Moto("213AB",120));
        FrotaLog.AdicionarEntregavel(new Caminhao("12312AD",5700));
        FrotaLog.AdicionarEntregavel(new Bicicleta("213A",60));
        FrotaLog.AdicionarEntregavel(new Bicicleta("21GFA",60));
        FrotaLog.AdicionarEntregavel(new Bicicleta("21GAFA",60));
        FrotaLog.ExibirTotal(80, 3);
    }
}