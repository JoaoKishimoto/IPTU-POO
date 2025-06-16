package Responsavel;

import Imovel.Imovel;

public class PessoaJuridica extends Responsavel {
    private int anoDeFundacao;

    public PessoaJuridica(String nome, String documento, int anoDeFundacao) {
        super(nome, documento);
        this.anoDeFundacao = anoDeFundacao;
    }

    public int getAnoFundacao() {
        return this.anoDeFundacao;
    }

    public void setAnoFundacao(int anoDeFundacao) {
        this.anoDeFundacao = anoDeFundacao;
    }

    @Override
    public String getDocumento() {
        return this.documento.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");

    }

    public void setCPF(String cpf) {
        this.documento = cpf;
    }
    
    @Override
    public double calcularDesconto(Imovel imovel, int idade1, int idade2, double porcentagemDesconto1, double porcentagemDesconto2) {
        return imovel.calcularIPTU();
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " CNPJ: " + this.getDocumento() + " Ano de fundação: " + this.anoDeFundacao + " Tipo: " + this.getClass().getSimpleName();
    }
}
