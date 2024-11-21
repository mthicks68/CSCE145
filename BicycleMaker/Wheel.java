//By Micah Hicks
public class Wheel {

	private double diameter;
	private double width;
	
	public Wheel() {
		this.diameter = 16.0;
		this.width = 1.0;
		
	}
	
	//Uses Mutators to check if the inputed values are valid. 
	public Wheel(double aD, double aW) 
	{
		this.setDiameter(aD);
		this.setWidth(aW);
	}
	
	public void setDiameter(double aD) 
	{
		if (aD >= 16 && aD <= 55) {
			this.diameter = aD;
		}
		else {
			this.diameter = 16.0;
		}
	}
	
	public void setWidth(double aW) 
	{
		if (aW >= 1.0 && aW <= 2.5) {
			this.width = aW;
		}
		else {
			this.width = 1.0;
		}
	}
	
	public double getDiameter() 
	{
		return this.diameter;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	//Prints the Wheel
	public String toString()
	{
		return "[Wheel] Diameter: " + this.getDiameter() + " Width: " + this.getWidth();
	}
	
	//Checks the Wheel against another wheel
	public boolean equals(Wheel aW) {
		return this.getDiameter() == aW.getDiameter() && this.getWidth() == aW.getWidth();
	}
}
