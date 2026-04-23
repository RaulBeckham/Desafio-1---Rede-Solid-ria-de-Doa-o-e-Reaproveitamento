package main;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class Main {

    static ArrayList<Doador> doadores = new ArrayList<>();
    static ArrayList<Beneficiario> beneficiarios = new ArrayList<>();
    static ArrayList<ItemDoacao> itens = new ArrayList<>();
    static int idDoador = 1;
    static int idBeneficiario = 1;
    static int idItem = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Doador");
            System.out.println("2 - Cadastrar Beneficiario");
            System.out.println("3 - Cadastrar Item");
            System.out.println("4 - Listar Doadores");
            System.out.println("5 - Listar Beneficiarios");
            System.out.println("6 - Listar Itens");
            System.out.println("0 - Sair");

            opcao = -1;
            try {
                opcao = sc.nextInt();
                sc.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro: Opção deve ser um número. Tente novamente.");
                sc.nextLine(); // consume invalid input
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeD = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telD = sc.nextLine();
                    System.out.print("Email: ");
                    String emailD = sc.nextLine();
                    System.out.print("Endereço: ");
                    String endD = sc.nextLine();
                    doadores.add(new Doador(idDoador++, nomeD, telD, emailD, endD));
                    System.out.println("Doador cadastrado com sucesso!");
                    break;

                case 2:
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
                    System.out.print("Prioridade: ");
                    int prioridade = -1;
                    try {
                        prioridade = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Prioridade deve ser um número inteiro. Tente novamente.");
                        continue;
                    }
                    beneficiarios.add(new Beneficiario(
                            idBeneficiario++, nomeB, telB, emailB, endB, tipo, prioridade));
                    System.out.println("Beneficiário cadastrado com sucesso!");
                    break;

                