package com.teamfinder.beans;

import java.io.Serializable;

public class PessoaBean implements Serializable {
 
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String dt_nascimento;
    private String rg;
    private String cpf;
    private String num_contato;


    public PessoaBean (int id, String nome, String email, String senha, String dt_nascimento, String rg,String cpf, String num_contato){
    
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dt_nascimento = dt_nascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.num_contato = num_contato;

    }


    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getSenha(){
        return this.senha;
    }

    /**
     * @return the dt_nascimento
     */
    public String getDt_nascimento() {
        return dt_nascimento;
    }

    /**
     * @param dt_nascimento the dt_nascimento to set
     */
    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the num_contato
     */
    public String getNum_contato() {
        return num_contato;
    }

    /**
     * @param num_contato the num_contato to set
     */
    public void setNum_contato(String num_contato) {
        this.num_contato = num_contato;
    }
    

}