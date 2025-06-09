
/**
 * Write a description of class Endereco here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Endereco
{
    // instance variables - replace the example below with your own
    private String rua;
    private int numero;
    private String bairro;

    /**
     * Constructor for objects of class Endereco
     */
    public Endereco(String rua, String bairro, int numero)
    {
        // initialise instance variables
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getRua()
    {
        // put your code here
        return this.rua;
    }
    
        public int getNumero()
    {
        // put your code here
        return this.numero;
    }
    
        public String getBairro()
    {
        // put your code here
        return this.bairro;
    }
    
        public void setRua(String rua)
    {
        // put your code here
        this.rua = rua;
    }
    
        public void setNumero(int numero)
    {
        // put your code here
        this.numero = numero;
    }
    
        public void setBairro()
    {
        // put your code here
        this.bairro = bairro;
    }
}
