package EmpWageProblem;

public class EmpWage {
	public static void main(String[] args) {
		System.out.println("welcome To Employee Wage");
		int Is_Full_Time = 1;
		double EmpCheck = Math.floor((Math.random() *10 ) %2);
		if (EmpCheck == Is_Full_Time )
			System.out.println("Employee Is Present");
		else
			System.out.println("Employee Is Obsent");		
	}
}