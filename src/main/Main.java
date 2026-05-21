import java.util.Scanner;
import util.MenuController;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        repository.DoadorRepository doadorRepository = new repository.DoadorRepository();
        repository.BeneficiarioRepository beneficiarioRepository = new repository.BeneficiarioRepository();
        repository.ItemRepository itemRepository = new repository.ItemRepository();
        repository.SolicitacaoRepository solicitacaoRepository = new repository.SolicitacaoRepository();
        service.SolicitacaoService solicitacaoService = new service.SolicitacaoService(solicitacaoRepository);

        MenuController.iniciarMenu(sc, doadorRepository, beneficiarioRepository, itemRepository, solicitacaoService);
        sc.close();
    }
}

