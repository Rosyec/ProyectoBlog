/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import dominio.Persona;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author chech
 */
@WebService
public interface PersonaServicioWS {
    @WebMethod
    public List<Persona> buscarTodos();
    @WebMethod
    public Persona buscarPorId(Persona p);
    @WebMethod
    public Persona buscarPorEmail(Persona p);
    @WebMethod
    public void insertar(Persona p);
    @WebMethod
    public void actualizar(Persona p);
    @WebMethod
    public void eliminar(Persona p);
}
