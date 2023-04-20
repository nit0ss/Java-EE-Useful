package entregable1;

public class OperacionesBando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCC cuenta1 = new CCC("Javi", 1000);
		CCC cuenta2 = new CCC("Pedro", 2000);
	
		//prueba metodos
		cuenta1.RealizarTransferenciaEntreCuentas(cuenta2, 3000);
		
		System.out.println("Saldos actualizados \n"+ cuenta1.getSaldoCuenta()
		+ "\n" + cuenta2.getSaldoCuenta());
	}

}
