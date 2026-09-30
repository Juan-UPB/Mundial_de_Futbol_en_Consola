import java.util.Scanner;

public class TablaPosiciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] equipos = {
            "Mexico", "Sudafrica", "Corea del Sur", "Chequia",
            "Canada", "Bosnia-Herzegovina", "Catar", "Suiza",
            "Brasil", "Marruecos", "Haiti", "Escocia",
            "Estados Unidos", "Paraguay", "Australia", "Turquia",
            "Alemania", "Curazao", "Costa de Marfil", "Ecuador",
            "Paises Bajos", "Japon", "Suecia", "Tunez",
            "Belgica", "Egipto", "Iran", "Nueva Zelanda",
            "Espana", "Cabo Verde", "Arabia Saudita", "Uruguay",
            "Francia", "Senegal", "Irak", "Noruega",
            "Argentina", "Argelia", "Austria", "Jordania",
            "Portugal", "RD Congo", "Uzbekistan", "Colombia",
            "Inglaterra", "Croacia", "Ghana", "Panama"
        };

        String[] columnas = {
            "PJ", "PG", "PE", "PP", "GF",
            "GC", "DG", "TA", "TR", "Pts"
        };

        int[][] tabla = new int[48][10];

        int equiposPorPagina = 12;
        int totalPaginas = 4;
        int pagina = 0;

        String opcion = "";

        while (!opcion.equals("X")) {

            System.out.println();
            System.out.println("==============================================");
            System.out.println("       TABLA DE POSICIONES - MUNDIAL 2026");
            System.out.println("             Pagina " + (pagina + 1) + " de " + totalPaginas);
            System.out.println("==============================================");

            System.out.printf("%-3s %-2s %-20s",
                    "#", "G", "Equipo");

            for (int c = 0; c < columnas.length; c++) {
                System.out.printf("%5s", columnas[c]);
            }

            System.out.println();

            for (int i = 0; i < 82; i++) {
                System.out.print("-");
            }

            System.out.println();

            int inicio = pagina * equiposPorPagina;
            int fin = inicio + equiposPorPagina;

            for (int f = inicio; f < fin; f++) {

                char grupo = (char) ('A' + f / 4);

                System.out.printf("%-3d %-2c %-20s",
                        f + 1,
                        grupo,
                        equipos[f]);

                for (int c = 0; c < columnas.length; c++) {
                    System.out.printf("%5d", tabla[f][c]);
                }

                System.out.println();
            }

            for (int i = 0; i < 82; i++) {
                System.out.print("-");
            }

            System.out.println();

            System.out.println();
            System.out.println("[S] Siguiente pagina");
            System.out.println("[A] Anterior pagina");
            System.out.println("[E] Editar equipo");
            System.out.println("[X] Salir");

            System.out.print("Opcion: ");
            opcion = sc.nextLine().trim().toUpperCase();

            if (opcion.equals("S")) {

                if (pagina < totalPaginas - 1) {
                    pagina++;
                } else {
                    System.out.println("Ya estas en la ultima pagina.");
                }
            }

            else if (opcion.equals("A")) {

                if (pagina > 0) {
                    pagina--;
                } else {
                    System.out.println("Ya estas en la primera pagina.");
                }
            }

            else if (opcion.equals("E")) {

                System.out.print("Numero del equipo (1-48): ");
                int equipo = Integer.parseInt(sc.nextLine()) - 1;

                if (equipo < 0 || equipo >= 48) {
                    System.out.println("Numero de equipo no valido.");
                    continue;
                }

                System.out.println();
                System.out.println("Columnas disponibles:");
                System.out.println("1. PJ  - Partidos jugados");
                System.out.println("2. PG  - Partidos ganados");
                System.out.println("3. PE  - Partidos empatados");
                System.out.println("4. PP  - Partidos perdidos");
                System.out.println("5. GF  - Goles a favor");
                System.out.println("6. GC  - Goles en contra");
                System.out.println("7. DG  - Diferencia de goles (automatico)");
                System.out.println("8. TA  - Tarjetas amarillas");
                System.out.println("9. TR  - Tarjetas rojas");
                System.out.println("10. Pts - Puntos (automatico)");

                System.out.print("Numero de la columna: ");
                int columna = Integer.parseInt(sc.nextLine()) - 1;

                if (columna < 0 || columna >= 10) {
                    System.out.println("Numero de columna no valido.");
                    continue;
                }

                if (columna == 6 || columna == 9) {
                    System.out.println(
                        "DG y Pts se calculan automaticamente."
                    );
                    continue;
                }

                System.out.print("Nuevo valor: ");
                int valor = Integer.parseInt(sc.nextLine());

                if (valor < 0) {
                    System.out.println(
                        "El valor no puede ser negativo."
                    );
                    continue;
                }

                tabla[equipo][columna] = valor;

                tabla[equipo][6] =
                    tabla[equipo][4] - tabla[equipo][5];

                tabla[equipo][9] =
                    tabla[equipo][1] * 3 + tabla[equipo][2];

                System.out.println();
                System.out.println("Tabla actualizada correctamente.");
            }
            else if (!opcion.equals("X")) {
                System.out.println("Opcion no valida.");
            }
        }

        System.out.println();
        System.out.println("Fin del programa.");

        sc.close();
    }
}