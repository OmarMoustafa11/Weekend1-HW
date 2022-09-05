public class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie");

    }
    Movie(String title, String genre, int rating ){
       this.title = title;
        this.genre = genre;
        this.rating = rating;


    }

}
