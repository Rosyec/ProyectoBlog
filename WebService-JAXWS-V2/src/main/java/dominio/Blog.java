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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chech
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Blog.findAll", query = "SELECT b FROM Blog b"),
    @NamedQuery(name = "Blog.findByIdblog", query = "SELECT b FROM Blog b WHERE b.idblog = :idblog")})
@XmlAccessorType(XmlAccessType.FIELD)
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idblog;
    @Lob
    @Size(max = 2147483647)
    private String titulo;
    @Lob
    @Size(max = 2147483647)
    private String contenido;
    @Lob
    @Size(max = 2147483647)
    private String url;
    @Lob
    @Size(max = 2147483647)
    private String texto;

    public Blog() {
    }

    public Blog(Integer idblog) {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
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
        if (!(object instanceof Blog)) {
            return false;
        }
        Blog other = (Blog) object;
        if ((this.idblog == null && other.idblog != null) || (this.idblog != null && !this.idblog.equals(other.idblog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Blog[ idblog=" + idblog + " ]";
    }
    
}
