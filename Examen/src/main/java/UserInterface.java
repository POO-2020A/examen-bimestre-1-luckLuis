
import java.util.Scanner;

public class UserInterface {

    private Seat seats;
    private Passenger passenger;
    private Plane plane;
    private Scanner scanner;

    public UserInterface(Passenger passenger, Scanner scanner) {
        this.seats = seats;
        this.passenger = passenger;
        this.plane = plane;
        this.scanner = scanner;
    }

    public void start() {
        int maxRow = 20;
        int maxCol = 8;
        
        
        int rows;
        while (true) {
            System.out.print("Ingrese la cantidad de filas: ");
            rows = Integer.valueOf(scanner.nextLine());
            if (rows <= maxRow) {
                break;
            }
        }
        int cols;
        while (true) {
            System.out.print("Ingrese la cantidad de columnas: ");
            cols = Integer.valueOf(scanner.nextLine());
            if (cols <= maxCol) {
                break;
            }

        }
        
        Plane plane = new Plane(rows, cols);
        System.out.println("Este es el mapa del avión:");
        System.out.println(plane);
    
        while (true) {
            
              this.opciones();
              System.out.print("Ingrese la opción: ");
              int opcion = Integer.valueOf(scanner.nextLine());
              System.out.println(" ");
                            
              if(opcion == 1){
                  System.out.println("Ingresar pasajero:");
                  System.out.print("Ingrese el nombre del pasajero: ");
                  String nombre = scanner.nextLine();
                  System.out.print("Ingrese el apellido del pasajero: ");
                  String apellido = scanner.nextLine();
                  
                  Passenger passenger = new Passenger(nombre, apellido);
                  
                  System.out.println("Ingrese la fila del asiento: ");
                  int fila = Integer.valueOf(scanner.nextLine());
                  System.out.println("Ingrese la columna del asiento: ");
                  String columna = scanner.nextLine();
                  
                  Seat seat = new Seat(fila, columna);
                  
                  System.out.println("¡Pasajero ingresado!");

              }
              
              if(opcion == 2){
                  System.out.println("Consulta el asiento: ");
                  
                  System.out.print("Ingrese la fila del asiento: ");
                  int fila = Integer.valueOf(scanner.nextLine());
                  System.out.print("Ingrese la columna: ");
                  String columna = scanner.nextLine();
                  

                  
                  if(true){
                      System.out.println(this.seats.isFree());
                  }
                  else {
                      System.out.println(this.seats);
                  }
              }
              
              if(opcion == 3){
                  System.out.println("Consulta de pasajero.");
                  System.out.print("Ingresa el nombre y apellido: ");
                  String usuario = scanner.nextLine();
                  String[] partes = usuario.split(" ");

              }
        }

    }
    
    public void opciones(){
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Ingresar pasajero");
        System.out.println("2. Consultar asiento");
        System.out.println("3. Consultar pasajero");
        System.out.println("");
    }
}
