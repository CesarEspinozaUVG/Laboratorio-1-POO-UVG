public class Digimon {
    private String nombre;
    private String tipo;
    private int ataque;
    private int defensa;
    private Digievolucion digievolucion;

    public Digimon(String nombre, String tipo, int ataque, int defensa, Digievolucion digievolucion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.digievolucion = digievolucion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public Digievolucion getDigievolucion() {
        return digievolucion;
    }

    public boolean usarHabilidad() {
        return digievolucion.activar();
    }

    public int calcularAtaqueTotal(Digimon enemigo) {
        int bono = Batalla.calcularVentajaTipo(this.tipo, enemigo.getTipo());
        int ataqueTotal = this.ataque + bono;

        if (usarHabilidad()) {
            String efecto = digievolucion.getEfecto();
            int valor = digievolucion.getValor();

            switch (efecto.toLowerCase()) {
                case "ataque":
                    ataqueTotal += valor;
                    break;
                case "defensa":
                    ataqueTotal += this.defensa;
                    break;
                case "daño":
                    ataqueTotal += valor;
                    break;
            }
        }
        return ataqueTotal;
    }
}
