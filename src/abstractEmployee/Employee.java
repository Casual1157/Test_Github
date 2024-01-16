package abstractEmployee;

public abstract class Employee {
	private String name;
	private double salary;
	
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee: \n\t name: " + name + "| salary: " + salary;
	}
	
	public void increaseSalary(double amount) {
		this.salary += amount;
	}
	public abstract double calculateBonus();
	public double calculateBouns() {
		// TODO Auto-generated method stub
		return 0;
	}

}
