package StroitelPattern;

public class FordMondeoBuilder extends CarBuilder {

	void buildMake() {car.setMaker("Ford");}
	void buildTransmission() {car.setTransmission(Transmission.AUTO);}
	void buildMaxSpeed() {car.setMaxSpeed(180);}

}
