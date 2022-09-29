/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import dominio.Blog;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author chech
 */
@WebService
public interface BlogServicioWS {
    @WebMethod
    public List<Blog> buscarTodosLosBlogs();
    @WebMethod
    public Blog buscarBlogPorId(Blog blogs);
}
