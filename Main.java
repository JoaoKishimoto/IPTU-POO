import Imovel.Casa;
import Imovel.Endereco;
import Imovel.Imovel;
import Prefeitura.Prefeitura;
import Responsavel.Responsavel;

public class Main {
    public static void main(String[] args)
    {
        // This is the main method where you can test your classes
        // Create instances of Responsavel, Imovel, and Prefeitura to test functionality
        Responsavel responsavel = new Responsavel("João", "12345678900", 45);
        Endereco endereco = new Endereco("Rua A", "Bairro A", 1);
        Imovel imovel = new Casa(responsavel, 200000, endereco, 150.00, 200); // Assuming Casa extends Imovel
        Prefeitura prefeitura = new Prefeitura(60, 70, 0.1, 0.2);
        
        double iptuComDesconto = prefeitura.calcularComDesconto(imovel);
        System.out.println("IPTU com desconto: " + iptuComDesconto);
    }
}
