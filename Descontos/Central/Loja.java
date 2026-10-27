package Central;
import java.time.LocalDate;
import java.util.ArrayList;
public class Loja {
    private final static String nome = "LojaDeRoupas";
    private ArrayList<Historico> historicos = new ArrayList<>();
    public Loja() {
    }
    public ArrayList<Historico> getHistoricos() {
        return historicos;
    }
    public void RegistrarOperacao(Historico historico) throws IllegalArgumentException {
        if (historico == null) {
            throw new IllegalArgumentException("O histórico precisa existir");
        }
        this.historicos.add(historico);
    }
    public double FaturamentoMensal() {
        if (historicos.size() == 0) {
            return 0;}
        int index = 0;
        double faturamento = 0;
        LocalDate data = LocalDate.now();
        while (historicos.size()<index && historicos.get(index).getData().getMonth().equals(data.getMonth())) {
            faturamento+=historicos.get(index).getValorpago();
            index+=1;}
        return faturamento;
    }
    public boolean BuscarOperacoes(LocalDate data) {
        return true;
    }
    public boolean ProdutosMaisVendidos () {
        for (int i=0;i<historicos.size();i++) {
        }
        return true;
    }
}