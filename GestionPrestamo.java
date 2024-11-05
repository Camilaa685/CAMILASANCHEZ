import java.util.ArrayList;
import java.util.Scanner;

public class GestionPrestamo {
    // ArrayLists para almacenar los registros de estudiantes y equipos (vectores dinámicos)
    static ArrayList<EstudianteIngenieria> vectorIngenieros = new ArrayList<>();
    static ArrayList<EstudianteDiseño> vectorDisenadores = new ArrayList<>();
    static ArrayList<ComputadorPortatil> vectorPortatiles = new ArrayList<>();
    static ArrayList<TabletaGrafica> vectorTabletas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Estudiantes de Ingeniería");
            System.out.println("2. Estudiantes de Diseño");
            System.out.println("3. Imprimir Inventario Total");
            System.out.println("4. Salir del Programa");
            System.out.print("Elija una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    menuEstudiantesIngenieria(sc);
                    break;
                case 2:
                    menuEstudiantesDiseno(sc);
                    break;
                case 3:
                    imprimirInventarioTotal();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    // Métodos para el menú de Estudiantes de Ingeniería
    public static void menuEstudiantesIngenieria(Scanner sc) {
        boolean volver = false;
        while (!volver) {
            System.out.println("===== MENÚ ESTUDIANTES INGENIERÍA =====");
            System.out.println("1 Registrar préstamo de equipo.");
            System.out.println("2 Modificar préstamo de equipo.");
            System.out.println("3 Devolución de equipo.");
            System.out.println("4 Buscar equipo.");
            System.out.println("5 Volver al menú principal.");
            System.out.print("Elija una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarPrestamoIngenieria(sc);
                    break;
                case 2:
                    modificarPrestamoIngenieria(sc);
                    break;
                case 3:
                    devolucionEquipoIngenieria(sc);
                    break;
                case 4:
                    buscarEquipoIngenieria(sc);
                    break;
                case 5:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    // Métodos para el menú de Estudiantes de Diseño
    public static void menuEstudiantesDiseno(Scanner sc) {
        boolean volver = false;
        while (!volver) {
            System.out.println("===== MENÚ ESTUDIANTES DISEÑO =====");
            System.out.println("1 Registrar préstamo de equipo.");
            System.out.println("2 Modificar préstamo de equipo.");
            System.out.println("3 Devolución de equipo.");
            System.out.println("4 Buscar equipo.");
            System.out.println("5 Volver al menú principal.");
            System.out.print("Elija una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarPrestamoDiseno(sc);
                    break;
                case 2:
                    modificarPrestamoDiseno(sc);
                    break;
                case 3:
                    devolucionEquipoDiseno(sc);
                    break;
                case 4:
                    buscarEquipoDiseno(sc);
                    break;
                case 5:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    // Método para imprimir inventario total
    public static void imprimirInventarioTotal() {
        System.out.println("===== INVENTARIO TOTAL =====");
        System.out.println("Equipos Prestados a Estudiantes de Ingeniería:");
        for (EstudianteIngenieria estudiante : vectorIngenieros) {
            System.out.println(estudiante.toString());
        }

        System.out.println("\nEquipos Prestados a Estudiantes de Diseño:");
        for (EstudianteDiseño estudiante : vectorDisenadores) {
            System.out.println(estudiante.toString());
        }
    }

    // Métodos para registrar, modificar, devolver y buscar préstamos para Ingeniería
    public static void registrarPrestamoIngenieria(Scanner sc) {
        // Lógica para registrar el préstamo de un portátil
    }

    public static void modificarPrestamoIngenieria(Scanner sc) {
        // Lógica para modificar el préstamo de un portátil
    }

    public static void devolucionEquipoIngenieria(Scanner sc) {
        // Lógica para devolver el equipo prestado
    }

    public static void buscarEquipoIngenieria(Scanner sc) {
        // Lógica para buscar un equipo prestado
    }

    // Métodos para registrar, modificar, devolver y buscar préstamos para Diseño
    public static void registrarPrestamoDiseno(Scanner sc) {
        // Lógica para registrar el préstamo de una tableta gráfica
    }

    public static void modificarPrestamoDiseno(Scanner sc) {
        // Lógica para modificar el préstamo de una tableta gráfica
    }

    public static void devolucionEquipoDiseno(Scanner sc) {
        // Lógica para devolver la tableta gráfica
    }

    public static void buscarEquipoDiseno(Scanner sc) {
        // Lógica para buscar una tableta gráfica
    }
}
