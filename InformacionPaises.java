import java.util.Scanner;

public class InformacionPaises {

    public static void main(String[] args) {
        informacionPaises();
    }

    public static void informacionPaises() {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("================================");
            System.out.println("      INFORMACION DE PAISES");
            System.out.println("================================");
            System.out.println("1. Uzbekistán");
            System.out.println("2. Irak");
            System.out.println("3. Ghana");
            System.out.println("4. Panamá");
            System.out.println("5. Curazao");
            System.out.println("6. Suecia");
            System.out.println("7. Irán");
            System.out.println("8. Salir");
            System.out.println("================================");

            System.out.print("Seleccione un pais: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("===== UZBEKISTÁN =====");
                    System.out.println("Capital: Taskent");
                    System.out.println("Continente: Asia");
                    System.out.println("Poblacion: Aproximadamente 37 millones");
                    System.out.println("Jugadores principales: Eldor Shomurodov, Abbosbek Fayzullaev, Odiljon Hamrobekov");
                    System.out.println("Apariciones en Copas del Mundo: 1");

                    System.out.println();
                    System.out.println("Bandera de Uzbekistán:");

                    Matrix2Console.dibujarBandera(
                            Matrix2Console.uzbekistan, 2);

                    break;


                case 2:

                    System.out.println("===== IRAK =====");
                    System.out.println("Capital: Bagdad");
                    System.out.println("Continente: Asia");
                    System.out.println("Poblacion: Aproximadamente 46 millones");
                    System.out.println("Jugadores principales: Ali Adnan, Aymen Hussein, Zidane Iqbal");
                    System.out.println("Apariciones en Copas del Mundo: 1");

                    System.out.println();
                    System.out.println("Bandera de Irak:");

                    Matrix2Console.dibujarBandera(
                            Matrix2Console.irak, 2);

                    break;


                case 3:

                    System.out.println("===== GHANA =====");
                    System.out.println("Capital: Accra");
                    System.out.println("Continente: África");
                    System.out.println("Poblacion: Aproximadamente 35 millones");
                    System.out.println("Jugadores principales: Thomas Partey, Mohammed Kudus, Jordan Ayew");
                    System.out.println("Apariciones en Copas del Mundo: 4");

                    System.out.println();
                    System.out.println("Bandera de Ghana:");

                    Matrix2Console.dibujarBandera(
                            Matrix2Console.ghana, 2);

                    break;


                case 4:

                    System.out.println("===== PANAMÁ =====");
                    System.out.println("Capital: Ciudad de Panamá");
                    System.out.println("Continente: América");
                    System.out.println("Poblacion: Aproximadamente 4.5 millones");
                    System.out.println("Jugadores principales: Michael Murillo, Adalberto Carrasquilla, Ismael Díaz");
                    System.out.println("Apariciones en Copas del Mundo: 1");

                    System.out.println();
                    System.out.println("Bandera de Panamá:");

                    Matrix2Console.dibujarBandera(
                            Matrix2Console.panama, 2);

                    break;


                case 5:

                    System.out.println("===== CURAZAO =====");
                    System.out.println("Capital: Willemstad");
                    System.out.println("Continente: América");
                    System.out.println("Poblacion: Aproximadamente 190 mil");
                    System.out.println("Jugadores principales: Leandro Bacuna, Juninho Bacuna, Kenji Gorre");
                    System.out.println("Apariciones en Copas del Mundo: 0");

                    System.out.println();
                    System.out.println("Bandera de Curazao:");

                    Matrix2Console.dibujarBandera(
                            Matrix2Console.curazao, 2);

                    break;


                case 6:

                    System.out.println("===== SUECIA =====");
                    System.out.println("Capital: Estocolmo");
                    System.out.println("Continente: Europa");
                    System.out.println("Poblacion: Aproximadamente 10.6 millones");
                    System.out.println("Jugadores principales: Alexander Isak, Viktor Gyökeres, Dejan Kulusevski");
                    System.out.println("Apariciones en Copas del Mundo: 12");

                    System.out.println();
                    System.out.println("Bandera de Suecia:");

                    Matrix2Console.dibujarBandera(
                            Matrix2Console.suecia, 2);

                    break;


                case 7:

                    System.out.println("===== IRÁN =====");
                    System.out.println("Capital: Teherán");
                    System.out.println("Continente: Asia");
                    System.out.println("Poblacion: Aproximadamente 92 millones");
                    System.out.println("Jugadores principales: Mehdi Taremi, Sardar Azmoun, Alireza Jahanbakhsh");
                    System.out.println("Apariciones en Copas del Mundo: 6");

                    System.out.println();
                    System.out.println("Bandera de Irán:");

                    Matrix2Console.dibujarBandera(
                            Matrix2Console.iran, 2);

                    break;


                case 8:

                    System.out.println("Volviendo al menu...");

                    break;


                default:

                    System.out.println(
                            "Opcion invalida. Intente nuevamente.");

            }

        } while (opcion != 8);

        sc.close();
    }
}