package src;

import src.Clases.*;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Turno> Turnos = new LinkedList<>();
        Stack<Turno> TurnosAtendidos = new Stack<>();

        Metodos m = new Metodos();
        int opt = 1;
        do {
            try {
                m.mostrarMenu(sc);
                opt = sc.nextInt();
                sc.nextLine(); // Clear the buffer
                switch (opt) {
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    case 1:
                        m.nuevoTurno(Turnos, sc);
                        break;
                    case 2:
                        m.verSigTurno(Turnos);
                        break;
                    case 3:
                        m.atenderSigTurno(Turnos, TurnosAtendidos);
                        break;
                    case 4:
                        m.verTurnosAtendidos(TurnosAtendidos);
                        break;
                    case 5:
                        m.verTurnosPendientes(Turnos);
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 3.");
                }

                if (opt != 0) {
                    System.out.println();
                    System.out.print("Presiona Enter para continuar...");
                    sc.nextLine();
                    System.out.println();
                }

            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
                sc.nextLine(); // Clear the buffer
            }
        } while (opt != 0);
        sc.close();
    }
}

