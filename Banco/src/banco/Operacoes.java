/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author manuel
 */
public class Operacoes {
    
    String nome;
    double saldo;
    
    public Operacoes(String nome, double saldo)
    {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void saque(double saque)
    {
        if(saque > 0.0)
        {
            this.saldo = saldo - saque;
        }
    }
    
    public void deposito(double deposito)
    {
        if(deposito > 0.0)
        {
            this.saldo = saldo + deposito;
        }
    }
    
    public void getestrato()
    {
        this.saldo = saldo -10;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
