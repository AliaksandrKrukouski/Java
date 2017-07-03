package by.krukouski.train.train;

import java.util.ArrayList;

import by.krukouski.train.wagon.Wagon;

public class Train {
	private ArrayList<Wagon> train;
 
	public Train() {};

	public Train(ArrayList<Wagon> train) {
		this.train = train;
	}

	public ArrayList<Wagon> getTrain() {
		return train;
	}

	public void setTrain(ArrayList<Wagon> train) {
		this.train = train;
	}
}