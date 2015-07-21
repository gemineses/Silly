package vista;

import javax.swing.JPanel;

import propiedades.Pantalla;
import propiedades.Variables;

public class PantallaCampo extends JPanel{
	Pantalla pV=new Pantalla();
	Variables v=new Variables(this.getClass());
	public PantallaCampo(){
		super.setSize(pV.medidasPantallaAncho, pV.medidasPantallaAlto);
	}
}
