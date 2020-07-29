
public class Passenger {

    private String name;
    private String lastname;

    public Passenger(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.lastname + "\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
    
    public boolean equals(Object compared){
        if(compared == null){
            return false;
        }
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Passenger)){
            return false;   
        }
        
        Passenger comparedPassenger = (Passenger) compared;
        
        if(this.name.equals(comparedPassenger.name) && this.lastname.equals(comparedPassenger.lastname)){
            return true;
        }
        return false;
    }
}
