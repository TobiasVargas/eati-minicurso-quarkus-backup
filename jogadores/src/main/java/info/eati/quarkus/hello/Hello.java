package info.eati.quarkus.hello;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/api/hello")
public class Hello {

	@GET
	@Path("/")
	public Response dizerOlaMundo() {
		return Response.ok("Hello World!").build();
	}
}
