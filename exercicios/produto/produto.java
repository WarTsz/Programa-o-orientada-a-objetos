public class produto {
    public class produtos {
        String nome = "";
        double preco = 0;
        int estoque = 0;
    void exibir(produtos produto){
        System.out.println("\nNome: "+produto.nome+"\npreco: "+produto.preco+"\nestoque: "+produto.estoque);
    }
    void vender(produtos produto,int quantidade) {
        if (quantidade>produto.estoque) {
            return;}
        produto.estoque = produto.estoque - quantidade;
    }
    }
    public void main(String[] args) {
        produtos arroz = new produtos();
        produtos frango = new produtos();
        produtos feijao = new produtos();
        arroz.preco = 6.66; arroz.estoque = 69; arroz.nome = "arroz";
        frango.preco = 22; frango.estoque = 67; frango.nome = "frango";
        feijao.preco = 13; feijao.estoque = 99; feijao.nome = "feijao";
        arroz.exibir(arroz);feijao.exibir(feijao);frango.exibir(frango);
    }
}
