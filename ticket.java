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
    

    Ticket(int pnr,String departurel,String destinationl,String tdDeparture,String tdDestination,String fN,String tS,int pI,double tP,int seatNumber){
       this.pnr = pnr;
       this.departureLocation = departurel;
       this.destinationLocation = destinationl;
       this.timeDataDeparture = tdDeparture;
       this.timeDateDestination = tdDestination;
       this.flightName = fN;
       this.ticketStatus = tS;
       this.passengerId = pI;
       this.ticketPrice = tP; 
       this.seatNumber = seatNumber;
    }

    public String statusCheck(){
       return this.ticketStatus;
    }

    public void cancellation(){
       this.ticketStatus = "Cancelled";
    }



 }
    

