import java.util.Scanner;

public class TablaPosiciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 48 equipos ordenados por grupos (4 por grupo, A a L)
        String[] equipos = {
            "Mexico", "Sudafrica", "Corea del Sur", "Chequia",              // Grupo A
            "Canada", "Bosnia-Herzegovina", "Catar", "Suiza",               // Grupo B
            "Brasil", "Marruecos", "Haiti", "Escocia",                      // Grupo C
            "Estados Unidos", "Paraguay", "Australia", "Turquia",           // Grupo D
            "Alemania", "Curazao", "Costa de Marfil", "Ecuador",            // Grupo E
            "Paises Bajos", "Japon", "Suecia", "Tunez",                     // Grupo F
            "Belgica", "Egipto", "Iran", "Nueva Zelanda",                   // Grupo G
            "Espana", "Cabo Verde", "Arabia Saudita", "Uruguay",            // Grupo H
            "Francia", "Senegal", "Irak", "Noruega",                        // Grupo I
            "Argentina", "Argelia", "Austria", "Jordania",                  // Grupo J
            "Portugal", "RD Congo", "Uzbekistan", "Colombia",               // Grupo K
            "Inglaterra", "Croacia", "Ghana", "Panama"                      // Grupo L
        };

        String[] columnas = {"PJ", "PG", "PE", "PP", "GF", "GC", "DG", "TA", "TR", "Pts"};

        // Matriz: 48 filas (equipos) x 10 columnas (estadisticas)
        int[][] tabla = new int[48][10];

        int porPagina = 12;
        int totalPaginas = 48 / porPagina;
        int pagina = 0;
        String opcion = "";

        while (!opcion.equals("X")) {
            // ----- Imprimir la pagina actual -----
            System.out.println();
            System.out.println("TABLA DE POSICIONES - MUNDIAL 2026 (Pagina " + (pagina + 1) + " de " + totalPaginas + ")");

            String linea = "";
            for (int i = 0; i < 82; i++) {
                linea = linea + "-";
            }

            System.out.println(linea);
            System.out.printf("%-3s %-2s %-20s", "#", "G", "Equipo");
            for (int c = 0; c < 10; c++) {
                System.out.printf("%5s", columnas[c]);
            }
            System.out.println();
            System.out.println(linea);

            for (int f = pagina * porPagina; f < (pagina + 1) * porPagina; f++) {
                char grupo = (char) ('A' + f / 4);
                System.out.printf("%-3d %-2c %-20s", f + 1, grupo, equipos[f]);
                for (int c = 0; c < 10; c++) {
                    System.out.printf("%5d", tabla[f][c]);
                }
                System.out.println();
            }
            System.out.println(linea);

            // ----- Menu -----
            System.out.println("[S] Siguiente   [A] Anterior   [E] Editar   [X] Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextLine().trim().toUpperCase();

            if (opcion.equals("S") && pagina < totalPaginas - 1) {
                pagina++;
            } else if (opcion.equals("A") && pagina > 0) {
                pagina--;
            } else if (opcion.equals("E")) {
                System.out.print("Numero del equipo (1-48): ");
                int f = Integer.parseInt(sc.nextLine()) - 1;

                System.out.println("Columnas: 1=PJ 2=PG 3=PE 4=PP 5=GF 6=GC 8=TA 9=TR");
                System.out.print("Numero de la columna: ");
                int c = Integer.parseInt(sc.nextLine()) - 1;

                System.out.print("Nuevo valor: ");
                int valor = Integer.parseInt(sc.nextLine());

                if (f < 0 || f > 47 || c < 0 || c > 9 || c == 6 || c == 9) {
                    System.out.println("Datos no validos (DG y Pts se calculan solos).");
                } else {
                    tabla[f][c] = valor;
                    tabla[f][6] = tabla[f][4] - tabla[f][5];        // DG = GF - GC
                    tabla[f][9] = tabla[f][1] * 3 + tabla[f][2];    // Pts = 3*PG + PE
                    System.out.println("Tabla actualizada.");
                }
            }
        }
        System.out.println("Fin del programa.");
    }
}