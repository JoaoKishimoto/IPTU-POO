package Responsavel;

import Responsavel.Responsavel;

public class PesssoaJuridica extends Responsavel {
    protected String cnpj;
    protected int anoFundacao;

    public PessoaJuridica(String nome, String cnpj, int anoFundacao) {
        super(nome);
        this.cnpj = cnpj;
        this.anoFundacao = anoFundacao;
    }

    public String getCNPJ() {
      return this.cpf.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3//$4-$5");
    }

    public int getAnoFundacao() {
      return this.anoFundacao;
    }

    public String gerarDocumento() {
      
    }
}
