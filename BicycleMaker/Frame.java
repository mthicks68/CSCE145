//By Micah Hicks
public class Frame {
	private double size;
	private String type;
	
	public Frame() {
		this.size = 18.5;
		this.type = "Diamond";
	}
	
	//Uses mutators in the parameterized constructor to check if the inputs are valid before seting the size and type to the inputed values. 
	public Frame( double size, String type) {
		this.setSize(size);
		this.setType(type);
	}
	
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		if (size >= 18.5 && size <= 60) 
		{
			this.size = size;
		}	
		else {
			this.size = 18.5;
		}
	}
	
	public String getType() {
		return type;
	}
	
	//Checks if the string is equal to the allowed values. 
	public void setType(String type) {
		if (type.equals("Diamond") || type.equals("Step-Through") || type.equals("Truss") || type.equals("Penny-Farthing")) 
		{
			this.type = type;
		}	
		else {
			this.type = "Diamond";
		}
	}
	
	//prints the frame object.
	public String toString() {
		return "[Frame] Size: " + this.getSize() + " Type: " + this.getType();
	}
	
	//checks the frame properties against another frame. 
	public boolean equals(Frame aF) {
		{
			return this.getSize() == aF.getSize() && this.getType().equals(aF.getType());
		}
	}
	
	
}
