package catalogoLivros;

public class Main {
    public static void main(String[] args){

        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.addLivro("Livro1 ", "Autor1", 2000);
        catalogoLivros.addLivro("Livro1", "Autor2", 2001);
        catalogoLivros.addLivro("Livro2", "Autor2", 2002);
        catalogoLivros.addLivro("Livro3", "Autor3", 2003);
        catalogoLivros.addLivro("Livro4", "Autor4", 2004);
        catalogoLivros.addLivro("Livro5", "Autor4", 2005);

        System.out.println("Pesquisa por Autor:");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));
        System.out.println();

        System.out.println("Pesquisa por intervalo de anos: 2001 - 2003");
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2001, 2003));
        System.out.println();

        System.out.println("Pesquisa por titulo: 'Livro1'");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro1"));
    }
}
