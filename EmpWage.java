package EmpWageProblem;

public class EmpWage {
	public static void main(String[] args) {
		System.out.println("welcome To Employee Wage");
		int Emp_Wage_Per_Hour = 20;
		int Emp_Part_Time_Hour = 4;
		int Emp_Full_Time_Hour = 8;
		int Is_Full_Time = 1;
		int Is_Part_Time = 2;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == Is_Full_Time)	{
			int EmpWage = Emp_Wage_Per_Hour * Emp_Full_Time_Hour;
			System.out.println("Employee Wage For Full Time:"  +EmpWage);
		}else if (empCheck == Is_Part_Time)	{
			int EmpWage2 = Emp_Wage_Per_Hour * Emp_Part_Time_Hour;
			System.out.println("Employee Wage For Part Time:"  +EmpWage2);
		}else {
			System.out.println("Employee Is Abscent");
		}
	}	
}