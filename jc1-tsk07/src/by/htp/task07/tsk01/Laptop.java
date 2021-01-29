package by.htp.task07.tsk01;

public class Laptop extends ElectronicDevice {
	private static final long serialVersionUID = -2107190315346361247L;

	private int memoryRom;
	private int systemMemory;
	private int displayInchs;
	private double cpu;
	private String os;
	
	public Laptop() {}

	public Laptop(int memoryRom, int systemMemory, int displayInchs, double cpu, String os) {
		super();
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.displayInchs = displayInchs;
		this.cpu = cpu;
		this.os = os;
	}
	
	//----------------------------------------------------
	public void loadOS() {
		// загрузка ОС Windows
	}
	
	public void loadProgram() {
		// запустить исполняемый файл
	}
	
	public void closeProgram() {
		// закрыть программу
	}

	//----------------------------------------------------
	public int getMemoryRom() {
		return memoryRom;
	}
	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}
	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public int getDisplayInchs() {
		return displayInchs;
	}
	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}

	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}

	//----------------------------------------------------
	@Override
	public String toString() {
		return "Laptop [memoryRom=" + memoryRom + ", systemMemory=" + systemMemory + ", displayInchs=" + displayInchs
				+ ", cpu=" + cpu + ", os=" + os + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(cpu);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + displayInchs;
		result = prime * result + memoryRom;
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		result = prime * result + systemMemory;
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
		Laptop other = (Laptop) obj;
		if (Double.doubleToLongBits(cpu) != Double.doubleToLongBits(other.cpu))
			return false;
		if (displayInchs != other.displayInchs)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}
}
