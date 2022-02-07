package entities;

public class Individual extends Person {

	private Double healthExpenditures;

	public Individual(String name, Double income, Double healthExpenditures) {
		super(name, income);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	public void totalTax(Double income) {

	}

	@Override
	public Double tax() {
		
		if (getIncome() >= 2000) {
			return getIncome() * 0.25 - healthExpenditures / 2;
		} else {
			return getIncome() * 0.15 - healthExpenditures / 2;
		}
	}
}