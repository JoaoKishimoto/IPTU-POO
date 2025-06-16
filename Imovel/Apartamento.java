package Imovel;

import java.text.NumberFormat;
import java.util.Locale;

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
    public String toString() {
        Locale brasil = Locale.of("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);
        
        return "Apartamento {" +
                "endereco=" + endereco +
                ", valorDeAvaliacao=" + formatoMoeda.format(valorDeAvaliacao) +
                ", responsavel=" + responsavel +
                ", andar=" + andar +
                ", areaPrivativa=" + areaPrivativa +
                '}';
    }

    public double getAreaPrivativa() {
        return areaPrivativa;
    }

    public void setAreaPrivativa(double areaPrivativa) {
        this.areaPrivativa = areaPrivativa;
    }

    @Override
    public double calcularIPTU() {
        double iptu = this.valorDeAvaliacao * 0.015;
        return this.andar > 10 ? iptu - 200 : iptu;
    }
}
