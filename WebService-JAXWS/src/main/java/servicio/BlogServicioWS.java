/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import dominio.Blogs;
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
    public List<Blogs> buscarTodosLosBlogs();
    @WebMethod
    public Blogs buscarBlogPorId(Blogs blogs);
}
