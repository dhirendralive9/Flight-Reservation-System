class RegularTicket extends Ticket{

    String specialServices[];

   RegularTicket(int pnr, String departurel, String destinationl, String tdDeparture, String tdDestination, String fN,
            String tS, int pI, double tP, int seatNumber) {
        super(pnr, departurel, destinationl, tdDeparture, tdDestination, fN, tS, pI, tP, seatNumber);
        //TODO Auto-generated constructor stub
    }
    
     public void setSpecialServiceRequest(String specialString[]){
           
     }

}