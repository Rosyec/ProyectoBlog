/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Blogs;
import java.util.List;

/**
 *
 * @author chech
 */
public interface BlogsDAO {
    public List<Blogs> findAllBlogs(); 
    public Blogs findBlogById(Blogs blogs);
}
