package SimpePrograms;

public class Employee {
	
	public void display()
	{
		System.out.println("Employee name is keerthi");
		System.out.println("employee address:kochi");
		System.out.println("employee salary is 20000");
	}
	public void display1(int empid,String empname) {
		System.out.println("employee id:"+empid);
		System.out.println("employee name:"+empname);
	}
	public double displaySalary(int salary) {
		return 12*salary;
	}
	public static void displayAdress() {
		System.out.println("kochi");
	}
    public static int displayExpences(int exp) {
    	return exp;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		emp.display();
		emp.display1(123,"keerthi");
		System.out.println("Anuual salary:"+emp.displaySalary(200000));
		emp.displayAdress();
		System.out.println("Monthly Expences "+emp.displayExpences(10000));
		

	}

}
