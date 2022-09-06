/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import webservice.Persona;
import webservice.PersonaServicioWS;
import webservice.PersonaServicioImplService;

/**
 *
 * @author chech
 */
public class Test {

    public static void main(String[] args) {
        PersonaServicioWS personaServicioWS = new PersonaServicioImplService().getPersonaServicioImplPort();

//        System.out.println("Ejecutando Servicio Listar Personas!");
//
//        List<Persona> personas = personaServicioWS.buscarTodos();
//
//        for (Persona persona : personas) {
//            System.out.println("Id: " + persona.getIdpersona());
//            System.out.println("Nombre: " + persona.getNombre());
//            System.out.println("Apellido: " + persona.getApellido());
//            System.out.println("Email: " + persona.getEmail());
//            System.out.println("Telefono: " + persona.getTelefono());
//            System.out.println("\n");
//        }
//
//        System.out.println("Fin al Servicio Listar Personas!");
//
//        System.out.println("Ejecutando Servicio Buscar Persona por ID!");
//
//        Persona persona = personaServicioWS.buscarPorId(20);
//
//        System.out.println("Id: " + persona.getIdpersona());
//        System.out.println("Nombre: " + persona.getNombre());
//        System.out.println("Apellido: " + persona.getApellido());
//        System.out.println("Email: " + persona.getEmail());
//        System.out.println("Telefono: " + persona.getTelefono());
//
//        System.out.println("Fin al Servicio Buscar Persona por ID!");

//        System.out.println("Actualizando Persona!");
//        Persona p = new Persona();
//        p.setIdpersona(7);
//        p.setNombre("CHECHO");
//        p.setApellido("PARRADO");
//        p.setEmail("chechomens@gmail.com");
//        p.setTelefono("3114486298");
//        System.out.println("Persona actualizada!");
//        
//        personaServicioWS.actualizar(p);

    }
}
