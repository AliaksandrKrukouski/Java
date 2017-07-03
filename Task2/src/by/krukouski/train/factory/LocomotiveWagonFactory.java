package by.krukouski.train.factory;

import by.krukouski.train.type.EngineType;
import by.krukouski.train.wagon.LocomotiveWagon;

public class LocomotiveWagonFactory extends WagonFactory {
	@Override
	public LocomotiveWagon createWagon() { 
		return new LocomotiveWagon();
	}
	
	public static LocomotiveWagon createWagon(int id, int length, int width, int weight, EngineType engineType, int maxSpeed) { 
		return new LocomotiveWagon(id, length, width, weight, engineType, maxSpeed);
	}
}