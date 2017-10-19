/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unicamp.ft.cafeteriasoft.entidade;

import java.util.ArrayList;

/**
 *
 * @author leand
 */
public class Fornecedor extends Usuario{
   
    private String cnpj;
    private String telefone;
    private ArrayList<String> produtos;

    public Fornecedor(String nome, String cnpj, String telefone, String email, ArrayList<String> produtos) {
        super(nome,email);
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.produtos = produtos;
    }

    /**
     *
     * @return
     */
    @Override
     public String getNome(){
         return "Fornecedor: " + nome;
     }
    
     public String getEmail(){
         return email;
     }
   
    public ArrayList<String> getProdutos() {
        produtos.stream().forEach((prod) -> {
            System.out.println(prod);
        });
        return produtos;
    }


    public void setProdutos(ArrayList<String> produtos) {
        this.produtos = produtos;
    }



    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

  
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    }



