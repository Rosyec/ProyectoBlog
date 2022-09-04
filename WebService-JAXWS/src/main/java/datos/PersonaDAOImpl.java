/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PersonaDAOImpl implements PersonaDAO{
    
    @PersistenceContext(unitName="com.mycompany.webservice.jaxws_WebService-JAXWS")
    EntityManager em;

    @Override
    public List<Persona> findAll() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findById(Persona p) {
        return (Persona) em.createNamedQuery("Persona.findByIdpersona").getSingleResult();
    }

    @Override
    public void insert(Persona p) {
        em.persist(p);
    }

    @Override
    public void update(Persona p) {
        em.merge(p);
    }

    @Override
    public void delete(Persona p) {
        em.remove(em.merge(p));
    }
    
}
