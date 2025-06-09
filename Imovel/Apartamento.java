package Imovel;

import Responsavel.Responsavel;

public class Apartamento extends Imovel {
    private int andar;
    private double areaPrivativa;
    
    public Apartamento(Responsavel responsavel, double valorDeAvaliacao, Endereco endereco, double areaPrivativa, int andar) {
        super(responsavel, valorDeAvaliacao, endereco);
        this.areaPrivativa = areaPrivativa;
        this.andar = andar;
    }

    @Override
    public double calcularIPTU() {
        double iptu = this.valorDeAvaliacao * 0.015;
        return this.andar > 10 ? iptu - 200 : iptu;
    }
}
