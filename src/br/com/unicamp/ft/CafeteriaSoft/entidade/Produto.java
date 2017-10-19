/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unicamp.ft.cafeteriasoft.entidade;

/**
 *
 * @author leand
 */
public class Produto {
    
    private String nome;
    private double valor;
    private int quantidade;
    private double custo;
    private Integer id;
    private Fornecedor fornecedor; 

    public Produto(String nome, double valor, int quantidade, double custo, Integer id, Fornecedor fornecedor) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.custo = custo;
        this.id = id;
        this.fornecedor = fornecedor;
    }
    
    
    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }
    
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public Integer getId(){
        return this.id;
    }
    
    public void setId (Integer id){
        this.id = id;
    }

    public double getCusto() {
        return custo;
    }


    public void setCusto(double custo) {
        this.custo = custo;
    }



    public int getQuantidade() {
        return quantidade;
    }

    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
