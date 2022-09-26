/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Blogs;
import dominio.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author chech
 */
@Stateless
public class BlogsDAOImpl implements BlogsDAO{
    
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.mycompany.webservice.jaxws.v2_WebService-JAXWS-V2");
    EntityManager em = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = em.getTransaction();

    @Override
    public List<Blogs> findAllBlogs() {
        transaction.begin();
        List<Blogs> blogses = em.createNamedQuery("Blogs.findAll").getResultList();
        transaction.commit();
        return blogses;
    }

    @Override
    public Blogs findBlogById(Blogs blogs) {
        transaction.begin();
        Blogs blogs1 = em.find(Blogs.class, blogs.getIdblog());
        transaction.commit();
        return blogs1;
    }
    
}
