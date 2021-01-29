package by.htp.task07.tsk01;

import java.io.Serializable;

public class Device implements Serializable {
	private static final long serialVersionUID = -2793826140798350812L;
	private boolean statusOnOff;
	
	public Device() {}
	
	//----------------------------------------------------
	public void on() {
		this.statusOnOff = true;
	}
	
	public void off() {
		this.statusOnOff = false;
	}

	//----------------------------------------------------
	public boolean isStatusOnOff() {
		return statusOnOff;
	}
	
	public void setStatusOnOff(boolean statusOnOff) {
		this.statusOnOff = statusOnOff;
	}

	//----------------------------------------------------
	@Override
	public String toString() {
		return "Device [statusOnOff=" + statusOnOff + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (statusOnOff ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (statusOnOff != other.statusOnOff)
			return false;
		return true;
	}
}
