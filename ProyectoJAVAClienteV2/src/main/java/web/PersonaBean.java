/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import servicio.ServicioLocal;
import webservice.BlogServicioImplService;
import webservice.BlogServicioWS;
import webservice.Blogs;
import webservice.Persona;


@Named("ControladorPersona")
@SessionScoped
public class PersonaBean implements Serializable{
    BlogServicioWS blogServicioWS = new BlogServicioImplService().getBlogServicioImplPort();
    
    static Logger log = LogManager.getRootLogger();
    
    @Inject
    ServicioLocal servicioLocal;
    
    private Blogs blogSeleccionado;
    
    List<Persona> personas;
    
    List<Blogs> blogs;
       
    private List<String> tituloSlider = new ArrayList<>(3);
    private List<String> subtituloSlider = new ArrayList<>(3);
    
    private Persona persona;

    public PersonaBean() {
    }
    
    @PostConstruct
    public void inicializar(){
        tituloSlider.add(0, "Encuentra los mejores cuadros");
        tituloSlider.add(1, "Los cuadros mas vendidos");
        tituloSlider.add(2, "Enmarca tu cuadro");
        subtituloSlider.add(0, "Si buscas un cuadro abstracto, estas en el lugar indicado.");
        subtituloSlider.add(1, "Lo mas popular en todo el mundo.");
        subtituloSlider.add(2, "Elige el marco de tu preferencia.");
        personas = servicioLocal.listarPersonas();
        blogs = blogServicioWS.buscarTodosLosBlogs();
    }
    
    public Blogs buscarBlogPorId(Blogs blog){
        blogSeleccionado = blog;
        log.debug("Blog Seleccionado: ");
        log.debug(blog);
        return blogSeleccionado;
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

    public List<Blogs> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blogs> blogs) {
        this.blogs = blogs;
    }

    public List<String> getTituloSlider() {
        return tituloSlider;
    }

    public void setTituloSlider(List<String> tituloSlider) {
        this.tituloSlider = tituloSlider;
    }

    public List<String> getSubtituloSlider() {
        return subtituloSlider;
    }

    public void setSubtituloSlider(List<String> subtituloSlider) {
        this.subtituloSlider = subtituloSlider;
    }
    
    
    
}
