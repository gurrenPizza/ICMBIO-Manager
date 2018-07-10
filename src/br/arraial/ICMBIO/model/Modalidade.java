/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.arraial.ICMBIO.model;

/**
 *
 * @author Euller Felipe
 */
public class Modalidade {

    private String nome_modalidade;
    
    public Modalidade(String mod) {
        this.nome_modalidade = mod;
        
    }
    
    public Modalidade() {
    }
    public String getMod() {
        return nome_modalidade;
    }

    public void setMod(String mod) {
        this.nome_modalidade = mod;
    }
    
    
    
}
