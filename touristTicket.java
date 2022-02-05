class TouristTicket extends Ticket {
    private String hotelAddress;
    
    TouristTicket(int pnr,String departurel,String destinationl,String tdDeparture,String tdDestination,String fN,String tS,int pI,double tP,int seatNumber,String hA){
        super(pnr, departurel, destinationl, tdDeparture, tdDestination, fN, tS, pI, tP, seatNumber);
        this.hotelAddress = hA;
        
    }

    public String getHotelAddress(){
        return this.hotelAddress;
    }
    public void setHotelAddress(String hA){
        this.hotelAddress = hA;
    }
}
