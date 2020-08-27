import java.util.Collections;
import java.util.LinkedList;

public class qustion_3 {

	public static void main(String[] args) 
	{
/*Given a linked list of integers , find out number of missing elements in linked list. E.g. list
contains { 2 , 3, 7} missing elements are 4, 5, 6. If list contains { 3 , 13 , 7 , 2 } 
. missing elements are 4,5,6,8,9,10,11,12 and so on. Write a logic which will work for any list.*/

			LinkedList<Integer> ll=new LinkedList<Integer>();
				ll.add(3);
				ll.add(13);
				ll.add(7);
				ll.add(2);
			
				//first i sort the linkedlist
				Collections.sort(ll);
				System.out.println(ll);
				//int first=ll.getFirst();
				//int last=ll.getLast();
				for(int i=ll.getFirst();i<ll.getLast();i++)
				{
					if(!ll.contains(i))
					{
						System.out.println(i);
					}
				}

			}
		
	}


