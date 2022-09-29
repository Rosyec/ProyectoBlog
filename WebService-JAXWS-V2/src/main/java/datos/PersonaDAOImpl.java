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
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Stateless
public class PersonaDAOImpl implements PersonaDAO{
    
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.mycompany.webservice.jaxws.v2_WebService-JAXWS-V2");
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
    public Persona findByEmail(Persona p) {
        if (!em.getTransaction().isActive()) {
            transaction.begin();
        }
        
        try{
        Persona persona = (Persona) em.createNamedQuery("Persona.findByEmail", Persona.class).setParameter("email", p.getEmail()).getSingleResult();
        transaction.commit();
        return persona;
        
        }catch(NoResultException e){
            return null;
        }       
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
