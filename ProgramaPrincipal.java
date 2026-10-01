import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaPrincipal {
    
    public static void main(String[] args) {
        Scanner tecladoMain = new Scanner(System.in);
        int opcionPrincipal = 0;

        while (opcionPrincipal != 4) {
            System.out.println("\n==============================================");
            System.out.println("          MENÚ PRINCIPAL - MUNDIAL 2026");
            System.out.println("==============================================");
            System.out.println("1. Matrix 2 Console (Banderas)");
            System.out.println("2. Información de Países");
            System.out.println("3. Tabla de Posiciones");
            System.out.println("4. Salir del programa");
            System.out.println("==============================================");
            System.out.print("Seleccione una opción: ");

            try {
                opcionPrincipal = Integer.parseInt(tecladoMain.nextLine().trim());
            } catch (NumberFormatException e) {
                opcionPrincipal = 0;
            }

            switch (opcionPrincipal) {
                case 1:
                    Matrix2Console.ejecutar(tecladoMain);
                    break;
                case 2:
                    InformacionPaises.ejecutar(tecladoMain);
                    break;
                case 3:
                    TablaPosiciones.ejecutar(tecladoMain);
                    break;
                case 4:
                    System.out.println("\n¡Gracias por usar el programa! Hasta luego.");
                    break;
                default:
                    System.out.println("Opción incorrecta. Intente nuevamente.");
            }
        }

        tecladoMain.close();
    }
}


class Matrix2Console {

    static final String AMARILLO = "\u001B[43m";
    static final String NARANJA = "\u001B[48;5;208m";
    static final String ROJO = "\u001B[41m";
    static final String AZUL = "\u001B[44m";
    static final String VERDE = "\u001B[42m";
    static final String BLANCO = "\u001B[47m";
    static final String NEGRO = "\u001B[40m";
    static final String CAFE = "\u001B[48;5;94m";
    static final String RESET = "\u001B[0m";

