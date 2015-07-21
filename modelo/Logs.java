package modelo;

import propiedades.Variables;

public class Logs {
	Variables v;
	Archivos a=new Archivos();
	/* Todo se guardara en el archivo logs
	 * error : puede ir el id de error que el programador desee darle, luego agregaremos esto como parte de la bd
	 * referencia : el correo o contacto al area que puede resolver este problema
	 * salida : lo que mostrara en la consola
	 * */
	public void registraLogs(int error, String referencia, String salida, String clase){
		String texto=error+";"+referencia+";"+clase+":"+salida;
		//System.out.println(clase+"->"+salida);
		String errorNombre="";
		switch(error){
		case 0:
			errorNombre="Administracion";
			break;
		case 1:
			errorNombre="Error maquina";
			break;
		}
		//TODO: lista de errores en bd o algo
		a.GuardaArchivos(0, texto, v.rutaLogs, errorNombre);
	}
}
