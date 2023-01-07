// https://www.javaworld.com/article/2075271/encapsulation-is-not-information-hiding.html

package p01_introductorio.encapsulacion;

/* Ejecución minimizando la encapsulación. Al estilo procedimental */



public abstract class SinEncapsulacion {

	static class Position {
		public double latitude;
		public double longitude;
	}
	
	static class PositionUtility {
		public static double distance(Position position1, Position coffeeShoposition2p) {
			return 0; // Calculate and return the distance between the specified positions.
		}
		public static double heading(Position position1, Position coffeeShoposition2p) {
			return 0; // Calculate and return the heading from position1 to position2.
		}
	}

	public static void main(String... args) {

		Position myHouse = new Position();
		myHouse.latitude = 36.538611;
		myHouse.longitude = -121.797500;

		Position coffeeShop = new Position();
		coffeeShop.latitude = 36.539722;
		coffeeShop.longitude = -121.907222;

		double distance = PositionUtility.distance(myHouse, coffeeShop);
		double heading = PositionUtility.heading(myHouse, coffeeShop);

		System.out.println("From my house at (" + myHouse.latitude + ", " + myHouse.longitude +
			") to the coffee shop at (" + coffeeShop.latitude + ", " + coffeeShop.longitude +
			") is a distance of " + distance + " at a heading of " + heading + " degrees.");
	}

}
