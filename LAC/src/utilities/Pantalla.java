package utilities;

import javafx.scene.paint.Color;

public class Pantalla {
	
	//String/////////
	public static void write(String msg) {
		System.out.println(msg);
	}
	public static void writeNoTab(String msg) {
		System.out.print(msg);
	}
	
	//salto de linea
	public static void lineBreak() {
		System.out.println();
	}
	
	//int/////////////
	public static void write(int n) {
		System.out.println(n);
	}
	public static void writeNoTab(int n) {
		System.out.print(n);
	}
	
	//float////////////
	public static void write(float f) {
		System.out.println(f);
	}
	public static void writeNoTab(float f) {
		System.out.print(f);
	}
	
	//Enum/////////////
	public static void write(Enum e) {
		System.out.println(e.toString());
	}
	public static void writeNoTabColor(Enum e) {
		System.out.print(e.toString());
	}
	
	//Limpiar pantalla
	public static void clearScreen() {
		final String operatingSystem = System.getProperty("os.name");
		
		try {
			if (operatingSystem .contains("Windows")) {
			    Runtime.getRuntime().exec("cls");
			}
			else {
			    Runtime.getRuntime().exec("clear");
			}
		} catch (Exception e){
			Pantalla.write("Error: "+e);
		}
		
	}
	
}
