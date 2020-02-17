package cecs274;

public class Roach_Population {
	private int pop;
	private String gang;
	private int breed;
	double spray;
	public Roach_Population() {
		pop = 10;
		gang = "Ewwww";
		breed = pop * pop;
		spray = pop * 0.10;
	}
	public Roach_Population (int population, String gangs, int breeds, double sprays) {
		population = pop;
		gangs = gang;
		breeds = breed;
		sprays = spray;
	}
	public int getpop() {
		return pop;
	}
	public String getgang() {
		return gang;
	}
	public int getbreed() {
		return breed;
	}
	public double getspray() {
		return spray;
	}
	public void setPop(int population) {
		population = pop;
	}
	public void SetGang(String gangs) {
		gangs = gang;
	}
	public void setBreed(int breeds) {
		breeds = breed;
	}
	public void setSpray(double sprays) {
		sprays = spray;
	}
	public String toString() {
		return ("The name of the roach population is: " + gang + ". The initial population is: " + pop + ". \n" + 
	"The population squared is:" + breed + ". /n" + " The total population of roaches after being sprayed is: " + spray);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
