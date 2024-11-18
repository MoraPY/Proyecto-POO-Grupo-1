import java.util.Scanner;

public class Jugador {
    int id = 0;
    private String correoElectronico;
    private String alias;
    private int scoreTotal;
    private String tiempoJugado;
    private final Ficha[] fichas = new Ficha[7];

    public Ficha[] getFichas() {
        return fichas;
    }

    public String mostrarFichas() {
        StringBuilder atril = new StringBuilder();
        for (Ficha ficha : this.fichas) {
            if (ficha != null) {
                atril.append(ficha.letra);
            } else {
                atril.append(" _ ");
            }
        }
        return atril.toString();
    }

    public void jugarFichas(Tablero tablero, int fila, int columna, int indexFichas) {
        if(tablero.colocarFicha(fila, columna, fichas[indexFichas])) {
            fichas[indexFichas] = null;
        }
    }

    public void rellenarFichas(BolsaFichas bolsaFichas) {
        for (int i = 0; i < 7; i++) {
            int randomIndex = (int) (Math.random() * (bolsaFichas.getListaFichas().size()-1));
            if(fichas[i] == null) {
                fichas[i] = bolsaFichas.getListaFichas().get(randomIndex);
                bolsaFichas.getListaFichas().remove(randomIndex);
            }
        }
    }

    public Jugador(){}

    public Jugador(String alias, String correoElectronico) {
        this.correoElectronico = correoElectronico;
        this.alias = alias;
        this.scoreTotal = 0;
        this.tiempoJugado = "0";
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




