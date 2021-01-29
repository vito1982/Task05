package by.htp.task07.tsk01;

public class TabletPC extends ElectronicDevice {
	private static final long serialVersionUID = -6601073009904031045L;

	private int displayInches;
	private int memoryRom;
	private int flashMmeoryCapacity;
	private String color;
	
	public TabletPC() {}

	public TabletPC(int displayInches, int memoryRom, int flashMmeoryCapacity, String color) {
		super();
		this.displayInches = displayInches;
		this.memoryRom = memoryRom;
		this.flashMmeoryCapacity = flashMmeoryCapacity;
		this.color = color;
	}
	
	//----------------------------------------------------
	public void loadOS() {
		// загрузка Android
	}
	
	public void loadProgram() {
		// запустить приложение
	}
	
	public void closeProgram() {
		// закрыть приложение
	}
	//----------------------------------------------------
	public int getDisplayInches() {
		return displayInches;
	}
	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}

	public int getMemoryRom() {
		return memoryRom;
	}
	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getFlashMmeoryCapacity() {
		return flashMmeoryCapacity;
	}
	public void setFlashMmeoryCapacity(int flashMmeoryCapacity) {
		this.flashMmeoryCapacity = flashMmeoryCapacity;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	//----------------------------------------------------
	@Override
	public String toString() {
		return "TabletPC [displayInches=" + displayInches + ", memoryRom=" + memoryRom + ", flashMmeoryCapacity="
				+ flashMmeoryCapacity + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + displayInches;
		result = prime * result + flashMmeoryCapacity;
		result = prime * result + memoryRom;
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
		TabletPC other = (TabletPC) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (displayInches != other.displayInches)
			return false;
		if (flashMmeoryCapacity != other.flashMmeoryCapacity)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		return true;
	}
}
