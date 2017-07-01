package by.krukouski.train.wagon;

public abstract class Wagon { 
	private long id; 
	private int length;
	private int width;
	private int weight; 
	
	public Wagon() {};
	
	public Wagon(int id, int length, int width, int weight) {
		this.id = id;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void settWidth(int width) {
		this.width = width;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "id=" + id + ", length=" + length + ", width=" + width + ", weight=" + weight;
	}

    
}
