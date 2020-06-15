package com.teamfinder.beans;

import java.io.Serializable;

public class PessoaBean implements Serializable {
 
    private int id;
    private String nome;
    private String dt_nascimento;
    private String rg;
    private String cpf;
    private String num_contato;


    public PessoaBean (int idp, String nomep, String dt_nascimentop, String rgp,String cpfp, String num_contatop){
    
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