package by.krukouski.train.action;

import java.util.Comparator;
import by.krukouski.train.wagon.Wagon;

public class TrainSort {
	static final Comparator<Wagon> LENGTH_ASC = new Comparator<Wagon>() {
		public int compare(Wagon wagonOne, Wagon wagonTwo) {
			return wagonOne.getLength() - wagonTwo.getLength();
		}
	};
	
	static final Comparator<Wagon> WIDTH_ASC = new Comparator<Wagon>() {
		public int compare(Wagon wagonOne, Wagon wagonTwo) {
			return wagonOne.getWidth() - wagonTwo.getWidth();
		}
	};
	
	static final Comparator<Wagon> WEIGHT_ASC = new Comparator<Wagon>() {
		public int compare(Wagon wagonOne, Wagon wagonTwo) {
			return wagonOne.getWeight() - wagonTwo.getWeight();
		}
	};
	
	
}