package StroitelPattern;

public class SubaryBuilder extends CarBuilder{
	void buildMake() {car.setMaker("Subaru");}
	void buildTransmission() {car.setTransmission(Transmission.MANUAL);}
	void buildMaxSpeed() {car.setMaxSpeed(150);}
}
