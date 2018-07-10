/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.arraial.ICMBIO.model;

/**
 *
 * @author Aluno
 */
public class Solicitacao {
    private String numero_processo;
    private String sequencia_anual;
    private String status;
    private String motivo;
    private Integer codigo_solicitante;
    private Integer codigo_embarcacao;
  
    public Solicitacao(String numero_processo, String sequencia_anual, String status, String motivo, Integer codigo_solicitante, Integer codigo_embarcacao) {
        this.numero_processo=numero_processo;
        this.sequencia_anual=sequencia_anual;
        this.status=status;
        this.motivo=motivo;
        this.codigo_solicitante=codigo_solicitante;
        this.codigo_embarcacao=codigo_embarcacao;
        
    }
     public Solicitacao()
{

}

    public String getNumero_processo() {
        return numero_processo;
    }

    public void setNumero_processo(String numero_processo) {
        this.numero_processo = numero_processo;
    }

    public String getSequencia_anual() {
        return sequencia_anual;
    }

    public void setSequencia_anual(String sequencia_anual) {
        this.sequencia_anual = sequencia_anual;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Integer getCodigo_solicitante() {
        return codigo_solicitante;
    }

    public void setCodigo_solicitante(Integer codigo_solicitante) {
        this.codigo_solicitante = codigo_solicitante;
    }

    public Integer getCodigo_embarcacao() {
        return codigo_embarcacao;
    }

    public void setCodigo_embarcacao( Integer codigo_embarcacao) {
        this.codigo_embarcacao = codigo_embarcacao;
    }
     
}

