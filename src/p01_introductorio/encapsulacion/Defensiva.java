package p01_introductorio.encapsulacion;

class PositionD {

	private double latitude;
	private double longitude;

	public PositionD(double latitude, double longitude) {
		setLatitude(latitude);
		setLongitude(longitude);
	}
	public void setLatitude(double latitude) {
		// Ensure -90 <= latitude <= 90 using modulo arithmetic. Code not shown.
		// Then set instance variable.
		this.latitude = latitude;
	}
	public void setLongitude(double longitude) {
		// Ensure -180 < longitude <= 180 using modulo arithmetic. Code not shown.
		// Then set instance variable.
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public double distance(PositionD position) {
		return 0;
	}
	public double heading(PositionD position) {
		return 0;
	}
}

public class Defensiva {
	
	
	PositionD myHouse = new PositionD( 36.538611, -121.797500 );
	PositionD coffeeShop = new PositionD( 36.539722, -121.907222 );
	 
	double distance = myHouse.distance( coffeeShop );
	double heading = myHouse.heading( coffeeShop );

}
