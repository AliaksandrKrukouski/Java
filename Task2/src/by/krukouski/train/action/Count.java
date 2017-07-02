package by.krukouski.train.action;


import by.krukouski.train.train.Train;
import by.krukouski.train.wagon.BaggageWagon;
import by.krukouski.train.wagon.PassengerWagon;
import by.krukouski.train.wagon.Wagon;

public class Count {

	public static int getPassengerCount(Train train) {
		int count = 0;
		
		for (Wagon wagon:train.getTrain()) {
			count += wagon instanceof PassengerWagon ? 1 : 0;
		}
		
		return count; 
	}

	public static int getBaggageCount(Train train) {
		int count = 0;
		
		for (Wagon wagon:train.getTrain()) {
			count += wagon instanceof BaggageWagon ? 1 : 0;
		}
		
		return count; 
	}

}