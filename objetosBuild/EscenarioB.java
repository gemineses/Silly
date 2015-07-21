package objetosBuild;

import java.awt.Graphics;

import javax.swing.JComponent;

import modelo.Archivos;
import objetos.Escenario;
import objetosDataAccess.EscenarioDA;
import propiedades.Variables;

public class EscenarioB extends JComponent{
	Escenario escenario;
	EscenarioDA escenarioDA=new EscenarioDA();
	Archivos archivo=new Archivos();
	Variables var=new Variables(this.getClass());
	public EscenarioB(){
		escenario=new Escenario();
	}
	public EscenarioB(int escenarioId){
		setEscenario(escenarioDA.consultaEscenario(escenarioId));
	}
	
	//G&S de escenario
	public Escenario getEscenario() {
		return escenario;
	}
	public void setEscenario(Escenario escenario) {
		this.escenario = escenario;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(archivo.leeImagenes(0, var.rutaEscenarios, escenario.getNombre(), var.tipoAImagenesEscenarios), 0, 0, null);
	}
}
