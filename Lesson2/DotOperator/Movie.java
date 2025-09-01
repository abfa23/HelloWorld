package Lesson2.DotOperator;

public class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie: " + title + " (" + genre + ") - Rating: " + rating);
    }
}
