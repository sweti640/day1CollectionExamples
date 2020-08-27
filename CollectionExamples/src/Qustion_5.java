import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Qustion_5 
{
/*Assume that there is already aarraylist of Customer objects. Customer { intcid , String name ,
int items }. Write a program which creates hashset of customer objects. If there are
multiple customer object for same customer in arraylist ,then items should be added to previous 
customer’s items.Once set is created sort that set based on no. of items purchased by that customer.
Customer with maximum items should be first.*/

	public static void main(String[] args) 
	{
		HashSet<Customer> hashcust=new HashSet<Customer>();
		
		
		ArrayList<Customer> arrcust=new ArrayList<Customer>();
		arrcust.add(new Customer(1, "abc", 1));
		arrcust.add(new Customer(1, "abc", 2));
		arrcust.add(new Customer(2, "pqr", 1));
		arrcust.add(new Customer(3, "xyz", 2));
		arrcust.add(new Customer(2, "pqr", 3));
		Iterator< Customer> itr=arrcust.iterator()
		while(itr.hasNext())
		{
			Customer data2=null;
			int sum=0;
			int it=0;
			Customer data=itr.next();
			Customer c1=new Customer(data.cid, data.cname, data.item);
			if(hashcust.contains(c1))
			{
				sum=sum+data.item;
			}
			sum=data.item;
			hashcust.add(new Customer(data.cid, data.cname, sum));
			
			System.out.println(hashcust);
			
		}
					
	}
}


class Customer
{
	 int cid;
	String cname;
	int item;
	
	public Customer(int id,String name,int p_iteam)
	{
		this.cid=id;
		this.cname=name;
		this.item=p_iteam;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", item=" + item + "]";
	}
	
	public int hashCode()
	{
		return cid;
	}
	public boolean equals(Object obj)
	{
		
		
		Customer emp=(Customer)obj;
		if(this.cid==emp.cid)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
