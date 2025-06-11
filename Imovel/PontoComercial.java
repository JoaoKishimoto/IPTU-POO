package Imovel;

import Responsavel.Responsavel;

public class PontoComercial extends Imovel {
  protected double areaConstruida;

  public PontoComercial(Responsavel responsavel, double valorDeAvaliacao, Endereco endereco, double areaConstruida) {
    super(responsavel, valorDeAvaliacao, endereco);
    this.areaConstruida = areaConstruida;
  }

  public double calcularIPTU() {
    return this.areaConstruida * 7.50;
  }

  @Override
  public double calcularDesconto(double porcentagemDesconto) {
    return this.calcularIPTU();
  } 
}
