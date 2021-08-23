package usoThreads;

public class BancoSinSincronizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco mibanco = new Banco();
		mibanco.transferencia(1, 2, 200);
	}

}

class Banco {

	private final double[] cuentas;

	public Banco() {
		this.cuentas = new double[100];
		for (int i = 0; i < cuentas.length; i++) {
			cuentas[i] = 2000;
		}
	}

	public void transferencia(int cuentaO, int cuentaD, double plata) {
		if (cuentas[cuentaO] < plata) // si tiene suficiente plata en la cuenta
			return;

		System.out.println(Thread.currentThread());

		cuentas[cuentaO] -= plata;

		System.out.printf("%10.2f de %d para %d ", plata, cuentaO, cuentaD);

		cuentas[cuentaD] += plata;

		System.out.printf("Saldo total: %10.2f%n ", getSaldoTotal());
	}

	public double getSaldoTotal() {
		double sumaCuentas = 0;
		for (double d : cuentas) {
			sumaCuentas += d;
		}
		return sumaCuentas;
	}
}

class EjecucionTransferencias implements Runnable {

	@Override
	public void run() {

	}

	public EjecucionTransferencias() {

	}

}