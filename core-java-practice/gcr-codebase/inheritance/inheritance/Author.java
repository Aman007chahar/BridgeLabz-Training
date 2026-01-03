package inheritance;

public class Author extends Book {
    String name;
    String bio;

    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println(title + " (" + publicationYear + ")");
        System.out.println("Author: " + name);
    }
}
