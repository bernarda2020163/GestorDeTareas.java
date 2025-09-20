package latinasincloud;
// import java.util.*;  // importar todas las herramientas en util
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    // declarar la variable publica en el Main

    private static List<String> tareas = new ArrayList<String>();   // variable privada, de un procedimiento estatico y declarando
    private static Scanner scanner = new Scanner(
            System.in
    );

    public static void main(String[] args) {

        /// ----------------------------------------------
        // Ejercicio Gestor de Tareas
        // Crear un programa que permita gestionar tareas pendientes usando una Lista (Colección)
        //y funcionaes para cada operación.

        // Requisitos
        //1 ) Funciones para:
        // Añadir tarea
        // Eliminar tarea
        // Mostrar todas las tareas
        // Buscar tarea por palabra Clave

        // 2) Usar List <String> para almacenar las tareas

        int opcion = 0;
        do {
            System.out.println("--- Gestor de tareas v2 ---");
            System.out.println("1. Agregar tarea.");
            System.out.println("2. Eliminar tarea.");
            System.out.println("3. Mostrar tareas.");
            System.out.println("4. Buscar tarea.");
            System.out.println("5. Salir.");
            System.out.print("> Ingrese una opción: ");
            opcion = scanner.nextInt();
            //Limpieza de buffer
            scanner.nextLine();
        // que eligio el usuario
            switch (opcion){
                case 1:
                    agregarTarea(); //procedimiento
                    break;
                case 2:
                    eliminarTarea();
                    break;
                case 3: mostrarTareas();
                    break;
                case 4: buscarTarea();
                    break;
                case 5:
                    System.out.println("Hasta luego!");
                    break;
                default: System.out.println("Opción incorrecta.");
                break; }
        } while (opcion !=5);
        scanner.close();

    }
    /// fuera de Main agrego mis procedimientos por que no retornan valor
    private static void agregarTarea(){
        System.out.print("> Ingrese su tarea: "); // ingreso la tarea
        String tarea = scanner.nextLine(); // leo la tarea
        if(tarea.isEmpty()) {
            System.out.println("La tarea no puede ser vacía."); //validacion de scanner
            return;
        }
        tareas.add(tarea);
        System.out.println("La tarea ha sido agregada.");
    }

    private static void eliminarTarea() {
        System.out.print("> Ingrese el índice de la tarea a eliminar: ");
        int indice = scanner.nextInt();
        //Limpieza de buffer
        scanner.nextLine();
        String tareaEncontrada = tareas.get(indice);
        if (tareaEncontrada.isEmpty()) {
            System.out.println("No existe tarea en el índice ingresado.");
            return;
        }
        tareas.remove(indice);
        System.out.println("La tarea ha sido eliminada");
    }

    private static void mostrarTareas(){
        if(tareas.isEmpty()){
            System.out.println("No hay tareas registradas.");
        } else { for (int i = 0; i < tareas.size(); i++) {
            System.out.printf("Índice: %d - Tarea: %s.\n", i, tareas.get(i)); //permite incrustar un texto en formato
        }
      }
     }
    private static void buscarTarea() {
        System.out.print(" > Ingrese palabra clave para buscar: ");
        String palabraClave = scanner.nextLine();
        boolean encontreResultados = false;
        for (String tarea : tareas) {
            if (tarea.toLowerCase().contains(palabraClave.toLowerCase())) {
                encontreResultados = true;
                System.out.printf("indice: %d - Tarea: %s.\n", tareas.indexOf(tarea), tarea);
            }
        }
         if (!encontreResultados) {
            System.out.println("No hay tareas con palabra clave:");
      }
    }
}