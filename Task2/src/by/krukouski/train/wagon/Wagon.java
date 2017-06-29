package by.krukouski.train.wagon;

public class Wagon { 
	private int id; 
	private int length;
	private int weight;
	private int trackWidth;
	
	public Wagon() {};
	
	public Wagon(int id, int length, int weight, int trackWidth) {
		this.id = id;
		this.length = length;
		this.weight = weight;
		this.trackWidth = trackWidth;
	}
 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getTrackWidth() {
		return trackWidth;
	}

	public void setTrackWidth(int trackWidth) {
		this.trackWidth = trackWidth;
	}
}
