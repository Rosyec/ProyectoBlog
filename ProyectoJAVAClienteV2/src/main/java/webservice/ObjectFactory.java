
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Blog_QNAME = new QName("http://servicio/", "blog");
    private final static QName _BuscarBlogPorId_QNAME = new QName("http://servicio/", "buscarBlogPorId");
    private final static QName _BuscarBlogPorIdResponse_QNAME = new QName("http://servicio/", "buscarBlogPorIdResponse");
    private final static QName _BuscarTodosLosBlogs_QNAME = new QName("http://servicio/", "buscarTodosLosBlogs");
    private final static QName _BuscarTodosLosBlogsResponse_QNAME = new QName("http://servicio/", "buscarTodosLosBlogsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Blog }
     * 
     */
    public Blog createBlog() {
        return new Blog();
    }

    /**
     * Create an instance of {@link BuscarBlogPorId }
     * 
     */
    public BuscarBlogPorId createBuscarBlogPorId() {
        return new BuscarBlogPorId();
    }

    /**
     * Create an instance of {@link BuscarBlogPorIdResponse }
     * 
     */
    public BuscarBlogPorIdResponse createBuscarBlogPorIdResponse() {
        return new BuscarBlogPorIdResponse();
    }

    /**
     * Create an instance of {@link BuscarTodosLosBlogs }
     * 
     */
    public BuscarTodosLosBlogs createBuscarTodosLosBlogs() {
        return new BuscarTodosLosBlogs();
    }

    /**
     * Create an instance of {@link BuscarTodosLosBlogsResponse }
     * 
     */
    public BuscarTodosLosBlogsResponse createBuscarTodosLosBlogsResponse() {
        return new BuscarTodosLosBlogsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Blog }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Blog }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "blog")
    public JAXBElement<Blog> createBlog(Blog value) {
        return new JAXBElement<Blog>(_Blog_QNAME, Blog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarBlogPorId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarBlogPorId }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarBlogPorId")
    public JAXBElement<BuscarBlogPorId> createBuscarBlogPorId(BuscarBlogPorId value) {
        return new JAXBElement<BuscarBlogPorId>(_BuscarBlogPorId_QNAME, BuscarBlogPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarBlogPorIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarBlogPorIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarBlogPorIdResponse")
    public JAXBElement<BuscarBlogPorIdResponse> createBuscarBlogPorIdResponse(BuscarBlogPorIdResponse value) {
        return new JAXBElement<BuscarBlogPorIdResponse>(_BuscarBlogPorIdResponse_QNAME, BuscarBlogPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosLosBlogs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarTodosLosBlogs }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarTodosLosBlogs")
    public JAXBElement<BuscarTodosLosBlogs> createBuscarTodosLosBlogs(BuscarTodosLosBlogs value) {
        return new JAXBElement<BuscarTodosLosBlogs>(_BuscarTodosLosBlogs_QNAME, BuscarTodosLosBlogs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosLosBlogsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarTodosLosBlogsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio/", name = "buscarTodosLosBlogsResponse")
    public JAXBElement<BuscarTodosLosBlogsResponse> createBuscarTodosLosBlogsResponse(BuscarTodosLosBlogsResponse value) {
        return new JAXBElement<BuscarTodosLosBlogsResponse>(_BuscarTodosLosBlogsResponse_QNAME, BuscarTodosLosBlogsResponse.class, null, value);
    }

}
