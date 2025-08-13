public class Batalla {
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private int rondasGanadas1;
    private int rondasGanadas2;

    public Batalla(Entrenador e1, Entrenador e2) {
        this.entrenador1 = e1;
        this.entrenador2 = e2;
        this.rondasGanadas1 = 0;
        this.rondasGanadas2 = 0;
    }

    public void pelearRonda(int ronda) {
        Digimon d1 = entrenador1.seleccionarDigimon();
        Digimon d2 = entrenador2.seleccionarDigimon();

        int ataque1 = d1.calcularAtaqueTotal(d2);
        int ataque2 = d2.calcularAtaqueTotal(d1);

        System.out.println("Ronda " + ronda + ":");
        System.out.println(entrenador1.getNombre() + " usó " + d1.getNombre() + " con " + ataque1 + " puntos.");
        System.out.println(entrenador2.getNombre() + " usó " + d2.getNombre() + " con " + ataque2 + " puntos.");

        if (ataque1 > ataque2) {
            rondasGanadas1++;
            System.out.println(entrenador1.getNombre() + " gana la ronda.");
        } else if (ataque2 > ataque1) {
            rondasGanadas2++;
            System.out.println(entrenador2.getNombre() + " gana la ronda.");
        } else {
            System.out.println("La ronda termina en empate.");
        }
    }

    public void mostrarResultadoFinal() {
        System.out.println("Resultado Final:");
        if (rondasGanadas1 > rondasGanadas2) {
            System.out.println(entrenador1.getNombre() + " gana el combate.");
        } else if (rondasGanadas2 > rondasGanadas1) {
            System.out.println(entrenador2.getNombre() + " gana el combate.");
        } else {
            System.out.println("El combate termina en empate.");
        }
    }

    public static int calcularVentajaTipo(String tipo1, String tipo2) {
        if (tipo1.equals("Fuego") && tipo2.equals("Planta")) return 20;
        if (tipo1.equals("Planta") && tipo2.equals("Agua")) return 20;
        if (tipo1.equals("Agua") && tipo2.equals("Fuego")) return 20;
        if (tipo1.equals("Eléctrico") && tipo2.equals("Agua")) return 20;
        if (tipo2.equals("Fuego") && tipo1.equals("Agua")) return -10;
        if (tipo2.equals("Planta") && tipo1.equals("Fuego")) return -10;
        if (tipo2.equals("Agua") && tipo1.equals("Planta")) return -10;
        return 0;
    }
}
