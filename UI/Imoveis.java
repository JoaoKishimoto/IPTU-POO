package UI;

import Imovel.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import Prefeitura.Prefeitura;
import Responsavel.PessoaJuridica;
import Responsavel.Responsavel;

public class Imoveis {
    public static void startMenu(Scanner scanner, Prefeitura prefeitura) {
        int choice = 0;
        while (choice != 3) {
            UI.clearScreen();
            System.out.println("\n--- Imóveis ---");
            System.out.println("1. Cadastrar imóvel");
            System.out.println("2. Listar imóveis");
            System.out.println("3. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1 -> {
                    UI.clearScreen();
                    System.out.println("Qual o tipo de Imóvel?");
                    System.out.println("1. Casa");
                    System.out.println("2. Apartamento");
                    System.out.println("3. Terreno");
                    System.out.println("4. Ponto Comercial");

                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolha) {
                        case 1 -> cadastrarCasa(scanner, prefeitura);
                        case 2 -> cadastrarApartamento(scanner, prefeitura);
                        case 3 -> cadastrarTerreno(scanner, prefeitura);
                        case 4 -> cadastrarPontoComercial(scanner, prefeitura);
                        default -> System.out.println("Opção inválida.");
                    }

                    System.out.println("\nPressione Enter para continuar...");
                    scanner.nextLine();

                    return;
                }
                case 2 -> {
                    UI.clearScreen();
                    listImoveis(prefeitura);
                    
                    scanner.nextLine();
                    System.out.println("\nPressione Enter para continuar...");
                    scanner.nextLine();

                    return;
                }
                case 3 -> {
                    UI.clearScreen();
                    System.out.println("Saindo...");
                    return;
                }
                default -> throw new AssertionError();
            }
        }
    }

    public static void cadastrarCasa(Scanner scanner, Prefeitura prefeitura) {
        UI.clearScreen();
        Endereco endereco = coletarEndereco(scanner);
        double valor = coletarDouble(scanner, "Valor do imóvel: ");
        Responsavel responsavel = escolherResponsavel(scanner, prefeitura);
        double areaTerreno = coletarDouble(scanner, "Área do terreno: ");
        double areaConstruida = coletarDouble(scanner, "Área construída: ");

        Casa casa = new Casa(responsavel, valor, endereco, areaTerreno, areaConstruida);
        prefeitura.adicionarImovel(casa);

        System.out.println("Casa cadastrada com sucesso!");
    }

    public static void cadastrarApartamento(Scanner scanner, Prefeitura prefeitura) {
        UI.clearScreen();
        Endereco endereco = coletarEndereco(scanner);
        double valor = coletarDouble(scanner, "Valor do imóvel: ");
        Responsavel responsavel = escolherResponsavel(scanner, prefeitura);
        double areaPrivativa = coletarDouble(scanner, "Área privativa: ");
        int andar = coletarInt(scanner, "Andar: ");

        Apartamento ap = new Apartamento(responsavel, valor, endereco, areaPrivativa, andar);
        prefeitura.adicionarImovel(ap);

        System.out.println("Apartamento cadastrado com sucesso!");
    }         

    public static void cadastrarTerreno(Scanner scanner, Prefeitura prefeitura) {
        UI.clearScreen();
        Endereco endereco = coletarEndereco(scanner);
        double valor = coletarDouble(scanner, "Valor do imóvel: ");
        Responsavel responsavel = escolherResponsavel(scanner, prefeitura);
        double area = coletarDouble(scanner, "Área do terreno: ");

        Terreno terreno = new Terreno(responsavel, valor, endereco, area);
        prefeitura.adicionarImovel(terreno);

        System.out.println("Terreno cadastrado com sucesso!");
    }

    public static void cadastrarPontoComercial(Scanner scanner, Prefeitura prefeitura) {
        UI.clearScreen();
        Endereco endereco = coletarEndereco(scanner);
        double valor = coletarDouble(scanner, "Valor do imóvel: ");
        PessoaJuridica responsavel = escolherPessoaJuridica(scanner, prefeitura);
        double area = coletarDouble(scanner, "Valor do imóvel: ");

        PontoComercial pontoComercial = new PontoComercial(responsavel, valor, endereco, area);
        prefeitura.adicionarImovel(pontoComercial);

        System.out.println("Ponto Comercial cadastrado com sucesso!");
    }
    
    //metodos auxiliares para cadastro de imoveis

    private static Endereco coletarEndereco(Scanner scanner) {
        UI.clearScreen();
        System.out.print("Rua: ");
        String rua = scanner.nextLine();

        System.out.print("Número: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();

        return new Endereco(rua, bairro, numero);
    }

    private static double coletarDouble(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }

    private static int coletarInt(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    private static Responsavel escolherResponsavel(Scanner scanner, Prefeitura prefeitura) {

        ArrayList<Responsavel> responsaveis = prefeitura.getListaResponsaveis();
        if (responsaveis.isEmpty()) {
            System.out.println("Nenhum responsável cadastrado.");
            return null;
        }

        int contador = 1;
        for (Responsavel respon : responsaveis) {
            System.out.println((contador++) + " - " + respon.toString());
        }

        System.out.print("Escolha o número do responsável: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indice >= 0 && indice < responsaveis.size()) {
            return responsaveis.get(indice);
        } else {
            System.out.println("Opção inválida.");
            return null;
        }
    }

    private static PessoaJuridica escolherPessoaJuridica(Scanner scanner, Prefeitura prefeitura) {

        ArrayList<Responsavel> responsaveis = prefeitura.getListaResponsaveis();
        ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>();

        for (Responsavel respon : responsaveis) {
            if (respon instanceof PessoaJuridica) {
                pessoasJuridicas.add((PessoaJuridica) respon);
            }
        }

        if (pessoasJuridicas.isEmpty()) {
            System.out.println("Nenhum responsável cadastrado.");
            return null;
        }

        int contador = 1;
        for (Responsavel respon : pessoasJuridicas) {
            System.out.println((contador++) + " - " + respon.toString());
        }

        System.out.print("Escolha o número do responsável: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indice >= 0 && indice < pessoasJuridicas.size()) {
            return (PessoaJuridica) pessoasJuridicas.get(indice);
        } else {
            System.out.println("Opção inválida.");
            return null;
        }
    }

    private static void listImoveis(Prefeitura prefeitura) {
        HashMap<Imovel, Responsavel> list = prefeitura.getListaImoveis();
        for (Imovel i : list.keySet()) {
            System.out.println(i.toString());
        }
    }
}
