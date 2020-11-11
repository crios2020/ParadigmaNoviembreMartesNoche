class Cuenta{
	int nro;
	String moneda;
	float saldo;
	
	//método constructor
	Cuenta(int nro,String moneda){
		this.nro=nro;
		this.moneda=moneda;
	}
	
	void depositar(float monto){
		saldo=saldo+monto;
	}
	
	void debitar(float monto){
		if(monto<=saldo){
			saldo=saldo-monto;
		}else{
			System.out.println("No Hay Fondos Suficientes!");
		}
	}
	
	String getEstado(){
		return nro+", "+moneda+", "+saldo;
	}
}

class Cliente{
	int nro;
	String nombre;
	Cuenta cuenta;
	
	//método constructor
	Cliente(int nro,String nombre,Cuenta cuenta){
		this.nro=nro;
		this.nombre=nombre;
		this.cuenta=cuenta;
	}
	
	Cliente(int nro,String nombre, int nroCuenta){
		this.nro=nro;
		this.nombre=nombre;
		this.cuenta=new Cuenta(nroCuenta,"arg$");
	}
	
	Cuenta getCuenta(){
		return cuenta;
	}
	
	String getEstado(){
		return nro+", "+nombre+", "+cuenta.getEstado();
	}
}

public class Paradigma2{
	public static void main(String[] args){
		System.out.println("--Clase02--");
		
		//Objetos Mock (Objetos de simulación)
		System.out.println("-- cuenta1 --");
		Cuenta cuenta1=new Cuenta(1,"arg$");
		cuenta1.depositar(50000);
		cuenta1.depositar(20000);
		cuenta1.debitar(3000);
		System.out.println(cuenta1.getEstado());
		
		System.out.println("-- cliente1 --");
		Cliente cliente1=new Cliente(1,"Juan Perez",2);
		cliente1.getCuenta().depositar(800000);
		Cuenta cuentaCliente1=cliente1.getCuenta();
		cuentaCliente1.depositar(200000);
		
		System.out.println("-- cliente2 --");
		Cliente cliente2=new Cliente(2,"Roxana Listorti",cuentaCliente1);
		cliente2.getCuenta().debitar(50000);
		cliente2.getCuenta().debitar(25000);
		
		System.out.println(cliente1.getEstado());
		System.out.println(cliente2.getEstado());
		
		
		
		
	}
}
