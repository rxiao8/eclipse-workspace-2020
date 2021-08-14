/*
 * Ms. Gaines
 * April 2020
 * Animal Interface
 * You must use this to complete the lab
*/
public interface Animal {

	void move(String t);  //Type of movement is passed in
	double getWeight();  //returns weight
	void updateWeight(double x);
	void addHabitat(String y);
	String getHabitat();  //returns Habitat Type
	String LatinName();  // returns Animal's Latin/Scientific Name
	String toString();

}
