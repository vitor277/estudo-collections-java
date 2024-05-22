package ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ordenacaoPessoa {
    
    private List<Pessoa> pessoaList;

    public ordenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;

    }
    

    public static void main(String[] args) {
        ordenacaoPessoa ordenacaoPessoa = new ordenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 25, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 26, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 30, 1.66);
        
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println("--------------------------------------");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }



    
}
