package usoThreads;

public class SincronizandoHilos {

	public static void main(String[] args) {
		HilosVarios hilo1 = new HilosVarios();
		HilosVarios hilo2 = new HilosVarios();

		hilo1.start();
		try {
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		hilo2.start();
		try {
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Tareas teminadas");
	}

}

class HilosVarios extends Thread {

	public void run() {
		for (int i = 0; i < 15; i++) {

			System.out.println("Ejecutando hilo: " + getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
