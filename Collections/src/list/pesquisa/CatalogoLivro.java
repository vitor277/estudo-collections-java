package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    private List<Livro> livroList;

    public CatalogoLivro() {this.livroList = new ArrayList<>();}

    public void adicionarLivro(String titulo, String autor, int dataPublicacao){
        livroList.add(new Livro(titulo, autor, dataPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList ){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){

        List<Livro> livrosPorIntervaloAnos= new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;

    }

    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("Livro 1", "Autor 1", 2010);
        catalogoLivro.adicionarLivro("Livro 2", "Autor 2", 2020);
        catalogoLivro.adicionarLivro("Livro 3", "Autor 2", 2002);
        catalogoLivro.adicionarLivro("Livro 1", "Autor 4", 1995);
        catalogoLivro.adicionarLivro("Livro 5", "Autor 5", 2000);

        
       // System.out.println(catalogoLivro.pesquisarPorAutor("Autor 2"));
       // System.out.println(catalogoLivro.pesquisaPorIntervaloAnos(1995, 2003));
        System.out.println(catalogoLivro.pesquisaPorTitulo("Livro 1"));

    }

}
