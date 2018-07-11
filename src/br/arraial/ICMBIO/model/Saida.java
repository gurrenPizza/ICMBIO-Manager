package br.arraial.ICMBIO.model;

public class Saida {

    /**
     *
     * @version 5.0 - 08/07
     * @author Turma INF161 Grupo Saída - Alberto Figuerêdo, Ariane Sales,
     * Felipe Viana, Laura Fidalgo e Phillipe Loriot de Rouvray
     */
    private Integer numsaidas;
    private Integer codigosaida;
    private Integer codigosolicitacao;
    private Integer numvisitantes;
    private String mes;
    private String ano;

    public Saida() {

    }

    public Saida(String mes, String ano) {
        this.mes = mes;
        this.ano = ano;
    }

    public Saida(Integer num_saidas, Integer num_visitantes, String mes, String ano, Integer cod_saida) {
        this.numsaidas = num_saidas;
        this.numvisitantes = num_visitantes;
        this.mes = mes;
        this.ano = ano;
        codigosaida = cod_saida;
    }

    public Saida(Integer num_saidas, Integer num_visitantes, String mes, String ano) {
        this.numsaidas = num_saidas;
        this.numvisitantes = num_visitantes;
        this.mes = mes;
        this.ano = ano;
    }

    public Saida(Integer codigo_solicitacao) {
        this.codigosolicitacao = codigo_solicitacao;

    }

    public Integer getNumvisitantes() {
        return numvisitantes;
    }

    public void setNumvisitantes(Integer num_visitantes) {
        this.numvisitantes = num_visitantes;
    }

    public Integer getNumsaidas() {
        return numsaidas;
    }

    public void setNumsaidas(Integer num_saidas) {
        this.numsaidas = num_saidas;
    }

    public Integer getCodigosaida() {
        return codigosaida;
    }

    public void setCodigosaida(Integer codigo_saida) {
        this.codigosaida = codigo_saida;
    }

    public Integer getCodigosolicitacao() {
        return codigosolicitacao;
    }

    public void setCodigosolicitacao(Integer codigo_solicitacao) {
        this.codigosolicitacao = codigo_solicitacao;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

}
