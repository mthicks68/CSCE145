import java.util.Scanner;

public class DateAndTimeTester {

	//Runs the main method of the tester which calls on one method to test if a date and time combination is valid and prints the result out to the user. 
	public void run ()
	{
		Scanner k = new Scanner(System.in);

		System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if its valid");

		String date = k.next();
		String time = k.next();
	//	System.out.println(date);
	//	System.out.println(time);
		if(isValid(date, time)) {
			System.out.println("The date and time are valid!");
		}
		else {
			System.out.println("The date and time are not valid!");
		}
	}
	
	//Tests if the combination is valid or not based on the methods if the time is valid and if the date is valid
	public boolean isValid(String date, String time) {
		if (isValidDate(date) && isValidTime(time)) {
			return true;
		}
		else {
			return false;
		}
	}

	//Checks conditions if the month and day fall within the conditions listed. If it does the method returns true to the isValid method. If not then it returns a false to the isValid Method.
	public boolean isValidDate(String date) {
		if (getMonth(date) ==  1 || getMonth(date) ==  3 || getMonth(date) ==  5 || getMonth(date) ==  7 || getMonth(date) ==  8 || getMonth(date) ==  10 || getMonth(date) ==  12) {
			if(getDay(date) <= 31 && getDay(date) >= 1) {
				return true;
			}
			else {
				return false;
			}
		}
		if (getMonth(date) ==  4 || getMonth(date) ==  6 || getMonth(date) ==  9 || getMonth(date) ==  11) {
			if ((getDay(date) <= 30 && getDay(date) >= 1)) {
				return true;
			}
			else {
				return false;
			}
		}
		else if (getMonth(date) == 2 && getDay(date) <= 28 && getDay(date) >= 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Finds the special characters index within the date string and uses it to get the month string seperate from the date string 
	//then uses a parseInt to translate it to a number and returns the result to isValidDate for it to use the number to check the conditions of isValidDate. 
	public int getMonth(String date) {
		int s = 0;
		for (int i = 0; i < date.length(); i++)
		{
			if (date.charAt(i) == '/') {
				s = i;
				break;
			}
		}
		String m = date.substring(0, s);
		int month = Integer.parseInt(m);
		return month;
	}
	
	//Works the same as the getMonth method but gets the Day of the date string. Returns the result to isValidDate to Check condition.
	public int getDay(String date) {
		int s = 0;
		for (int i = 0; i < date.length(); i++)
		{
			if (date.charAt(i) == '/') {
				s = i;
				break;
			}
		}
		String d = date.substring(s+1, date.length());
		int day = Integer.parseInt(d);
		return day;
	}
	
	//Works the exact Same as isValidDate
	public boolean isValidTime(String time) {
		if (getHour(time) <= 12 && getHour(time) > 0 && getMinute(time) <= 60 && getMinute(time) >= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Works the exact same as getMonth
	public int getHour(String time) {
		int s = 0;
		for (int i = 0; i < time.length(); i++)
		{
			if (time.charAt(i) == ':') {
				s = i;
				break;
			}
		}
		String h = time.substring(0, s);
		int hour = Integer.parseInt(h);
		return hour;
	}
	
	//Works the exact same as getDay method
	public int getMinute(String time) {
		int s = 0;
		for (int i = 0; i < time.length(); i++)
		{
			if (time.charAt(i) == ':') {
				s = i;
				break;
			}
		}
		String m = time.substring(s+1, time.length());
		int minute = Integer.parseInt(m);
		return minute;
	}
}


