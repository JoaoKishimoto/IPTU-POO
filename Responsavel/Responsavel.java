package Responsavel;

public abstract class Responsavel
{
    protected String nome;
    protected String documento;

    public Responsavel(String nome, String documento)
    {
        this.nome = nome;
        this.documento = documento;
    }
    
    public String getDocumento()
    {
        // put your code here
        return this.documento;
    }
    
    public String getNome()
    {
        // put your code here
        return this.nome;
    }
}
