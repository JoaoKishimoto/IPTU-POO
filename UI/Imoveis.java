package UI;

import Imovel.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import Prefeitura.Prefeitura;

public class Imoveis {
    public static void startMenu(Scanner scanner, Prefeitura Optional.ofNullable(prefeitura)) {
        int choice = 0;
                            
        System.out.println("\n--- Bem vindo ao painel do Imoveis ---");
        
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
                    scanner.nextLine(); // Limpa quebra de linha

                    switch (escolha) {
                        case 1 -> cadastrarCasa(scanner, prefeitura);
                        case 2 -> cadastrarApartamento(scanner, prefeitura);
                        case 3 -> cadastrarTerreno(scanner, prefeitura);
                        case 4 -> cadastrarPontoComercial(scanner, prefeitura);
                        default -> System.out.println("Opção inválida.");
                    }
                }
                case 2 -> {
                    UI.clearScreen();
                    listaImoveis();
                }
                case 3 -> {
                    UI.clearScreen();
                    System.out.println("Saindo...");
                }
                default -> throw new AssertionError();
            }
        }
    }

    public static void cadastrarCasa(Scanner scanner, Prefeitura prefeitura) {
        Endereco endereco = coletarEndereco(scanner);
        double valor = coletarValor(scanner);
        Responsavel responsavel = escolherResponsavel(scanner, prefeitura);

        Casa casa = new Casa(endereco, valor, responsavel);
        prefeitura.adicionarImovel(casa);

        System.out.println("Casa cadastrada com sucesso!");
    }

    public static void cadastrarApartamento(Scanner scanner, Prefeitura prefeitura) {
        Endereco endereco = coletarEndereco(scanner);
        double valor = coletarValor(scanner);
        Responsavel responsavel = escolherResponsavel(scanner, prefeitura);

        Apartamento ap = new Apartamento(endereco, valor, responsavel);
        prefeitura.adicionarImovel(ap);

        System.out.println("Apartamento cadastrado com sucesso!");
    }         

    public static void cadastrarTerreno(Scanner scanner, Prefeitura prefeitura) {
        Endereco endereco = coletarEndereco(scanner);
        double valor = coletarValor(scanner);
        Responsavel responsavel = escolherResponsavel(scanner, prefeitura);

        Terreno terreno = new Terreno(endereco, valor, responsavel);
        prefeitura.adicionarImovel(terreno);

        System.out.println("Terreno cadastrado com sucesso!");
    }

    public static void cadastrarPontoComercial(Scanner scanner, Prefeitura prefeitura) {
        Endereco endereco = coletarEndereco(scanner);
        double valor = coletarValor(scanner);
        Responsavel responsavel = escolherResponsavel(scanner, prefeitura);

        Terreno terreno = new PontoComercial(endereco, valor, responsavel);
        prefeitura.adicionarImovel(terreno);

        System.out.println("Ponto Comercial cadastrado com sucesso!");
    }
    //metodos auxiliares para cadastro de imoveis

    private static Endereco coletarEndereco(Scanner scanner) {
        System.out.print("Rua: ");
        String rua = scanner.nextLine();

        System.out.print("Número: ");
        String numero = scanner.nextLine();

        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();

        return new Endereco(rua, numero, bairro);
    }

    private static double coletarValor(Scanner scanner) {
        System.out.print("Valor do imóvel: ");
        double valor = scanner.nextDouble();
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
            System.out.println((contador++) + " - " + respon.getNome());
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

    private static void listImoveis(Prefeitura prefeitura) {
        HashMap<Imovel, Responsavel> list = prefeitura.getListaImoveis();
        for (Imovel i : list.keySet()) {
            System.out.println(i.toString());
        }
    }
}
