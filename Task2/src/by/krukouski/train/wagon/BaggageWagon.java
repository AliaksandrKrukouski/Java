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
	public boolean equals(Object obj) {
		if (obj == null) { return false; }
		
	    if (obj == this) { return true; }
	    
	    if (!(obj instanceof BaggageWagon)) { return false; }
	    
	    if (!super.equals(obj)) { return false; }
	    
	    BaggageWagon wagon = (BaggageWagon) obj;
 
		return capacity == wagon.getCapacity();
	}

	@Override
	public int hashCode() {
		int hash  = super.hashCode();
		
		hash = 31 * hash + (int) capacity;
		
		return hash;
	}
	
	@Override
	public String toString() {
		return "BaggageWagon [" + super.toString() + ", capacity=" + capacity + "]";
	}
}
