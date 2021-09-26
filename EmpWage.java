package EmpWageProblem;

public class EmpWage {
	public static void main(String[] args) {
		System.out.println("welcome To Employee Wage");
		int Is_Full_Time = 1;
		int Emp_Wage_Per_Hour = 20;
		
		int empHrs = 0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 	2; 
			if (empCheck == Is_Full_Time ) {
				System.out.println("Employee Is Present");
				empHrs = 8;
			}else {
				System.out.println("Employee Is Abscent");
				empHrs = 0;
	}
				empWage = empHrs * Emp_Wage_Per_Hour;
				System.out.println("Daily Employee Wage Is:" + empWage);		
	}
}