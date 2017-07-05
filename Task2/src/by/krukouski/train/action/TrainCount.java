package by.krukouski.train.action;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.krukouski.train.train.Train;
import by.krukouski.train.wagon.BaggageWagon;
import by.krukouski.train.wagon.PassengerWagon;
import by.krukouski.train.wagon.Wagon;

public class TrainCount {
	private static Logger logger = LogManager.getLogger(TrainCount.class.getName());
	
	public static int countTrainSeatNumber(Train train) {
		int trainSeatNumber = 0;
		
		for (Wagon wagon:train.getTrain()) {
			trainSeatNumber += wagon instanceof PassengerWagon ? ((PassengerWagon) wagon).getSeatNumber() : 0;
		}
		
		logger.info("Total seats number is " + trainSeatNumber);
		return trainSeatNumber; 
	}

	public static double countTrainCapacity(Train train) {
		double trainCapacity = 0;
		
		for (Wagon wagon:train.getTrain()) {
			trainCapacity += wagon instanceof BaggageWagon ? ((BaggageWagon) wagon).getCapacity() : 0;
		}
		
		logger.info("Total capacity is " + trainCapacity);
		return trainCapacity; 
	}
}