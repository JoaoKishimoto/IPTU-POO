package Imovel;

import java.text.NumberFormat;
import java.util.Locale;

import Responsavel.Responsavel;

public class Terreno extends Imovel {
    private double area;
    
    public Terreno(Responsavel responsavel, double valorDeAvaliacao, Endereco endereco, double area) {
        super(responsavel, valorDeAvaliacao, endereco);
        this.area = area;
    }

    @Override
    public String toString() {
        Locale brasil = Locale.of("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);
        
        return "Terreno {" +
                "endereco=" + endereco +
                ", valorDeAvaliacao=" + formatoMoeda.format(valorDeAvaliacao) +
                ", responsavel=" + responsavel +
                ", area=" + area +
                '}';
    }

    public double getArea() {
        return area;
    }
    
    public void setArea(double area) {
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