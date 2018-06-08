/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author henrique
 */
public class JpaResourceBean {
    private static EntityManagerFactory entityManagerFactory;
    
    public static EntityManagerFactory getEntityManagerFactory(){
        if(entityManagerFactory == null){
            entityManagerFactory = Persistence.createEntityManagerFactory("hibernatejpa");
        }
        return entityManagerFactory;
    }
}
