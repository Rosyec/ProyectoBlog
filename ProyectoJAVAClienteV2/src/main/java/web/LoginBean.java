/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
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
@SessionScoped
public class LoginBean implements Serializable{
    static Logger log = LogManager.getRootLogger();
    PersonaServicioWS personaServicioWS = new PersonaServicioImplService().getPersonaServicioImplPort();
    private String email = null;
    private String telefono = null;
    private boolean onError = false;
    private Persona personaLog = null;


    public LoginBean() {
    }
    
    public String login(){
        try{
        Persona p = new Persona();
        p.setEmail(this.email);
        personaLog = personaServicioWS.buscarPorEmail(p);
        log.debug("LOGIN RESPONSE: " + personaLog);
        if (personaLog != null) {
            this.onError = false;
            this.email = null;
            this.telefono = null;
            return "index";           
        } else{
            this.onError = true;
            return "login";
        }
        }catch(Exception e){
            e.printStackTrace();
            this.onError = true;
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

    public boolean isOnError() {
        return onError;
    }

    public void setOnError(boolean onError) {
        this.onError = onError;
    }

    public Persona getPersonaLog() {
        return personaLog;
    }

    public void setPersonaLog(Persona personaLog) {
        this.personaLog = personaLog;
    }
    
    
    
}
