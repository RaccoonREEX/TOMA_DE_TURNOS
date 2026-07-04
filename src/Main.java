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
                    if (numeroTurno <= maximoTurnos) {

                        System.out.print("Ingrese el nombre del paciente: ");
                        String nombre = entrada.nextLine();

                        Paciente nuevoPaciente = new Paciente(nombre, numeroTurno);

                        colaPacientes.add(nuevoPaciente);

                        System.out.println("Paciente registrado correctamente.");
                        System.out.println("Nombre: " + nuevoPaciente.nombre);
                        System.out.println("Su numero de turno es: " + nuevoPaciente.numeroTurno);

                        numeroTurno++;

                    } else {
                        System.out.println("Ya no se pueden registrar mas pacientes en este momento.");
                    }
                    break;

                case 2:
                    if (colaPacientes.isEmpty()) {

                        System.out.println("No hay pacientes en espera.");

                    } else {

                        Paciente siguiente = colaPacientes.peek();

                        System.out.println("El siguiente paciente es:");
                        System.out.println("Nombre: " + siguiente.nombre);
                        System.out.println("Turno: " + siguiente.numeroTurno);

                        System.out.print("Ingrese su numero de turno para ser atendido: ");
                        int turnoIngresado = entrada.nextInt();
                        entrada.nextLine();

                        if (turnoIngresado == siguiente.numeroTurno) {

                            Paciente pacienteAtendido = colaPacientes.poll();

                            System.out.println("El paciente " + pacienteAtendido.nombre + " ha sido atendido.");
                            System.out.println("Pacientes en espera: " + colaPacientes.size());

                        } else {

                            System.out.println("Ese turno no corresponde al siguiente paciente.");
                            System.out.println("Debe ser atendido el turno: " + siguiente.numeroTurno);
                        }
                    }
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
