package Data_Types;

public class DataType01 {

	public static void main(String[] args) {
		
		int fmin = 0; // fmin = Starting Fahrenheit temperature (0°F)
		int fmax = 300; // fmax = Ending Fahrenheit temperature (300°F)
		int fstep = 20; // fstep = Increase temperature by 20°F each time
		int fcurrent = fmin; // fcurrent = Current Fahrenheit value
		
		while (fcurrent <= fmax) { // The loop runs until fcurrent becomes greater than 300.
			int celsius = (int) ((5.0 / 9) * (fcurrent - 32)); // This line converts the current Fahrenheit temperature (fcurrent) to Celsius, where 5.0/9 ensures decimal division and (int) removes the decimal part to store the result as an integer.
			System.out.println(fcurrent + "\t" + celsius); // '\t' prints a tab, separating the Fahrenheit and Celsius values into columns.
			fcurrent = fcurrent + fstep; // This increases the current Fahrenheit value (fcurrent) by the step value (fstep = 20) so the loop moves to the next temperature
			
		}

	}

}
