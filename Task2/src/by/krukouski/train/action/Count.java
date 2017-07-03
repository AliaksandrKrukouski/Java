package by.krukouski.train.action;


import by.krukouski.train.train.Train;
import by.krukouski.train.wagon.BaggageWagon;
import by.krukouski.train.wagon.PassengerWagon;
import by.krukouski.train.wagon.Wagon;

public class Count {

	public static int countTrainSeatNumber(Train train) {
		int trainSeatNumber = 0;
		
		for (Wagon wagon:train.getTrain()) {
			trainSeatNumber += wagon instanceof PassengerWagon ? ((PassengerWagon) wagon).getSeatNumber() : 0;
		}
		
		return trainSeatNumber; 
	}

	public static double countTrainCapacity(Train train) {
		double trainCapacity = 0;
		
		for (Wagon wagon:train.getTrain()) {
			trainCapacity += wagon instanceof BaggageWagon ? ((BaggageWagon) wagon).getCapacity() : 0;
		}
		
		return trainCapacity; 
	}
}