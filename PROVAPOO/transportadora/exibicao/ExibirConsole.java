package transportadora.exibicao;
public class ExibirConsole implements Exibivel {
    public ExibirConsole() {
    }
    @Override
    public void enviar(String relatorio) {
        System.out.println(relatorio);
    }
}