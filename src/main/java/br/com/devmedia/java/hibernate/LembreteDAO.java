/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devmedia.java.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author henrique
 */
public class LembreteDAO {

    private static EntityManagerFactory entityManagerFactory;

    public void update() {
        entityManagerFactory = Persistence.createEntityManagerFactory("hibernatejpa");
        EntityManager em = entityManagerFactory.createEntityManager();
    }

}
