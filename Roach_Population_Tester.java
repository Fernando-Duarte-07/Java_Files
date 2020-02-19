/*Programmers: Fernando Duarte and James Pham
  Date: 18 February 2020
  Purpose: The program is used to calculate the existing population of an endangered species
  Inputs: The name, population, breed method, spray
  Output: the initial population, the amount the population has grown and total population after the breed and spray method
 */
package cecs274;

public class Roach_Population_Tester {

	public static void main(String[] args) {
		//new parameter for Roach_population
		Roach_Population rs = new Roach_Population();
		//Prints out default constructor
		System.out.println(rs + "\n");
		//sets a new variable for population
		rs.setPop(1000);
		//sets a new name for Roach_population
		rs.SetGang("expelled");
		//sets new breed value
		rs.setBreed(3);
		//sets new spray value
		rs.setSpray(0.20);
		//gets new spray value for usage
		rs.getSpray();
		//gets new breed value for usage
		rs.getBreed();
		//gets new population value for usage
		rs.getpop();
		//gets new name for usage
		rs.getgang();
		//prints out modified parameters
		System.out.println(rs + "\n");
		
		//sets a second population value
		rs.setPop(100);
		//sets a second name value
		rs.SetGang("test 3");
		//sets the third new spray value
		rs.setSpray(0.5);
		rs.setBreed(2);
		//gets the third spray value for use
		rs.getSpray();
		//gets the third breed value for usage
		rs.getBreed();
		//gets the third population parameter for usage
		rs.getpop();
		//get the third name for use
		rs.getgang();
		//prints out the third set of parameters
		System.out.println(rs);
		
	}

}
