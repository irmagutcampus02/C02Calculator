public class IFStatement {

    public static void main(String[] args) {
        int a = 10;

        // wenn a < 10 => Schreibe "ich bin kleiner"
        // sonst => Schreibe "ich bin größer"
        if (a < 10) {
            System.out.println("ich bin kleiner");
        } else {
            System.out.println("ich bin größer");
        }

        // wenn a < 10 => Schreibe "ich bin kleiner"
        // wenn a == 10 => Schreibe "ich bin gleich groß"
        // sonst => Schreibe "ich bin größer"
        if (a < 10) {
            System.out.println("ich bin kleiner");
        } else if (a == 10) {
            System.out.println("ich bin gleich groß");
        } else {
            System.out.println("ich bin größer");
        }

        int x = 2;
        int y = 2;

        if (x == 1 && y == 2) {
            // statement
            System.out.println("Und Operation");
            System.out.println("beide Variablen gleich");
        } else {
            System.out.println("ungleich");
        }

        if (x == 1 || y == 2) {
            System.out.println("Oder Operation");
            System.out.println("mind 1 der Variblen ist gleich");
        }

    }

}
