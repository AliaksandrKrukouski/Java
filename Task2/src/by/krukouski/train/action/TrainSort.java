package by.krukouski.train.action;

import java.util.Comparator;
import by.krukouski.train.wagon.Wagon;

public class TrainSort {
	public static final Comparator<Wagon> LENGTH_ASC = new Comparator<Wagon>() {
		public int compare(Wagon wagonOne, Wagon wagonTwo) {
			return wagonOne.getLength() - wagonTwo.getLength();
		}
	};
	
	public static final Comparator<Wagon> WIDTH_ASC = new Comparator<Wagon>() {
		public int compare(Wagon wagonOne, Wagon wagonTwo) {
			return wagonOne.getWidth() - wagonTwo.getWidth();
		}
	};	
}