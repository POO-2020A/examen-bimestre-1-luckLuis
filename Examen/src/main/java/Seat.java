public class Seat {
    private int row;
    private String col;
    private Passenger passenger;
    
    public Seat(int row, String col){
        this.row = row;
        this.col = col;
    }
    
    public boolean isFree(){
        if(this.passenger == null){
        return true;
        }
        return false;
    } 
    
    @Override
    public String toString(){
        if(this.equals(passenger)){
            return "Asiento: " + this.row + this.col + "libre.";
        }
        return "Asiento: " + this.row + this.col + " ocupado. Pasajero: " + 
                this.passenger.getName() + " " + this.passenger.getLastname();
    }
    
     @Override
    public boolean equals(Object compared){
        if(this == null){
            return false;
        }
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Seat)){
            return false;   
        }
        
        Seat comparedObject = (Seat) compared;
        
        if(this.row == comparedObject.row && this.col == comparedObject.col){
            return true;
        }
         return false;
    }

    public int getRow() {
        return row;
    }

    public String getCol() {
        return col;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    
    
    
}
