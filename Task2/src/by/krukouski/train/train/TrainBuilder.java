package by.krukouski.train.train;

import java.util.ArrayList;

import by.krukouski.train.exception.InvalidWagonTypeException;
import by.krukouski.train.factory.BaggageWagonFactory;
import by.krukouski.train.factory.LocomotiveWagonFactory;
import by.krukouski.train.factory.PassengerWagonFactory;
import by.krukouski.train.type.EngineType;
import by.krukouski.train.type.PassengerType;
import by.krukouski.train.wagon.Wagon;

public class TrainBuilder {

	public static Train BuildTrainFromStringList(ArrayList<String> wagonStringList) throws InvalidWagonTypeException {
		Wagon wagon;
		String[] wagonStringParsed;
		String wagonType;
		String[] wagonParameters;
		ArrayList<Wagon> wagonList = new ArrayList<Wagon>(); 
		
		for (String wagonString:wagonStringList) {
			wagonStringParsed = wagonString.split("@"); 
			wagonType = wagonStringParsed[0];
			wagonParameters = wagonStringParsed[1].split(",");
			
			switch(wagonType) {
				case "LOCOMITIVE": 
					wagon = LocomotiveWagonFactory.createWagon(Integer.parseInt(wagonParameters[0]), 
														  	   Integer.parseInt(wagonParameters[1]), 
															   Integer.parseInt(wagonParameters[2]),
															   Integer.parseInt(wagonParameters[3]),
															   EngineType.valueOf(wagonParameters[4]),
															   Integer.parseInt(wagonParameters[5]));
					break;
				case "BAGGAGE": 
					wagon = BaggageWagonFactory.createWagon(Integer.parseInt(wagonParameters[0]), 
													  	    Integer.parseInt(wagonParameters[1]), 
														    Integer.parseInt(wagonParameters[2]), 
														    Integer.parseInt(wagonParameters[3]), 
														    Double.parseDouble(wagonParameters[4]));
					break;
				
				case "PASSENGER": 
					wagon = PassengerWagonFactory.createWagon(Integer.parseInt(wagonParameters[0]), 
														  	  Integer.parseInt(wagonParameters[1]), 
															  Integer.parseInt(wagonParameters[2]),
															  Integer.parseInt(wagonParameters[3]),
															  PassengerType.valueOf(wagonParameters[4]),
															  Integer.parseInt(wagonParameters[5]));
		  		  	break;
		  		default: throw new InvalidWagonTypeException();  		  
			}
			
			wagonList.add(wagon); 
		}
		
		return new Train(wagonList);
	}
}
