
public class ToAirPort {
	
	private Strategies Context ;
	
	public ToAirPort(Strategies Contrext) {
		this.Context=Contrext;
	}

	public Strategies getContext() {
		return Context;
	}

	public void setContext(Strategies context) {
		Context = context;
	}
	
	
	public void Duree(int Distance) {
		System.out.println("vous allez arriver a l'airport dans :"+this.Context.CalculeDuree(Distance)+" H");
	}

}
