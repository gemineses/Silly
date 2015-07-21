package objetosBuild;

import java.awt.Graphics;

import javax.swing.JComponent;

import objetos.Personaje;
import objetosDataAccess.PersonajeDA;

public class PersonajeB extends JComponent{
	Personaje personaje;
	PersonajeDA pDA=new PersonajeDA(); 
	int actualX, actualY;
	public PersonajeB(){
		setPersonaje(pDA.crear());
		super.setSize(personaje.getAncho(), personaje.getAlto());
	}
	
	public void movimiento(int x, int y){
		this.actualX=(int)this.getLocation().getX();
		this.actualY=(int)this.getLocation().getY();
		
		this.actualX=(actualX-x)+actualX;
		System.out.println(actualX);
		//this.actualY=(actualY-y)+actualY;
		//System.out.println(actualY);
		this.setLocation(actualX, actualY);
	}
	
	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(personaje.getColor());
		g.fillRect(0,0,personaje.getAncho(), personaje.getAlto());
	}

}
