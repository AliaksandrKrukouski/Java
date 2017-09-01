package by.krukouski.multithread.action;

import by.krukouski.multithread.port.LoadingPort;
import by.krukouski.multithread.ship.CargoShip;

public class Runner {

	public static void main(String[] args) {
		final int PORT_CAPACITY = 3; 
		final int SHIP_NUMBER = 10; 
		
		LoadingPort port = LoadingPort.getPort(PORT_CAPACITY);
		
		for (int i = 1; i <= SHIP_NUMBER; i++) {
			new CargoShip(i, port).start();
		}
	}
}