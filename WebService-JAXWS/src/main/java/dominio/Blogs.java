/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author chech
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Blogs.findAll", query = "SELECT b FROM Blogs b"),
    @NamedQuery(name = "Blogs.findByIdblog", query = "SELECT b FROM Blogs b WHERE b.idblog = :idblog"),
    @NamedQuery(name = "Blogs.findByTitulo", query = "SELECT b FROM Blogs b WHERE b.titulo = :titulo")})
public class Blogs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idblog;
    private String titulo;
    @Lob
    private String contenido;
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
    @OneToOne
    private Persona persona;

    public Blogs() {
    }

    public Blogs(Integer idblog) {
        this.idblog = idblog;
    }

    public Integer getIdblog() {
        return idblog;
    }

    public void setIdblog(Integer idblog) {
        this.idblog = idblog;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idblog != null ? idblog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Blogs)) {
            return false;
        }
        Blogs other = (Blogs) object;
        if ((this.idblog == null && other.idblog != null) || (this.idblog != null && !this.idblog.equals(other.idblog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Blogs[ idblog=" + idblog + " ]";
    }
    
}
