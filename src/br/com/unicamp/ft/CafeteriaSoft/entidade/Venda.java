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
public class Venda {
    
    private int codigo;
    private Funcionario funcionario;
    private double valorTotal;
    private String dataVenda;

    public Venda(int codigo, Funcionario funcionario, double valorTotal, String dataVenda) {
        this.codigo = codigo;
        this.funcionario = funcionario;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
    }
    
    
    public String getDataVenda(){
        return dataVenda;
    }
    
    public void setDataVenda(String dataVenda){
        this.dataVenda = dataVenda;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

  
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    
    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getLucro(Produto prod){
        return prod.getValor() - prod.getCusto();
    }
    
    public double getLucro(Produto prod, double desconto){
        return(prod.getValor() - prod.getCusto())*(100 - desconto)/100;
    }
}
