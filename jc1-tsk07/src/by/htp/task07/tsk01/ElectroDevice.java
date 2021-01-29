package by.htp.task07.tsk01;

public class ElectroDevice extends Device {
	private static final long serialVersionUID = -5445567708810936788L;
	private int powerConsumption;
	
	public ElectroDevice() {}
	
	public ElectroDevice(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	
	//----------------------------------------------------
	@Override
	public void on() {
		// подключить к электросети
		// включить устройство
		super.on();
	}

	@Override
	public void off() {
		super.off();
		// выключить устройство
		// отключить от электросети
	}

	//----------------------------------------------------
	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	//----------------------------------------------------
	@Override
	public String toString() {
		return "ElectroDevice [powerConsumption=" + powerConsumption + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + powerConsumption;
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
		ElectroDevice other = (ElectroDevice) obj;
		if (powerConsumption != other.powerConsumption)
			return false;
		return true;
	}
}
