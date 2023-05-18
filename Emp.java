public class Emp {
	private int ID;
	private String name;
	private double salary;
	private String deptname;
	static String department[];
	static {
		department= new String[5];
		department[0]= "Admin";
		department[1]= "Finance";
		department[2]= "HR";
		department[3]="Project";
		department[4]="Sales";
	}
	public Emp(int id,String nm,double salary, String dept)
	{
		this.ID=id;
		this.name=nm;
		this.salary=salary;
	}
	{
	for(i=0;i<department.length;i++)
	{
		if(deptname.equals(department[i]))
		{
			deptname=dept;
					break;
		}
		
	}
	if(i==department.length)
		dept="Training";
	public void display()
	{
		System.out.println("Emp ID"+ID);
		System.out.println("Name"+name);
		System.out.println("Salary"+salary);
		System.out.println("Deptname"+deptname);
		}
}
	public class EmpDemo
	{
		public static void main(String[]args)
		{
			Emp i1=new Emp(103,"Ram",1000,"Admin");
			Emp i2=new Emp(104,"Shyam",2000,"Finance");
			Emp i3=new Emp(105,"Raju",5000," ");
			Emp a[]=new Emp[3];
			a[0]=i1;
			a[1]=i2;
			a[2]=i3;
		}
	}
