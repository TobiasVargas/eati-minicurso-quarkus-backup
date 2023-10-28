package info.eati.quarkus.resource;

import info.eati.quarkus.dto.VotoDTO;
import info.eati.quarkus.service.VotoService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/votos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VotoResource {
	@Inject
	VotoService votoService;
	
	@Path("/")
	@POST
	public Response registrarVoto(VotoDTO votoDTO) {
		votoService.registrarVoto(votoDTO);
		return Response.ok(votoDTO).build();
	}
}
