package Imovel;

import Responsavel.Responsavel;

public class Terreno extends Imovel {
    private double area;
    
    public Terreno(Responsavel responsavel, double valorDeAvaliacao, Endereco endereco, double area) {
        super(responsavel, valorDeAvaliacao, endereco);
        this.area = area;
    }
    
    public double calcularIPTU() {
        return this.valorDeAvaliacao * 0.01;
    }
    
    @Override
    public double calcularDesconto(double porcentagemDesconto) {
        return 0.0;
    }
}