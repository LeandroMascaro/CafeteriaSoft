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
public class Funcionario extends Usuario{
    
    private String cpf;
    private double salario;
    private int vendas;

    public Funcionario(String cpf, double salario, int vendas, String nome, String email) { 
        super(nome, email);
        this.cpf = cpf;
        this.salario = salario;
        this.vendas = vendas;
    }

    /**
     *
     * @return
     */
    @Override
    public String getNome(){
        
        return "Funcionario: " + nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public int getVendas() {
        return vendas;
    }

 
    public void setVendas(int vendas) {
        this.vendas = vendas;
    }


 
    public double getSalario() {
        return salario;
    }

 
    public void setSalario(double salario) {
        this.salario = salario;
    }

   
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void incVenda(){
        this.vendas++;
    }
    
}
