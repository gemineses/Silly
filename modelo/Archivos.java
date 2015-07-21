package modelo;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

import propiedades.Variables;

public class Archivos {
	Variables v;
	File archivo;
	BufferedWriter bfEscritura;
	BufferedReader bfLectura;
	BufferedImage bfImagen;
	
	public void GuardaArchivos(int tipo, String texto, String ruta, String nombre){
		switch(tipo){
		case 0://archivos de texto
			nombre+=v.tipoATexto;
			break;
		
		case 1://archivos delimitados por comas
			nombre+=v.tipoACsv;
			break;
		}
		try {
			archivo=new File(ruta+nombre);

			if(archivo.exists()){//Ya existe un archivo
				bfEscritura=new BufferedWriter(new FileWriter(archivo,true));
			}else{//nuevo archivo
				bfEscritura=new BufferedWriter(new FileWriter(archivo));
			}	
			bfEscritura.write(texto);
			bfEscritura.newLine();
			bfEscritura.close();
		} catch (IOException e) {
			// TODO No permitir que se cierre el programa
			e.printStackTrace();
		}
	}
	
	/*public Object leeArchivos(int tipo, String ruta, String nombre, String tArchivo){
		Object obj=null;
		try {
			switch(tipo){
			case 0://imagenes
				bfImagen = ImageIO.read(new File(ruta+nombre+tArchivo));
				obj=bfImagen;
			break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return obj;
	}*/
	public BufferedImage leeImagenes(int tipo, String ruta, String nombre, String tArchivo){
		try {
			switch(tipo){
			case 0://imagenes
				bfImagen = ImageIO.read(new File(ruta+nombre+tArchivo));
			break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bfImagen;
	}
}
