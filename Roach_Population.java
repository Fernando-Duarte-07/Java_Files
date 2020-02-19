/*Programmers: Fernando Duarte and James Pham
  Date: 18 February 2020
  Purpose: The program is used to calculate the existing population of an endangered species
  Inputs: The name, population, breed method, spray
  Output: the initial population, the amount the population has grown and total population after the breed and spray method
 */
package cecs274;

public class Roach_Population {
	public int pop;
	private String gang;
	private int breed;
	private double spray;

	//default constructor for Roach_population
	public Roach_Population() {
		pop = 10;
		gang = "Ewwww";
		breed = 2;
		spray = 0.10;
		
	}
	//second constructor for altering the parameters in the tester files
	public Roach_Population (int population, String gangs, int breeds, double sprays) {
		population = pop;
		gangs = gang;
		breeds = breed;
		sprays = spray;
	}
	//returns the population variable
	public int getpop() {
		return pop;
	}
	//returns the gang name variable
	public String getgang() {
		return gang;
	}
	//returns the integer for the breed method
	public int getBreed() {
		return breed;
	}
	//returns the spray variable set earlier
	public double getSpray() {
		return spray;
	}
	//sets the variable to public for changing in the tester file
	public void setPop(int population) {
		pop = population;
	}
	//sets the variable to public for changing in the tester file
	public void SetGang(String gangs) {
		gang = gangs;
	}
	//sets the variable to public for changing in the tester file
	public void setBreed(int breeds) {
		breed = breeds;
	}
	//sets the variable to public for changing in the tester file
	public void setSpray(double sprays) {
		spray = sprays;
	}
	//prints out the first constructor and is able to be changed in the tester file
	public String toString() {
		return ("The name of the roach population is: " + gang + ". The initial population is: " + pop + ". \n" + 
	"The population grew by: " + breed + " time(s). The new population is: " + breed * pop + "." + " The percentage of roaches sprayed is: " + spray *100 + "% The total population of roaches after being sprayed is: " + ((pop * breed) - ((pop * breed) * spray)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
