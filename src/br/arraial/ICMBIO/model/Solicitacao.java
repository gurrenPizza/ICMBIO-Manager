package br.arraial.ICMBIO.model;

/**
 *
 * @author Aluno
 */
public class Solicitacao {

    private String numeroprocesso;
    private String sequenciaanual;
    private String status;
    private String motivo;
    private Integer codigosolicitante;
    private Integer codigoembarcacao;

    public Solicitacao(String numeroprocesso, String sequenciaanual, String status, String motivo, Integer codigosolicitante, Integer codigoembarcacao) {
        this.numeroprocesso = numeroprocesso;
        this.sequenciaanual = sequenciaanual;
        this.status = status;
        this.motivo = motivo;
        this.codigosolicitante = codigosolicitante;
        this.codigoembarcacao = codigoembarcacao;

    }

    public Solicitacao(String numeroprocesso) {
        this.numeroprocesso = numeroprocesso;
    }

    public Solicitacao() {
    }

    public String getNumeroprocesso() {
        return numeroprocesso;
    }

    public void setNumeroprocesso(String numeroprocesso) {
        this.numeroprocesso = numeroprocesso;
    }

    public String getSequenciaanual() {
        return sequenciaanual;
    }

    public void setSequenciaanual(String sequenciaanual) {
        this.sequenciaanual = sequenciaanual;
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

    public Integer getCodigosolicitante() {
        return codigosolicitante;
    }

    public void setCodigosolicitante(Integer codigosolicitante) {
        this.codigosolicitante = codigosolicitante;
    }

    public Integer getCodigoembarcacao() {
        return codigoembarcacao;
    }

    public void setCodigoembarcacao(Integer codigoembarcacao) {
        this.codigoembarcacao = codigoembarcacao;
    }
}
