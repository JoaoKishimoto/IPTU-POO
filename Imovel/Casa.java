
package Imovel;

import java.text.NumberFormat;
import java.util.Locale;

import Responsavel.Responsavel;

public class Casa extends Imovel {
    private double areaCasa;
    private double areaTerreno;
    
    public Casa(Responsavel responsavel, double valorDeAvaliacao, Endereco endereco, double areaCasa, double areaTerreno) {
        super(responsavel, valorDeAvaliacao, endereco);
        this.areaCasa = areaCasa;
        this.areaTerreno = areaTerreno;
    }

    @Override
    public String toString() {
        Locale brasil = Locale.of("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);

        return "Casa {" +
                "endereco=" + endereco +
                ", valorDeAvaliacao=" + formatoMoeda.format(valorDeAvaliacao) +
                ", responsavel=" + responsavel +
                ", areaCasa=" + areaCasa +
                ", areaTerreno=" + areaTerreno +
            '}';
    }

    public double getAreaCasa() {
        return areaCasa;
    }

    public void setAreaCasa(double areaCasa) {
        this.areaCasa = areaCasa;
    }

    public double getAreaTerreno() {
        return areaTerreno;
    }

    public void setAreaTerreno(double areaTerreno) {
        this.areaTerreno = areaTerreno;
    }
    
    public double calcularIPTU() {
        return this.valorDeAvaliacao * 0.012 + 0.5 * this.areaCasa;
    }
}