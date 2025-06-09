
package Imovel;

import Responsavel.Responsavel;

public class Casa extends Imovel {
    private double areaCasa;
    private double areaTerreno;
    
    public Casa(Responsavel responsavel, double valorDeAvaliacao, Endereco endereco, double areaCasa, double areaTerreno) {
        super(responsavel, valorDeAvaliacao, endereco);
        this.areaCasa = areaCasa;
        this.areaTerreno = areaTerreno;
    }
    
    public double calcularIPTU() {
        return this.valorDeAvaliacao * 0.012 + 0.5 * this.areaCasa;
    }
}