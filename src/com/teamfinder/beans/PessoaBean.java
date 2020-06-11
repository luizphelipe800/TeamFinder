package com.teamfinder.beans;

import java.io.Serializable;

public class PessoaBean implements Serializable {
 
    private int id;
    private String nome;
    private int dt_nascimento;
    private int rg;
    private int cpf;
    private int num_contato;


    public PessoaBean (int idp, String nomep, int dt_nascimentop, int rgp,int cpfp, int num_contatop){
    
        this.id = idp;
        this.nome = nomep;
        this.dt_nascimento = dt_nascimentop;
        this.rg = rgp;
        this.cpf = cpfp;
        this.num_contato = num_contatop;

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

    /**
     * @return the dt_nascimento
     */
    public int getDt_nascimento() {
        return dt_nascimento;
    }

    /**
     * @param dt_nascimento the dt_nascimento to set
     */
    public void setDt_nascimento(int dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the num_contato
     */
    public int getNum_contato() {
        return num_contato;
    }

    /**
     * @param num_contato the num_contato to set
     */
    public void setNum_contato(int num_contato) {
        this.num_contato = num_contato;
    }
    

}