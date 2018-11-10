import java.util.Scanner;

public class Airline {

    static Scanner sc = new Scanner(System.in);
    static Flight[] flights = new Flight[100];

    public static void main(String[] args) {
        welcome();
        boolean exit = false;
        do {
            printMenu();
            System.out.print("Enter a Number: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (addFlight()) {
                        System.out.println("Flight Add..");
                    }
                    break;
                case 2:
                    System.out.print("Enter flight number: ");
                    String flightNumber = sc.next().toUpperCase();
                    if (findFlight(flightNumber) >= 0) {
                        int index = findFlight(flightNumber);
                        System.out.println("the index of flight is: " + index);
                    }
                    break;
                case 3:
                    printAll();
                    break;
                case 4:
                    System.out.println("Enter date: ");
                    printAll(sc.next());
                    break;
                case 5:
                    System.out.print("Enter flight number: ");
                    String fn = sc.next().toUpperCase();
                    System.out.print("Enter new time: ");
                    String nt = sc.next();
                    updateTime(fn, nt);
                    break;
                case 6:
                    System.out.println("the total of flights is: " + getNumberOfFlights());
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input!!");
            }
            if (exit) {
                System.out.println("Bye..");
                break;
            }
        } while (true);

    }

    private static void welcome() {
        System.out.println("\n\n         AA           AAAAAA    AAAAAAAAAAA    AA             AAAAAA   AAA        AA   AAAAAAAAA");
        System.out.println("       AA  AA           AA      AA        AA   AA               AA     AA AA      AA   AA");
        System.out.println("      AA    AA          AA      AA       AA    AA               AA     AA  AA     AA   AA");
        System.out.println("     AA      AA         AA      AA      AA     AA               AA     AA   AA    AA   AA");
        System.out.println("    AA        AA        AA      AAAAAAAAA      AA               AA     AA    AA   AA   AAAAAAAAA");
        System.out.println("    AAAAAAAAAAAA        AA      AAAA           AA               AA     AA     AA  AA   AA");
        System.out.println("   AA          AA       AA      AA   AA        AA               AA     AA      AA AA   AA");
        System.out.println("  AA            AA      AA      AA     AA      AA               AA     AA       AAAA   AA");
        System.out.println(" AA              AA   AAAAAA    AA       AA    AAAAAAAAAAAA   AAAAAA   AA        AAA   AAAAAAAAA\n\n");

    }

    private static void printMenu() {
        System.out.println("\n(1) Add a Flight");
        System.out.println("(2) Find a flight");
        System.out.println("(3) List all flights");
        System.out.println("(4) List flights for a given date");
        System.out.println("(5) Update Departure & Arrival Time");
        System.out.println("(6) Total number of flights");
        System.out.println("(7) Exit\n");
    }

    private static boolean addFlight() {
        if (getNumberOfFlights() >= 100) {
            System.out.println("No space for new flight..\n");
            return false;
        }

        int destination, gate;
        String date, departure;

        printDestination();
        System.out.print("destination: ");
        destination = sc.nextInt();
        System.out.print("date(DD/MM): ");
        date = sc.next();
        System.out.print("gate: ");
        gate = sc.nextInt();
        System.out.print("departure(HH:MM): ");
        departure = sc.next();

        flights[getNumberOfFlights()] = new Flight(destination, date, gate, departure);
        return true;
    }

    private static int findFlight(String flightNumber) {
        for (int i = 0; i < getNumberOfFlights(); i++) {
            if (flights[i].getFlightNumber().equals(flightNumber)) {
                flights[i].printFlightInfo();
                System.out.print("the flight index is: ");
                return i;
            }
        }

        return -1;
    }

    private static void printAll() {
        for (int i = 0; i < getNumberOfFlights(); i++) {
            flights[i].printFlightInfo();
        }
    }

    private static void printAll(String date) {
        for (int i = 0; i < getNumberOfFlights(); i++) {
            if (flights[i].getDate().equals(date)) {
                flights[i].printFlightInfo();
            }
        }
    }

    private static void updateTime(String fn, String nt) {
        if (findFlight(fn) < 0) {
            System.out.println("couldn't find the flight");
            return;
        }
        flights[findFlight(fn)].setDepartureTime(nt);
    }

    private static int getNumberOfFlights() {
        return Flight.totalFlights;
    }

    private static void printDestination() {
        System.out.println("\n(1) DAMAMM");
        System.out.println("(2) JEDDAH");
        System.out.println("(3) YANBU");
        System.out.println("(4) HAIL");
        System.out.println("(5) ABHA");
        System.out.println("(6) TABUK");
        System.out.println("(7) TAIF\n");
    }

}
