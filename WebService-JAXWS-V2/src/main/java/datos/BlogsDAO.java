/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Blog;
import java.util.List;

/**
 *
 * @author chech
 */
public interface BlogsDAO {
    public List<Blog> findAllBlogs(); 
    public Blog findBlogById(Blog blog);
}
