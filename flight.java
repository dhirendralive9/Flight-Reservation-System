class Flight {
    private int flightNumber;
    private int flightCapacity;
    private int seatBooked;
    private String airLine;
    private String flightName;

     Flight(int flightNumber,int flightCapacity,int seatBooked,String airLine,String flightName){
        this.flightNumber = flightNumber;
        this.flightCapacity = flightCapacity;
        this.seatBooked = seatBooked;
        this.airLine = airLine;
        this.flightName = flightName;
    }

    public void seatBook(int numberOfSeats){
        seatBooked = seatBooked-numberOfSeats;
    }

    public void flightUpdate(){
        System.out.println("Flight Name: "+flightName);
        System.out.println("Flight Number: "+flightNumber);
        System.out.println("Flight AirLine: "+airLine);
        System.out.println("Flight Capacity: "+flightCapacity);
        System.out.println("Seat Available: "+(flightCapacity-seatBooked));
    }

}
