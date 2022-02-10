class Flight {
    private int flightNumber;
    private int flightCapacity =200;
    private int seatBooked;
    private String airLine;
    private String flightName;
    private int seatAvialable = 200;

     Flight(int flightNumber,String airLine,String flightName){
        this.flightNumber = flightNumber;
        
        this.airLine = airLine;
        this.flightName = flightName;
    }

    public void seatBook(int numberOfSeats){
        this.seatBooked = this.seatBooked+numberOfSeats;
        this.seatAvialable = this.flightCapacity-this.seatBooked;
    }
    public int seatAvialable(){
      return this.seatAvialable;
    }

    public int getFlightCapacity(){
        return this.flightCapacity;
    }

    public void flightUpdate(){
        System.out.println("Flight Name: "+flightName);
        System.out.println("Flight Number: "+flightNumber);
        System.out.println("Flight AirLine: "+airLine);
        System.out.println("Flight Capacity: "+flightCapacity);
        System.out.println("Seat Available: "+(flightCapacity-seatBooked));
    }

}
