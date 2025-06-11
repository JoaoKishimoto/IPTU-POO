package UI;

import java.util.Scanner;

import Prefeitura.Prefeitura;

public class UI {
    public static void startUI() {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            
            System.out.println("\n--- Bem vindo ao painel do IPTU ---");
            
            Prefeitura prefeitura = new Prefeitura(60, 75, 0.15, 0.2);
            
            while (choice != 4) {
                clearScreen();
                System.out.println("1. Responsáveis");
                System.out.println("2. Imóveis");
                System.out.println("3. Mostrar IPTUs");
                System.out.println("4. Exit");
                System.out.print("\nEnter your choice: ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1 -> {
                        clearScreen();
                        Responsaveis.startMenu(scanner, prefeitura);
                    }
                    case 2 -> {
                        clearScreen();
                        Imoveis.startMenu(scanner, prefeitura);
                    }
                    case 3 -> {
                        clearScreen();
                        PrefeituraUI.startMenu(scanner, prefeitura);
                    }
                    case 4 -> {
                        clearScreen();
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> throw new AssertionError();
                }
                default -> throw new AssertionError();
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
