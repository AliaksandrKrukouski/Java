package by.krukouski.train.action;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.krukouski.train.train.Train;
import by.krukouski.train.wagon.PassengerWagon;
import by.krukouski.train.wagon.Wagon;

public class TrainSearch {
	private static Logger logger = LogManager.getLogger(TrainSearch.class.getName());
	
	public static ArrayList<Wagon> searchWagonBySeatNumber(Train train, int minSeatNumber, int maxSeatNumber) {
		ArrayList<Wagon> searchResult = new ArrayList<Wagon>();
		
		for (Wagon wagon:train.getTrain()) {
			if (wagon instanceof PassengerWagon 
					&& ((PassengerWagon) wagon).getSeatNumber() >= minSeatNumber
					&& ((PassengerWagon) wagon).getSeatNumber() <= maxSeatNumber) {
				logger.info("Search condition matches for " + wagon);
				searchResult.add(wagon);	
			}
		}
		
		return searchResult;
	}
}