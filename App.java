public static void informacionPaises() {

    Scanner sc = new Scanner(System.in);

    int opcion;

    do {
        System.out.println("==============================");
        System.out.println("      INFORMACION PAISES");
        System.out.println("==============================");
        System.out.println("1. Senegal");
        System.out.println("2. Escocia");
        System.out.println("3. Jordania");
        System.out.println("4. Congo");
        System.out.println("5. Volver");
        System.out.print("Seleccione un pais: ");

        opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("===== SENEGAL =====");
                System.out.println("Capital: Dakar");
                System.out.println("Jugadores principales: Sadio Mane, Kalidou Koulibaly, Edouard Mendy");
                System.out.println("Apariciones en Copas del Mundo: 3");


                break;

            case 2:
                System.out.println("===== ESCOCIA =====");
                System.out.println("Capital: Edimburgo");
                System.out.println("Jugadores principales: Andy Robertson, Scott McTominay, John McGinn");
                System.out.println("Apariciones en Copas del Mundo: 8");

                break;

            case 3:
                System.out.println("===== JORDANIA =====");
                System.out.println("Capital: Amman");
                System.out.println("Jugadores principales: Musa Al-Taamari, Yazan Al-Naimat, Noor Al-Rawabdeh");
                System.out.println("Apariciones en Copas del Mundo: 1");


                break;

            case 4:
                System.out.println("===== CONGO =====");
                System.out.println("Capital: Brazzaville");
                System.out.println("Jugadores principales: Thievy Bifouma, Delvin N'Dinga, Prince Oniangue");
                System.out.println("Apariciones en Copas del Mundo: 0");

                break;

            case 5:
                System.out.println("Volviendo al menu...");
                break;

            default:
                System.out.println("Opcion invalida.");
        }

    } while (opcion != 5);
}