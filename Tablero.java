import java.util.Arrays;

public class Tablero {
    private final Ficha[][] tablero;
    private final Ficha casillaVacia = new Ficha(0, " ");

    public String getCasillaVacia() {
        return casillaVacia.letra;
    }

    public Tablero() {
        tablero = new Ficha[15][15];
        for (int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], casillaVacia);
        }
    }

    public boolean validarFichaPosicion(int fila, int columna) {
        if (fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero.length) {
            return tablero[fila][columna].equals(casillaVacia);
        }
        return false;
    }

    public boolean colocarFicha(int fila, int columna, Ficha ficha) {
        if (validarFichaPosicion(fila, columna) && ficha != null) {
            this.tablero[fila][columna] = ficha;
            return true;
        }
        return false;
    }

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.print("\n");
        }
    }
}
