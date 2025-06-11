package Responsavel;

/**
 * Write a description of class Responsavel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Responsavel
{
    // instance variables - replace the example below with your own
    private int idade;
    private String nome;
    private String cpf;
    private String cnpj;

    /**
     * Constructor for objects of class Responsavel
     */
    public Responsavel(String nome, String documento, int idade)
    {
        // initialise instance variables
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getIdade()
    {
        // put your code here
        return this.idade;
    }
    
    public String getCPF()
    {
        // put your code here
        return this.cpf;
    }
    
    public String getNome()
    {
        // put your code here
        return this.nome;
    }
}
