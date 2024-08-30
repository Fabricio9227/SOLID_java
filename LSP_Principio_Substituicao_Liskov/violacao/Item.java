package LSP_Principio_Substituicao_Liskov.violacao;

public class Item {

    private int id;

    private int quantidade;

    private String descricao;

    private boolean embalado;

    public boolean emEstoque() {
        return quantidade > 0;
    }

    public boolean foiEmbalado() {
        return embalado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEmbalado(boolean embalado) {
        this.embalado = embalado;
    }

}