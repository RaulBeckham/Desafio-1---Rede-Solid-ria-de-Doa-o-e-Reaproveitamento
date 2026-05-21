package util;

import java.util.Scanner;
import model.Beneficiario;
import model.Doador;
import model.ItemDoacao;
import model.Solicitacao;
import repository.BeneficiarioRepository;
import repository.DoadorRepository;
import repository.ItemRepository;
import service.SolicitacaoService;

public class MenuController {

    private static int idDoador = 1;
    private static int idBeneficiario = 1;
    private static int idItem = 1;

    public static void iniciarMenu(
            Scanner sc,
            DoadorRepository doadorRepository,
            BeneficiarioRepository beneficiarioRepository,
            ItemRepository itemRepository,
            SolicitacaoService solicitacaoService) {

        int opcao;
        do {
            MenuUtil.exibirMenu();
            opcao = lerOpcao(sc);
            if (opcao == -1) {
                continue;
            }

            switch (opcao) {
                case 1: cadastrarDoador(sc, doadorRepository);
                case 2: cadastrarBeneficiario(sc, beneficiarioRepository);
                case 3: cadastrarItem(sc, itemRepository);
                case 4: doadorRepository.listarDoadores().forEach(System.out::println);
                case 5: beneficiarioRepository.listarBeneficiarios().forEach(System.out::println);
                case 6: itemRepository.listarItens().forEach(System.out::println);
                case 7: solicitarItem(sc, beneficiarioRepository, itemRepository, solicitacaoService);
                default: {
                }
            }
        } while (opcao != 0);
    }

    private static int lerOpcao(Scanner sc) {
        try {
            int opcao = sc.nextInt();
            sc.nextLine();
            return opcao;
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Opção deve ser um número. Tente novamente.");
            sc.nextLine();
            return -1;
        }
    }

    private static void cadastrarDoador(Scanner sc, DoadorRepository doadorRepository) {
        System.out.print("Nome: ");
        String nomeD = sc.nextLine();
        System.out.print("Telefone: ");
        String telD = sc.nextLine();
        System.out.print("Email: ");
        String emailD = sc.nextLine();
        System.out.print("Endereço: ");
        String endD = sc.nextLine();

        doadorRepository.adicionarDoador(new Doador(idDoador++, nomeD, telD, emailD, endD));
        System.out.println("Doador cadastrado com sucesso!");
    }

    private static void cadastrarBeneficiario(Scanner sc, BeneficiarioRepository beneficiarioRepository) {
        System.out.print("Nome: ");
        String nomeB = sc.nextLine();
        System.out.print("Telefone: ");
        String telB = sc.nextLine();
        System.out.print("Email: ");
        String emailB = sc.nextLine();
        System.out.print("Endereço: ");
        String endB = sc.nextLine();
        System.out.print("Tipo: ");
        String tipo = sc.nextLine();

        Integer prioridade = lerInteiro(sc, "Prioridade: ", "Erro: Prioridade deve ser um número inteiro. Tente novamente.");
        if (prioridade == null) {
            return;
        }

        beneficiarioRepository.adicionarBeneficiario(new Beneficiario(idBeneficiario++, nomeB, telB, emailB, endB, tipo, prioridade));
        System.out.println("Beneficiário cadastrado com sucesso!");
    }

    private static void cadastrarItem(Scanner sc, ItemRepository itemRepository) {
        System.out.print("Nome do item: ");
        String nomeItem = sc.nextLine();
        System.out.print("Categoria: ");
        String cat = sc.nextLine();
        System.out.print("Descrição: ");
        String desc = sc.nextLine();

        Integer qtd = lerInteiro(sc, "Quantidade: ", "Erro: Quantidade deve ser um número inteiro. Tente novamente.");
        if (qtd == null) {
            return;
        }

        System.out.print("Estado (ex: bom, ruim, danificado): ");
        String estado = sc.nextLine();

        itemRepository.adicionarItemDoado(new ItemDoacao(idItem++, nomeItem, cat, desc, qtd, estado));
        System.out.println("Item cadastrado com sucesso!");
    }

    private static void solicitarItem(
            Scanner sc,
            BeneficiarioRepository beneficiarioRepository,
            ItemRepository itemRepository,
            SolicitacaoService solicitacaoService) {

        if (beneficiarioRepository.listarBeneficiarios().isEmpty()) {
            System.out.println("Nenhum beneficiário cadastrado.");
            return;
        }

        beneficiarioRepository.listarBeneficiarios().forEach(System.out::println);

        Integer idBeneficiarioSolicitacao = lerInteiro(sc, "Digite o ID do beneficiário: ", "Erro: ID deve ser um número inteiro. Tente novamente.");
        if (idBeneficiarioSolicitacao == null) {
            return;
        }

        Beneficiario beneficiario = beneficiarioRepository.buscarPorId(idBeneficiarioSolicitacao);
        if (beneficiario == null) {
            System.out.println("Beneficiário não encontrado.");
            return;
        }

        if (itemRepository.listarItens().isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
            return;
        }

        itemRepository.listarItens().forEach(System.out::println);

        Integer idItemSolicitado = lerInteiro(sc, "Digite o ID do item: ", "Erro: ID deve ser um número inteiro. Tente novamente.");
        if (idItemSolicitado == null) {
            return;
        }

        ItemDoacao item = itemRepository.buscarPorId(idItemSolicitado);
        if (item == null) {
            System.out.println("Item não encontrado.");
            return;
        }

        Integer quantidadeSolicitada = lerInteiro(sc, "Digite a quantidade desejada: ", "Erro: Quantidade deve ser um número inteiro. Tente novamente.");
        if (quantidadeSolicitada == null) {
            return;
        }

        if (quantidadeSolicitada <= 0) {
            System.out.println("Quantidade inválida.");
            return;
        }

        Solicitacao solicitacao = new Solicitacao(beneficiario, item, quantidadeSolicitada);
        solicitacaoService.criarSolicitacao(solicitacao);
    }

    private static Integer lerInteiro(Scanner sc, String prompt, String erroMensagem) {
        System.out.print(prompt);
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(erroMensagem);
            return null;
        }
    }
}
