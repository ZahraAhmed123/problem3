package movie;
import java.util.ArrayList;
import java.util.List;
public class movie {
    private List<movieItem>movieItems = new ArrayList<movieItem>();
    public void addMovieItem(movieItem movieItem) {
        movieItems.add(movieItem);
    }
    public List<movieItem> getMovieItems() {
        return movieItems;
    }

    public void printMovieDetails() {
        for (movieItem movieItem : movieItems) {
            System.out.println(movieItem);
        }
    }
}





