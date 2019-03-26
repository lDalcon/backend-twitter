package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Table(name = "Likes")
@Entity
public class Likes implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id_Like")
	private long idLike;

	@Column(name = "Fecha_Like")
	private Date fechaLike;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Id_Publicacion_Like")
	private Publicacion publicacionLike;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Id_UsuarioLike")
	private Usuario usuarioLike;

	public Likes() {

	}

	public Likes(long idLike, Date fechaLike, Publicacion publicacionLike, Usuario usuarioLike) {
		this.idLike = idLike;
		this.fechaLike = fechaLike;
		this.publicacionLike = publicacionLike;
		this.usuarioLike = usuarioLike;
	}

	public long getIdLike() {
		return idLike;
	}

	public void setIdLike(long idLike) {
		this.idLike = idLike;
	}

	public Date getFechaLike() {
		return fechaLike;
	}

	public void setFechaLike(Date fechaLike) {
		this.fechaLike = fechaLike;
	}

	public Publicacion getPublicacionLike() {
		return publicacionLike;
	}

	public void setPublicacionLike(Publicacion publicacionLike) {
		this.publicacionLike = publicacionLike;
	}

	public Usuario getUsuarioLike() {
		return usuarioLike;
	}

	public void setUsuarioLike(Usuario usuarioLike) {
		this.usuarioLike = usuarioLike;
	}

}
