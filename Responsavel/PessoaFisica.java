package Responsavel;

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

    @Override
    public String toString() {
        return "Pessoa Física: " + this.getNome() + ", CPF: " + this.getDocumento() + ", Documento: " + this.getDocumento();
    }
}
