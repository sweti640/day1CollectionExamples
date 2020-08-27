import java.util.*;


public class Qustion6 
{
/*WAP wherein Set<Student>containing { int rollno , String name , int marks } are changed to
Map where key will be marks and value will be List of RollNos where all those students who have 
same marks are together.*/

	public static void main(String[] args) 
	{
		Map<Integer, List<Integer>> hmap=new HashMap<Integer, List<Integer>>();
		Set<StudentData> hset=new HashSet();
		hset.add(new StudentData(1, "abc", 50));
		hset.add(new StudentData(2, "abc", 50));
		hset.add(new StudentData(3, "abc", 60));
		hset.add(new StudentData(4, "abc", 60));
		hset.add(new StudentData(5, "abc", 60));
		
		Iterator<StudentData> sitr=hset.iterator();
		while(sitr.hasNext())
		{
			
			List<Integer> rools=new ArrayList<Integer>();
			StudentData data=(StudentData)sitr.next();
			if(hmap.containsKey(data.marks))
			{
				rools=hmap.get(data.marks);
			}
			rools.add(data.rollNo);
			hmap.put(data.marks, rools);
			
		}
		System.out.println(hmap);
		
		
		

	}

}
class StudentData
{
	int rollNo;
	String name;
	int marks;
	
	public StudentData(int no,String s_name,int mark) 
	{
		this.rollNo=no;
		this.name=s_name;
		this.marks=mark;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
