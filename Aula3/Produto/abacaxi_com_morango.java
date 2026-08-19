public class abacaxi_com_morango {
    public static void main(String[] args) {
        cliente cliente01 = new cliente("João","");
        cliente cliente02 = new cliente("Shaolim_mata_porco","");
        produto feijao = new produto("feijao",30);
        produto cerebro_porco = new produto("cerebro_de_porco",666);
        pedido primeiro = new pedido(cliente01,feijao,40);
        pedido segundo = new pedido(cliente02,cerebro_porco,666);
        primeiro.resumo(primeiro);
        segundo.resumo(segundo);
    }
}