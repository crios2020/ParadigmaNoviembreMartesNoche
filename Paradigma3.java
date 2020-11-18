final class Cuenta{
	private int nro;
	private float saldo;
	private final static float descubierto=5000;
	
	public Cuenta(int nro){
		this.nro=nro;
	}
		
}// end class Cuenta

class Auto{
	private String marca;
	private String modelo;
	private String color;
	private static int velocidad;
	
	public Auto(String marca, String modelo, String color){
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
	} 
	
	public static void acelerar(){
		velocidad=velocidad+10;
	}
	
	public static int getVelocidad(){
		return velocidad;
	}
	
	public String getEstado(){
		return marca+", "+modelo+", "+color;
	}
}//end class Auto


public class Paradigma3{
	public static void main(String[] args){
		System.out.println("Paradigma - Clase 03");
		
		Auto.acelerar();
		
		System.out.println("-- auto1 --");
		Auto auto1=new Auto("Renault","Kangoo","Bordo");
		Auto.acelerar();			// 10
		Auto.acelerar();			// 20
		Auto.acelerar();			// 30
		System.out.println(auto1.getEstado());
		System.out.println(Auto.getVelocidad());
		
		System.out.println("-- auto2 --");
		Auto auto2=new Auto("VW","UP","Blanco");
		Auto.acelerar();			// 40
		System.out.println(auto2.getEstado());
		System.out.println(Auto.getVelocidad());
		
		//Persona p=new Persona();
		//Error no se puede crear un objeto de una clase Abstracta
		
		
	}
}

abstract class Persona{
	private String nombre;
	private String apellido;
}
