/**
 * MyHealthData.java
 * This system maintains important health information about a patient's maximum and target heart rates, etc.
 * @author Yicong (Daniel) Zhang
 * @version 1.0
 * @since 1.0
 */
public class MyHealthData {

/**
 * Declaring variables of patient's data
 */

	private String firstName, lastName, gender;
	private int birthYear, currentYear;
	private double height, weight;

	/**
	 * This is a 7 arguments constructor that stores the below data (3 Strings, 2 doubles, 2 integers)
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param height
	 * @param weight
	 * @param birthYear
	 * @param currentYear
	 */
	public MyHealthData(String firstName, String lastName, String gender, double height, double weight,
			int birthYear, int currentYear) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
	}
	
	/**
	 * This is the public get method that gets the private string of patient's first name
	 * @return patient's first name
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * This is the public get method that gets the private string of patient's last name
	 * @return patient's last name
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * This is the public get method that gets the private string of patient's gender
	 * @return patient's gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * This is the public get method that gets the private integer of patient's birthYear
	 * @return patient's birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}
	/**
	 * This is the public get method that gets the private integer of patient's birthYear
	 * @return patient's birthYear
	 */
	public int getCurrentYear() {
		return currentYear;
	}
	/**
	 * This is the public get method that gets the private double of patient's height in inches
	 * @return patient's height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * This is the public get method that gets the private double of patient's weight in pounds
	 * @return patient's weight
	 */
	public double getWeight() {
		return weight;
	}
	
	/**
	 * This is a public void method that sets patient's first name
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * This is a public void method that sets patient's last name
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * This is a public void method that sets patient's gender
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * This is a public void method that sets patient's birth year
	 * @param birthYear
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	/**
	 * This is a public void method that sets the current year
	 * @param currentYear
	 */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	/**
	 * This is a public void method that sets patient's height
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * This is a public void method that sets patient's weight
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * This is a public method
	 * @return patient's age by doing subtraction between current year and birth year
	 */
	public int getAge() {
		return (getCurrentYear() - getBirthYear());
	}
	/**
	 * This is a public method
	 * @return patient's maximum heart rate by doing subtraction between 220 year and patient's age
	 */
	public int getMaximumHeartRate() {
		return (220 - getAge());
		
	}
	/**
	 * This is a public method
	 * @return patient's minimum target heart rate by doing multiplication of MaximumHeartRate times 0.5
	 */
	public double getMinimumTargetHeartRate() {
		return (getMaximumHeartRate() * 0.5);
	}
	/**
	 * This is a public method
	 * @return patient's maximum target heart rate
	 */
	public double getMaximumTargetHeartRate() {
		return (getMaximumHeartRate() * 0.85);
		
	}
	/**
	 * This is a public method
	 * @return patient's BMI
	 */
	public double getBMI() {
	   return (getWeight() * 703) / (getHeight() * getHeight());
	} 

	/**
	 * The System.out.printf that prints all patient's data (Height, weight, MinimumTargetHeartRate and MaximumTargetHeartRate keep 2 decimal places, BMI keeps 1 decimal places.)
	 */
	public void displayMyHealthData() { 
		System.out.printf("%s%s\n", "First name: ", getFirstName());
		System.out.printf("%s%s\n", "Last name: ", getLastName());
		System.out.printf("%s%s\n", "Gender: ", getGender());
		System.out.printf("%s%d\n", "Birth year: ", getBirthYear());
		System.out.printf("%s%.2f%s\n", "Height: ", getHeight(), " inches");
		System.out.printf("%s%.2f%s\n", "Weight: ", getWeight(), " pounds");
		System.out.printf("%s%d%s\n", "Age: ", getAge(), " years old");
		System.out.printf("%s%d\n", "Maximum heart rate: ", getMaximumHeartRate());
		System.out.printf("%s%.2f\n", "MinimumTargetHeartRate: ", getMinimumTargetHeartRate());
		System.out.printf("%s%.2f\n", "MaximumTargetHeartRate: ", getMaximumTargetHeartRate());
		System.out.printf("%s%.1f\n", "BMI: ", getBMI());

	    System.out.println("BMI VALUES");
	    System.out.println("Underweight: less than 18.5");
	    System.out.println("Normal:      between 18.5 and 24.9");
	    System.out.println("Overweight:  between 25 and 29.9");
	    System.out.println("Obese:       30 or greater");   
	} 

} // end class MyHealthData






