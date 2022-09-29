/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Persona;
import java.util.List;

/**
 *
 * @author chech
 */
public interface PersonaDAO {
    public List<Persona> findAll();
    public Persona findById(Persona p);
    public Persona findByEmail(Persona p);
    public void insert(Persona p);
    public void update(Persona p);
    public void delete(Persona p);
}
