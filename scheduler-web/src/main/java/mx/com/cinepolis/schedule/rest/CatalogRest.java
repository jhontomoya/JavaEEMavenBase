package mx.com.cinepolis.schedule.rest;

import mx.com.cinepolis.scheduler.commons.to.CatalogsTO;
import mx.com.cinepolis.scheduler.commons.to.GitHubAddUserTO;
import mx.com.cinepolis.scheduler.commons.to.GitHubUserTO;
import mx.com.cinepolis.scheduler.commons.to.GitHubUserValidTO;
import mx.com.cinepolis.scheduler.commons.to.UserTO;
import mx.com.cinepolis.scheduler.facade.CatalogFacadeEJB;
import mx.com.cinepolis.scheduler.facade.GitHubFacadeEJB;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * @author jrodriguez
 */
@Path("/catalog")
public class CatalogRest {

    @EJB
    private CatalogFacadeEJB catalogFacadeEJB;
    @EJB
    private GitHubFacadeEJB gitHubFacadeEJB;


    @GET
    @Produces("application/json")
    @Path("/user")
    public Response getSimpleCatalog()
    {
        UserTO userTO = catalogFacadeEJB.getSimpleUser();
        return Response.ok().entity(userTO).build();
    }
    
    /*@GET
    @Produces("application/json")
    @Path("/country/{pais}")
    public Response getEstados(@PathParam("pais") String pais) {
    	List<CatalogsTO> catalogsTOLits =  catalogFacadeEJB.getEstadosList(pais);
    	
    	//La manera de retornar una lista, ya que si se retorna de manera normal no pinta nada, Solo es con listas
    	GenericEntity<List<CatalogsTO>> entity = new GenericEntity<List<CatalogsTO>>(catalogsTOLits) {};
                
    	return Response.ok().entity(entity).build();
    }*/
    
    @GET
    @Produces("application/json")
    @Path("/country")
    public Response getEstados(@Context UriInfo ui) {
    	//country?pais=mexico
    	MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
    	String pais = queryParams.getFirst("pais");
    	
    	List<CatalogsTO> catalogsTOLits =  catalogFacadeEJB.getEstadosList(pais);
    	
    	//La manera de retornar una lista, ya que si se retorna de manera normal no pinta nada, Solo es con listas
    	GenericEntity<List<CatalogsTO>> entity = new GenericEntity<List<CatalogsTO>>(catalogsTOLits) {};
                
    	return Response.ok().entity(entity).build();
    }
    
    @GET
    @Produces("application/json")
    @Path("/users/{login}")
    public Response getLogin(@PathParam("login") String login) {
    	GitHubUserTO gitHubUserTO = gitHubFacadeEJB.getUserLogin(login);
        return Response.ok().entity(gitHubUserTO).build();
    }
    
    @GET
    @Produces("application/json")
    @Path("/login")
    public Response getState(@Context UriInfo ui) {
    	//login?usr=jhonn&pwd=123
    	MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
    	String usr = queryParams.getFirst("usr");
    	String pwd = queryParams.getFirst("pwd");
    	
    	GitHubUserValidTO gitHubUserValidTO =  gitHubFacadeEJB.getLoginValid(usr, pwd);
                
    	return Response.ok().entity(gitHubUserValidTO).build();
    }
    
    @POST
    @Produces("application/json")
    @Path("/alta")
    public Response setUserAdd(GitHubAddUserTO gitHubAddUserTO) {
    	return Response.ok().entity(gitHubAddUserTO).build();
    }
   
}
