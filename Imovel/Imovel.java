package Imovel;

import Responsavel.Responsavel;

public abstract class Imovel {
    protected Endereco endereco;
    protected double valorDeAvaliacao;
    protected Responsavel responsavel;
    
    public Imovel(Responsavel responsavel, double valorDeAvaliacao, Endereco endereco) {
        this.responsavel = responsavel;
        this.valorDeAvaliacao = valorDeAvaliacao;
        this.endereco = endereco;
    }
    
    public abstract double calcularIPTU();
    
    public double calcularDesconto(double porcentagemDesconto) {
        return this.calcularIPTU() * porcentagemDesconto;
    }
    
    public Responsavel getResponsavel() { return this.responsavel; }
    
    public void setResponsavel(Responsavel responsavel) { this.responsavel = responsavel; }

    // TODO: ToString()
}
    
