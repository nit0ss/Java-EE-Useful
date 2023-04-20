package entregable1;
import java.util.Random;
public class CCC {
	
	private double saldoDeCuenta;
	private String nombreDelTitular;
	public long numeroDeCuenta;
	
	public CCC (String nombreDelTitular, double saldoDeCuenta) {
		this.nombreDelTitular = nombreDelTitular;
		this.saldoDeCuenta = saldoDeCuenta;
		Random num = new Random();
		this.numeroDeCuenta = Math.abs(num.nextLong());
		
	}
	
	public  void setIngreso(double saldo) {
		saldoDeCuenta += saldo;
	}
	public  void setReintegro(double saldo) {
		checkDinero(saldo);
		saldoDeCuenta -= saldo;
		
	}
	
	public String getSaldoCuenta() {
		return nombreDelTitular + "\n" + 
				numeroDeCuenta + "\n"+ 
				saldoDeCuenta;
		}
	
	
	public boolean checkDinero(double saldo){
		if(saldo>saldoDeCuenta){
			System.out.println("No puede retirar");
			return false;
			}
			
		else return true;}
		


		
	
	public long getDatosCuenta() {return numeroDeCuenta;}
	
	
	public void RealizarTransferenciaEntreCuentas(CCC cuenta, double saldo) {
		if(checkDinero(saldo)) {
			cuenta.setIngreso(saldo);
			saldoDeCuenta -= saldo;
		}
	}
}