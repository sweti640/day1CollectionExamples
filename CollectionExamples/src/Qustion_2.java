import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Qustion_2 
{
/*Given a Linkedhashmap<string, integer> , find out if given list of keys (Strings )appear in
same order in hashmap. 
E.g. Linkedhashmap has { “pqr” , 12 } { “rst” , 43 } { “abc” , 4 } {“mno” ,2}
Given list is (“rst”) (“abc”) so it appears in same order. Output should be “true”*/

	public static void main(String[] args) 
	{
		List<String> al=new LinkedList();
		
		al.add("abc");
		al.add("rst");
		
		LinkedHashMap<String, Integer> lmap=new LinkedHashMap<String, Integer>();
		lmap.put("pqr", 12);
		lmap.put("rst", 43);
		lmap.put("abc", 4);
		lmap.put("mno", 2);
		String name1=null;
		int count=0;
		int index=0;
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			String data=itr.next();
			count++;
			for(Map.Entry<String, Integer> itr2:lmap.entrySet())
			{
				String data2=itr2.getKey();
				index++;
				if(data.equals(data2))
				{
					System.out.println(data);
					System.out.println(data2)
					
				}
				
			}
		}
		
		
		
		
		
		
		

	}

}
