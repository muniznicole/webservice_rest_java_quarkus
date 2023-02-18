package br.unitins.model;
import java.util.Date;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Biblioteca extends PanacheEntity {

    Integer idLivro;
    Date dataCompra;
    Integer quantidade;
    String descricao;
    double locaLestante;

    public Integer getIdLivro() {
        return idLivro;
    }
    public void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
    }
    public Date getDataCompra() {
        return dataCompra;
    }
    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getLocaLestante() {
        return locaLestante;
    }
    public void setLocaLestante(double locaLestante) {
        this.locaLestante = locaLestante;
    }
}
