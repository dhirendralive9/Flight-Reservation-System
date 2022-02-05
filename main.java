class Main{

    public static void main(String[] args){
      
        Contact obj = new Contact("Dhirendra Biswal", "btc.xyz@gmail.com", 97789,"address 124,Ayodhya,Uttar Pradesh");
        System.out.println("Name:"+obj.getName());
        System.out.println("Email:"+obj.getEmailId());
        System.out.println("Phone:"+obj.getPhoneNumber());
        System.out.println("Address:"+obj.getAddress());
        Address obj1 = new Address("Address 124,Ayodhya,Uttar Pradesh");
        System.out.println("Address Object: "+obj1.getAddress());
        Passenger obj3 = new Passenger();
        System.out.println(obj3.getPassengerId());
        Flight obj4 = new Flight(6233, 199, 54, "NK-Supreme", "North Korean Best Airline");
         obj4.flightUpdate();

         RegularTicket ticket1 = new RegularTicket(112233, "departurel", "destinationl", "tdDeparture", "tdDestination", "123", "tS", 12, 5056.00, 345);
         TouristTicket ticket2 = new TouristTicket(112233, "departurel", "destinationl", "tdDeparture", "tdDestination", "123", "tS", 12, 5056.00, 345,"Hotel one");
    }
}