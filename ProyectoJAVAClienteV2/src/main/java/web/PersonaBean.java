/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import servicio.ServicioLocal;
import webservice.BlogServicioImplService;
import webservice.BlogServicioWS;
import webservice.Blogs;
import webservice.Persona;

/**
 *
 * @author chech
 */
@Named("ControladorPersona")
@SessionScoped
public class PersonaBean implements Serializable{
    BlogServicioWS blogServicioWS = new BlogServicioImplService().getBlogServicioImplPort();
    
    @Inject
    ServicioLocal servicioLocal;
    
    List<Persona> personas;
    
    List<Blogs> blogs;
    
    private String titulo = "Bienvenido a Bloggit Colombia";
    
    private String subTitulo = "Encuentra todos los temas de tu interes solo aqui.";
    
    private Persona persona;

    public PersonaBean() {
    }
    
    @PostConstruct
    public void inicializar(){
        personas = servicioLocal.listarPersonas();
        blogs = blogServicioWS.buscarTodosLosBlogs();
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public List<Blogs> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blogs> blogs) {
        this.blogs = blogs;
    }
    
    
    
}
