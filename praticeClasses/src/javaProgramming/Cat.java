package javaProgramming;

public class Cat extends Animal{
	public Cat() {
		
	}
	
	public String makeSound() {
		return "meow";
	}
	
	public static void main(String[] args) {
		Animal fido = new Dog();
		Animal fluffy = new Cat();
		
		Animal[] theAnimals = new Animal[10];
		theAnimals[0] = fido;
		theAnimals[1] = fluffy;
	}
}
