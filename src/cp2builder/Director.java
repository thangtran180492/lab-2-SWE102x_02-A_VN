package cp2builder;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 * 
 * Director xác định thứ tự xây dựng
 * Nó hoạt động thông qua đối tượng xây dựng
 * thông qua giao diện xây dựng phổ biến
 * do đó nó không thể biết được sản phẩm nào
 */

public class Director {
	 public void constructSportsCar(Builder builder) {
	        builder.setCarType(CarType.SPORTS_CAR);
	        builder.setSeats(2);
	        builder.setEngine(new Engine(3.0, 0));
	        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
	        builder.setTripComputer(new TripComputer());
	        builder.setGPSNavigator(new GPSNavigator());
	    }

	    public void constructCityCar(Builder builder) {
	        builder.setCarType(CarType.CITY_CAR);
	        builder.setSeats(2);
	        builder.setEngine(new Engine(1.2, 0));
	        builder.setTransmission(Transmission.AUTOMATIC);
	        builder.setTripComputer(new TripComputer());
	        builder.setGPSNavigator(new GPSNavigator());
	    }

	    public void constructSUV(Builder builder) {
	        builder.setCarType(CarType.SUV);
	        builder.setSeats(4);
	        builder.setEngine(new Engine(2.5, 0));
	        builder.setTransmission(Transmission.MANUAL);
	        builder.setGPSNavigator(new GPSNavigator());
	    }
}
