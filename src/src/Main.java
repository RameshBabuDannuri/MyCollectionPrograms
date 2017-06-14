import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Movie> al = new ArrayList<>();
        al.add( new Movie( "avengers",8.2,2002 ) );
        al.add( new Movie( "star wars",9,2016 ) );
        al.add(new Movie( "avathar",7.9,2012 ));
        al.add(new Movie("Return of the Jedi", 8.4, 1983));
        System.out.println("sorted by year using comparable ");
        Collections.sort(al);
        System.out.println("Movies affter sorting");
        for (Movie movie: al) {
            System.out.println(movie.getYear()+" "+
                                 movie.getName()+" "+
                                   movie.getRating());
        }
        System.out.println("sorted by rating using comparator ");
        RatingCompare r = new RatingCompare();
         Collections.sort(al,r);
        for (Movie movie:al) {
            System.out.println(movie.getRating()+" " +
                                 movie.getName()+" "+
                                 movie.getYear());

        }
        System.out.println("sorted by name using comparator ");
        NameComparator n = new NameComparator();
        Collections.sort( al,n );
        for (Movie movie: al) {
            System.out.println( movie.getName()+" "+
                                 movie.getRating()+" "+
                                   movie.getYear());


        }

    }

}
