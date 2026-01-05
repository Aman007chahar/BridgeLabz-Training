package encapsulation;

public abstract class LibraryItem {
    protected int itemId;
    protected String title;
    protected String author;

    public LibraryItem(int id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println(title + " by " + author);
    }
}
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable {

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        System.out.println("Book Reserved");
    }

    public boolean checkAvailability() {
        return true;
    }
}
