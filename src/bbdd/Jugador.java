package bbdd;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@SuppressWarnings("serial")
@Entity
@Table(name="Jugador")
public class Jugador implements Serializable{
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment",strategy="increment")
	@Column(name = "idJugador")
	private int idJugador;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;
	@Column(name="posicion")
	private String posicion;
	@Column(name="equipo")
	private int equipo;
	@Column(name="pais")
	private String pais;
	@Column(name="fechaInicio")
	private Date fechaInicio;
	@Column(name="tempInicio")
	private int tempInicio;
	@Column(name="edadInicio")
	private int edadInicio;
	@Column(name="fechaAscenso")
	private Date fechaAscenso;
	@Column(name="edadAscenso")
	private int edadAscenso;

	public Jugador() {
	}
	public Jugador(int idJugador, String nombre, String apellido, String posicion, int equipo, String pais,
			Date fechaInicio, int tempInicio, int edadInicio, Date fechaAscenso, int edadAscenso) {
		super();
		this.idJugador = idJugador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.posicion = posicion;
		this.equipo = equipo;
		this.pais = pais;
		this.fechaInicio = fechaInicio;
		this.tempInicio = tempInicio;
		this.edadInicio = edadInicio;
		this.fechaAscenso = fechaAscenso;
		this.edadAscenso = edadAscenso;
	}
	
	public int getIdJugador() {
		return idJugador;
	}
	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getEquipo() {
		return equipo;
	}
	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public int getTempInicio() {
		return tempInicio;
	}
	public void setTempInicio(int tempInicio) {
		this.tempInicio = tempInicio;
	}
	public int getEdadInicio() {
		return edadInicio;
	}
	public void setEdadInicio(int edadInicio) {
		this.edadInicio = edadInicio;
	}
	public Date getFechaAscenso() {
		return fechaAscenso;
	}
	public void setFechaAscenso(Date fechaAscenso) {
		this.fechaAscenso = fechaAscenso;
	}
	public int getEdadAscenso() {
		return edadAscenso;
	}
	public void setEdadAscenso(int edadAscenso) {
		this.edadAscenso = edadAscenso;
	}
	
}
