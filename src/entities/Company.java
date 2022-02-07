package entities;

public class Company extends Person {

	public int employees;

	public Company(String name, Double income, int employees) {
		super(name, income);
		this.employees = employees;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	@Override
	public Double tax() {
		
		if (employees <= 10) {
			return getIncome() * 0.16;
			
		} else {
			return getIncome() * 0.14;
			
		}
	}
}