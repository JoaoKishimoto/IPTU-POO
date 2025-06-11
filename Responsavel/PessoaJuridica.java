package Responsavel;

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

    public String getDocumento() {
        return this.documento.replaceAll("(^\\d{2}.\\d{3}.\\d{3}/\\d{4}-\\d{2}$)", "$1.$2.$3/$4-$5");
    }

    public void setCPF(String cpf) {
        this.documento = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa Física: " + this.getNome() + ", CPF: " + this.getDocumento() + ", Documento: " + this.getDocumento();
    }
}
