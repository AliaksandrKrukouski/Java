package by.krukouski.train.action;


import by.krukouski.train.train.Train;
import by.krukouski.train.wagon.BaggageWagon;
import by.krukouski.train.wagon.PassengerWagon;
import by.krukouski.train.wagon.Wagon;

public class Count {

	public static int countTotalSeatNumber(Train train) {
		int totalSeatNumber = 0;
		
		for (Wagon wagon:train.getTrain()) {
			totalSeatNumber += wagon instanceof PassengerWagon ? ((PassengerWagon) wagon).getSeatNumber() : 0;
		}
		
		return totalSeatNumber; 
	}

	public static double countTotalCapacity(Train train) {
		double totalCapacity = 0;
		
		for (Wagon wagon:train.getTrain()) {
			totalCapacity += wagon instanceof BaggageWagon ? ((BaggageWagon) wagon).getCapacity() : 0;
		}
		
		return totalCapacity; 
	}
}