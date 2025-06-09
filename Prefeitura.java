
/**
 * Write a description of class Prefeitura here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Hash;
import java.util.HashMap;

public class Prefeitura
{
    // instance variables - replace the example below with your own
    private Hash<Imoveis> listaImoveis = new HashMap<>();
    private List<Responsavel> listaResponsaveis = new ArrayList<>();
    private int idadeMinima1;
    private int idadeMinima2;
    private float desconto1;
    private float desconto2;

    /**
     * Constructor for objects of class Prefeitura
     */
    public Prefeitura(int idadeMinima1, int idadeMinima2, float desconto1, float desconto2)
    {
        // initialise instance variables
        this.idadeMinima1 = idadeMinima1;
        this.idadeMinima2 = idadeMinima2;
        this.desconto1 = desconto1;
        this.desconto2 = desconto2;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public float calcularComDesconto(Imovel imovel)
    {
        // put your code here
        Responsavel responsavel = imovel.getResponsavel();
        int idade = responsavel.getIdade();
        
        if(idade > idadeMinima2) return calcularIPTU(imovel)*(1-desconto2);
        if(idade > idadeMinima1) return calcularIPTU(imovel)*(1-desconto1);
        return calcularIPTU(imovel);
    }
    
    public float calcularIPTU(Imovel imovel){
        return imovel.calcularIPTU();
    }
    
    public float getDesconto1(){
        return this.desconto1;
    }
    
        public float getDesconto2(){
        return this.desconto2;
    }
    
        public float getIdadeMinima1(){
        return this.idadeMinima1;
    }
    
        public float getIdadeMinima2(){
        return this.idadeMinima2;
    }
    
        public void setDesconto1(float desconto1){
        this.desconto1 = desconto1;
    }
    
        public void setDesconto2(float desconto2){
        this.desconto2 = desconto2;
    }
    
        public void setIdadeMinima1(int idadeMinima1){
        this.idadeMinima1 = idadeMinima1;
    }
    
        public void setIdadeMinima2(int idadeMinima2){
        this.idadeMinima2 = idadeMinima2;
    }
}
