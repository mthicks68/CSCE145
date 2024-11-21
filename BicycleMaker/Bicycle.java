// By Micah Hicks
public class Bicycle {

	//Creates all the instance varibles which creates two different instances of the wheel class and an a instance of the frame class.
	private String make;
	private Wheel frontWheel;
	private Wheel backWheel;
	private Frame frame;
	
	//Default Bicyle using new Wheel and new Frame to create new instances of those objects. 
	public Bicycle() {
		this.make = "none";
		this.frontWheel = new Wheel();
		this.backWheel = new Wheel();
		this.frame = new Frame();
	}

	//Uses mutators that checks the inputed values and in the case of wheels and frames it calls upon the wheel and frame class and those mutators check if the inputs are valid. 
	public Bicycle(String make, Wheel frontWheel, Wheel backWheel, Frame frame) {
		this.setMake(make);
		this.setFrontWheel(frontWheel);
		this.setBackWheel(backWheel);
		this.setFrame(frame);
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		if (make != null) {
			this.make = make;
		}
		else 
		{
			this.make = "none";
		}
	}

	public Wheel getFrontWheel() {
		return frontWheel;
	}

	public void setFrontWheel(Wheel frontWheel) {
		this.frontWheel = frontWheel;
	}

	public Wheel getBackWheel() {
		return backWheel;
	}

	public void setBackWheel(Wheel backWheel) {
		this.backWheel = backWheel;
	}

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	
	//Uses wheel and frame classes and checks all the properties of one bicycle with another. 
	public boolean equals(Bicycle aB) {
		return this.make != null && this.make.equals(aB.getMake()) && this.frontWheel.equals(aB.getFrontWheel()) && this.backWheel.equals(aB.getBackWheel()) && this.frame.equals(aB.getFrame());
	}
	
	//Prints a bicycle. 
	public String toString() {
		return "[Bicycle] Make: " + getMake() + " Front Wheel: " + this.frontWheel.toString() + " Back Wheel: " + this.backWheel.toString() + " Frame: " + this.frame.toString();
		
	}
}
