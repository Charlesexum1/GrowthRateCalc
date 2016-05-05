public class CalculateGrowthRate {
	
	public String species = "";
	public int population = 0;
	public double growthRate = 0.0;
	public int years = 0;
	
	private CalculateGrowthRate(String newSpecies, int newPop, double newGR) {
		if (newPop > 0) {
		species = newSpecies;
		population = newPop;
		growthRate = newGR;
			}
		else {
			System.out.println("Population must be positive...");
			}			
		}
	private void outGrow(CalculateGrowthRate otherSpecies) {
		if (this.population > otherSpecies.population) {
			while (this.population > otherSpecies.population ) {
					years++;
					this.population += (this.population * this.growthRate);
					otherSpecies.population += (otherSpecies.population * otherSpecies.population);
					}
			System.out.println(years + " years.");	
			}
		else {
			while (otherSpecies.population > this.population) {
				years++;
					this.population += (this.population * this.growthRate);
					otherSpecies.population += (otherSpecies.population * otherSpecies.population);
				}
			System.out.println(years + " years.");
			}
		}	
	
	public static void main (String[] args) {
		
		CalculateGrowthRate demo1 = new CalculateGrowthRate("1", 2, 15);
		CalculateGrowthRate demo2 = new CalculateGrowthRate("2", 1, 30);
		demo1.outGrow(demo2);
		}
	
	}
