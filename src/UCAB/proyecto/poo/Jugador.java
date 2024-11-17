package UCAB.proyecto.poo;
import java.util.Scanner;

public class Jugador {
    int id = 0;
    private String correoElectronico;
    private String alias;
    private int scoreTotal = 0;
    private String tiempoJugado = "0";
    

    public Jugador(){}

    public Jugador(String alias, String correoElectronico) {
        this.correoElectronico = correoElectronico;
        this.alias = alias;
    }
    public String getAlias() {
        return alias;
    }

    public int getId() {
        return id;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    
    public int getScoreTotal() {
        return scoreTotal;
    }

    
    public String getTiempoJugado() {
        return tiempoJugado;
    }

    public void establecerAlias() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("¡Ingrese su alias! \n");
                String entrada = scanner.nextLine();

                if (entrada.trim().isEmpty()) {
                    throw new IllegalArgumentException("El alias no puede estar vacío.");
                }

                this.alias = entrada;
                break;
            } catch (IllegalArgumentException exepcion) {
                System.out.println("Error! " + exepcion.getMessage());
                System.out.println("Intenta de nuevo.");
            }
        }
    }

    public void establecerCorreoElectronico() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("¡Ingrese su correo electronico! \n");
                String entrada = scanner.nextLine();

                if (entrada.trim().isEmpty()) {
                    throw new IllegalArgumentException("El correo electronico no puede estar vacío.");
                }

                if (!entrada.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                    throw new IllegalArgumentException("El correo es invalido. ");
                }

                this.correoElectronico = entrada;
                break;
            } catch (IllegalArgumentException exepcion) {
                System.out.println("Error! " + exepcion.getMessage());
                System.out.println("Intenta de nuevo.");
            }
        }
    }

    public void establecerId(){

    }



}




