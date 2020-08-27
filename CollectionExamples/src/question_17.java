import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class question_17 
{
/*An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a
map which has alphabets as keys and integers as values. If alphabet is
repeated add integer to old value*/

	public static void main(String[] args) 
	{
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("A+2");
		list1.add("B+12");
		list1.add("D+4");
		list1.add("DD+5");
		HashMap<String,String> hmap=new HashMap();
		
		Iterator<String> itr=list1.iterator();
		while(itr.hasNext())
		{
			String data=itr.next();
			int index=data.indexOf("+");
			//System.out.println(index);
			String chkey=data.substring(0, index);
			//System.out.println(chkey);
			String chvalue=data.substring(index+1);
			//System.out.println(chvalue);
			if(index==2)
			{
				chvalue="old value";
			}
			hmap.put(chkey, chvalue);
			
			
		}
		System.out.println(hmap);
		

	}

}
