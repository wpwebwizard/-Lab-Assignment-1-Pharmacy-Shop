public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("Movie1", 2020, "Director1");
        Movie m2 = new Movie("Movie2", "Director2");
        Movie m3 = new Movie(m1);

        System.out.println("Before Modification:");
        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();

        m1.setTitle("Inception: Dream Within a Dream");
        m1.setDirector("C. Nolan");
        m1.setReleaseDate(2025);

        System.out.println("\nAfter Modification:");
        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();
    }
}
