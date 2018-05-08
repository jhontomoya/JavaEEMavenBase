package mx.com.cinepolis.schedule.rest;

import mx.com.arquitectura.base.model.UsuarioDO;
import mx.com.cinepolis.scheduler.commons.to.UsuarioTO;
import mx.com.cinepolis.scheduler.facade.UserManagementFacadeEJB;

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

@Path("/example")
public class UserCatalog {
    @EJB
    private UserManagementFacadeEJB userManagementFacadeEJB;

    @GET
    @Produces("application/json")
    @Path("/login")
    public Response getUser(@Context UriInfo ui) {
        //login?usr=jhonn&pwd=123
        MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
        String usr = queryParams.getFirst("usr");
        String pwd = queryParams.getFirst("pwd");

        UsuarioTO usuarioTO =  userManagementFacadeEJB.getUser(usr,pwd);

        return Response.ok().entity(usuarioTO).build();
    }

    @POST
    @Produces("application/json")
    @Path("/add")
    public Response setNewUser(UsuarioTO userTO) {
        UsuarioTO userTO2 = userManagementFacadeEJB.setNewUser(userTO);
        return Response.ok().entity(userTO2).build();
    }

    @GET
    @Produces("application/json")
    @Path("/users")
    public Response getAllUsers() {
        List<UsuarioTO> usuarioTOList = userManagementFacadeEJB.getAllUsers();
        GenericEntity<List<UsuarioTO>> entity = new GenericEntity<List<UsuarioTO>>(usuarioTOList) {};
        return Response.ok().entity(entity).build();
    }

}
