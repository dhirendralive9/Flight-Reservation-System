class Main{

    public static void main(String[] args){

        
      
        Contact obj = new Contact("Dhirendra Biswal", "btc.xyz@gmail.com", 97789);   //creating a contact object and printing its details 
        System.out.println("Name:"+obj.getName());
        System.out.println("Email:"+obj.getEmailId());
        System.out.println("Phone:"+obj.getPhoneNumber());
        
        Address obj1 = new Address("Address 124,Ayodhya,Uttar Pradesh");   //creating a address object
        System.out.println("Address Object: "+obj1.getAddress());   //creating a address object 
        Passenger obj3 = new Passenger("Dhirendra Biswal", "Btc.dhirendra@gmail.com", 9778988, "Fake Lane 123,NYC,NY 110001");  //creating a passenger class 
        System.out.println(obj3.getPassengerId());    //this will get the passenger id which is unique
        Flight obj4 = new Flight(6233,"NK-Supreme", "North Korean Best Airline");  //creating a flight class, objct
         obj4.flightUpdate();
         //creating the regular ticket and tourist ticket class 
         RegularTicket ticket1 = new RegularTicket(obj3, "departurel", "destinationl", "tdDeparture", "tdDestination", "fN", "tS", 299.99, 123, 6233,"NK-Supreme", "North Korean Best Airline");
         TouristTicket ticket2 = new TouristTicket(obj3, "departurel", "destinationl", "tdDeparture", "tdDestination", "fN", "tS", 299.99, 123,"Sumpreme Hotel", 6233,"NK-Supreme", "North Korean Best Airline");
         printTicketDetails(ticket1);
         printTicketDetails(ticket2);
         
         

    }

    public static void printTicketDetails(Ticket ticket){   //this will take a ticket class and print the inr 
           System.out.println("PNR: "+ticket.getPNR()); 
    }

}