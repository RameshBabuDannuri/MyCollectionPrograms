/**
 * Created by root on 14/6/17.
 */
 class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    public Movie(String nm, double rt, int yr){
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }

    @Override
    public int compareTo(Movie o) {
        return  this.year - o.year;
    }
}
