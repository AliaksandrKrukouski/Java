package by.krukouski.multithread.ship;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.krukouski.multithread.port.LoadingPort; 

public class CargoShip extends Thread {
	private static Logger logger = LogManager.getLogger(CargoShip.class.getName());
    private int id;
	private LoadingPort port;
	
	public CargoShip(int id, LoadingPort port) {
		this.id= id;
		this.port = port;
	}
	
	public void toUnload() { 
		try {
			logger.info("Ship #" + id + " arrived");
			port.toArrive();
			
			logger.info("Ship #" + id + " started unloading");
			TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextLong(5));
		} catch (InterruptedException e) { 
			logger.error("Ship #" + id + " was not unloaded correctly");
		} finally {
			logger.info("Ship #" + id + " left");
			port.toLeave();
		}
	}
	
	public void run() { 
		toUnload();
	}
}