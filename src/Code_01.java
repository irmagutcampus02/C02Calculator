public class Code_01 {
    public static void main(String[] args) {
        //        int a = 1;
        //        System.out.println(a);
        //
        //        double d = 2.0;
        //        System.out.println(d);
        //
        //        boolean b = true;
        //        System.out.println(b);
        //
        //        char c = 'c';
        //        System.out.println(c);
        //
        //        String s = "Ich bin ein String";
        //        System.out.println(s);
        //
        //
        //        // modulo
        //        boolean even = 2 % 2 == 0;
        //        System.out.println(even);
        //
        //        // addition
        //        int add = 2 + 3;
        //
        //        //subtrahieren
        //        int sub = 3 - 3;
        //
        //        //multiplizieren
        //        int multi = 3 * 3;
        //
        //        int div = 3 / 1;
        //        System.out.println(div);
        //
        //        int p = 2 + multi;
        //        System.out.println(p);
        //
        //        System.out.println(4 % 2);
        //
        //        int x = 3;
        //        int y = 2;
        //
        //        // addieren
        //        int r = x + y;
        //        System.out.println("a + b = " + r);
        //
        //        // subtrahieren
        //        r = x - y;
        //        System.out.println("a - b = " + r);
        //
        //        // mulitplizieren
        //        r = x * y;
        //        System.out.println("a * b = " + r);
        //
        //        // dividieren
        //        r = x/y;
        //        System.out.println("a / b = " + r);
        //
        //        float f = (float) ((x * 1.0) / y);
        //        System.out.println("double: " + f);

        printResult(2 + 3);
        int a = 2 + 4;
        printResult(a);
        int result = add(2, 5);
        printResult(result);
        printResult(add(2, 6));
        schreibHallo();
        int ten = returnTen();
        System.out.println(ten);
    }

    // Methode, welchen 1 Parameter als Input annimmt
    // und den Wert des Parameters in die Konsole schreibt
    public static void printResult(int result) {
        System.out.println(result);
    }

    // Methode, welche 2 Input-Parameter hat
    // und das Ergebnis der Addition zurück liefert
    public static int add(int a, int b) {
        return a + b;
    }

    // Methode ohne Input-Parameter
    // Schreibt bei jedem Aufruf "Hallo" in die Konsole
    public static void schreibHallo() {
        System.out.println("Hallo");
    }

    // Methode ohne Input-Parameter
    // Liefert immer 10 zurück
    public static int returnTen() {
        return 10;
    }
}
