import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Queue<Paciente> colaPacientes = new LinkedList<>();

        int opcion = 0;
        int numeroTurno = 1;
        int maximoTurnos = 5;

        while (opcion != 4) {

            System.out.println("\n===== SISTEMA DE TURNOS MEDICOS =====");
            System.out.println("1. Tomar turno");
            System.out.println("2. Hacerse atender");
            System.out.println("3. Ver estado de la cola");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("Parte 2 pendiente: aqui se tomara el turno.");
                    break;

                case 2:
                    System.out.println("Parte 3 pendiente: aqui se atendera al paciente.");
                    break;

                case 3:
                    System.out.println("Parte 4 pendiente: aqui se vera el estado de la cola.");
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }

        entrada.close();
    }
}

class Paciente {
    String nombre;
    int numeroTurno;

    public Paciente(String nombre, int numeroTurno) {
        this.nombre = nombre;
        this.numeroTurno = numeroTurno;
    }
}
