import java.util.ArrayList;

public class Transportadora {
    private String nome;
    private ArrayList<Encomenda> encomendas = new ArrayList<>();
    Transportadora(String newnome) {
        this.nome = newnome;
    }
    private int ProcurarCodigo(int codigo) {
        for (int i=0;i<encomendas.size();i++) {
            if (encomendas.get(i).codigo == codigo) {
                return i;
            }
        }
        return -1;
    }
    private boolean VerificarCodigo(int codigo) {
        for (int i=0;i<encomendas.size();i++) {
            if (encomendas.get(i).codigo == codigo) {
                return false;
            }
        }
        return true;
    }
    protected int GerarCodigo() {
        return 1+encomendas.size();
    }
    public boolean GerarEncomenda(Destinatario destinario,double peso,String tipo,int codigo) throws CodigoRepetidoException,IllegalArgumentException {
        if (VerificarCodigo(codigo) == false) {
            throw new CodigoRepetidoException("Codigo repetido, tente novamente");
        }
        if (tipo == "Expressa") {
            Encomenda neweEncomenda = new EncomendaExpressa(codigo,destinario,peso);
            encomendas.add(neweEncomenda);
        }
        else if (tipo == "Fragil") {
            Encomenda neweEncomenda = new EncomendaFragil(codigo,destinario,peso);
            encomendas.add(neweEncomenda);
        }
        else if (tipo == "Normal") {
            Encomenda neweEncomenda = new Encomenda(codigo,destinario,peso);
            encomendas.add(neweEncomenda);
        }
        else {
            throw new IllegalArgumentException("Algo de errado aconteceu, tente novamente");
        }
        return true;
    }
    public boolean EntregarEncomenda(int codigo) throws IllegalArgumentException {
        int Validade = ProcurarCodigo(codigo);
        if (Validade == -1) {
            throw new IllegalArgumentException("Encomenda não existe");
        }
        encomendas.get(Validade).entregue = true;
        encomendas.remove(Validade);
        System.out.println("<< Encomenda Entregue >>");
        return true;
    }
}