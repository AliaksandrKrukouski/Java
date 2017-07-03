package by.krukouski.train.action;

import java.util.ArrayList;

import by.krukouski.train.train.Train;
import by.krukouski.train.wagon.PassengerWagon;
import by.krukouski.train.wagon.Wagon;

public class Search {

	public static ArrayList<Wagon> searchWagonBySeatNumber(Train train, int minSeatNumber, int maxSeatNumber) {
		ArrayList<Wagon> searchResult = new ArrayList<Wagon>();
		
		for (Wagon wagon:train.getTrain()) {
			if (wagon instanceof PassengerWagon 
					&& ((PassengerWagon) wagon).getSeatNumber() >= minSeatNumber
					&& ((PassengerWagon) wagon).getSeatNumber() <= maxSeatNumber) {
				searchResult.add(wagon);	
			}
		}
		
		return searchResult;
	}
}