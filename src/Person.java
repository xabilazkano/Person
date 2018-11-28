import java.util.Random;

public class Person {

	private String name;
	private int age;
	private double weight;
	private String dni;

	public Person() {

	}

	public Person(String name, int age, double weight, String dni) {
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

	public Person(String name, int age, double weight) {
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

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 0 && age < 120) {
			this.age = age;
		}
	}

	public void setWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
		}
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

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

	public void idealWeight() {
		if (this.weight > 50 && this.weight < 90) {
			System.out.println("You have an ideal weight");
		} else {
			System.out.println("You dont have an ideal weight");
		}
	}

	public void adult() {
		if (this.age >= 18) {
			System.out.println("You are adult");
		} else {
			System.out.println("You arent adult");
		}
	}

	public void tostring() {
		System.out.println(this.name + " " + this.age + " " + this.weight + " " + this.dni);
	}

	public void dniByDefault() {
		String number = String.valueOf(new Random().nextInt(10));
		for (int i = 0; i < 8; i++) {
			number = number + String.valueOf(new Random().nextInt(10));
		}
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		number = number + alphabet.charAt(new Random().nextInt(alphabet.length()));

		System.out.println(number);
	}
}
