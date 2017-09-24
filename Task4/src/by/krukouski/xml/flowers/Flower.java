package by.krukouski.xml.flowers;

public class Flower {
	
	private String name;
	private String solid;
	private String origin;
	
	private String stalkColor;
	private String leafColor;
	private int length;
	private String lengthMeasure;
	
	private int temperature;
	private String temperatureMeasure;
	private boolean light;
	private int water;
	private String waterMeasure;
	private int waterFrequency;
	
	private String multiplying;

	public Flower(String name, String solid, String origin, String stalkColor, String leafColor, int length,
			      String lengthMeasure, int temperature, String temperatureMeasure, boolean light, int water,
			      String waterMeasure, int waterFrequency, String multiplying) {
		this.name = name;
		this.solid = solid;
		this.origin = origin;
		this.stalkColor = stalkColor;
		this.leafColor = leafColor;
		this.length = length;
		this.lengthMeasure = lengthMeasure;
		this.temperature = temperature;
		this.temperatureMeasure = temperatureMeasure;
		this.light = light;
		this.water = water;
		this.waterMeasure = waterMeasure;
		this.waterFrequency = waterFrequency;
		this.multiplying = multiplying;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSolid() {
		return solid;
	}

	public void setSolid(String solid) {
		this.solid = solid;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getStalkColor() {
		return stalkColor;
	}

	public void setStalkColor(String stalkColor) {
		this.stalkColor = stalkColor;
	}

	public String getLeafColor() {
		return leafColor;
	}

	public void setLeafColor(String leafColor) {
		this.leafColor = leafColor;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getLengthMeasure() {
		return lengthMeasure;
	}

	public void setLengthMeasure(String lengthMeasure) {
		this.lengthMeasure = lengthMeasure;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getTemperatureMeasure() {
		return temperatureMeasure;
	}

	public void setTemperatureMeasure(String temperatureMeasure) {
		this.temperatureMeasure = temperatureMeasure;
	}

	public boolean isLight() {
		return light;
	}

	public void setLight(boolean light) {
		this.light = light;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public String getWaterMeasure() {
		return waterMeasure;
	}

	public void setWaterMeasure(String waterMeasure) {
		this.waterMeasure = waterMeasure;
	}

	public int getWaterFrequency() {
		return waterFrequency;
	}

	public void setWaterFrequency(int waterFrequency) {
		this.waterFrequency = waterFrequency;
	}

	public String getMultiplying() {
		return multiplying;
	}

	public void setMultiplying(String multiplying) {
		this.multiplying = multiplying;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj == this) return true;
		if (!(obj instanceof Flower)) return false;
		
		Flower flower = (Flower) obj;
		
		return name.equals(flower.getName()) &&
			   solid.equals(flower.getSolid()) &&
			   origin.equals(flower.getOrigin()) && 
			   stalkColor.equals(flower.getStalkColor()) && 
			   leafColor.equals(flower.getLeafColor()) && 
			   length == flower.getLength() && 
			   lengthMeasure.equals(flower.getLengthMeasure()) && 
			   temperature == getTemperature() && 
			   temperatureMeasure.equals(flower.getTemperatureMeasure()) && 
			   light == flower.isLight() &&
			   water == flower.getWater() &&
			   waterMeasure.equals(flower.getWaterMeasure()) && 
			   waterFrequency == flower.getWaterFrequency() && 
			   multiplying.equals(flower.getMultiplying());
	}	
}
