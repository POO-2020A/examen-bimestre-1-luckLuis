
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Passenger pasajero = new Passenger("", "");
        Scanner scanner = new Scanner(System.in);
        
        UserInterface interf = new UserInterface(pasajero , scanner);
        interf.start();
        
        System.out.println(pasajero);

    }
}
