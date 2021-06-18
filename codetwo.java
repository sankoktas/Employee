public class EmployeeTester
{
	public static void main(String[]args)
	{
		Employee san = new Employee("san", 50);
		System.out.println(san.getName());
		System.out.println(san.getSalary());
		san.raiseSalary(15);
		System.out.println(san.getSalary());
	}
}
