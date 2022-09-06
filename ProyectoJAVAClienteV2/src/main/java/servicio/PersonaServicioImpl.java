/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import webservice.Persona;
import webservice.PersonaServicioImplService;
import webservice.PersonaServicioWS;

/**
 *
 * @author chech
 */
@Stateless
public class PersonaServicioImpl implements ServicioLocal{
 PersonaServicioWS personaServicioWS = new PersonaServicioImplService().getPersonaServicioImplPort();

    @Override
    public List<Persona> listarPersonas() {
        return personaServicioWS.buscarTodos();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaServicioWS.buscarPorId(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaServicioWS.insertar(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaServicioWS.actualizar(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaServicioWS.eliminar(persona);
    }
    
}
