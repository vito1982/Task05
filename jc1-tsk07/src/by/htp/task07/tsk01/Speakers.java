package by.htp.task07.tsk01;

import java.util.Arrays;

public class Speakers extends ElectroDevice {
	private static final long serialVersionUID = -3278159007590197691L;
	
	private int numberOfSpeakers;
	private int cordLength;
	private double[] frequencyRange;
	
	public Speakers() {}
	
	public Speakers(int numberOfSpeakers, int cordLength, double[] frequencyRange) {
		super();
		this.numberOfSpeakers = numberOfSpeakers;
		this.cordLength = cordLength;
		this.frequencyRange = frequencyRange;
	}
	
	//----------------------------------------------------
	public void changeVolume() {
		// изменение уровня громкости
	}

	//----------------------------------------------------
	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}
	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public int getCordLength() {
		return cordLength;
	}
	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}

	public double[] getFrequencyRange() {
		return frequencyRange;
	}
	public void setFrequencyRange(double[] frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	//----------------------------------------------------
	@Override
	public String toString() {
		return "Speakers [numberOfSpeakers=" + numberOfSpeakers + ", cordLength=" + cordLength + ", frequencyRange="
				+ Arrays.toString(frequencyRange) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cordLength;
		result = prime * result + Arrays.hashCode(frequencyRange);
		result = prime * result + numberOfSpeakers;
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
		Speakers other = (Speakers) obj;
		if (cordLength != other.cordLength)
			return false;
		if (!Arrays.equals(frequencyRange, other.frequencyRange))
			return false;
		if (numberOfSpeakers != other.numberOfSpeakers)
			return false;
		return true;
	}
}
