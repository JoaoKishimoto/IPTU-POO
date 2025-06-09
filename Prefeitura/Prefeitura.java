package Prefeitura;

import java.util.List;

import Imovel.Imovel;
import Responsavel.Responsavel;

import java.util.ArrayList;
import java.util.HashMap;

public class Prefeitura
{
    // instance variables - replace the example below with your own
    private HashMap<Imovel, Responsavel> listaImoveis = new HashMap<Imovel, Responsavel>();
    private List<Responsavel> listaResponsaveis = new ArrayList<>();
    private int idadeMinima1;
    private int idadeMinima2;
    private double desconto1;
    private double desconto2;

    public Prefeitura(int idadeMinima1, int idadeMinima2, double desconto1, double desconto2)
    {
        this.idadeMinima1 = idadeMinima1;
        this.idadeMinima2 = idadeMinima2;
        this.desconto1 = desconto1;
        this.desconto2 = desconto2;
    }

    public double calcularComDesconto(Imovel imovel)
    {
        Responsavel responsavel = imovel.getResponsavel();
        int idade = responsavel.getIdade();
        
        if(idade > idadeMinima2) return calcularIPTU(imovel)*(1-desconto2);
        if(idade > idadeMinima1) return calcularIPTU(imovel)*(1-desconto1);
        return calcularIPTU(imovel);
    }
    
    public double calcularIPTU(Imovel imovel){
        return imovel.calcularIPTU();
    }
    
    public double getDesconto1(){
        return this.desconto1;
    }
    
    public double getDesconto2(){
        return this.desconto2;
    }
    
    public double getIdadeMinima1(){
        return this.idadeMinima1;
    }
    
    public double getIdadeMinima2(){
        return this.idadeMinima2;
    }
    
    public void setDesconto1(double desconto1){
        this.desconto1 = desconto1;
    }
    
    public void setDesconto2(double desconto2){
        this.desconto2 = desconto2;
    }
    
    public void setIdadeMinima1(int idadeMinima1){
        this.idadeMinima1 = idadeMinima1;
    }
    
    public void setIdadeMinima2(int idadeMinima2){
        this.idadeMinima2 = idadeMinima2;
    }

    public void mostrarIPTUs() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarIPTUs'");
    }
}
