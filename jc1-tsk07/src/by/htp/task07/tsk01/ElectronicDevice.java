package by.htp.task07.tsk01;

public class ElectronicDevice extends Device {
	private static final long serialVersionUID = -7369862127526249124L;
	private int batteryCapacity;
	
	public ElectronicDevice() {}
	
	public ElectronicDevice(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	//----------------------------------------------------
	@Override
	public void on() {
		super.on();
		// включить устройство
		// загрузить ОС
		this.loadOS();
	}

	@Override
	public void off() {
		super.off();
		// выключить устройство
	}
	
	public void loadOS() {
		// загрузка ОС
	}
	
	public void loadProgram() {
		// загрузка программы
	}
	
	public void closeProgram() {
		// выгрузка программы
	}
	
	public void chargeDevice() {
		// зярядка устройства
	}

	//----------------------------------------------------
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	//----------------------------------------------------
	@Override
	public String toString() {
		return "ElectronicDevice [batteryCapacity=" + batteryCapacity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batteryCapacity;
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
		ElectronicDevice other = (ElectronicDevice) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		return true;
	}
}
