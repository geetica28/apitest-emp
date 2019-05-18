package com.mypack;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("emp")
public class EmployeeClass {

	
	@GET
	@Path("emp1/{id}/{names}")
	@Produces({"application/json","application/xml"})
	public Employee name1(@PathParam("id") int num, @PathParam("names") String name) {
		Employee obj = new Employee();
		obj.setId(num);
		obj.setName(name);
		return obj;
	}
	
	@GET
	@Path("emp2")
	@Produces({"application/json","application/xml"})
	public Employee name2(@QueryParam("id") int num, @QueryParam("names") String name) {
		Employee obj = new Employee();
		obj.setId(num);
		obj.setName(name);
		return obj;
	}
	
	@POST
	@Produces({"application/json","application/xml"})
	public Employee name3(@FormParam("num") int num, @FormParam("names") String name) {
		Employee obj = new Employee();
		obj.setId(num);
		obj.setName(name);
		return obj;
	}
}
