import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;





public class Qustion_1 
/*There is arraylist which contains objects of class BookSale { Book b , int copiesSold }
Book { int bookid , String author , float price } 
There is also a hashmap which contains information about business done by each book.
Map<int bookid , float amount> Map already has information about all books and business
done till now. You can take hardcoded values in map. Write a program to update map using
new information in given arraylist. If book is present in map calculate its business amount (price
* copiessold) and add to existing amount in map. If book is not present add its entry in map*/
{
	public static void main(String[] args) 
	{
		ArrayList<BookSale> booksale=new ArrayList();
		booksale.add(new BookSale(new Book(1, "abc", 200), 2));
		booksale.add(new BookSale(new Book(2, "xyz", 300), 1));
		booksale.add(new BookSale(new Book(1, "abc", 200), 1));
		booksale.add(new BookSale(new Book(2, "xyz", 300), 2));
		booksale.add(new BookSale(new Book(3, "pqr", 300), 1));
		
		HashMap<Integer, Float> bookMap=new HashMap<Integer, Float>();
		bookMap.put(1, 400.0f);
		bookMap.put(2, 300.0f);
		float total=0.0f;
		int booklistSize=1;
		for(int i=booklistSize+1;i<booksale.size();i++)
		{
			int booknum=booksale.get(i).b.book_id;
			if(bookMap.containsKey(booknum))
			{
				float price=bookMap.get(booknum);
				total=(booksale.get(i).number_of_copy*booksale.get(i).b.price)+price;
				bookMap.put(booksale.get(i).b.book_id, total);
				System.out.println(bookMap);
			}
			else
			{
				float p=booksale.get(i).b.price *booksale.get(i).number_of_copy;
				bookMap.put(booksale.get(i).b.book_id,p );
				System.out.println(bookMap);
			}
			
		}
		booklistSize++;
		
	}
	
	}



class Book
{
	
	int book_id;
	String author;
	float price;
	
	public Book(int book_id, String author, float price) 
	{
		
		this.book_id = book_id;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", author=" + author + ", price=" + price + "]";
	}
	
}
class BookSale
{
	Book b;
	int number_of_copy;
	
	public BookSale(Book b, int number_of_copy) 
	{
	
		this.b = b;
		this.number_of_copy = number_of_copy;
	}

	@Override
	public String toString() {
		return "BookSale [b=" + b + ", number_of_copy=" + number_of_copy + "]";
	}
	
	
}

	