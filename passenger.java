class Passenger{
    private int passengerId; //private id for storing unique id for passenger.
    private Address address; //private object for address class 
    private Contact contact; //private object for contact class

    public Passenger(String name,String emailId,long phoneNumber,String addres){
       contact = new Contact(name, emailId, phoneNumber);
       address = new Address(addres);
    }  //here we use constructor, to assign values in the passenger and contact object.


    public int getPassengerId(){  //This will generate userid for passenger.
        passengerId = (int)(Math.random() * 999999);
        return passengerId;
    }

     public void setContactName(String name){   //Setters for Phone no, email id, phone number and address 
       this.contact.setName(name);
     }
     public void setContactemailId(String emailId){
         this.contact.setEmailId(emailId);
    }
    public void setContactPhoneNumber(long phoneNumber){
         this.contact.setPhoneNumber(phoneNumber);
    }
    public void setPassengerAddress(String address){
         this.address.setAddress(address);
    }

    public String getContactName(){       //getters for contact,email id, phonenumber and address.
        return this.contact.getName();
    }
    public String getContactEmailId(){
        return this.contact.getEmailId();
    }
    public long getContactPhoneNumber(){
        return this.contact.getPhoneNumber();
    }
    public String getPassengerAddress(){
        return this.address.getAddress();
    }
    
}