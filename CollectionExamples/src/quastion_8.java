import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class quastion_8 
{
	/*Consider an array of Student 
	Student (int sid, String sname, List<String> hobby)
	From this list create a Map<String,List<Student>> where key is hobby name and list of
	student objects having same hobby. Also find out most common hobby among students */

	public static void main(String[] args) 
	{
		String hobby1[]= {"Reading","Playing"};
		String hobby2[]= {"Reading","Dancing"};
		String hobby3[]= {"Reading","Eating"};
		
		
		
		ArrayList<StudentFinal> student=new ArrayList<StudentFinal>();
		student.add(new StudentFinal(1, "sweti",hobby1));
		student.add(new StudentFinal(2, "Tejas",hobby2));
		student.add(new StudentFinal(1, "sradha",hobby3));
		
		HashMap<String, List<String>> fvrhobby=new HashMap();
		List<String> studentdata;
		Iterator< StudentFinal> itr=student.iterator();
		String[] hb=null;
		int i=0;
		while(itr.hasNext())
		{
			
			StudentFinal data=itr.next();
			
			 hb=data.hobby;
			
			for(i=0;i<hb.length;i++)
			{
				 studentdata=new ArrayList();
				if(fvrhobby.containsKey(hb[i]))
				{
					studentdata=fvrhobby.get(hb[i]);
				}
				studentdata.add(data.student_name);
				fvrhobby.put(hb[i], studentdata);
				
			}
			
			
		}
		
		System.out.println(fvrhobby);
		int max=0;
		String hname=null;
		for(Map.Entry<String, List<String>> fav:fvrhobby.entrySet())
		{
			int k=fav.getValue().size();
			 hname=fav.getKey();
			
			if(max<k)
			{
				max=k;
			}
			
		}	
		System.out.println(max);
		for(Map.Entry<String, List<String>> fav:fvrhobby.entrySet())
		{
			if(fav.getValue().size()==max)
			{
				System.out.println(fav.getKey()+"  is the most common hobby among the student");
				System.out.println("the student name is below");
				System.out.println(fav.getValue());
			}
			
		}
		
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		

	}

}
class StudentFinal
{
	int student_id;
	String student_name;
	String[] hobby;
	public StudentFinal(int id,String name,String[] h) 
	{
		this.student_id=id;
		this.student_name=name;
		hobby=h;
	}
	@Override
	public String toString() {
		return "StudentFinal [student_id=" + student_id + ", student_name=" + student_name + ", hobby="
				+ Arrays.toString(hobby) + "]";
	}
	
	
	
	
}

