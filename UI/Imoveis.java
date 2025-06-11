package UI;

public class Imoveis {
    public static void startMenu(Scanner scanner) {
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
    }
}
