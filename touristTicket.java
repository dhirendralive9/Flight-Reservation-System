class TouristTicket extends Ticket {
    private String hotelAddress;
    private String tourLocations[];
    
    TouristTicket(Passenger passenger,String departurel,String destinationl,String tdDeparture,String tdDestination,String fN,String tS,double tP,int seatNumber,String hA,int flightNumber,String airLine,String flightName){
        super(passenger,departurel, destinationl, tdDeparture, tdDestination, fN, tS, tP, seatNumber,flightNumber,airLine,flightName);
        this.hotelAddress = hA;
        
    }

    public String getHotelAddress(){    //fetch hotel address 
        return this.hotelAddress;
    }
    public void setHotelAddress(String hA){    //setting hotel address 
        this.hotelAddress = hA;
    }
    public void setTouristLocations(String tourlocations[]){   //setting tourist locations 
        this.tourLocations = new String[5];
         this.tourLocations = tourlocations; 
    }
    public String[] getTouristLocations(){    //fetching tourist locations 
        return this.tourLocations;
    }
}
