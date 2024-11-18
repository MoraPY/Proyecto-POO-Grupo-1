public class Main {
    public static void main(String[] args) {
       BolsaFichas bf = new BolsaFichas();

       Jugador jugador = new Jugador();
       jugador.rellenarFichas(bf);
       System.out.println(jugador.mostrarFichas());

       Tablero tablero = new Tablero();
       tablero.mostrarTablero();

       jugador.jugarFichas(tablero, 7, 7,  5 );
        System.out.println(jugador.mostrarFichas());
       jugador.rellenarFichas(bf);
        System.out.println(jugador.mostrarFichas());
       tablero.mostrarTablero();
        jugador.jugarFichas(tablero, 7, 7,  5 );
        System.out.println(jugador.mostrarFichas());
        tablero.mostrarTablero();
        jugador.jugarFichas(tablero, 8, 8,  5 );
        System.out.println(jugador.mostrarFichas());
        tablero.mostrarTablero();

    }
}