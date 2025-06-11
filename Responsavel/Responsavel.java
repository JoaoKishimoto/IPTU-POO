package Responsavel;

public class Responsavel {
    protected String nome;
    
    public Responsavel(String nome) {
        this.nome = nome;
    }

    public abstract String gerarDocumento();
    
    public String getNome() {
        return this.nome;
    }
}
