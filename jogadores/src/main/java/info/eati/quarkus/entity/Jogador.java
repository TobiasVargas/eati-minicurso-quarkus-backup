package info.eati.quarkus.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "jogadores", name = "jogadores")
@Getter
@Setter
public class Jogador extends PanacheEntityBase {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "time")
	private String time;
	@Column(name = "camisa")
	private int camisa;
	
}
