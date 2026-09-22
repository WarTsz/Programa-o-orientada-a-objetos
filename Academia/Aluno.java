public class Aluno {
    private String nome;
    private int idade;
    private Plano plano;
    Aluno(String newnome,int newidade,Plano newplano) throws IllegalArgumentException {
        if (newplano == null) {
            throw new IllegalArgumentException("Plano invalido");
        }
        this.nome = newnome;
        this.idade = newidade;
        this.plano = newplano;
    }
    public double ValorDaMensalidade() {
        // System.out.println("Valor da mensalidade: "+plano.getMensalidade()+" \n");
        return plano.getMensalidade();
    }
    public int DiaDaMatricula() {
        return plano.getDia();
    }
    public boolean PagarMensalidade(double valor) {
        return plano.PagarMensalidade(valor);
    }
}
