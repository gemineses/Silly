package objetosDataAccess;

import java.awt.Color;

import objetos.Personaje;

public class PersonajeDA {
	Personaje personaje=new Personaje();
	public Personaje crear(){
		personaje.setAlto(50);
		personaje.setAncho(50);
		personaje.setColor(Color.GREEN);
		personaje.setNombre("Personaje");
		return personaje;
	}
}
