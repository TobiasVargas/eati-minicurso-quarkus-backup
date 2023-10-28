package info.eati.quarkus.resource;

import java.util.List;

import info.eati.quarkus.entity.Jogador;
import info.eati.quarkus.service.JogadorService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/jogadores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JogadorResource {

	@Inject
	JogadorService jogadorService;
	
	@Path("/")
	@GET
	public Response consultarTodosOsJogadores() {
		List<Jogador> jogadores = jogadorService.consultarTodosOsJogadores();
		return Response.ok(jogadores).build();
	}
	
	@Path("/{id}")
	@GET
	public Response consultarJogadorPeloId(Long id) {
		Jogador jogador = jogadorService.consultarJogadorPeloId(id);
		return Response.ok(jogador).build();
	}
}
