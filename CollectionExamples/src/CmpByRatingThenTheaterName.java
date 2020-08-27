import java.util.Comparator;

public class CmpByRatingThenTheaterName implements Comparator<Theatre>
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

}
