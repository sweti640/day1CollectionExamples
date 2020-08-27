import java.util.*;
public class question_11 
{
/*Hotel serves delicious Menus to its Customers. It maintains list of Orders given on daily basis.
 *  Order list is maintained as ArrayList<Order>. Each Order contains orderid, MenuName, price,  
 *  qtyOrdered. (Price of same Menu may vary according hours).From ArrayLsit of Orders
 *   create a map <String,Float> where Menu Name is key and total sale in a day for theMenu as Value.
 *   (sale for the menu is Price*qty ordered).Eg. Order List for a day is :

[(80,”Pav Bhajee”,120.00,5), (90,”Grilled Sandwitch”,72.00,10),   (92,”Hakka Noodles”,220.00,2), 
(96,”Pav Bhajee”,125.00,8),        (101,”Grilled Sandwitch”,70.00,2)]
Then Map would be like this :
{{“Pav Bhajee”,(120*5)+(125*8) ie.1600},   {“Hakka Noodles”, 440}, {“Grilled Sandwitch”,860}}*/

	public static void main(String[] args) 
	{
		ArrayList<Order> order=new ArrayList<Order>();
		order.add(new Order(80,"Pav Bhajee", 120.00, 5));
		order.add(new Order(90,"Grilled Sandwitch",72.00,10));
		order.add(new Order(92,"Hakka Noodles",220.00,2));
		order.add(new Order(96,"Pav Bhajee",125.00,8));
		order.add(new Order (101,"Grilled Sandwitch",70.00,2));
		//order.add(new Order(111,"Hakka Noodles",220.00,2));
		
		HashMap<String, Double> totalSale=new HashMap<String, Double>();
		
		Iterator<Order> orderitr=order.iterator();
		while(orderitr.hasNext())
		{
			double sum=0;
			Double sale=0.0;
			double finalsale=0.0;
			Order data=(Order)orderitr.next();
			
			if(totalSale.containsKey(data.menu_name))
			{
				 sale=totalSale.get(data.menu_name);
			}
			Double second_sel=data.price*data.order_qty;
			finalsale=sale+second_sel;
			totalSale.put(data.menu_name, finalsale);
		}
		System.out.println(totalSale);
		
	}

}
class Order
{
	int order_id;
	String menu_name;
	double price;
	int order_qty;
	public Order(int id,String name,double d,int qty) 
	{
		this.order_id=id;
		this.menu_name=name;
		this.price=d;
		this.order_qty=qty;
		
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", menu_name=" + menu_name + ", price=" + price + ", order_qty="
				+ order_qty + "]";
	}
	
	
}





