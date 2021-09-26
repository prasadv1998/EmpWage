package EmpWageProblem;

public class EmpWage {
	public static final int Is_Full_Time = 1;
	public static final int Is_Part_Time = 2;
	public static final int Emp_Rate_Per_Hour = 20;
	public static final int Num_Of_Working_Days = 20;
	
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage");
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage =0;
		int empCheck = (int) Math.floor(Math.random() *10) %3;
		for (int day = 0; day < Num_Of_Working_Days; day++) {
		switch (empCheck) {
			case Is_Full_Time:
				empHrs = 8;
		System.out.println("Employee is Full Time");
				break;
			case Is_Part_Time:
				empHrs = 4;
		System.out.println("Employee is Part Time");
				break;
			default:
				empHrs = 0;
		}	
		empWage = empHrs * Emp_Rate_Per_Hour;
		totalEmpWage += empWage;
		System.out.println("Employee daily wage is:" +empWage);
		}
		System.out.println("Total employee wage is:" + totalEmpWage);
	}
}	
