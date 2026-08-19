public class suco_de_maracuja {
    public void main(String[] args) {
        int[] data = {2000,8,27};
        Autor primeiro_autor = new Autor("Stalin-da","URSS");
        Autor segundo_autor = new Autor("Pol-pot","Camboja");
        Livro primeiro_livro = new Livro("As presepadas de Stalin na Rússia",primeiro_autor,data,true);
        Livro segundo_livro = new Livro("A baguncinha no Camboja",segundo_autor,data,true);
        primeiro_livro.emprestar(primeiro_livro);
        primeiro_livro.exibir_ficha(primeiro_livro);
        segundo_livro.exibir_ficha(segundo_livro);
        segundo_livro.devolver(segundo_livro);
        primeiro_livro.devolver(primeiro_livro);

    }
}