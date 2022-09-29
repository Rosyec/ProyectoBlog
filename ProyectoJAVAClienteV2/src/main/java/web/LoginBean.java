/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import webservice.Persona;
import webservice.PersonaServicioImplService;
import webservice.PersonaServicioWS;

/**
 *
 * @author chech
 */
@Named("ControladorLogin")
@RequestScoped
public class LoginBean {
    static Logger log = LogManager.getRootLogger();
    PersonaServicioWS personaServicioWS = new PersonaServicioImplService().getPersonaServicioImplPort();
    private String email = null;
    private String telefono = null;

    public LoginBean() {
    }
    
    public String login(){
        try{
        Persona p = new Persona();
        p.setEmail(this.email);
        Persona personaLog = personaServicioWS.buscarPorEmail(p);
        log.debug("PERSONA: " + personaLog);
        if (personaLog != null) {
            if (personaLog.getEmail().equalsIgnoreCase(this.email)) {
                return "index";
            }else{
                return "login";
            }           
        } else{
            return "login";
        }
        }catch(Exception e){
            e.printStackTrace();
            return "login";
        }
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
    
    
    
}
