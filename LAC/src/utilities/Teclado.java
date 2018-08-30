package utilities;
import java.util.Scanner;

public class Teclado {
	
	@SuppressWarnings("resource")
	//char////////////
	public static String leerString() {
		return new Scanner(System.in).nextLine();
	}
	public static String leerString(String msg) {
		System.out.println(msg);
		return leerString();
	}
	
	
	@SuppressWarnings("resource")
	//int//////////////
	public static int leerInt() {
		return new Scanner(System.in).nextInt();
	}
	public static int leerInt(String msg) {
		System.out.println(msg);
		return leerInt();
	}
	
	
	@SuppressWarnings("resource")
	//float///////////
	public static float leerFloat() {
		return new Scanner(System.in).nextFloat();
	}
	public static float leerFloat(String msg) {
		System.out.println(msg);
		return leerFloat();
	}
	
	
	@SuppressWarnings("resource")
	//byte/////////////
	public static byte leerByte() {
		return new Scanner(System.in).nextByte();
	}
	public static byte leerByte(String msg) {
		System.out.println(msg);
		return leerByte();
	}
	
	
	@SuppressWarnings("resource")
	//short////////////
	public static short leerShort() {
		return new Scanner(System.in).nextShort();
	}
	public static short leerShort(String msg) {
		System.out.println(msg);
		return leerShort();
	}	
	
	
	@SuppressWarnings("resource")
	//long////////////
	public static long leerLong() {
		return new Scanner(System.in).nextLong();
	}
	public static long leerLong(String msg) {
		System.out.println(msg);
		return leerLong();
	}
	
	
	@SuppressWarnings("resource")
	//double//////////
	public static double leerDouble() {
		return new Scanner(System.in).nextDouble();
	}
	public static double leerDouble(String msg) {
		System.out.println(msg);
		return leerDouble();
	}
	
	
	@SuppressWarnings("resource")
	//char////////////
	public static char leerChar() {
		return new Scanner(System.in).next().charAt(0);
	}
	public static char leerChar(String msg) {
		System.out.println(msg);
		return leerChar();
	}
	
	
	@SuppressWarnings("resource")
	//char////////////
	public static String leerWord() {
		return new Scanner(System.in).next();
	}
	public static String leerWord(String msg) {
		System.out.println(msg);
		return leerWord();
	}
	
	
//	@SuppressWarnings("resource")
//	//boolean////////
//	public static boolean leerBoolean() {
//		return new Scanner(System.in).nextBoolean();
//	}
//	public static boolean leerBoolean(String msg) {
//		System.out.println(msg);
//		return leerBoolean();
//	}
	
}
