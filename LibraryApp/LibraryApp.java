public class LibraryApp {
    public static void main(String[] args) {
        Library KSUL = new Library("KSU Library", 100);
        System.out.println("1. KSU Library has been created..");

        Shelf sh1 = new Shelf("00", 20);
        System.out.println("2. Shelf 00 has been created..");

        Shelf sh2 = new Shelf("01", 20);
        System.out.println("2. Shelf 01 has been created..");

        Shelf sh3 = new Shelf("02", 20);
        System.out.println("2. Shelf 02 has been created..");

        sh1.addBook(new Book(11, "One Brain Two Minds", "Andrew"));
        sh1.addBook(new Book(22, "The Empowered Manager", "Peter"));
        sh2.addBook(new Book(33, "Diabetes and Carb Counting", "Sherri"));
        sh3.addBook(new Book(44, "Built to Grow", "Royston"));
        sh3.addBook(new Book(55, "Beyond The Vision", "Sarah"));
        sh3.addBook(new Book(66, "Little Things", "Emmy"));
        System.out.println("3. The Books have been added to the shelves..");

        KSUL.addShelf(sh1);
        KSUL.addShelf(sh2);
        KSUL.addShelf(sh3);
        System.out.println("4. The shelves have been added to the library..");

        System.out.println("5. shelf id for ISBN=55 : " + KSUL.searchForBook(55));

        System.out.println("6. Shelves which have numBooks < 2");
        Shelf[] sh = KSUL.shelvesWithCapacity(2);
        for(int i = 0 ; i < sh.length ; i++){
            if(sh[i] == null){
                break;
            }else {
                System.out.println(sh[i].toString());
            }
        }

        System.out.println("7. All KSU Library Info:");
        System.out.println(KSUL.toString());
    }
}

