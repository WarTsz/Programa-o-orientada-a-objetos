public class filme_exercicio {
    public class Filme {
        String nome = "";
        double duracao = 0;
        double nota = 0;
        boolean assistido = false;
    void exibir(Filme filme) {
        System.out.println("\nNome:"+filme.nome+"\nDuracao:"+filme.duracao+"\nnota:"+filme.nota+"\nassistido:"+filme.assistido);
    }
    void marcar_assistido(Filme filme) {
        filme.assistido = true;
    }
    void dar_nota(Filme filme, double nota) {
        if (nota<0 || nota>10) {
            System.out.println("Nota inválida");
        }
        else {
            marcar_assistido(filme);
            filme.nota = nota;
        }
    }
    }
    public void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.duracao = 2.45;
        filme1.nome = "João pedro e o peixe assassino";
        filme1.exibir(filme1);
        filme1.dar_nota(filme1, 666.0);
        filme1.exibir(filme1);
        filme1.dar_nota(filme1, 7.0);
        filme1.exibir(filme1);
        }
}
