
public class CarApp {

	public static void main(String[] args) {
		Car porsche = new Car("red", "Porsche");
		Car jetta = new Car("blue", "Jetta");

		System.out.println(porsche.goes("85"));

		System.out.println("");
		System.out.println(jetta.starts());
		System.out.println(porsche.accelerates());
		System.out.println(jetta.accelerates());
		System.out.println(jetta.stops("to have its emissions checked."));

		System.out.println(jetta.passesEmissions());
		System.out.println(porsche.goes("50"));
		System.out.println(porsche.stops());
		System.out.println(jetta.passes(porsche));
		
		/* TEST OUTPUT:
		The red Porsche is starting
		The blue Jetta is starting
		The red Porsche is accelerating
		The blue Jetta is accelerating
		The blue Jetta has stopped to have its emissions checked 
		The blue Jetta passes its emission test
		The red Porsche is going 50 mph
		The red Porsche is stopped
		The blue Jetta just passed the red Porsche
		*/

	}

}
