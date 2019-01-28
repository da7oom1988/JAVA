public class Library {

    private String name;
    private int numShelves;
    private Shelf[] shelves;

    public Library(String name, int size){
        this.name = name;
        this.numShelves = 0;
        this.shelves = new Shelf[size];
    }

    public boolean addShelf(Shelf sh){
        if(numShelves == shelves.length) return false;
        shelves[numShelves] = sh;
        numShelves++;
        return true;
    }

    public String searchForBook(int isbn){
        for (int i = 0 ; i < numShelves ; i++){
            if(shelves[i].containsBook(isbn))
                return shelves[i].getID();
        }
        return "-1";
    }

    public Shelf[] shelvesWithCapacity(int cap) {
        Shelf[] newArr = new Shelf[numShelves];
        int num = 0;
        for (int i = 0 ; i < newArr.length ; i++){
            if(shelves[i].getNumBooks() < cap){
                newArr[num] = shelves[i];
                num++;
            }
        }
        return newArr;
    }

    public String toString(){
        String str = "\nLibrary Name: " + name ;
        for (int i = 0 ; i < numShelves ; i++){
            str += (shelves[i].toString());
            str += ("\n");
        }
        return str;
    }

}

