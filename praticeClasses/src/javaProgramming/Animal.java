package javaProgramming;
//single comment
/*multi
 * comment
 */

//Video from this link:https://www.youtube.com/watch?v=WPvGqX-TXP0&t=305s 

import java.util.Scanner;
import java.util.*;//all libraries
public class Animal {
	public static final double FAVNUM = 6.99; //availaible to everyone and is shared by all animal objects
	private String name; //helps privacy
	private int weight; //-2^31--2^31
	private boolean hasOwner = false;
	private byte age; //-28--127
	private long uniqeID; //-2^63
	private char nickname;
	private double speed; //64 bit
	private float height; //32 bit
	
	protected static int numberOfAnimals = 0;
	
	//static for classes and does not belong to objects
	
	static Scanner userinput = new Scanner (System.in);
	static Scanner in = new Scanner(System.in);
	public Animal() {
		numberOfAnimals++;
		
		
		System.out.print("Enter the name for your pet: \r\n");
		
		//hasNextInt, hasNextFloat, hasNextDouble, hasNextByte
		//nextInt, nextFloat, nextByte
		if (in.hasNextLine()) {
			this.setName(in.nextLine());
		}
		
	
		this.setUniqeID();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public void getUniqeID(long uniqueID) {
		this.uniqeID = uniqueID;
		System.out.println("UniqueID: "+ this.uniqeID);
		
	}

	public void setUniqeID() {
		long minNumber = 1;
		long maxNumber = 1000000;
		
		this.uniqeID = minNumber + (long)(Math.random()*((maxNumber-minNumber) + 1));
		//random returns double, so we do casting with Long
		String stringNum = Long.toString(maxNumber);
		
		int numString = Integer.parseInt(stringNum);
		System.out.println("UniqueID: "+ this.uniqeID);
	}

	public char getNickname() {
		return nickname;
	}

	public void setNickname(char nickname) {
		this.nickname = nickname;
	}
	
	public void setNickname() {
		int randomNumber = (int)(Math.random()*126) + 1;
		this.nickname = (char) randomNumber;
		
		if (randomNumber == 32) {
			System.out.println("is set to Space");
		}
		else if (randomNumber == 10) {
			System.out.println("is set to new line");
		}
		else {
			System.out.println("is set to: " + this.nickname);
		}
		
		if ((randomNumber > 97) && (randomNumber < 122)) {
			System.out.println("is lowercase");
		}
		
		if ((randomNumber > 97) && (randomNumber < 122) || ((randomNumber > 64) && (randomNumber < 91))) {
			System.out.println("is letter");
			
		}
		
		if (!false) {
			System.out.println("I tunred false to " + !false);
			
		}
		
		int whichIsBigger = (50 >randomNumber) ? 50: randomNumber;
		//if the condition in the () is true, then that value. else they get a new value
		switch(randomNumber) {
		case 8: 
			System.out.println("is");
			break;
		
		}
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	protected static void countTo(int startingNumber) {
		for (int i = startingNumber; i <= 100; i++) {
			if (i == 90) continue; //continue will jump out of iteration and continue
			System.out.println(i);
		}
	}
	
	protected static String printnumbers (int maxNumbers) {
		int i = 1;
		while(i <(maxNumbers/2)) {
			System.out.println(i);
			i++;
			
			if(i == (maxNumbers/2)) break;
		}
		
		Animal.countTo(maxNumbers/2);
		return "End of printNums";
	}
	
	protected static void guessNum() {
		int number;
		
		do { //great for asking user input
			System.out.println("Guess num up to 100");
			
			while(!in.hasNextInt()) {
				String numEntered = in.next();
				System.out.printf("%s is not a number\n",numEntered);
				
			}
			number = in.nextInt();
		}while (number != 50);
		System.out.println("yes the number was 50");
	}

	public String makeSound() {
		return "Grrr";
	}
	
	public static void speakAnimal (Animal randAnimal) {
		System.out.println("Animal says " + randAnimal.makeSound());
	}
	public static void main(String[] args) {
		Animal a1 = new Animal();
		
		int[] favNumber;
		favNumber = new int[20];
		
		favNumber[0] = 100;
		
		String[] stringArray = {"Random", "words", "here"};
		for (String word: stringArray) {
			System.out.println(word);
		}
		
		System.out.print(Arrays.toString(favNumber));
		//System.out.println(Arrays.copyOf(array));
		//System.out.println(Arrays.binarySearch(array, value));
		
		int [][] threeD = {{12, 23, 34}, {345,6543,345}, {234, 654, 765}};
		//[][][] will have rows, columns, and groups
		
	}
	
}
