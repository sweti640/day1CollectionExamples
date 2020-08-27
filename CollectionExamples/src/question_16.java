import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class question_16 
{
/*Consider an ArrayList<Test>and  test has  {tid,sid,int marks[]} .Create a Set<Student> 
 * Student{sid,totalmarks}  from the list and sort the set in descending order of totalmarks
 */
	public static void main(String[] args) 
	{
		ArrayList<Test> test=new ArrayList<Test>();
		int mark1[]= {10,20,30};
		int mark2[]= {40,50,60};
		int mark3[]= {15,5,5};
		int mark4[]= {70,80,90};
		Test t1=new Test(1, 1, mark1);
		Test t2=new Test(2, 2, mark2);
		Test t3=new Test(3, 3, mark3);
		Test t4=new Test(4, 4, mark4);
		test.add(t1);
		test.add(t2);
		test.add(t3);
		test.add(t4);
		
		
		
		Set<StudentDamy> student=new HashSet();
		
		
		Iterator<Test> stutest=test.iterator();
		while(stutest.hasNext())
		{
			Test data=stutest.next();
			int id=data.stu_id;
			int sum=0;
			int total[]=data.marks;
			for(int i=0;i<total.length;i++)
			{
				sum=sum+total[i];
			}
			student.add(new StudentDamy(id,sum));
			
			
		}
		//System.out.println(student);
		TreeSet<StudentDamy> tree=new TreeSet<StudentDamy>(student);
		System.out.println(tree);
		
		
	}

}
class Test 
{
	int test_id;
	int stu_id;
	int marks[];
	
	public Test( int test_id, int stu_id, int[] marks) 
	{
		
		this.test_id = test_id;
		this.stu_id = stu_id;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Test [test_id=" + test_id + ", stu_id=" + stu_id + ", marks=" + Arrays.toString(marks) + "]";
	}





	
	
}
class StudentDamy implements Comparable<StudentDamy>
{
	int student_id;
	int total;
	public StudentDamy(int id,int t) 
	{
		this.student_id=id;
		this.total=t;
	}
	public StudentDamy(int sid) 
	{
		this.student_id=sid;
	}
	@Override
	public String toString() {
		return "StudentDamy [student_id=" + student_id + ", total=" + total + "]";
	}
	@Override
	public int compareTo(StudentDamy o) 
	{
		if(this.total<o.total)
			return 1;
		if(this.total>o.total)
			return -1;
		else
		
			return 0;
	}
	
	
	
	
}
