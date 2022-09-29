/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import webservice.Persona;
import webservice.PersonaServicioImplService;
import webservice.PersonaServicioWS;

/**
 *
 * @author chech
 */
@Named("ControladorRegister")
@RequestScoped
public class RegisterBean implements Serializable{
    PersonaServicioWS personaServicioWS = new PersonaServicioImplService().getPersonaServicioImplPort();
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private Persona p = null;
    private boolean succes = false;
    
    public RegisterBean() {
    }
    
    public void registrar(){
        p = new Persona();
        p.setNombre(this.nombre);
        p.setApellido(this.apellido);
        p.setEmail(this.email);
        p.setTelefono(this.telefono);
        
        personaServicioWS.insertar(p);
        
        succes = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isSucces() {
        return succes;
    }

    public void setSucces(boolean succes) {
        this.succes = succes;
    }
    
    
    
}
