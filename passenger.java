class Passenger{
    private int passengerId;

    public int getPassengerId(){
        passengerId = (int)(Math.random() * 999999);
        return passengerId;
    }
}