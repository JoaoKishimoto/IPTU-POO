package UI;

import java.util.Scanner;
import Responsavel.PessoaFisica;
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
            
            switch (choice) {
                case 1 -> {
                    System.out.println("Qual o nome do Responsável?");
                    String nome = scanner.nextLine();
                    System.out.println("Qual o CPF do Responsável?");
                    String cpf = scanner.nextLine();
                    System.out.println("Qual a idade do Responsável?");
                    int idade = scanner.nextInt();
                    PessoaFisica responsavel = new PessoaFisica(nome, cpf, idade);
                    System.out.println("Responsável adicionado!");
                    prefeitura.adicionarResponsavel(responsavel);
                    return;
                }
                case 2 -> {
                    UI.clearScreen();
                    
                    for (Responsavel responsavel : prefeitura.getListaResponsaveis()) {
                        System.out.println(responsavel.toString());
                    }
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
}
