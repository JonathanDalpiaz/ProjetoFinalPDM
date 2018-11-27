package whatfood.whatfood.model;

public class IngredienteUsuario {

    private String id;
    private String nomeIngrediente;
    private String quantidade;
    private String medidaQuantidade;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getMedidaQuantidade() {
        return medidaQuantidade;
    }

    public void setMedidaQuantidade(String medidaQuantidade) {
        this.medidaQuantidade = medidaQuantidade;
    }



}
