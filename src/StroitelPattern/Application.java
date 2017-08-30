package StroitelPattern;

public class Application {

	public static void main(String[] args) {
		Director director = new Director();
		director.setBuilder(new SubaryBuilder());
		Car car = director.BuildCar();
		System.out.println(director.BuildCar().maxSpeed);
	}

}
