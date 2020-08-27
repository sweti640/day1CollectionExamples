import java.util.*;
import java.util.LinkedHashSet;

public class question_13 
{
/*Create two Set of students objects where insertion order in maintained. Now accept Studentid 
 * from user and check whether in both sets have student with given id at same position	
 */

	public static void main(String[] args) 
	{
		Set<StudentDemo> student1=new LinkedHashSet();
		student1.add(new StudentDemo(3, "sweti"));
		student1.add(new StudentDemo(2, "tejas"));
		student1.add(new StudentDemo(1, "sradha"));
		student1.add(new StudentDemo(4, "sradha"));

		Set<StudentDemo> student2=new LinkedHashSet();
		student2.add(new StudentDemo(1, "sweti"));
		student2.add(new StudentDemo(2, "tejas"));
		student2.add(new StudentDemo(3, "sradha"));
		student2.add(new StudentDemo(4, "sradha"));
		System.out.println(student1);
		System.out.println(student2);
		

		Scanner keyBord=new Scanner(System.in);
		System.out.println("Enter the student id=");
		int id=keyBord.nextInt();
		int index=0;
		int count=0;
		Iterator<StudentDemo> stu1=student1.iterator();
		while(stu1.hasNext())
		{
			StudentDemo data1=(StudentDemo)stu1.next();
			index++;
			if(data1.stu_id==id)
			{
				Iterator<StudentDemo> stu2=student2.iterator();
				
				while(stu2.hasNext())
				{
					
					StudentDemo data2=(StudentDemo)stu2.next();
					count++;
					if(index==count)
					{
					if(data2.stu_id==data1.stu_id) 
					{
						System.out.println("enter id is same position in both set at index No="+index);
					
					}
					else 
					{
						System.out.println("id is not in same postion...");
						
					}
				}
					
					
			}
		}
			
	}

}
}
class StudentDemo
{
	int stu_id;
	String name;
	
	public StudentDemo(int id,String sname) 
	{
		this.stu_id=id;
		this.name=sname;
	}
	
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", name=" + name + "]";
	}
	
	
}

