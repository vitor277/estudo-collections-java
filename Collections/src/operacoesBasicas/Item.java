package operacoesBasicas;

public class Item {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public Item(String descricao){
        this.descricao = descricao;
    }

    public String toString(){
        return descricao;
    }

    
}
