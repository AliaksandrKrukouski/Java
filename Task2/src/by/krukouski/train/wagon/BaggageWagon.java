package by.krukouski.train.wagon;

public class BaggageWagon extends Wagon {
	private double capacity;

	public BaggageWagon() {
		super();
	}

	public BaggageWagon(int id, int length, int width, int weight, double capacity) {
		super(id, length, width, weight);
		this.capacity = capacity;
	}
	
	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "BaggageWagon [" + super.toString() + ", capacity=" + capacity + "]";
	}
}
