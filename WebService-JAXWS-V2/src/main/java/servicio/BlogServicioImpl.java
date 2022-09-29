/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import datos.BlogsDAO;
import dominio.Blog;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

/**
 *
 * @author chech
 */
@Stateless
@WebService(endpointInterface = "servicio.BlogServicioWS")
public class BlogServicioImpl implements BlogServicio, BlogServicioWS{
    
    @Inject
    BlogsDAO blogsDAO; 

    @Override
    public List<Blog> buscarTodosLosBlogs() {
        return blogsDAO.findAllBlogs();
    }

    @Override
    public Blog buscarBlogPorId(Blog blogs) {
        return blogsDAO.findBlogById(blogs);
    }
    
}
