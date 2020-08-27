import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class question_15 
{
/*Assume that there is already  arraylist of members of Society Member{memberid,Wing_flatNo,name}.  
 * Write a program which creates Map where key is Wing_FlatNo and value is List of all names of 
 * family members */

	public static void main(String[] args) 
	{
		ArrayList<Society> family=new ArrayList<Society>();
		family.add(new Society(1, 1, "xyz"));
		family.add(new Society(2, 1, "abc"));
		family.add(new Society(8, 3, "bhabhi"));
		family.add(new Society(3, 2, "sweti"));
		family.add(new Society(4, 2, "hemal"));
		family.add(new Society(5, 3, "papa"));
		family.add(new Society(6,3 , "mom"));
		family.add(new Society(7, 3, "bhai"));
		
		HashMap<Integer, ArrayList<String>> member=new HashMap();
		
		Iterator<Society> fitr=family.iterator();
		while(fitr.hasNext())
		{
			ArrayList<String> listOfMember=new ArrayList<String>();
			Society data=fitr.next();
			
			if(member.containsKey(data.wing_flatNo))
			{
				listOfMember=member.get(data.wing_flatNo);
			}
			listOfMember.add(data.name);
			member.put(data.wing_flatNo, listOfMember);
		}
		System.out.println(member);
		

	}

}
class Society
{
	int member_id;
	int wing_flatNo;
	String name;
	
	public Society(int id,int f_no,String name) 
	{
		this.member_id=id;
		this.wing_flatNo=f_no;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Society [member_id=" + member_id + ", wing_flatNo=" + wing_flatNo + ", name=" + name + "]";
	}
	
}
