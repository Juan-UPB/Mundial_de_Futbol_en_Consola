import java.util.Scanner;

public class InformacionPaises {

    public static void main(String[] args) {
        informacionPaises();
    }

    public static void informacionPaises() {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("==============================");
            System.out.println("      INFORMACION PAISES");
            System.out.println("==============================");
            System.out.println("1. Uzbekistán");
            System.out.println("2. Irak");
            System.out.println("3. Ghana");
            System.out.println("4. Panamá");
            System.out.println("5. Curazao");
            System.out.println("6. Suecia");
            System.out.println("7. Irán");
            System.out.println("8. Volver");
            System.out.print("Seleccione un pais: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("===== UZBEKISTÁN =====");
                    System.out.println("Capital: Taskent");
                    System.out.println("Jugadores principales: Eldor Shomurodov, Abbosbek Fayzullaev, Odiljon Hamrobekov");
                    System.out.println("Apariciones en Copas del Mundo: 0");
                    break;

                case 2:
                    System.out.println("===== IRAK =====");
                    System.out.println("Capital: Bagdad");
                    System.out.println("Jugadores principales: Ali Adnan, Aymen Hussein, Zidane Iqbal");
                    System.out.println("Apariciones en Copas del Mundo: 1");
                    break;

                case 3:
                    System.out.println("===== GHANA =====");
                    System.out.println("Capital: Accra");
                    System.out.println("Jugadores principales: Thomas Partey, Mohammed Kudus, Jordan Ayew");
                    System.out.println("Apariciones en Copas del Mundo: 4");
                    break;

                case 4:
                    System.out.println("===== PANAMÁ =====");
                    System.out.println("Capital: Ciudad de Panamá");
                    System.out.println("Jugadores principales: Michael Murillo, Adalberto Carrasquilla, Ismael Díaz");
                    System.out.println("Apariciones en Copas del Mundo: 1");
                    break;

                case 5:
                    System.out.println("===== CURAZAO =====");
                    System.out.println("Capital: Willemstad");
                    System.out.println("Jugadores principales: Leandro Bacuna, Juninho Bacuna, Kenji Gorre");
                    System.out.println("Apariciones en Copas del Mundo: 0");
                    break;

                case 6:
                    System.out.println("===== SUECIA =====");
                    System.out.println("Capital: Estocolmo");
                    System.out.println("Jugadores principales: Alexander Isak, Viktor Gyökeres, Dejan Kulusevski");
                    System.out.println("Apariciones en Copas del Mundo: 12");
                    break;

                case 7:
                    System.out.println("===== IRÁN =====");
                    System.out.println("Capital: Teherán");
                    System.out.println("Jugadores principales: Mehdi Taremi, Sardar Azmoun, Alireza Jahanbakhsh");
                    System.out.println("Apariciones en Copas del Mundo: 6");
                    break;

                case 8:
                    System.out.println("Volviendo al menu...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 8);
    }
}
