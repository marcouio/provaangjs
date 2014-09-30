package com.molinari.prova.service.users;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/utente")
public class ServiceUtente {

	  @GET
	  @Path("/registra")
	  @Produces({MediaType.APPLICATION_JSON})
	  public String registra(@QueryParam("firstname") String name, 
	  						   @QueryParam("username") String uname, 
	  						   @QueryParam("password") String pwd,
	  						   @QueryParam("surname") String sname) {
		  Utente utente = new Utente();
		  utente.setFirstname(name);
		  utente.setPassword(pwd);
		  utente.setSurname(sname);
		  utente.setUsermame(uname);
		  return "";
	  }
}
