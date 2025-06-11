package Imovel;

import Responsavel.PessoaJuridica;

public class Comercial extends Imovel{

    private double areaConstruida;
    
    public Comercial(PessoaJuridica responsavel, Endereco endereco, double areaCasa, double areaConstruida, double valorDeAvaliacao) {
        super(responsavel, valorDeAvaliacao, endereco);
        this.areaConstruida = areaConstruida;
    }
    
    @Override
    public double calcularIPTU() {
        return this.areaConstruida * 7.5;
    }

    @Override
    public double calcularDesconto(double porcentagemDesconto) {
        return 0.0;
    }
}

