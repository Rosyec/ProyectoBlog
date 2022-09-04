/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Stateless
public class PersonaDAOImpl implements PersonaDAO{
    
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.mycompany.webservice.jaxws_WebService-JAXWS");
    EntityManager em = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = em.getTransaction();
    

    @Override
    public List<Persona> findAll() {
        transaction.begin();
        List<Persona> personas = em.createNamedQuery("Persona.findAll").getResultList();
        transaction.commit();
        return personas;
    }

    @Override
    public Persona findById(Persona p) {
        transaction.begin();
        Persona persona = (Persona) em.find(Persona.class, p.getIdpersona());
        transaction.commit();
        return persona;
    }

    @Override
    public void insert(Persona p) {
        transaction.begin();
        em.persist(p);
        transaction.commit();
    }

    @Override
    public void update(Persona p) {
        transaction.begin();
        em.merge(p);
        transaction.commit();
    }

    @Override
    public void delete(Persona p) {
        transaction.begin();
        em.remove(em.merge(p));
        transaction.commit();
    }
    
}
