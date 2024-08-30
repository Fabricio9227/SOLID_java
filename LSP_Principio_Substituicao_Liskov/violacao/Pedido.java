package LSP_Principio_Substituicao_Liskov.violacao;

import java.util.List;

public class Pedido {

    private int id;

    private String descricao;
    
    private List<Item> itens;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> items) {
        this.itens = items;
    }

}