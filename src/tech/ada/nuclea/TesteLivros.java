package tech.ada.nuclea;

public class TesteLivros {
    public static void main(String[] args) {

        Autor autor  = new Autor("Machado de Assis", "Brasileiro");
        Livro livro = new Livro(autor, "Literatura Brasileira");

        System.out.println(livro.autor.nome);
        System.out.println(livro.autor.nacionalidade);
        System.out.println(livro.genero);


    }
}
