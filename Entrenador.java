import java.util.ArrayList;

public class Entrenador {
    private String nombre;
    private ArrayList<Digimon> digimons;
    private ArrayList<Digimon> digimonsUsados;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.digimons = new ArrayList<>();
        this.digimonsUsados = new ArrayList<>();
    }

    public void agregarDigimon(Digimon digimon) {
        digimons.add(digimon);
    }

    public Digimon seleccionarDigimon() {
        for (Digimon d : digimons) {
            if (!digimonsUsados.contains(d)) {
                digimonsUsados.add(d);
                return d;
            }
        }
        return null;
    }

    public void marcarComoUsado(Digimon digimon) {
        if (!digimonsUsados.contains(digimon)) {
            digimonsUsados.add(digimon);
        }
    }

    public String getNombre() {
        return nombre;
    }
}
