package service;

import java.util.List;
import model.DoacaoEfetivada;

public class RelatorioService {

    public static void gerarRelatorio(List<DoacaoEfetivada> doacoes) {

        System.out.println("\n===== RELATÓRIO DE DOAÇÕES =====");

        if (doacoes.isEmpty()) {
            System.out.println("Nenhuma doação registrada.");
            return;
        }

        for (DoacaoEfetivada d : doacoes) {
            System.out.println(d);
        }
    }
}