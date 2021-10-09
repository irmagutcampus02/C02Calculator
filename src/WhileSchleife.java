public class WhileSchleife {

    public static void main(String[] args) {

        int count = 1;
        // while schleife
        while (count < 4) {
            // Statement
            System.out.println("hier bin ich in der Schleife");

            // 3 Varianten um den count zu erhöhen
            //count++;
            //count = count + 1;
            count += 1;
        }
        System.out.println("aus der Schleife ausgebrochen");
    }

}
