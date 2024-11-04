package UCAB.proyecto.poo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        System.out.println("¡BIENVENIDO!");
        while(!salir){

            System.out.println();
            System.out.println("Registrar jugador (1)");
            System.out.println("Consultar los jugadores agregados (2)");
            System.out.println("Modificar jugadores");
            System.out.println("Opcion 4 (Salir)");
            System.out.println("Opcion 5");

            System.out.println("Escribe una de las opciones: ");
            opcion = entrada.nextInt();
            Registro registro = new Registro();

            switch (opcion) {
                case 1:
                    System.out.println("Se ha seleccionado registrar a un jugador");
                    Jugador jugador = new Jugador();
                    jugador.establecerAlias();
                    jugador.establecerCorreoElectronico();
                    registro.agregarJugadorArchivo(jugador);

                    break;
                case 2:
                    System.out.println("Los datos de los jugadores agragados son:");
                    registro.consultar();
                    break;
                case 3:
                    System.out.println("Los datos de los jugadores agragados son:");
                    registro.consultar();
                    registro.modificarJugador(registro.seleccionarJugador());


                    break;
                case 4:
                    salir = true;
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5");
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5");
            }
        }


    }
}