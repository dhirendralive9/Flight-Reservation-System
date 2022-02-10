 class Ticket {
    private int pnr;
    private String departureLocation;
    private String destinationLocation;
    private String timeDataDeparture;
    private String timeDateDestination;
    private String flightName;
    private String ticketStatus;
    private int passengerId;
    private double ticketPrice;
    private int seatNumber;
    

    Ticket(String departurel,String destinationl,String tdDeparture,String tdDestination,String fN,String tS,int pI,double tP,int seatNumber){
       
       this.departureLocation = departurel;
       this.destinationLocation = destinationl;
       this.timeDataDeparture = tdDeparture;
       this.timeDateDestination = tdDestination;
       this.flightName = fN;
       this.ticketStatus = tS;
       this.passengerId = pI;
       this.ticketPrice = tP; 
       this.seatNumber = seatNumber;
    }    //This is a contructor for ticket class 

    public String statusCheck(){     //This wil help us to check the status of the ticket. 
       return this.ticketStatus;
    }

    public void cancellation(){      //This will hep us to cancel the ticket. 
       this.ticketStatus = "Cancelled";
    }

    public String checkDuration(){    //This will return the duration of the flight.
       return "The Duration of the Flight is 3:00 hours";
    }

    public int getPNR(){
       this.pnr = (int)(Math.random() * 999999);
       return this.pnr;
    }
    public String getFlightName(){
       return this.flightName;
    }
    public String getDepartureLocation(){
       return this.departureLocation;
    }
    public String getDestinationlocation(){
       return this.destinationLocation;
    }
    public String getTimeDateDestination(){
       return this.timeDateDestination;
    }

    public String getTimeDateDeparture(){
       return this.timeDataDeparture;
    }
   
    
    public int getSeatnumber(){
       return this.seatNumber;
    }

    public double getTicketPrice(){
       return this.ticketPrice;
    }

    public void setTicketPrice(double ticketprice){
       this.ticketPrice = ticketprice;
    }
     
    public void setSeatnumber(int seatnumber){
       this.seatNumber = seatnumber;
    }
    public void setFlightName(String flightname){
       this.flightName = flightname;
    }

    public void setDepartureLocation(String departureLocation){
      this.departureLocation = departureLocation;
   }
   public void setDestinationlocation(String destinationLocation){
      this.destinationLocation = destinationLocation;
   }
   public void setTimeDateDestination(String timeDateDestination){
     this.timeDateDestination = timeDateDestination;
   }

   public void setTimeDateDeparture(String timeDateDeparture){
     this.timeDataDeparture = timeDateDeparture;
   }

   }
    

