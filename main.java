class Main{

    public static void main(String[] args){
      
        Contact obj = new Contact("Dhirendra Biswal", "btc.xyz@gmail.com", 97789);
        System.out.println("Name:"+obj.getName());
        System.out.println("Email:"+obj.getEmailId());
        System.out.println("Phone:"+obj.getPhoneNumber());
        
        Address obj1 = new Address("Address 124,Ayodhya,Uttar Pradesh");
        System.out.println("Address Object: "+obj1.getAddress());
        Passenger obj3 = new Passenger("Dhirendra Biswal", "Btc.dhirendra@gmail.com", 9778988, "Fake Lane 123,NYC,NY 110001");
        System.out.println(obj3.getPassengerId());
        Flight obj4 = new Flight(6233,"NK-Supreme", "North Korean Best Airline");
         obj4.flightUpdate();

         RegularTicket ticket1 = new RegularTicket(obj3, "departurel", "destinationl", "tdDeparture", "tdDestination", "fN", "tS", 299.99, 123, 6233,"NK-Supreme", "North Korean Best Airline");
         TouristTicket ticket2 = new TouristTicket(obj3, "departurel", "destinationl", "tdDeparture", "tdDestination", "fN", "tS", 299.99, 123,"Sumpreme Hotel", 6233,"NK-Supreme", "North Korean Best Airline");
         
    }
}