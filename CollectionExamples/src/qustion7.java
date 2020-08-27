import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class qustion7 
{
/*Create a collection to maintain data in sorted order of Movie Rating and if 2 movies have
same rating then according to Theatrename (use Anonymous class for sorting) 
Theatre (Theatreid,Theatrename,location,Movie)
Movie (Movieid,Moviename,Rating)*/

	public static void main(String[] args) 
	{
		ArrayList<Theatre> tarr=new ArrayList<Theatre>();
		tarr.add(new Theatre(1, "cineplex", "pune", new Movie(1, "DDl", 5)));
		tarr.add(new Theatre(2, "digital", "surat", new Movie(2, "Doom", 2)));
		tarr.add(new Theatre(3, "multiplex", "mubai", new Movie(3, "sadak2", 0)));
		tarr.add(new Theatre(4, "bigbazar", "valsad", new Movie(4, "chichore", 10)));
		tarr.add(new Theatre(5, "rajhansh", "delhi", new Movie(5, "chelo divas", 9)));
		tarr.add(new Theatre(6, "sevensis", "delhi", new Movie(5, "dhamal", 9)));
		tarr.add(new Theatre(7, "bigbazar", "pune", new Movie(1, "ABCD", 5)));
		
		//Collections.sort(tarr, new CmpByRatingThenTheaterName());
		Collections.sort(tarr, new Comparator<Theatre>() 
		{
			@Override
			public int compare(Theatre o1, Theatre o2) 
			{
				if(o1.movie.movie_rating>o2.movie.movie_rating)
					return 1;
				else if (o1.movie.movie_rating<o2.movie.movie_rating) 
					return -1;
				else
					return o1.Theatre_name.compareTo(o2.Theatre_name);
				
			}
			
		});
		
		System.out.println(tarr);		
	}
	
}
class Movie
{
	int movie_id;
	String movie_name;
	int movie_rating;
	
	public Movie(int id,String name,int rating) 
	{
		this.movie_id=id;
		this.movie_name=name;
		this.movie_rating=rating;
	}

	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", movie_name=" + movie_name + ", movie_rating=" + movie_rating + "]";
	}
	
}
class Theatre
{
	int Theatre_id;
	String Theatre_name;
	String Location;
	Movie movie;
	
	public Theatre(int id,String name,String loc,Movie m) 
	{
		this.Theatre_id=id;
		this.Theatre_name=name;
		this.Location=loc;
		this.movie=m;
	}

	@Override
	public String toString() {
		return "Theatre [Theatre_id=" + Theatre_id + ", Theatre_name=" + Theatre_name + ", Location=" + Location
				+ ", movie=" + movie + "]";
	}
	
}
