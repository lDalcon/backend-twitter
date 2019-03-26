package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Table(name = "Publicacion")
@Entity
public class Publicacion implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id_Publicacion")
	private long idPublicacion;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Id_Usuario")
	private Usuario usuario;

	@Column(name = "Fecha_Publicacion")
	private Date fechaPublicacion;

	@Column(name = "Contenido_Publicaccion")
	private String contenidoPublicacion;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Id_Publicacion_RT", nullable = true)
	private Publicacion publicacionRT;

	public Publicacion() {

	}

	public Publicacion(long idPublicacion, Usuario usuario, Date fechaPublicacion, String contenidoPublicacion,
			Publicacion publicacionRT) {
		this.idPublicacion = idPublicacion;
		this.usuario = usuario;
		this.fechaPublicacion = fechaPublicacion;
		this.contenidoPublicacion = contenidoPublicacion;
		this.publicacionRT = publicacionRT;
	}

	public long getIdPublicacion() {
		return idPublicacion;
	}

	public void setIdPublicacion(long idPublicacion) {
		this.idPublicacion = idPublicacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getContenidoPublicacion() {
		return contenidoPublicacion;
	}

	public void setContenidoPublicacion(String contenidoPublicacion) {
		this.contenidoPublicacion = contenidoPublicacion;
	}

	public Publicacion getPublicacionRT() {
		return publicacionRT;
	}

	public void setPublicacionRT(Publicacion publicacionRT) {
		this.publicacionRT = publicacionRT;
	}

}
