/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.mediaserver;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.*;
import se.nrm.mediaserver.entity.Media;

/**
 *
 * @author ingimar
 */
@Stateless
@Path("/hybrid")
public class MediaBean {

    @PersistenceContext(unitName = "MysqlStatesPU")
    private EntityManager em;

    public void saveMedia(Media media) {
        em.persist(media);
    }
    
    public List fetchMedia(){
        Query createNamedQuery = em.createNamedQuery("select * from Image");
        List resultList = createNamedQuery.getResultList();
        return resultList;
    }
    
    @GET
    @Path("/test")
    @Produces("text/html")
    public String test(){
        String text ="content";
        return "<html><body><h1>Hello "+text+"!</h1></body></html>";
    }
}
