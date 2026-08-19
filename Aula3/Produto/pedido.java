public class pedido {
    cliente cliente;
    produto produto;
    int quantidade;
    pedido(cliente cliente_atual, produto produto_desejado, int qtd) {
        cliente = cliente_atual;
        produto = produto_desejado;
        quantidade = qtd;
    }
void resumo(pedido pedido_atual) {
    System.out.println("\nCliente:"+pedido_atual.cliente.nome+"\nProduto:"+pedido_atual.produto.nome+"\nValor Total:"+pedido_atual.produto.preco*pedido_atual.quantidade+"\n");
}
}