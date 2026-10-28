package Entregas;
import Veiculos.Entregavel;
import Veiculos.Motorizados;
import java.util.ArrayList;

public class Transportadora implements Despacho{
    public final static String nome = "FrotaLog";
    private ArrayList<Entregavel> entregaveis = new ArrayList<>();
    public Transportadora() {        
    }
    public void AdicionarEntregavel(Entregavel entregavel) throws IllegalArgumentException {
        if (entregavel == null) {
            throw new IllegalArgumentException("O veiculo deve existir");
        }
        this.entregaveis.add(entregavel);
    }

    @Override 
    public double SomarCustos(double distancia_veiculos_motorizados,double distancia_veiculos_nao_motorizados) throws IllegalArgumentException {
        if (distancia_veiculos_motorizados<=0 || distancia_veiculos_nao_motorizados<=0 ) {
            throw new IllegalArgumentException("Distancia invalida");
        }
        double custo = 0;
        for (int i = 0;i<entregaveis.size();i++) {
            if (entregaveis.get(i) instanceof Motorizados) {
                 custo+=entregaveis.get(i).CalcularCusto(distancia_veiculos_motorizados);
            }
            else {
                custo+=entregaveis.get(i).CalcularCusto(distancia_veiculos_nao_motorizados);
            }
        }
        return custo;
    }
    public void ExibirTotal(double distancia_veiculos_motorizados,double distancia_veiculos_nao_motorizados) {
        System.out.println("\n\033[38;2;255;0;0mCusto total das entregas: "+SomarCustos(distancia_veiculos_motorizados,distancia_veiculos_nao_motorizados)+"\033[0m\n");
    }
}