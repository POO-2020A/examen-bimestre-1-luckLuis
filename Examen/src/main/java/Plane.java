
import java.util.ArrayList;

public class Plane {

    private ArrayList<Seat> seats;
    private int rows;
    private int cols;

    public Plane(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.seats = new ArrayList<>();
    }
    
@Override
    public String toString() {
                    
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H"};
        String tabla = "";
        

        for (int i = 0; i < this.rows; i++) {
            tabla += (i + 1) + " ";

            for (int j = 0; j < this.cols; j++) {
                
                tabla += letras[j] + " ";
            }
            tabla += "\n";
        }
        return tabla;
    }
    
    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }
    
    
}
