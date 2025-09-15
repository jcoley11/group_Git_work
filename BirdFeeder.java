package edu.unca.csci201;

public class BirdFeeder {
	
	int numberOfSeeds;

	
	public void fillUp(int numberOfSeeds) {
		this.numberOfSeeds = numberOfSeeds;
	}

	public int getAmountOfSeeds() {
		return numberOfSeeds;
	}
	
	public void feedABird(Bird whichBirdEats, int seedsToEat) {
		
		numberOfSeeds = numberOfSeeds - seedsToEat;
		whichBirdEats.seedsEaten =+ seedsToEat;
		
		numberOfSeeds = seedsToEat;
	
		
	
		
		
		}
	}
	

