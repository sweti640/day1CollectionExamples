import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class question12 
{
/*Create a Map<String,String> where key is adharno  and value is vote casted to which party
 * (eg. BJP,ShivSena,NCP,Congress,Other) .From this create new map such that KEY is party name 
 * and value is count of votes casted 
 */

	public static void main(String[] args) 
	{
		Map<String, String> voting=new HashMap<String, String>();
		voting.put("101", "BJP");
		voting.put("102", "ShivSena");
		voting.put("103", "NCP");
		voting.put("104", "Congress");
		voting.put("105", "Other");
		voting.put("106", "BJP");
		voting.put("107", "ShivSena");
		voting.put("108", "NCP");
		voting.put("109", "Congress");
		voting.put("110", "Other");
		voting.put("111", "BJP");
		voting.put("112", "ShivSena");
		voting.put("113", "NCP");
		voting.put("114", "Congress");
		voting.put("115", "Other");
		voting.put("116", "Other");
		voting.put("117", "Other");
		voting.put("118", "BJP");
		
		
		System.out.println(voting);
		
		Map<String, Integer> countVoting=new HashMap();
		
		for(Map.Entry<String, String> mapitr:voting.entrySet())
		{
			//System.out.println(mapitr.getValue());
			
			int count=1;
			
			if(countVoting.containsKey(mapitr.getValue()))
			{
				count=countVoting.get(mapitr.getValue());
				count++;
			}
			countVoting.put(mapitr.getValue(),count);
			//System.out.println(countVoting);
		}
		System.out.println(countVoting);
		
	}
	

}
