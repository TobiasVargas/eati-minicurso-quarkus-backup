package info.eati.quarkus.service;

import java.util.List;

import info.eati.quarkus.entity.Jogador;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JogadorService {
	
	public List<Jogador> consultarTodosOsJogadores() {
		return Jogador.findAll().list();
	}
	
	public Jogador consultarJogadorPeloId(Long id) {
		return (Jogador) Jogador.findByIdOptional(id).orElseThrow();
	}
}
