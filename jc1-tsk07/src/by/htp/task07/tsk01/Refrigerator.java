package by.htp.task07.tsk01;

public class Refrigerator extends ElectroDevice {
	private static final long serialVersionUID = -8041001532963625296L;
	
	private int freezerCapacity;
	private int overallCapacity;
	private double weight;
	private double height;
	private double width;
	
	public Refrigerator() {}
	
	public Refrigerator(int freezerCapacity, int overallCapacity, double weight, double height, double width) {
		super();
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.weight = weight;
		this.height = height;
		this.width = width;
	}
	
	//----------------------------------------------------
	public void setTemp() {
		// установить температуру холодильника
	}
	
	public void setFreezerTemp() {
		// установить температуру морозильника
	}
	
	public void unFreeze() {
		// разморозка
	}

	//----------------------------------------------------
	public int getFreezerCapacity() {
		return freezerCapacity;
	}
	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public int getOverallCapacity() {
		return overallCapacity;
	}
	public void setOverallCapacity(int overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	//----------------------------------------------------
	@Override
	public String toString() {
		return "Refrigerator [freezerCapacity=" + freezerCapacity + ", overallCapacity=" + overallCapacity + ", weight="
				+ weight + ", height=" + height + ", width=" + width + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + freezerCapacity;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + overallCapacity;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator other = (Refrigerator) obj;
		if (freezerCapacity != other.freezerCapacity)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (overallCapacity != other.overallCapacity)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
}
