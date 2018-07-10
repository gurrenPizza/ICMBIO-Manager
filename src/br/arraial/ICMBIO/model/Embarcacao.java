package br.arraial.ICMBIO.model;

import static br.arraial.ICMBIO.DAO.BancoDeDados.retornarConexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Embarcacao{
private String nome_embarcacao;
private Integer TIE;
private String nome_proprietario;
private Integer numero_passageiros;
private Integer Tamanho_embarcacao;
private Integer capacidade_passageiros;
private String local;
private String OBS;
private Integer codigo_modalidade;


/*public class Embarcacao 
{
    private PreparedStatement inserir;
    public void inserir(String a,String b,String c,String d,String e,String f,String g, String h, String i, String j){
        try {
            inserir = retornarConexao().prepareStatement("insert into embarcacao(nome_embarcacao, TIE,nome_proprietario,numero_passageiros,Tamanho_embarcacao,capacidade_passageiros,local,OBS,codigo_modalidade) values("+a+","+b+","+c+","+d+","+e+","+f+","+g+","+h+","+i+","+j+")");
        } catch (SQLException ex) {
            Logger.getLogger(Embarcacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
*/

    public Embarcacao(String nome_embarcacao, Integer TIE, String nome_proprietario, Integer numero_passageiros, Integer Tamanho_embarcacao, Integer capacidade_passageiros, String local, String OBS, Integer codigo_modalidade) {
        this.nome_embarcacao = nome_embarcacao;
        this.TIE = TIE;
        this.nome_proprietario = nome_proprietario;
        this.numero_passageiros = numero_passageiros;
        this.Tamanho_embarcacao = Tamanho_embarcacao;
        this.capacidade_passageiros = capacidade_passageiros;
        this.local = local;
        this.OBS = OBS;
        this.codigo_modalidade = codigo_modalidade;
    }

    public String getNome_embarcacao() {
        return nome_embarcacao;
    }

    public void setNome_embarcacao(String nome_embarcacao) {
        this.nome_embarcacao = nome_embarcacao;
    }

    public Integer getTIE() {
        return TIE;
    }

    public void setTIE(Integer TIE) {
        this.TIE = TIE;
    }

    public String getNome_proprietario() {
        return nome_proprietario;
    }

    public void setNome_proprietario(String nome_proprietario) {
        this.nome_proprietario = nome_proprietario;
    }

    public Integer getNumero_passageiros() {
        return numero_passageiros;
    }

    public void setNumero_passageiros(Integer numero_passageiros) {
        this.numero_passageiros = numero_passageiros;
    }

    public Integer getTamanho_embarcacao() {
        return Tamanho_embarcacao;
    }

    public void setTamanho_embarcacao(Integer Tamanho_embarcacao) {
        this.Tamanho_embarcacao = Tamanho_embarcacao;
    }

    public Integer getCapacidade_passageiros() {
        return capacidade_passageiros;
    }

    public void setCapacidade_passageiros(Integer capacidade_passageiros) {
        this.capacidade_passageiros = capacidade_passageiros;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getOBS() {
        return OBS;
    }

    public void setOBS(String OBS) {
        this.OBS = OBS;
    }

    public Integer getCodigo_modalidade() {
        return codigo_modalidade;
    }

    public void setCodigo_modalidade(Integer codigo_modalidade) {
        this.codigo_modalidade = codigo_modalidade;
    }
}