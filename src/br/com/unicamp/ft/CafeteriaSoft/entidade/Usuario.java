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
public abstract class Usuario {
    
    protected String nome;
    protected String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome(){
    return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
