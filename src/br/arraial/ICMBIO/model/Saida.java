
package br.arraial.ICMBIO.model;


public class Saida {
    
    /**
    * 
    * @version 4.0 - 26/06
    * @author Turma INF161
    *               Grupo Saída - Alberto Figuerêdo, Ariane Sales, Felipe Viana,
    *                             Laura Fidalgo e Phillipe Loriot de Rouvray
    */
    
    private Integer num_saidas;
    private Integer codigo_saida;
    private Integer codigo_solicitacao;
    private Integer num_visitantes;
    private String mes;
    private String ano;
    
    
    public Saida(){
        
    }
    
    public Saida(Integer num_saidas, Integer num_visitantes, String mes, String ano) {
        this.num_saidas = num_saidas;
        this.num_visitantes = num_visitantes;
        this.mes = mes;
        this.ano = ano;
    }
    
    

    public Saida(Integer codigo_solicitacao) {
        this.codigo_solicitacao = codigo_solicitacao;
        
    }

    public Integer getNum_visitantes() {
        return num_visitantes;
    }

    public void setNum_visitantes(Integer num_visitantes) {
        this.num_visitantes = num_visitantes;
    }
    
    public Integer getNum_saidas() {
        return num_saidas;
    }

    public void setNum_saidas(Integer num_saidas) {
        this.num_saidas = num_saidas;
    }

    public Integer getCodigo_saida() {
        return codigo_saida;
    }

    public void setCodigo_saida(Integer codigo_saida) {
        this.codigo_saida = codigo_saida;
    }

    public Integer getCodigo_solicitacao() {
        return codigo_solicitacao;
    }

    public void setCodigo_solicitacao(Integer codigo_solicitacao) {
        this.codigo_solicitacao = codigo_solicitacao;
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
