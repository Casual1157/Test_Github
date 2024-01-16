package abstractEmployee;

public class Manager extends Employee{
	
	public Manager(String name, double salary) {
		this.setSalary(salary);
		this.setName(name);
	}
	
	@Override
	public double calculateBonus() {
		// TODO Auto-generated method stub
		return this.getSalary()*0.25;
	}
}
