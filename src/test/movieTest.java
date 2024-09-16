package test;
import movie.movie;
import movie.movieItem;
public class movieTest {
    public static void main(String[] args) {
        movie myBestmovie = new movie();

        movieItem item1 = new movieItem("Strange things","OuterBanks");
        movieItem item2 = new movieItem("Killers","Captian America");

        myBestmovie.addMovieItem(item1);
        myBestmovie.addMovieItem(item2);

        myBestmovie.printMovieDetails();
    }
}

