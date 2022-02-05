class Contact extends Address{
    private String name;
    private String emailId;
    private long phoneNumber;

    public Contact(String name,String emailId,long phoneNumber,String address){
        super(address);
        this.name = name;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
       
    }

    public String getName(){
        return this.name;
    }

    public String getEmailId(){
        return this.emailId;
    }

    public long getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getAddress(){
        return super.getAddress();
    }

    public void setName(String name){
      this.name = name;
    }
    public void setEmailId(String emailId){
        this.emailId = emailId;
      }

      public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
      } 
      
      public void setAddress(String address){
        super.setAddress(address);
      }
}
