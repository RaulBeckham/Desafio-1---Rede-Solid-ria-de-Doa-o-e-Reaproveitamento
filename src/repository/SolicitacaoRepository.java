package repository;

import java.util.ArrayList;
import model.Solicitacao;

public class SolicitacaoRepository {

    private ArrayList<Solicitacao> solicitacoes = new ArrayList<>();

    public void adicionarSolicitacao(Solicitacao solicitacao) {
        solicitacoes.add(solicitacao);
    }

    public ArrayList<Solicitacao> listarSolicitacoes() {
        return solicitacoes;
    }
}