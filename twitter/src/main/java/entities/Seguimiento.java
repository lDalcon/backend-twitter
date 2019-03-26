package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Table(name = "Seguimiento")
@Entity
public class Seguimiento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id_Seguimiento")
	private long idSeguimiento;

	@Column(name = "Fecha_Seguimiento")
	private Date fechaSeguimiento;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Id_UsuarioSeguidor", nullable = false)
	private Usuario usuarioSeguidor;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Id_UsuarioSeguido", nullable = false)
	private Usuario usuarioSeguido;

	public Seguimiento() {

	}

}
