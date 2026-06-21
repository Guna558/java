package constructor;

public class Movie1 {
	int movieid;
	String MovieName;
	String Heroname;
	 double rating;

	Movie1() {
		this(0);
	}

	Movie1(int movieid){
		this(movieid,"name");
	}
	Movie1(int movieid,String Moviename){
		this(movieid, "Moviename", "Heroname");
	}
	Movie1(int movieid,String Moviename, String Heroname){
		this(movieid, "Moviename", "Moviename",0.0);
		
	}
	Movie1(int movieid,String Moviename, String Heroname,double rating){
		this.movieid = movieid;
		this.MovieName = Moviename;
		this.Heroname = Heroname;
		this.rating = rating;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie1 m = new Movie1();
		m.display();
		Movie1 m1 = new Movie1(101,"puspha","allu arjun");
		m1.display();
		Movie1 m2 = new Movie1(101,"RRR","NTR",9.5);
		m2.display();
	}
	void display() {
		System.out.println("MovieID:" + movieid);
		System.out.println("MovieName:" + MovieName);
		System.out.println("HeroName:" + Heroname);
		System.out.println("MovieRating:" + rating);
	}

}
