package UI;

import java.util.Scanner;

public class Imoveis {
<<<<<<< Updated upstream
    public static void MostrarMenuImoveis(Scanner scanner) {
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
                    
                }
                case 2 -> {
                    UI.clearScreen();
                    
                }
                case 3 -> {
                    UI.clearScreen();
                    System.out.println("Exiting...");
                }
                default -> throw new AssertionError();
            }
        }
        return;
=======
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            
            System.out.println("\n--- Painel Imovel ---");
                        
            while (choice != 3) {
                UI.clearScreen();
                System.out.println("\n--- Imóveis ---");
                System.out.println("1. Cadastrar imóvel");
                System.out.println("3. Voltar ao menu principal");
                System.out.print("Escolha uma opção: ");
                System.out.print("\nEnter your choice: ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1 -> {
                        clearScreen();
                        Prefeitura.cadastrarImovel();
                    }
                    case 3 -> {
                        clearScreen();
                        return;
                    }
                    default -> throw new AssertionError();
                }
            }
        }
>>>>>>> Stashed changes
    }
}
