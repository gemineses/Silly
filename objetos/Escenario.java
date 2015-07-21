package objetos;

public class Escenario {
	/*alto y ancho por px*/
	int alto, ancho;
	/*Nombre del escenario deacuerdo al archivo*/
	String nombre;
	int escenarioId;
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEscenarioId() {
		return escenarioId;
	}
	public void setEscenarioId(int escenarioId) {
		this.escenarioId = escenarioId;
	}
	
}