public class Shelf {

    private String id;
    private int numBooks;
    private Book[] books;

    public Shelf(String id, int size){
        this.id = id;
        numBooks = 0;
        books = new Book[size];
    }

    public Shelf(Shelf sh){
        this.id = sh.id;
        this.numBooks = sh.numBooks;
        books = new Book[sh.books.length];
        for (int i = 0 ; i < this.numBooks ; i++){
            books[i] = sh.books[i];
        }
    }

    public boolean addBook(Book b){
        if(numBooks == books.length) return false;
        books[numBooks] = b;
        numBooks++;
        return true;
    }

    public boolean containsBook(int isbn){
        for(int i = 0 ; i < numBooks ; i++){
            if(books[i].getISBN() == isbn)
                return true;
        }
        return false;
    }

    public String toString(){
        String str = "\nShelf ID: " + id ;
        for (int i = 0 ; i < numBooks ; i++){
            str += (books[i].toString());
            str += ("\n");
        }
        return str + "\n";
    }

    public String getID() {
        return id;
    }

    public int getNumBooks() {
        return numBooks;
    }
}

