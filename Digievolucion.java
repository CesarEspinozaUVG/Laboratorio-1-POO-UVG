public class Digievolucion {
    private String nombre;
    private String efecto;
    private int valor;
    private int probabilidad;

    public Digievolucion(String nombre, String efecto, int valor, int probabilidad) {
        this.nombre = nombre;
        this.efecto = efecto;
        this.valor = valor;
        this.probabilidad = probabilidad;
    }

    public boolean activar() {
        int random = (int)(Math.random() * 100);
        return random < probabilidad;
    }

    public String getEfecto() {
        return efecto;
    }

    public int getValor() {
        return valor;
    }
}
