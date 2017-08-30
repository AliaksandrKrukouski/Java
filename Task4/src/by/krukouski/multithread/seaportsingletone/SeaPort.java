package by.krukouski.multithread.seaportsingletone;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class SeaPort {
	private static SeaPort seaPort;
	private static Lock lock = new ReentrantLock(); 
	private static Semaphore semaphore;   
	
	private SeaPort(int seaPortCapacity) { 
		semaphore = new Semaphore(seaPortCapacity);
	}
	
	public static SeaPort getSeaPortSingleton(int seaPortCapacity) {
		lock.lock();
		
		try {
			if (seaPort == null) {
				seaPort = new SeaPort(seaPortCapacity);
			}
		} finally {	
			lock.unlock();
		}	
		
		return seaPort;
	}
	
	public void toArrive() {
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void toLeave() {
		semaphore.release();
	}
}
