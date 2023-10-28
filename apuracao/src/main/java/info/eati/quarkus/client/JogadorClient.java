package info.eati.quarkus.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import info.eati.quarkus.dto.JogadorDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient(configKey = "clients.jogadores")
@Path("/api/jogadores")
public interface JogadorClient {
	@GET
	@Path("/{id}")
	JogadorDTO consultarJogadorPeloId(Long id);
}
