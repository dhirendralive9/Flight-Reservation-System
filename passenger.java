class Passenger{
    private static int idCounter;  //private id for storing unique id for passenger.
    private static Address address; //private object for address class 
    private static Contact contact; //private object for contact class
    private static int passengerCount =0; //This will count passenger objectcreated

    public Passenger(String name,String emailId,long phoneNumber,String addres){
       Passenger.contact = new Contact(name, emailId, phoneNumber);
       Passenger.address =new Address(addres);
       Passenger.idCounter = (int)(Math.random() * 999999);
    }  //here we use constructor, to assign values in the passenger and contact object.


    public int getpassengerCount(){
      return Passenger.passengerCount;
    }

    public int getPassengerId(){  //This will generate userid for passenger.
        
        return Passenger.idCounter;
    }

     public void setContactName(String name){   //Setters for Phone no, email id, phone number and address 
       Passenger.contact.setName(name);
     }
     public void setContactemailId(String emailId){
         Passenger.contact.setEmailId(emailId);
    }
    public void setContactPhoneNumber(long phoneNumber){
         Passenger.contact.setPhoneNumber(phoneNumber);
    }
    public void setPassengerAddress(String address){
         Passenger.address.setAddress(address);
    }

    public String getContactName(){       //getters for contact,email id, phonenumber and address.
        return Passenger.contact.getName();
    }
    public String getContactEmailId(){
        return Passenger.contact.getEmailId();
    }
    public long getContactPhoneNumber(){
        return Passenger.contact.getPhoneNumber();
    }
    public String getPassengerAddress(){
        return Passenger.address.getAddress();
    }
    
}