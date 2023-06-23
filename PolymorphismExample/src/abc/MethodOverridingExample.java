package abc;

public class MethodOverridingExample {

	public static void main(String[] args) {
		Honda hh = new Honda();
		hh.color();
		hh.speed();
		Bike bb= new Bike();
		bb.speed();
		Pulsar pp = new Pulsar();
		pp.color(1);
	}

}
