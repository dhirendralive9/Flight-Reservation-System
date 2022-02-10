class Contact {
    private String name;
    private String emailId;
    private long phoneNumber;

    public Contact(String name,String emailId,long phoneNumber){
        
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
    

    public void setName(String name){
      this.name = name;
    }
    public void setEmailId(String emailId){
        this.emailId = emailId;
      }

      public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
      } 
      
      
}
