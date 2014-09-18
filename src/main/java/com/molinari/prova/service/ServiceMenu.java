package com.molinari.prova.service;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/menu")
public class ServiceMenu {

	  @GET
	  @Path("/disegna")
	  @Produces({MediaType.APPLICATION_JSON})
	  public ArrayList<Menu> sayXMLHello() {
	    return Menu.creaMenu();
	  }
}
