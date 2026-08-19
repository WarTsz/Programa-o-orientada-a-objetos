public class Livro {
    String titulo;
    Autor autor;
    int[] data;
    boolean disponivel;
Livro(String titulo_do_livro, Autor autor_do_livro, int[] data_do_livro,boolean disponibilidade) {
    titulo = titulo_do_livro;
    autor = autor_do_livro;
    data = data_do_livro;
    disponivel = disponibilidade;
}
void exibir_ficha(Livro livro) {
    System.out.println("Informações sobre o livro:\nTitulo:"+livro.titulo+"\nAutor:"+livro.autor.nome+"\nData_do_livro:"+livro.data+"\nDisponivel:"+livro.disponivel);
}
void emprestar(Livro livro) {
    if (livro.disponivel == false) {
        System.out.println("Livro já foi emprestado");
    }
    else {
        livro.disponivel = false;
        System.out.println("Você emprestou o livro "+livro.autor.nome+".");
    }
}
void devolver(Livro livro) {
    if (livro.disponivel == true) {
        System.out.println("Livro já foi devolvido");
    }
    else {
        livro.disponivel = true;
        System.out.println("Você devolveu o livro "+livro.autor.nome+".");
    }
}
}