package objetosDataAccess;

import objetos.Escenario;

public class EscenarioDA {
	public Escenario consultaEscenario(int escenarioId){
		Escenario escenario=new Escenario();
		//datos por mientras para ajustar el escenario de prueba
		escenario.setAlto(100);
		escenario.setAncho(100);
		escenario.setEscenarioId(escenarioId);
		escenario.setNombre("fondoPrueba");
		return escenario;
	}
}
