package controladores;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDesktopPane;

import objetosBuild.ControlMouse;
import objetosBuild.ControlTeclado;
import objetosBuild.EscenarioB;
import objetosBuild.PersonajeB;
import vista.PantallaCampo;
import vista.PantallaEscritorio;
import vista.PantallaJframe;
import vista.SubPantallas;

public class Graficos{
	PantallaJframe frm;
	PantallaCampo pnl;
	SubPantallas sPersonajeDetalles;
	PantallaEscritorio frmMain;
	
	public void pantallaPrincipal(){
		//Instancias d objetos
		EscenarioB escB=new EscenarioB(1);
		PersonajeB perB=new PersonajeB();
		
		frm=new PantallaJframe();
		pnl=new PantallaCampo();
		frmMain=new PantallaEscritorio();
		sPersonajeDetalles=new SubPantallas();
		
		//funcionalidades
		ControlTeclado controlTeclado=new ControlTeclado();
		ControlMouse controlMouse=new ControlMouse();
		//frm.addKeyListener(controlTeclado);
		//frm.addMouseListener(controlMouse);
		//perB.addMouseListener(controlMouse);
		sPersonajeDetalles.setVisible(false);
		frmMain.add(sPersonajeDetalles);
		perB.getPersonaje().setColor(Color.black);
		frmMain.addMouseListener(controlMouse);
		frmMain.add(perB);
		
		frm.add(frmMain);
		
		frm.show();
		//dibujando
		Thread t=new Thread();
		int i=0;
		try {
			while(true){
				t.sleep(100);
				perB.repaint();
				perB.movimiento(controlMouse.getX(), controlMouse.getY());
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
