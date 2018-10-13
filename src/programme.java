
public class programme {

	public static void main(String[] args) {
		
		ToAirPort AirPort= new ToAirPort(new Car());
		AirPort.Duree(500);
		AirPort.setContext(new Bus());
		AirPort.Duree(500);
		AirPort.setContext(new Taxi());
		AirPort.Duree(500);

	}

}
