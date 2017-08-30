package StroitelPattern;

public class Director {
	CarBuilder carBuilder;
	void setBuilder(CarBuilder b){this.carBuilder=b;}
	Car BuildCar(){                 //get instance (builded)
		carBuilder.createCar();
		carBuilder.buildMake();
		carBuilder.buildTransmission();
		carBuilder.buildMaxSpeed();
		Car car = carBuilder.getCar();
		return car;
	}
	
}
