/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.arraial.ICMBIO.model;

import java.sql.PreparedStatement;

/**
 *
 * @author Aluno
 */
public class Solicitante {
    private String nome;
    private String beneficiario;
    private String CPFCNPJ;
    private String telefone;
    private String endereco;
    private String bairro;
    private String cidade;
    private String cep;
    private String email;
    private String razao_social;
    private String nome_fantasia;
    private String responsavel;
    private String operadora;

    public Solicitante(String nome, String beneficiario, String CPFCNPJ, String telefone, String endereco, String bairro, String cidade, String cep, String email, String razao_social, String nome_fantasia, String responsavel, String operadora) {
        this.nome = nome;
        this.beneficiario = beneficiario;
        this.CPFCNPJ = CPFCNPJ;
        this.telefone = telefone;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.email = email;
        this.razao_social = razao_social;
        this.nome_fantasia = nome_fantasia;
        this.responsavel = responsavel;
        this.operadora = operadora;
    }
 public Solicitante (){
 }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getCPFCNPJ() {
        return CPFCNPJ;
    }

    public void setCPFCNPJ(String CPFCNPJ) {
        this.CPFCNPJ = CPFCNPJ;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    


    public PreparedStatement prepareStatement(String insert_into_modalidadenome_modalidade_val) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setString(int i, String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
