package model;

public class Solicitacao {

    private int id;
    private Beneficiario beneficiario;
    private ItemDoacao item;
    private int quantidadeSolicitada;
    private String justificativa;
    private String status;

    // CONSTRUTOR COMPLETO
    public Solicitacao(int id,
                       Beneficiario beneficiario,
                       ItemDoacao item,
                       int quantidadeSolicitada,
                       String justificativa) {

        this.id = id;
        this.beneficiario = beneficiario;
        this.item = item;
        this.quantidadeSolicitada = quantidadeSolicitada;
        this.justificativa = justificativa;
        this.status = "PENDENTE";
    }

    // CONSTRUTOR SIMPLIFICADO
    public Solicitacao(
            Beneficiario beneficiario,
            ItemDoacao item,
            int quantidadeSolicitada) {

        this.beneficiario = beneficiario;
        this.item = item;
        this.quantidadeSolicitada = quantidadeSolicitada;
        this.status = "PENDENTE";
    }

    public int getId() {
        return id;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public ItemDoacao getItem() {
        return item;
    }

    public int getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {

        return "Solicitação ID: " + id +
               " | Beneficiário: " + beneficiario.getNome() +
               " | Item: " + item.getNome() +
               " | Quantidade: " + quantidadeSolicitada +
               " | Status: " + status;
    }
}