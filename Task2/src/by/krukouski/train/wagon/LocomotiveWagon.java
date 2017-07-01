package by.krukouski.train.wagon;

import by.krukouski.train.type.EngineType;

public class LocomotiveWagon extends Wagon {
	private EngineType engineType;
	private int maxSpeed;
	
	public LocomotiveWagon() {
		super();
	}
	
	public LocomotiveWagon(int id, int length, int width, int weight, EngineType engineType, int maxSpeed) {
		super(id, length, width, weight);
		this.engineType = engineType; 
		this.maxSpeed = maxSpeed;
	}

	public EngineType getEngineType() {
		return engineType;
	}

	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "LocomotiveWagon [" + super.toString() + ", engineType=" + engineType + ", maxSpeed=" + maxSpeed + "]";
	}
}
