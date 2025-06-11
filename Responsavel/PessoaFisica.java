package Responsavel;

import Imovel.Imovel;

public class PessoaFisica extends Responsavel {
    private int idade;

    public PessoaFisica(String nome, String documento, int idade) {
        super(nome, documento);
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return this.documento.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3-$4");
    }

    public void setCPF(String cpf) {
        this.documento = cpf;
    }

    public double calcularDesconto(Imovel imovel, int idade1, int idade2, float porcentagemDesconto1, float porcentagemDesconto2) {
        if (idade > idade2) return imovel.calcularIPTU()*(1 - porcentagemDesconto1);
        if (idade > idade1) return imovel.calcularIPTU()*(1 - porcentagemDesconto2);
        return imovel.calcularIPTU();
    }

    @Override
    public String toString() {
        return "nome: " + this.nome + "CPF: " + this.getDocumento() + "Idade: " + this.idade;
    }
}
