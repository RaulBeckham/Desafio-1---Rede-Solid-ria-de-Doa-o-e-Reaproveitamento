package repository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import model.ItemDoacao;

public class ArquivoRepository {

    private static final String ARQUIVO = "itens.csv";

    public static void salvar(List<ItemDoacao> itens) {

        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(ARQUIVO))) {

            for (ItemDoacao item : itens) {

                bw.write(
                        item.getId() + ";" +
                        item.getNome() + ";" +
                        item.getCategoria() + ";" +
                        item.getQuantidade() + ";" +
                        item.getStatus()
                );

                bw.newLine();
            }

            System.out.println("Dados salvos com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }
}