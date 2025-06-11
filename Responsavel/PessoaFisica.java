public class PessoaFisica extends Responsavel {
    
    public PessoaFisica(String nome, String cpf, int idade){
        super(nome)
    }

    public String getCpf() {
        String cpf = this.cpf.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3-$4");
        return cpf;
    }

    public String getIdade() {
        return this.idade;
    }

    public String gerarDocumento() {
        System.out.println("")
    }
}