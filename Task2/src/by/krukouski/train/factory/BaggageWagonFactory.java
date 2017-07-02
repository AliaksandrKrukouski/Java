package by.krukouski.train.factory;

import by.krukouski.train.wagon.BaggageWagon;

public class BaggageWagonFactory extends WagonFactory {
	@Override
	public BaggageWagon createWagon() { 
		return new BaggageWagon();
	}

	public BaggageWagon createWagon(int id, int length, int width, int weight, double capacity) { 
		return new BaggageWagon(id, length, width, weight, capacity);
	}
}