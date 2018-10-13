
public class Taxi implements Strategies  {
	
	@Override
	public double CalculeDuree(int Distance) {
				return Distance/60;
	}

}
