public class Flight {

    private String flightNumber, date, departureTime, arrivalTime;
    private int gate, destination;
    public static int totalFlights = 0; 
    private String[] citys = {"DAMAMM", "JEDDAH", "YANBU", "HAIL", "ABHA", "TABUK", "TAIF"};

    public Flight() {
        this.flightNumber = "";
        this.date = "";
        this.departureTime = "";
        this.arrivalTime = "";
        this.destination = 0;
        this.gate = 0;
        Flight.totalFlights++;

    }

    public Flight(int destination, String date, int gate, String departure) {
        Flight.totalFlights++;
        this.destination = destination;
        this.flightNumber = generateFlightNumber();
        this.date = date;
        this.departureTime = departure;
        this.arrivalTime = calculateArrivalTime();
        this.gate = gate;
    }

    private String generateFlightNumber() {
        return this.citys[this.destination - 1].substring(0,3) + "00" + Flight.totalFlights;
    }

    private String calculateArrivalTime() {
        int timeToArrival = 0;
        switch (destination){
            case 1: 
                timeToArrival = 65;
                break;
            case 2: 
            case 3:
            case 4: 
                timeToArrival = 105;
                break;
            case 5: 
                timeToArrival = 75;
                break;
            case 6: 
                timeToArrival = 80;
                break;
            case 7: 
                timeToArrival = 95;
                break;
        }
        
        int hours = Integer.parseInt(this.departureTime.substring(0,2));
        int minutes =Integer.parseInt(this.departureTime.substring(3)) + timeToArrival; 
        int days = 0;
        while(minutes >= 60){
            hours += 1;
            minutes -= 60;
            if(hours >= 24 ){
                days += 1;
                hours = 0;
            }
        }
        
        String str = (hours < 10 ? "0" + hours : hours + "") 
                + ":" + (minutes < 10 ? "0" + minutes : minutes + "") ;
        if(days > 0) return str + " +" + days;
        return str;
    }
    
    public void printFlightInfo(){
        System.out.println("\nFlight Info:");
        System.out.printf("%-30s %-15s %n","Flight Number: " + this.flightNumber , "Gate: " + this.gate);
        System.out.printf("%-30s %-15s %n","Destination: " + this.citys[this.destination - 1] , "Date: " + this.date);
        System.out.printf("%-30s %-15s %n","Departure Time: " + this.departureTime , "Arrival Time: " + this.arrivalTime);
        System.out.println("");
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
        this.arrivalTime = calculateArrivalTime();
    }

    public void setGate(int gate) {
        this.gate = gate;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDate() {
        return date;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public int getGate() {
        return gate;
    }

    public int getDestination() {
        return destination;
    }

}
