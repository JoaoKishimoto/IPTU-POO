package UI;

import java.util.Scanner;

import Prefeitura.Prefeitura;

public class PrefeituraUI {
    public static void startMenu(Scanner scanner, Prefeitura prefeitura) {
        int choice = 0;

        System.out.println("\n--- Bem vindo ao painel do Imoveis ---");

        while (choice != 2) {
            UI.clearScreen();
            System.out.println("\n--- Prefeitura ---");
            System.out.println("1. Listar IPTUs");
            System.out.println("2. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1 -> {
                    UI.clearScreen();
                    prefeitura.listarIPTUs();
                    
                    scanner.nextLine();
                    System.out.println("\nPressione Enter para continuar...");
                    scanner.nextLine();

                    return;
                }
                case 2 -> {
                    UI.clearScreen();
                    System.out.println("Exiting...");
                }
                default -> throw new AssertionError();
            }
        }
        return;
    }
}
