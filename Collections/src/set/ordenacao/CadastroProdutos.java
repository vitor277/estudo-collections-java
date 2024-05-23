package set.ordenacao;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class CadastroProdutos {
    
    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibiProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        
        cadastroProdutos.adicionarProduto(1L, "Produto 1", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Aroduto 2", 25d, 15);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 10);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 45d, 1);
        //System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirPorPreco());
    }

}


