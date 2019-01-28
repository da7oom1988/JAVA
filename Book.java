public class Book {

    private int ISBN ;
    private String title, author;

    public Book(int isbn, String title, String author){
        ISBN = isbn;
        this.title = title;
        this.author = author;
    }

    public String toString(){
        return "\nISBN: " + ISBN + "\nBook Title: " + title + "\nBy: " + author ;
    }

    public int getISBN() {
        return ISBN;
    }
}

