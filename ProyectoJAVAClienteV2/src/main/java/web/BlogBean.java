/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;


import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import webservice.BlogServicioImplService;
import webservice.BlogServicioWS;
import webservice.Blog;

/**
 *
 * @author chech
 */
@Named("ControladorBlog")
@SessionScoped
public class BlogBean implements Serializable{
    BlogServicioWS blogServicioWS = new BlogServicioImplService().getBlogServicioImplPort();
    
    static Logger log = LogManager.getRootLogger();
    
    private int idBlog = 0;
    private Blog blog = null;

    public BlogBean() {
    }
    
    public String enviarId(int idBlog){
        log.debug("ID BLOG: " + idBlog);
   
        Blog b = new Blog();
        b.setIdblog(idBlog);
        
        this.idBlog = idBlog;
        this.blog = blogServicioWS.buscarBlogPorId(b);
        
        
        return "detalleBlog";
    }  

    public int getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(int idBlog) {
        this.idBlog = idBlog;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }   
    
}
