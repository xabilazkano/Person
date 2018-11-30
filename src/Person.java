import java.util.Random;

public class Person {
	
	private String name;
	private int age;
	private double weight;
	private String dni;

	public Person() { //first constructor

	}

	public Person(String name, int age, double weight, String dni) { //second constructor
		this.name = name;
		if (age > 0 && age < 120) {
			this.age = age;
		} else {
			this.age = 20;
		}
		if (weight > 0) {
			this.weight = weight;
		} else {
			weight = 65;
		}
		this.dni = dni;
	}

	public Person(String name, int age, double weight) { //third constructor
		this.name = name;
		if (age > 0 && age < 120) {
			this.age = age;
		} else {
			this.age = 20;
		}
		if (weight > 0) {
			this.weight = weight;
		} else {
			weight = 65;
		}
	}

	public void setName(String name) { //change the name 
		this.name = name;
	}

	public void setAge(int age) { //change the age
		if (age > 0 && age < 120) {
			this.age = age;
		}
	}

	public void setWeight(double weight) { //change the weight
		if (weight > 0) {
			this.weight = weight;
		}
	}

	public void setDni(String dni) { //change the dni
		this.dni = dni;
	}

	//get the values of the properties
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public String getDni() {
		return dni;
	}

	public void idealWeight() { //we check that the weight is between these two values
		if (this.weight > 50 && this.weight < 90) {
			System.out.println("You have an ideal weight");
		} else {
			System.out.println("You dont have an ideal weight");
		}
	}

	public void adult() { //we check that he is an adult
		if (this.age >= 18) {
			System.out.println("You are adult");
		} else {
			System.out.println("You arent adult");
		}
	}

	public void tostring() { //we show all the properties
		System.out.println(this.name + " " + this.age + " " + this.weight + " " + this.dni);
	}

	public void dniByDefault() { //we create a random dni
		String number="";
		for (int i = 0; i < 9; i++) { //we create 9 random numbers
			number = number + String.valueOf(new Random().nextInt(10));
		}
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //we create a random letter and add it to the number
		number = number + alphabet.charAt(new Random().nextInt(alphabet.length()));
		this.dni=number; //we assign the new dni to the property

		System.out.println("Your new DNI is "+ number);
	}
}
