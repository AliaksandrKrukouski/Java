package by.krukouski.train.wagon;

import by.krukouski.train.type.PassengerType;

public class PassengerWagon extends Wagon {
	private PassengerType type;
	private int seatNumber;
	
	public PassengerWagon() {
		super();
	}
	
	public PassengerWagon(int id, int length, int width, int weight, PassengerType type, int seatNumber) {
		super(id, length, width, weight);
		this.type = type;
		this.seatNumber = seatNumber;
	}
	
	public PassengerType getType() {
		return type;
	}
	
	public void setType(PassengerType type) {
		this.type = type;
	}
	
	public int getSeatNumber() {
		return seatNumber;
	}
	
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	@Override
	public String toString() {
		return "PassengerWagon [" + super.toString() + ", type=" + type + ", seatNumber=" + seatNumber + "]";
	}	
}
