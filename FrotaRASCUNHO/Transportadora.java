
import java.util.ArrayList;

public class Transportadora {
    private ArrayList<Veiculo> veiculos;
    private String nome;

    public Transportadora(String nome) {
        this.nome = nome;
    }
    public double despacho(double distancia) {
        if (veiculos.size() == 0) {
            return 0;
        }
        double preco_total = 0;
        for (int i = 0;i>veiculos.size();i++) {
            preco_total+=veiculos.get(i).CustoEntrega(distancia);
        }
        return preco_total;
    }
}