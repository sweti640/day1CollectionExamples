import java.util.ArrayList;

public class qustion_9 
{
/*Write a Program in Java, You have an Employee class 
class Employee{ 
String name; 
int eid, 
int mgrid; 
} 
Every manager is also employee. So create an arraylist of 5 Emp and print all Employee along 
with their Manager name.*/

	public static void main(String[] args) 
	{
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee("medha", 1, 3));
		emplist.add(new Employee("priyanka", 2, 1));
		emplist.add(new Employee("pranav", 3, 0));
		emplist.add(new Employee("sonali", 4, 1));
		System.out.println("Employee  ||   Manager");
		System.out.println(".......................");
		for(int i=0;i<emplist.size();i++)
		{
			
			for(int j=i+1;j<emplist.size();j++)
			{
				if(emplist.get(i).manager_id==emplist.get(j).emp_id)
				{
					System.out.println(emplist.get(i).emp_name+"     "+emplist.get(j).emp_name);
				}
				else if(emplist.get(i).emp_id==emplist.get(j).manager_id)
				{
					
					System.out.println(emplist.get(j).emp_name+"    "+emplist.get(i).emp_name);
				}
			}
		}
		
		
		
	}

}
class Employee
{
	String emp_name;
	int emp_id;
	int manager_id;
	public Employee(String name,int eid,int mid ) 
	{
		this.emp_name=name;
		this.emp_id=eid;
		this.manager_id=mid;
		
	}
	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", emp_id=" + emp_id + ", manager_id=" + manager_id + "]";
	}
	
}
