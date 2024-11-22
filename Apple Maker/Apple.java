//Written by Micah Hicks

public class Apple {

//THis creates the instance variables that will be tied to the object apple
	private String type;
	private double weight;
	private double price;

	//default constructor of the apple object
	public Apple() 
	{
		this.type = "Gala";
		this.weight = 0.0;
		this.price = 0.0;
	}

	//parameterized constructor for apple
	public Apple(String aT, double aW, double aP) 
	{
		this.setType(aT);
		this.setWeight(aW);
		this.setPrice(aP);
	}

	//Checks if the inputed type of the parameterized constructor is valid or not
	public void setType(String aT) 
	{
		if(aT.equals("Gala") || aT.equals("Red Delicious") || aT.equals("Golden Delicious") || aT.equals("Granny Smith")) {
			this.type = aT;
		}
		else {
			this.type = "Gala";
		}
	}

	//Checks if the weight of the parameterized constructor is valid
	public void setWeight(double aW) 
	{

		if(aW > 0) {
			this.weight = aW;
		}
	}

	//Checks if the price of the parameterized constructor is valid
	public void setPrice(double aP) 
	{

		if (aP >= 0) {
			this.price = aP;
		}
	}

	//returns an apples type, weight, and price 
	public String toString() {
		return "Type: " + this.getType() + 
				" Weight: " + this.getWeight() +
				" Price: " + this.getPrice();
	}

	//Gets the type from the private variable
	public String getType() 
	{
		return this.type;
	}
	
	//Gets the weight from the private variable
	public double getWeight() 
	{
		return this.weight;
	}

	//Gets the price from the private variable
	public double getPrice() 
	{
		return this.price;
	}

	//checks if the properties of one apple matches the properties of another object
	public boolean equals(Apple aA) {
		if (aA != null && this.type.equals(aA.getType()) && this.weight == aA.getWeight() && this.price == (aA.getPrice())) {
			return true;
		}
		else {
			return false;
		}
	}
}
