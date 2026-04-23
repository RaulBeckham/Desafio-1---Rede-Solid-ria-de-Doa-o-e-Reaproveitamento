package model;

import java.time.LocalDate;

public class ItemDoacao {
    private int id;
    private String nome;
    private String categoria;
    private String descricao;
    private int quantidade;
    private String estado;
    private LocalDate dataCadastro;
    private String status;

    public ItemDoacao(int id, String nome, String categoria, String descricao,
                      int quantidade, String estado) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estado = estado;
        this.dataCadastro = LocalDate.now();
        this.status = "disponivel";
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "ID: " + id + " | Item: " + nome + " | Categoria: " + categoria + " | Qtd: " + quantidade + " | Estado: " + estado + " | Status: " + status + " | Data: " + dataCadastro;
    }
}
