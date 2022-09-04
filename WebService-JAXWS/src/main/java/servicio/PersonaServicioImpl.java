/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import datos.PersonaDAO;
import dominio.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author chech
 */
@Stateless
public class PersonaServicioImpl implements PersonaServicio{

    @Inject
    PersonaDAO personaDAO;
    
    @Override
    public List<Persona> buscarTodos() {
        return personaDAO.findAll();
    }

    @Override
    public Persona buscarPorId(Persona p) {
        return personaDAO.findById(p);
    }

    @Override
    public void insertar(Persona p) {
        personaDAO.insert(p);
    }

    @Override
    public void actualizar(Persona p) {
        personaDAO.update(p);
    }

    @Override
    public void eliminar(Persona p) {
       personaDAO.delete(p);
    }
    
}
