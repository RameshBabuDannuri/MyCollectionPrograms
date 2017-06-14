import java.util.Comparator;

/**
 * Created by root on 14/6/17.
 */
public class NameComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        String name1=o1.getName().toUpperCase();
        String name2=o2.getName().toUpperCase();

        return name1.compareTo( name2 );
    }
}
