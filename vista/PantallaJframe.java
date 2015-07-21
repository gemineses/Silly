package vista;

import javax.swing.JFrame;

import propiedades.Pantalla;
import propiedades.Variables;

public class PantallaJframe extends JFrame{
	Pantalla pV=new Pantalla();
	Variables v=new Variables(this.getClass());
	public PantallaJframe(){
		super.setSize(pV.medidasPantallaAncho, pV.medidasPantallaAlto);
		super.setUndecorated(true);
		//super.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
