package by.krukouski.train.factory;

import by.krukouski.train.type.PassengerType;
import by.krukouski.train.wagon.PassengerWagon;

public class PassengerWagonFactory extends WagonFactory {
	@Override
	public PassengerWagon createWagon() {
		return new PassengerWagon();
	}
	
	public static PassengerWagon createWagon(int id, int length, int width, int weight, PassengerType type, int seatNumber) {
		return new PassengerWagon(id, length, width, weight, type, seatNumber);
	}
}