package Responsavel;

import Imovel.Imovel;

public abstract class Responsavel
{
    protected String nome;
    protected String documento;

    public Responsavel(String nome, String documento)
    {
        this.nome = nome;
        this.documento = documento;
    }
    
    public abstract String getDocumento();
        
    public String getNome()
    {
        // put your code here
        return this.nome;
    }

    public abstract double calcularDesconto(Imovel imovel, int idade1, int idade2, double porcentagemDesconto1, double porcentagemDesconto2);

    public abstract String toString();
}
