package UI;

import java.util.Scanner;

import Responsavel.PessoaFisica;
import Responsavel.PessoaJuridica;
import Responsavel.Responsavel;

import Prefeitura.Prefeitura;

public class Responsaveis {
    public static void startMenu(Scanner scanner, Prefeitura prefeitura) {
        int choice = 0;
        
        System.out.println("\n--- Responsáveis ---");
        
        while (choice != 3) {
            UI.clearScreen();
            System.out.println("1. Cadastrar responsável");
            System.out.println("2. Listar responsáveis");
            System.out.println("3. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()
            
            switch (choice) {
                case 1 -> {
                    UI.clearScreen();
                    System.out.println("---- Cadastrar Responsável ----");
                    
                    System.out.println("Qual o tipo de responsável?");
                    System.out.println("1. Pessoa Física");
                    System.out.println("2. Pessoa Jurídica");

                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character left by nextInt()

                    if (tipo == 1) {
                        registerPessoaFisica(scanner, prefeitura);
                    } else if (tipo == 2) {
                        registerPessoaJuridica(scanner, prefeitura);
                    } else {
                        System.out.println("Opção inválida. Tente novamente.");
                    }

                    return;
                }
                case 2 -> {
                    UI.clearScreen();
                    
                    for (Responsavel responsavel : prefeitura.getListaResponsaveis()) {
                        System.out.println(responsavel.toString());
                    }

                    System.out.println("\nPressione Enter para continuar...");
                    scanner.nextLine();

                    return;
                }
                case 3 -> {
                    System.out.println("Saindo de Responsáveis");
                    return;
                }

                default -> throw new AssertionError();
            }
        }
    }

    public static void registerPessoaFisica(Scanner scanner, Prefeitura prefeitura) {
        System.out.println("---- Cadastrar Pessoa Física ----");
        
        System.out.println("Qual o nome do Responsável?");
        String nome = scanner.nextLine();
        System.out.println("Qual o CPF do Responsável?");
        String cpf = scanner.nextLine();
        System.out.println("Qual a idade do Responsável?");
        int idade = scanner.nextInt();
        
        PessoaFisica responsavel = new PessoaFisica(nome, cpf, idade);
        prefeitura.adicionarResponsavel(responsavel);
        
        System.out.println("Responsável adicionado!");
    }

    public static void registerPessoaJuridica(Scanner scanner, Prefeitura prefeitura) {
        System.out.println("---- Cadastrar Pessoa Jurídica ----");
        
        System.out.println("Qual o nome do Responsável?");
        String nome = scanner.nextLine();
        System.out.println("Qual o CNPJ do Responsável?");
        String cnpj = scanner.nextLine();
        System.out.println("Qual o ano de fundação do Responsável?");
        int anoDeFundacao = scanner.nextInt();
        
        PessoaJuridica responsavel = new PessoaJuridica(nome, cnpj, anoDeFundacao);
        prefeitura.adicionarResponsavel(responsavel);
        
        System.out.println("Responsável adicionado!");
    }
}