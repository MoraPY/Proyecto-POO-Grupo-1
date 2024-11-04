package UCAB.proyecto.poo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registro {
    private static final String NOMBRE_ARCHIVO = "jugador.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static List<Jugador> jugadores;
    Scanner entrada = new Scanner(System.in);


    public void consultar(){
        int contador = 0;
        for (Jugador jugador : jugadores){
            contador++;
            System.out.println("Jugador " + contador);
            System.out.println(jugador.getAlias());
            System.out.println(jugador.getCorreoElectronico());
        }
    }

    public void agregarJugadorArchivo(Jugador jugador) {
        System.out.println("AUN SIRVE");
        jugadores = cargarJugadores();
        jugadores.add(jugador);


        try (FileWriter fileWriter = new FileWriter(NOMBRE_ARCHIVO)) {
            gson.toJson(jugadores, fileWriter);
            System.out.println("El jugador ha sido agregado al archivo " + NOMBRE_ARCHIVO);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar el archivo: " + e.getMessage());
        }
    }

    private List<Jugador> cargarJugadores() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) {

            return new ArrayList<>();
        }

        try (FileReader fileReader = new FileReader(archivo)) {
            Type tipoListaJugadores = new TypeToken<List<Jugador>>() {}.getType();
            return gson.fromJson(fileReader, tipoListaJugadores);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al cargar el archivo: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public Jugador seleccionarJugador(){

        System.out.println("Seleccione el numero de jugador a modificar");
        int numeroJugador = entrada.nextInt();
        numeroJugador = entrada.nextInt();
        return jugadores.get(numeroJugador-1);
    }
    public void modificarJugador(Jugador jugador) {
        System.out.println("Seleccione el campo a modificar: \nAias(1) \nCorreo Electronico(2)");
        int campoModificar = entrada.nextInt();

        if (campoModificar == 1) {
            String modificar = entrada.next();
            jugador.setAlias(modificar);
        }
        if (campoModificar == 2) {
            String modificar = entrada.next();
            jugador.setCorreoElectronico(modificar);
        }
    }
}