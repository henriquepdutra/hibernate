/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devmedia.java.hibernate;

/**
 *
 * @author henrique
 */
public enum Prioridade {

    ALTA("Alta"),
    MEDIA("Média"),
    BAIXA("Baixa");

    private String descricao;

    Prioridade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
