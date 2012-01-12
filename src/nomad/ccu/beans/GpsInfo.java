package nomad.ccu.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GpsInfo {
	private long bearing;
	private double latitude;
	private double longitude;
	private long sats;
	private long speed;
	
	GpsInfo() {
		//Intentionally Empty - default ctor
	}
	
	public GpsInfo(double latitude, double longitude) {
		setLatitude(latitude);
		setLongitude(longitude);
	}
	
	public long getBearing() {
		return bearing;
	}
	public void setBearing(long bearing) {
		this.bearing = bearing;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public long getSats() {
		return sats;
	}
	public void setSats(long sats) {
		this.sats = sats;
	}
	public long getSpeed() {
		return speed;
	}
	public void setSpeed(long speed) {
		this.speed = speed;
	}
	
	
	
}
