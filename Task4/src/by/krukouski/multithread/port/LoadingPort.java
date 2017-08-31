package by.krukouski.multithread.port;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class LoadingPort {
	private static LoadingPort port;
	private static Lock lock = new ReentrantLock(); 
	private static Semaphore semaphore;   
	
	private LoadingPort(int portCapacity) { 
		semaphore = new Semaphore(portCapacity); 
	}
	
	public static LoadingPort getPort(int portCapacity) {
		lock.lock();
		
		try {
			if (port == null) {
				port = new LoadingPort(portCapacity);
			}
		} finally {	
			lock.unlock();
		}	
		
		return port;
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