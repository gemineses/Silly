package propiedades;

import modelo.Logs;

public class Variables {
	//clases siempre activas
	public static final Logs logs=new Logs();
	//tipos de archivo
	public static final String tipoACsv=".csv";
	public static final String tipoAImagenesEscenarios=".png";
	public static final String tipoATexto=".txt";
	//rutas
	public static final String rutaEscenarios="material/texturas/fondos/";
	public static final String rutaLogs="logs/";
	public final String nombreClase;
	public Variables(Class clase){
		this.nombreClase=clase.getName();
	}
}
