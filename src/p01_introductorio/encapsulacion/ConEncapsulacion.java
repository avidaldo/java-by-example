// https://www.javaworld.com/article/2075271/encapsulation-is-not-information-hiding.html
package p01_introductorio.encapsulacion;



public class ConEncapsulacion {
	
	static class Position {
		public double distance(Position coffeeShop) {
			return 0;
		}
		public double heading(Position coffeeShop) {
			return 0;
		}
		public double latitude;
		public double longitude;
	}
	
	public static void main(String... args) {

		Position myHouse = new Position();
		myHouse.latitude =    36.538611;
		myHouse.longitude = -121.797500;
		Position coffeeShop = new Position();
		coffeeShop.latitude =    36.539722;
		coffeeShop.longitude = -121.907222;
		double distance = myHouse.distance( coffeeShop );
		double heading = myHouse.heading( coffeeShop );

		System.out.println("From my house at (" + myHouse.latitude + ", " + myHouse.longitude +
			") to the coffee shop at (" + coffeeShop.latitude + ", " + coffeeShop.longitude +
			") is a distance of " + distance + " at a heading of " + heading + " degrees.");
	}

}