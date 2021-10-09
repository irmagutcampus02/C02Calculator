public class FindEven {

    public static void main(String[] args) {

        int count = 1;
        int end = 11;
        // durchlaufe die schleife solange, bis count gleich groß wie end ist
        while (count < end) {
            System.out.println("bin in der Schleife");
            // Bedingung: count ist eine gerade Zahl
            if (count % 2 == 0) {
                System.out.println("bin gerade: " + count);
            }
            count++;
        }
        // for schleife mit n Durchläufen
        for (int i = 1; i < 11; i++) {
            System.out.println("Duchlauf Nr.: " + i);
        }

        // for schleife von 10 herunter
        for (int j = 10; j >= 0; j--) {
            System.out.println("Durchlauf Nr.: " + j);
        }
        // k += 5 => k = k + 5
        for (int k = 20; k <= 90; k += 5) {
            System.out.println("5-er Schritte: " + k);
        }
    }

}
