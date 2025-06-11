package Prefeitura;


import Imovel.Imovel;
import Responsavel.Responsavel;

import java.util.ArrayList;
import java.util.HashMap;

public class Prefeitura
{
    private HashMap<Imovel, Responsavel> listaImoveis = new HashMap<Imovel, Responsavel>();
    private ArrayList<Responsavel> listaResponsaveis = new ArrayList<Responsavel>();
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

    public void adicionarResponsavel(Responsavel responsavel){
        if(listaResponsaveis.contains(responsavel)) return;
        listaResponsaveis.add(responsavel);
    }

    public double calcularComDesconto(Imovel imovel)
    {
        Responsavel responsavel = imovel.getResponsavel();
        return responsavel.calcularDesconto(imovel, idadeMinima1, idadeMinima1, idadeMinima2, idadeMinima1);
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

    public HashMap<Imovel, Responsavel> getListaImoveis() {
        return this.listaImoveis;
    }

    public ArrayList<Responsavel> getListaResponsaveis() {
        return this.listaResponsaveis;
    }

    public Responsavel buscarResponsavel(Imovel imovel) {
        return this.listaImoveis.get(imovel);        
    }

    public ArrayList<Responsavel> getListaResponsaveis() {
        return this.listaResponsaveis;
    }

    public Responsavel buscarResponsavel(Imovel imovel) {
        return this.listaImoveis.get(imovel);        
    }
}