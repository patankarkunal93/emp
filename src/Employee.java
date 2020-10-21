
public class Employee {
	int EmpId;
	String EmpName;
	double Basic_salary,HRA,Medical,PF,PT,Net_Sal,Gross_Sal; 

	public Employee()
	{
		
	}
	public Employee(int a, String b, double c)
	{
		EmpId=a;
		EmpName=b;
		Basic_salary=c;
		//this.Net_Sal=d;
		//this.Gross_Sal=e;
		
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the employee ID");
		EmpId=scan.nextInt();
		
		//Scanner scan=new Scanner(System.in);
		System.out.println("Enter the employee name");
		EmpName=scan.next();
		
		System.out.println("Enter the Basic_salary");
		Basic_salary=scan.nextDouble();
		*/
		/*
		System.out.println("Enter the net_salary");
		Net_Sal=scan.nextDouble();
		
		System.out.println("Enter the gross_salary");
		Gross_Sal=scan.nextDouble();
		*/
		HRA=Basic_salary/2;
		PF=(Basic_salary * 12)/100;
		PT=200;
		System.out.println("The HRA is: "+HRA);
		System.out.println("The PF is : "+PF);
		System.out.println("PPT is : "+PT);
		
		Gross_Sal=Basic_salary+HRA+Medical;
		Net_Sal=Gross_Sal-(PT+PF);
		System.out.println("Gross Salary is : "+Gross_Sal);
		System.out.println("Net Salary is: "+Net_Sal);
		System.out.println("Code completed");
	}
	
	public String toString()
	{
		//System.out.println("employee details are as below: ");
		//System.out.println(" "+ EmpName + " "+ EmpId +" "+Basic_salary);
		return EmpName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee E1=new Employee(10,"Kunal",200000);
		E1.toString();
		
	}

}
