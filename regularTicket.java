class RegularTicket extends Ticket{

    private String specialServices[];

   RegularTicket(String departurel, String destinationl, String tdDeparture, String tdDestination, String fN,
            String tS, int pI, double tP, int seatNumber) {
        super(departurel, destinationl, tdDeparture, tdDestination, fN, tS, pI, tP, seatNumber);
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