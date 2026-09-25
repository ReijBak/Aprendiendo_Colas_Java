package src;

import src.Clases.*;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Metodos {

    public void mostrarMenu(Scanner sc) {
            System.out.println("\n==========================================================\n");
            System.out.println("           BIENVENIDO AL INTENTO DE SISTEMA DE TURNOS          ");
            System.out.println("\n==========================================================\n");
            System.out.println("Ingrese el número de la funcionalidad que desea ejecutar (1-3): ");
            System.out.println("1. Ingresar un nuevo turno");
            System.out.println("2. Ver siguiente turno");
            System.out.println("3. Atender siguiente turno");
            System.out.println("4. Ver turnos atendidos");
            System.out.println("5. Ver turnos pendientes");
            System.out.println("Presione 0 para salir.");
    }

    public Queue<Turno> nuevoTurno (Queue<Turno> Turnos, Scanner sc) {
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su pedido: ");
        String descripcion = sc.nextLine();
        Turno nuevoTurno = new Turno(nombre, descripcion);
        boolean agregarTurno = Turnos.offer(nuevoTurno);
        if (agregarTurno) {
            System.out.println("Pedido ingresado correctamente.");
        } else {
            System.out.println("No se pudo ingresar el turno.");
        }
        return Turnos;
    }

    public void verSigTurno (Queue<Turno> turnos) {
        if (!turnos.isEmpty()) {
            Turno sigTurno = turnos.peek();
            sigTurno.mostrarTurno();
            System.out.println("==========================================================");
        } else  {
            System.out.println("No hay ningun turno en cola.");
        }
    }

    public void atenderSigTurno (Queue<Turno> turnos, Stack<Turno> TurnosAtendidos) {
        Turno turnoAtendido = turnos.poll();
        if (turnoAtendido != null) {
            System.out.println("Atendiendo turno...");
            turnoAtendido.setEstado(1);
            TurnosAtendidos.push(turnoAtendido);
            System.out.println("Turno atendido correctamente.");
        } else {
            System.out.println("No hay turnos por atender");
        }
    }

    public void verTurnosAtendidos (Stack<Turno> TurnosAtendidos){
        if (!TurnosAtendidos.isEmpty()) {
            for (Turno t : TurnosAtendidos) {
                if (t.getEstado() == 1) {
                    t.mostrarTurno();
                }
            }
            System.out.println("==========================================================");
        } else {
            System.out.println("No hay turnos atendidos");
        }
    }

    public void verTurnosPendientes (Queue<Turno> TurnosPendientes) {
        if (!TurnosPendientes.isEmpty()) {
            for (Turno t : TurnosPendientes) {
                if (t.getEstado() == 0) {
                    t.mostrarTurno();
                }
            }
            System.out.println("==========================================================");
        } else  {
            System.out.println("No hay turnos pendientes por atender");
        }
    }
}


