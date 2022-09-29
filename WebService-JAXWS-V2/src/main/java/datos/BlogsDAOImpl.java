/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Blog;
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
    public List<Blog> findAllBlogs() {
        transaction.begin();
        List<Blog> blogses = em.createNamedQuery("Blog.findAll").getResultList();
        transaction.commit();
        return blogses;
    }

    @Override
    public Blog findBlogById(Blog blogs) {
        transaction.begin();
        Blog blogs1 = em.find(Blog.class, blogs.getIdblog());
        transaction.commit();
        return blogs1;
    }
    
}
