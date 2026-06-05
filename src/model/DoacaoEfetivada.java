package model;

import java.time.LocalDate;

public class DoacaoEfetivada {

    private int id;
    private ItemDoacao item;
    private Beneficiario beneficiario;
    private LocalDate data;

    public DoacaoEfetivada(
            int id,
            ItemDoacao item,
            Beneficiario beneficiario) {

        this.id = id;
        this.item = item;
        this.beneficiario = beneficiario;
        this.data = LocalDate.now();
    }

    public ItemDoacao getItem() {
        return item;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Doação #" + id +
                " | Item: " + item.getNome() +
                " | Beneficiário: " + beneficiario.getNome() +
                " | Data: " + data;
    }
}