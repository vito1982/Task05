package by.htp.task07.tsk01;

public class VacuumCleaner extends ElectroDevice {
	private static final long serialVersionUID = -5003807880427081385L;
	
	private int motorSpeedRegualtion;
	private int cleaningWidth;
	private String filterType;
	private String bagType;
	private String wandType;
	
	public VacuumCleaner() {}
	
	public VacuumCleaner(int motorSpeedRegualtion, int cleaningWidth, String filterType, String bagType,
			String wandType) {
		super();
		this.motorSpeedRegualtion = motorSpeedRegualtion;
		this.cleaningWidth = cleaningWidth;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
	}
	
	//----------------------------------------------------
	public void changeFilter() {
		// замена фильтра
	}
	
	public void changePower() {
		// изменение мощности всасывания
	}

	//----------------------------------------------------
	public int getMotorSpeedRegualtion() {
		return motorSpeedRegualtion;
	}
	public void setMotorSpeedRegualtion(int motorSpeedRegualtion) {
		this.motorSpeedRegualtion = motorSpeedRegualtion;
	}

	public int getCleaningWidth() {
		return cleaningWidth;
	}
	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	public String getFilterType() {
		return filterType;
	}
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}
	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}
	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	//----------------------------------------------------
	@Override
	public String toString() {
		return "VacuumCleaner [motorSpeedRegualtion=" + motorSpeedRegualtion + ", cleaningWidth=" + cleaningWidth
				+ ", filterType=" + filterType + ", bagType=" + bagType + ", wandType=" + wandType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + cleaningWidth;
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		result = prime * result + motorSpeedRegualtion;
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (cleaningWidth != other.cleaningWidth)
			return false;
		if (filterType == null) {
			if (other.filterType != null)
				return false;
		} else if (!filterType.equals(other.filterType))
			return false;
		if (motorSpeedRegualtion != other.motorSpeedRegualtion)
			return false;
		if (wandType == null) {
			if (other.wandType != null)
				return false;
		} else if (!wandType.equals(other.wandType))
			return false;
		return true;
	}
}
