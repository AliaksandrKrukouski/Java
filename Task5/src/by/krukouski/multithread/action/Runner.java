package by.krukouski.multithread.action;

import java.io.IOException;

import by.krukouski.multithread.exception.EmptyFileException;
import by.krukouski.multithread.exception.IncorrectParamsException;
import by.krukouski.multithread.port.LoadingPort;
import by.krukouski.multithread.ship.CargoShip;

public class Runner {

	public static void main(String[] args) throws NumberFormatException, EmptyFileException, IncorrectParamsException, IOException {
		String path = "data/init.txt";
		int port_capacity = Integer.parseInt(Reader.readParams(path)[0]);
		int ship_number = Integer.parseInt(Reader.readParams(path)[1]);
		 
		LoadingPort port = LoadingPort.getPort(port_capacity);
		
		for (int i = 1; i <= ship_number; i++) {
			new CargoShip(i, port).start();
		}
		 
	}
}