    static int[][] ghana = {
        {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
        {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
        {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,8,1,1,1,1,1,1,1},
        {1,1,1,1,1,8,8,8,8,8,1,1,1,1,1},
        {1,1,1,1,1,1,8,8,8,1,1,1,1,1,1},
        {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6},
        {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6},
        {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6}
    };

    static int[][] panama = {
        {7,7,7,5,7,7,7,3,3,3,3,3,3,3,3},
        {7,7,5,5,5,7,7,3,3,3,3,3,3,3,3},
        {7,7,7,5,7,7,7,3,3,3,3,3,3,3,3},
        {7,7,7,7,7,7,7,3,3,3,3,3,3,3,3},
        {7,7,7,7,7,7,7,3,3,3,3,3,3,3,3},
        {5,5,5,5,5,5,5,7,7,7,7,7,7,7,7},
        {5,5,5,5,5,5,5,7,7,7,3,7,7,7,7},
        {5,5,5,5,5,5,5,7,7,3,3,3,7,7,7},
        {5,5,5,5,5,5,5,7,7,7,3,7,7,7,7},
        {5,5,5,5,5,5,5,7,7,7,7,7,7,7,7}
    };

    static int[][] irak = {
        {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
        {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
        {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
        {7,7,7,7,7,7,7,7,7,7,7,7,7,7,7},
        {7,7,7,6,6,7,6,6,7,6,6,7,7,7,7},
        {7,7,7,6,7,7,6,7,7,7,6,7,7,7,7},
        {7,7,7,6,6,7,6,6,7,6,6,7,7,7,7},
        {8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
        {8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
        {8,8,8,8,8,8,8,8,8,8,8,8,8,8,8}
    };

    static int[][] suecia = {
        {5,5,5,5,5,1,1,5,5,5,5,5,5,5,5},
        {5,5,5,5,5,1,1,5,5,5,5,5,5,5,5},
        {5,5,5,5,5,1,1,5,5,5,5,5,5,5,5},
        {5,5,5,5,5,1,1,5,5,5,5,5,5,5,5},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {5,5,5,5,5,1,1,5,5,5,5,5,5,5,5},
        {5,5,5,5,5,1,1,5,5,5,5,5,5,5,5},
        {5,5,5,5,5,1,1,5,5,5,5,5,5,5,5},
        {5,5,5,5,5,1,1,5,5,5,5,5,5,5,5}
    };

    static int[][] curazao = {
        {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
        {5,5,7,5,7,5,5,5,5,5,5,5,5,5,5},
        {5,7,7,7,7,7,5,5,5,5,5,5,5,5,5},
        {5,5,7,5,7,5,5,5,5,5,5,5,5,5,5},
        {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
        {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
        {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
        {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
    };

    static int[][] iran = {
        {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6},
        {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6},
        {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6},
        {7,7,7,7,7,7,7,7,7,7,7,7,7,7,7},
        {7,7,7,7,7,7,3,3,3,7,7,7,7,7,7},
        {7,7,7,7,7,3,3,3,3,3,7,7,7,7,7},
        {7,7,7,7,7,7,3,3,3,7,7,7,7,7,7},
        {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
        {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
        {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3}
    };

    static int[][] uzbekistan = {
        {5,5,7,7,5,7,5,7,5,5,5,5,5,5,5},
        {5,7,5,7,7,5,7,5,5,5,5,5,5,5,5},
        {5,5,7,7,5,7,5,7,5,5,5,5,5,5,5},
        {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
        {7,7,7,7,7,7,7,7,7,7,7,7,7,7,7},
        {7,7,7,7,7,7,7,7,7,7,7,7,7,7,7},
        {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
        {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6},
        {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6},
        {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6}
    };

    public static void ejecutar(Scanner teclado) {
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n===== MATRIX 2 CONSOLE =====");
            System.out.println("1. Icono");
            System.out.println("2. Pequeño");
            System.out.println("3. Mediano");
            System.out.println("4. Grande");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(teclado.nextLine().trim());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            if (opcion >= 1 && opcion <= 4) {
                System.out.println("\nGHANA");
                dibujarBandera(ghana, opcion);

                System.out.println("\nPANAMA");
                dibujarBandera(panama, opcion);

                System.out.println("\nIRAK");
                dibujarBandera(irak, opcion);

                System.out.println("\nSUECIA");
                dibujarBandera(suecia, opcion);

                System.out.println("\nCURAZAO");
                dibujarBandera(curazao, opcion);

                System.out.println("\nIRAN");
                dibujarBandera(iran, opcion);

                System.out.println("\nUZBEKISTAN");
                dibujarBandera(uzbekistan, opcion);

                System.out.println("\nPresione ENTER para volver al submenú...");
                teclado.nextLine();

            } else if (opcion != 5) {
                System.out.println("Opcion incorrecta.");
            }
        }
    }

    public static void dibujarBandera(int[][] bandera, int escala) {
        for (int fila = 0; fila < bandera.length; fila++) {
            for (int alto = 0; alto < escala; alto++) {
                for (int columna = 0; columna < bandera[fila].length; columna++) {
                    for (int ancho = 0; ancho < escala; ancho++) {
                        System.out.print(obtenerColor(bandera[fila][columna]) + "  " + RESET);
                    }
                }
                System.out.println();
            }
        }
    }

    public static String obtenerColor(int color) {
        switch (color) {
            case 1: return AMARILLO;
            case 2: return NARANJA;
            case 3: return ROJO;
            case 5: return AZUL;
            case 6: return VERDE;
            case 7: return BLANCO;
            case 8: return NEGRO;
            case 9: return CAFE;
            default: return RESET;
        }
    }
}


class InformacionPaises {

    public static void ejecutar(Scanner sc) {
        int opcion = 0;

        do {
            System.out.println("\n================================");
            System.out.println("      INFORMACION DE PAISES");
            System.out.println("================================");
            System.out.println("1. Uzbekistán");
            System.out.println("2. Irak");
            System.out.println("3. Ghana");
            System.out.println("4. Panamá");
            System.out.println("5. Curazao");
            System.out.println("6. Suecia");
            System.out.println("7. Irán");
            System.out.println("8. Volver al Menú Principal");
            System.out.println("================================");

            System.out.print("Seleccione un pais: ");
            try {
                opcion = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    System.out.println("===== UZBEKISTÁN =====");
                    System.out.println("Capital: Taskent");
                    System.out.println("Continente: Asia");
                    System.out.println("Poblacion: Aproximadamente 37 millones");
                    System.out.println("Jugadores principales: Eldor Shomurodov, Abbosbek Fayzullaev, Odiljon Hamrobekov");
                    System.out.println("Apariciones en Copas del Mundo: 1\n");
                    System.out.println("Bandera de Uzbekistán:");
                    Matrix2Console.dibujarBandera(Matrix2Console.uzbekistan, 2);
                    break;

                case 2:
                    System.out.println("===== IRAK =====");
                    System.out.println("Capital: Bagdad");
                    System.out.println("Continente: Asia");
                    System.out.println("Poblacion: Aproximadamente 46 millones");
                    System.out.println("Jugadores principales: Ali Adnan, Aymen Hussein, Zidane Iqbal");
                    System.out.println("Apariciones en Copas del Mundo: 1\n");
                    System.out.println("Bandera de Irak:");
                    Matrix2Console.dibujarBandera(Matrix2Console.irak, 2);
                    break;

                case 3:
                    System.out.println("===== GHANA =====");
                    System.out.println("Capital: Accra");
                    System.out.println("Continente: África");
                    System.out.println("Poblacion: Aproximadamente 35 millones");
                    System.out.println("Jugadores principales: Thomas Partey, Mohammed Kudus, Jordan Ayew");
                    System.out.println("Apariciones en Copas del Mundo: 4\n");
                    System.out.println("Bandera de Ghana:");
                    Matrix2Console.dibujarBandera(Matrix2Console.ghana, 2);
                    break;

                case 4:
                    System.out.println("===== PANAMÁ =====");
                    System.out.println("Capital: Ciudad de Panamá");
                    System.out.println("Continente: América");
                    System.out.println("Poblacion: Aproximadamente 4.5 millones");
                    System.out.println("Jugadores principales: Michael Murillo, Adalberto Carrasquilla, Ismael Díaz");
                    System.out.println("Apariciones en Copas del Mundo: 1\n");
                    System.out.println("Bandera de Panamá:");
                    Matrix2Console.dibujarBandera(Matrix2Console.panama, 2);
                    break;

                case 5:
                    System.out.println("===== CURAZAO =====");
                    System.out.println("Capital: Willemstad");
                    System.out.println("Continente: América");
                    System.out.println("Poblacion: Aproximadamente 190 mil");
                    System.out.println("Jugadores principales: Leandro Bacuna, Juninho Bacuna, Kenji Gorre");
                    System.out.println("Apariciones en Copas del Mundo: 0\n");
                    System.out.println("Bandera de Curazao:");
                    Matrix2Console.dibujarBandera(Matrix2Console.curazao, 2);
                    break;

                case 6:
                    System.out.println("===== SUECIA =====");
                    System.out.println("Capital: Estocolmo");
                    System.out.println("Continente: Europa");
                    System.out.println("Poblacion: Aproximadamente 10.6 millones");
                    System.out.println("Jugadores principales: Alexander Isak, Viktor Gyökeres, Dejan Kulusevski");
                    System.out.println("Apariciones en Copas del Mundo: 12\n");
                    System.out.println("Bandera de Suecia:");
                    Matrix2Console.dibujarBandera(Matrix2Console.suecia, 2);
                    break;

                case 7:
                    System.out.println("===== IRÁN =====");
                    System.out.println("Capital: Teherán");
                    System.out.println("Continente: Asia");
                    System.out.println("Poblacion: Aproximadamente 92 millones");
                    System.out.println("Jugadores principales: Mehdi Taremi, Sardar Azmoun, Alireza Jahanbakhsh");
                    System.out.println("Apariciones en Copas del Mundo: 6\n");
                    System.out.println("Bandera de Irán:");
                    Matrix2Console.dibujarBandera(Matrix2Console.iran, 2);
                    break;

                case 8:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }

        } while (opcion != 8);
    }
}

class TablaPosiciones {

    public static void ejecutar(Scanner sc) {

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
            System.out.println("              Pagina " + (pagina + 1) + " de " + totalPaginas);
            System.out.println("==============================================");

            System.out.printf("%-3s %-2s %-20s", "#", "G", "Equipo");

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

                System.out.printf("%-3d %-2c %-20s", f + 1, grupo, equipos[f]);

                for (int c = 0; c < columnas.length; c++) {
                    System.out.printf("%5d", tabla[f][c]);
                }

                System.out.println();
            }

            for (int i = 0; i < 82; i++) {
                System.out.print("-");
            }

            System.out.println();
            System.out.println("[S] Siguiente pagina");
            System.out.println("[A] Anterior pagina");
            System.out.println("[E] Editar equipo");
            System.out.println("[X] Volver al Menú Principal");

            System.out.print("Opcion: ");
            opcion = sc.nextLine().trim().toUpperCase();

            if (opcion.equals("S")) {
                if (pagina < totalPaginas - 1) {
                    pagina++;
                } else {
                    System.out.println("Ya estas en la ultima pagina.");
                }
            } else if (opcion.equals("A")) {
                if (pagina > 0) {
                    pagina--;
                } else {
                    System.out.println("Ya estas en la primera pagina.");
                }
            } else if (opcion.equals("E")) {

                System.out.print("Numero del equipo (1-48): ");
                int equipo;
                try {
                    equipo = Integer.parseInt(sc.nextLine().trim()) - 1;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida.");
                    continue;
                }

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
                int columna;
                try {
                    columna = Integer.parseInt(sc.nextLine().trim()) - 1;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida.");
                    continue;
                }

                if (columna < 0 || columna >= 10) {
                    System.out.println("Numero de columna no valido.");
                    continue;
                }

                if (columna == 6 || columna == 9) {
                    System.out.println("DG y Pts se calculan automaticamente.");
                    continue;
                }

                System.out.print("Nuevo valor: ");
                int valor;
                try {
                    valor = Integer.parseInt(sc.nextLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida.");
                    continue;
                }

                if (valor < 0) {
                    System.out.println("El valor no puede ser negativo.");
                    continue;
                }

                tabla[equipo][columna] = valor;

                if (columna == 1 || columna == 2 || columna == 3) {
                    tabla[equipo][0] = tabla[equipo][1] + tabla[equipo][2] + tabla[equipo][3];
                }

                tabla[equipo][6] = tabla[equipo][4] - tabla[equipo][5];
                tabla[equipo][9] = tabla[equipo][1] * 3 + tabla[equipo][2];

                System.out.println("\nTabla actualizada correctamente.");
            } else if (!opcion.equals("X")) {
                System.out.println("Opcion no valida.");
            }
        }

        System.out.println("\nVolviendo al menú principal...");
    }
}
