package set.operacoesBasicas;

import java.util.Set;
import java.util.HashSet;

/**
 * ConjuntoConvidados
 */
public class ConjuntoConvidados {

    //atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover= null;
        for(Convidado c: convidadoSet){
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados dentro do Set Convidados");

        conjuntoConvidados.adicionarConvidado("Junior", 1);
        conjuntoConvidados.adicionarConvidado("Antonio", 2);
        conjuntoConvidados.adicionarConvidado("Vitor", 3);
        conjuntoConvidados.adicionarConvidado("Douglas", 4);
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " dentro do Set Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2);
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " dentro do Set Convidados");


    }

}

