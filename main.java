
import java.util.Scanner;

public class Juego {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Entrenador e1 = new Entrenador("Ash");
        Entrenador e2 = new Entrenador("Misty");

        Digievolucion mega = new Digievolucion("Mega", "ataque", 15, 30);
        Digievolucion ultra = new Digievolucion("Ultra", "defensa", 20, 25);
        Digievolucion ultimate = new Digievolucion("Ultimate", "daño", 10, 20);

        e1.agregarDigimon(new Digimon("Agumon", "Fuego", 50, 30, mega));
        e1.agregarDigimon(new Digimon("Palmon", "Planta", 45, 35, ultra));
        e1.agregarDigimon(new Digimon("Patamon", "Eléctrico", 40, 40, ultimate));

        e2.agregarDigimon(new Digimon("Gomamon", "Agua", 48, 28, ultra));
        e2.agregarDigimon(new Digimon("Tentomon", "Planta", 46, 32, mega));
        e2.agregarDigimon(new Digimon("Elecmon", "Eléctrico", 42, 38, ultimate));

        Batalla batalla = new Batalla(e1, e2);
        for (int i = 1; i <= 4; i++) {
            batalla.pelearRonda(i);
            System.out.println();
        }
        batalla.mostrarResultadoFinal();
    }
}