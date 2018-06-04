package br.com.devmedia.java.hibernate;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.mapping.PrimaryKey;

/**
 *
 * @author henrique
 */
public class Main {

    private static EntityManagerFactory entityManagerFactory;

    public static void main(String args[]) {

        entityManagerFactory = Persistence.createEntityManagerFactory("hibernatejpa");
        EntityManager em = entityManagerFactory.createEntityManager();

        //        ////////////// Inserindo dados no banco ////////////////////////////////////////
//                Lembrete lembrete = new Lembrete();
//                lembrete.setTitulo("teste 3");
//                lembrete.setDescricao("26/06/18, 23h");
//        
//        
//                try {
//                    em.getTransaction().begin();
//                    em.persist(lembrete);
//                    em.getTransaction().commit();
//                } catch (Exception e) {
//                    em.getTransaction().rollback();
//                    System.out.println("INSERT: " + e.getMessage());
//                } finally {
//                    em.close();
//                }
        // /////////////////////////////////////////////////////////////////////////////////////////
        // ///////////// Buscando todos os dados //////////////////////////////////////////////
//        List<Lembrete> lembretes = null;
//
//        try {
//            lembretes = em.createQuery("from Lembrete").getResultList();
//        } catch (Exception e) {
//            System.out.println("LIST ALL: " + e.getMessage());
//        } finally {
//            em.close();
//        }
//
//        if (lembretes != null) {
//            for (Lembrete lembrete : lembretes) {
//                System.out.println("Lembretes:" + lembrete);
//            }
//        }
        ///////////////////////////////////////////////////////////////////////////////////////
        // /////////// Buscando dados por id /////////////////////////////////////////////
//        Lembrete lembrete = null;
//
//        try {
//            lembrete = em.find(Lembrete.class, 2L);
//            System.out.println(lembrete);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            em.close();
//        }
        /////////////////////////////////////////////////////////////////////////////////////
        /////////////////////Listar por campo do DB////////////////////////////////////////
//
//        List<Lembrete> lembretes = null;
//
//        try {
//            lembretes = em.createQuery("from Lembrete l where l.titulo LIKE '%teste%'  ").getResultList();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            em.close();
//        }
//
//        if (lembretes != null) {
//            for (Lembrete lembrete : lembretes) {
//                System.out.println("Lembrete:" + lembrete);
//
//            }
//        }
        //////////////////////////////////////////////////////////////////////////////////////////

    //////////////Atualizando dados///////////////////////////////////////////////////////
    
//    try{
//        Lembrete lembrete = em.find(Lembrete.class , 1L);
//        
//        lembrete.setTitulo("Comprar café");
//        lembrete.setDescricao("Amanhã");
//        
//        em.getTransaction().begin();
//        em.merge(lembrete);
//        em.getTransaction().commit();
//    }catch(Exception e){
//        em.getTransaction().rollback();
//        System.out.println(e.getMessage());
//    }finally{
//        em.close();
//    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////Excluindo Dados////////////////////////////////////////////////////
    
    try{
        Lembrete lembrete = em.find(Lembrete.class , 1L);
        
        em.getTransaction().begin();
        em.remove(lembrete);
        em.getTransaction().commit();
    }catch(Exception e){
        em.getTransaction().rollback();
        System.out.println("DELETE:" + e.getMessage());
    }finally{
        em.close();
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////
    }

}
