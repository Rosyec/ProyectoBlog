/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import dominio.Blogs;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author chech
 */
@Local
public interface BlogServicio {
    public List<Blogs> buscarTodosLosBlogs(); 
    public Blogs buscarBlogPorId(Blogs blogs);   
}
