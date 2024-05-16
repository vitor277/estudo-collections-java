package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    } 
    
    public void adicionarItem(String descricao){
        itemList.add(new Item(descricao));
    }

    public void removeritem(String descricao){
        List<Item> itensRemover = new ArrayList<>();
        for(Item i : itemList){
            if(i.getDescricao().equalsIgnoreCase(descricao)){
                itensRemover.add(i);
            }
        }
        itemList.removeAll(itensRemover);
    }

    public int numeroTotalItens(){
        return itemList.size();
    }

    public void obterDescricaoItens(){
        System.out.println(itemList.toString());
    }

    //TESTE DE FUNCIONAMENTO
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("camiseta");
        carrinhoDeCompras.adicionarItem("camiseta");
        carrinhoDeCompras.adicionarItem("calça");
        
        System.out.println("O numero total de elementos na lista é " + carrinhoDeCompras.numeroTotalItens());
        carrinhoDeCompras.removeritem("camiseta");
        System.out.println("O numero total de elementos na lista é " + carrinhoDeCompras.numeroTotalItens());

        carrinhoDeCompras.obterDescricaoItens();
    }
    
}