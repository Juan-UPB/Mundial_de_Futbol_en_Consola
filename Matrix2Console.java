import java.util.Scanner;

public class Matrix2Console {

    // Colores ANSI
    static final String AMARILLO = "\u001B[43m";
    static final String NARANJA = "\u001B[48;5;208m";
    static final String ROJO = "\u001B[41m";
    static final String AZUL = "\u001B[44m";
    static final String VERDE = "\u001B[42m";
    static final String BLANCO = "\u001B[47m";
    static final String NEGRO = "\u001B[40m";
    static final String CAFE = "\u001B[48;5;94m";
    static final String RESET = "\u001B[0m";


    // =========================================
    // BANDERA DE GHANA
    // =========================================

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


    // =========================================
    // BANDERA DE PANAMA
    // =========================================

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


    // =========================================
    // BANDERA DE IRAK
    // =========================================

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


    // =========================================
    // BANDERA DE SUECIA
    // =========================================

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


    // =========================================
    // BANDERA DE CURAZAO
    // =========================================

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


    // =========================================
    // BANDERA DE IRAN
    // =========================================

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


    // =========================================
    // BANDERA DE UZBEKISTAN
    // =========================================

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


    // =========================================
    // PROGRAMA PRINCIPAL
    // =========================================

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n===== MATRIX 2 CONSOLE =====");

            System.out.println("1. Icono");
            System.out.println("2. Pequeño");
            System.out.println("3. Mediano");
            System.out.println("4. Grande");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();

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

                System.out.println("\nPresione ENTER para volver al menu...");

                teclado.nextLine();
                teclado.nextLine();

            } else if (opcion != 5) {

                System.out.println("Opcion incorrecta.");
            }
        }

        System.out.println("Programa terminado.");

        teclado.close();
    }


    // =========================================
    // DIBUJAR BANDERA
    // =========================================

    public static void dibujarBandera(int[][] bandera, int escala) {

        for (int fila = 0; fila < bandera.length; fila++) {

            for (int alto = 0; alto < escala; alto++) {

                for (int columna = 0;
                     columna < bandera[fila].length;
                     columna++) {

                    for (int ancho = 0;
                         ancho < escala;
                         ancho++) {

                        System.out.print(
                            obtenerColor(bandera[fila][columna])
                            + "  "
                            + RESET
                        );
                    }
                }

                System.out.println();
            }
        }
    }


    // =========================================
    // OBTENER COLOR
    // =========================================

    public static String obtenerColor(int color) {

        switch (color) {

            case 1:
                return AMARILLO;

            case 2:
                return NARANJA;

            case 3:
                return ROJO;

            case 5:
                return AZUL;

            case 6:
                return VERDE;

            case 7:
                return BLANCO;

            case 8:
                return NEGRO;

            case 9:
                return CAFE;

            default:
                return RESET;
        }
    }
}