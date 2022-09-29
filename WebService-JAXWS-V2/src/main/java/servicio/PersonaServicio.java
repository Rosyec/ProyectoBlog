/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import dominio.Persona;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PersonaServicio {
    public List<Persona> buscarTodos();
    public Persona buscarPorId(Persona p);
    public Persona buscarPorEmail(Persona p);
    public void insertar(Persona p);
    public void actualizar(Persona p);
    public void eliminar(Persona p);
}
