package nomad.ccu.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ccu {
	private String designation;
	private GpsInfo gps;
	
	public Ccu() {
		// Intentionally empty - default ctor
	}

	public Ccu(String designation) {
		setDesignation(designation);
	}

	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public GpsInfo getGps() {
		return gps;
	}
	
	public void setGps(GpsInfo gps) {
		this.gps = gps;
	}
}
