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
