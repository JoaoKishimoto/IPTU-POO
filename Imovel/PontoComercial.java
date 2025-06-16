package Imovel;

import java.text.NumberFormat;
import java.util.Locale;

import Responsavel.PessoaJuridica;

public class PontoComercial extends Imovel {
  protected double areaConstruida;

  public PontoComercial(PessoaJuridica responsavel, double valorDeAvaliacao, Endereco endereco, double areaConstruida) {
    super(responsavel, valorDeAvaliacao, endereco);
    this.areaConstruida = areaConstruida;
  }

  @Override
  public String toString() {
    Locale brasil = Locale.of("pt", "BR");
    NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);
    
    return "Ponto Comercial {" +
           "endereco=" + endereco +
           ", valorDeAvaliacao=" + formatoMoeda.format(valorDeAvaliacao) +
           ", responsavel=" + responsavel +
           ", areaConstruida=" + areaConstruida +
           '}';
  }

  public double calcularIPTU() {
    return this.areaConstruida * 7.50;
  }

  @Override
  public double calcularDesconto(double porcentagemDesconto) {
    return this.calcularIPTU();
  } 
}
