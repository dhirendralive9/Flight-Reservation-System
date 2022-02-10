class Flight {
    private int flightNumber;
    private int flightCapacity =200;
    private int seatBooked;
    private String airLine;
    private String flightName;
    private int seatAvialable = 200;

     Flight(int flightNumber,String airLine,String flightName){  //This is a flight constructor 
        this.flightNumber = flightNumber;
        
        this.airLine = airLine;
        this.flightName = flightName;
    }

    public void seatBook(int numberOfSeats){     //This will take the number of seat booked and update the seat available 
        this.seatBooked = this.seatBooked+numberOfSeats;
        this.seatAvialable = this.flightCapacity-this.seatBooked;
    }
    public int seatAvialable(){  //This will show the avilable flight seat available 
      return this.seatAvialable;
    }

    public int getFlightCapacity(){    //This will return the flight capacity
        return this.flightCapacity;
    }

    public void flightUpdate(){     //This will display the entire flight details 
        System.out.println("Flight Name: "+flightName);
        System.out.println("Flight Number: "+flightNumber);
        System.out.println("Flight AirLine: "+airLine);
        System.out.println("Flight Capacity: "+flightCapacity);
        System.out.println("Seat Available: "+(flightCapacity-seatBooked));
    }

}
