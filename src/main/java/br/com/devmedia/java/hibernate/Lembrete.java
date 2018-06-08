package br.com.devmedia.java.hibernate;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author henrique
 */
@Entity
public class Lembrete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String descricao;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date inicio;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date criacao = new Date();

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Prioridade prioridade;

    @Column(nullable = false, columnDefinition = "BIT(1) default 0")
    private boolean arquivado;

    public Lembrete() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isArquivado() {
        return arquivado;
    }

    public void setArquivado(boolean arquivado) {
        this.arquivado = arquivado;
    }

    public String getArquivadoAsString() {
        return arquivado ? "SIM" : "NÃO";
    }

    @Override
    public String toString() {
        return "Lembrete{" + "id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + '}';
    }

}
