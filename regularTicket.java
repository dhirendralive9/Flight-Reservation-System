class RegularTicket extends Ticket{

    private String specialServices[];  //private varialbe to store the special services 

   RegularTicket(Passenger passenger,String departurel, String destinationl, String tdDeparture, String tdDestination, String fN,
            String tS, double tP, int seatNumber,int flightNumber,String airLine,String flightName) {
        super(passenger,departurel, destinationl, tdDeparture, tdDestination, fN, tS,tP, seatNumber,flightNumber,airLine,flightName);
        //TODO Auto-generated constructor stub
    }
    
     public void setSpecialServiceRequest(String special[]){     //adding special service requests.
            this.specialServices = new String[3];
           this.specialServices = special;
     }
     public String[] getSpecialServiceRequest(){     //fetching special service request
         return this.specialServices;
     }

}