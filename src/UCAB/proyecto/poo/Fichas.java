public class Ficha {
    int valor;
    String letra;

    public Ficha(int valor, String letra) {
        this.valor = valor;
        this.letra = letra;
    }

    public String getLetra() {
        return letra;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return letra + " (" + valor +") ";
    }
}
