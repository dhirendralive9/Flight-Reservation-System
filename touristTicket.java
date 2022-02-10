class TouristTicket extends Ticket {
    private String hotelAddress;
    private String tourLocations[];
    
    TouristTicket(String departurel,String destinationl,String tdDeparture,String tdDestination,String fN,String tS,int pI,double tP,int seatNumber,String hA){
        super(departurel, destinationl, tdDeparture, tdDestination, fN, tS, pI, tP, seatNumber);
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
