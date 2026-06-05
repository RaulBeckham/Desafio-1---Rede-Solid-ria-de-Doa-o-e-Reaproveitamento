package service;

import model.ItemDoacao;
import model.Solicitacao;
import repository.SolicitacaoRepository;

public class SolicitacaoService {

    private SolicitacaoRepository solicitacaoRepository;

    public SolicitacaoService(SolicitacaoRepository solicitacaoRepository) {
        this.solicitacaoRepository = solicitacaoRepository;
    }
    
    if (!item.getStatus().equalsIgnoreCase("DISPONIVEL")) {

    solicitacao.setStatus("REJEITADA");

    System.out.println(
            "Solicitação rejeitada. Item indisponível.");

    return;
}

    public boolean validarQuantidade(ItemDoacao item, int quantidadeSolicitada) {

    if (quantidadeSolicitada > item.getQuantidade()) {
        return false;
    }

    return true;
   } 

   public void criarSolicitacao(Solicitacao solicitacao) {

    boolean quantidadeValida = validarQuantidade(
            solicitacao.getItem(),
            solicitacao.getQuantidadeSolicitada());

   if (quantidadeValida) {

    solicitacao.setStatus("APROVADA");

    ItemDoacao item = solicitacao.getItem();

    int novaQuantidade =
            item.getQuantidade() - solicitacao.getQuantidadeSolicitada();

    item.setQuantidade(novaQuantidade);

    if (item.getQuantidade() == 0) {
    item.setStatus("ENTREGUE");
    } else {
    item.setStatus("DISPONIVEL");
    }

    solicitacaoRepository.adicionarSolicitacao(solicitacao);

    System.out.println("Solicitação aprovada!");

}
}

}
