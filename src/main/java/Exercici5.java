
    public class Exercici5 {
        static int[] ia = new int[2];
        static int x = 5;
        public static void main(String[] args) {
            while(true) {
                try {
                    ia[x] = 1;
                    System.out.println(ia[x]);
                    break;
                } catch(ArrayIndexOutOfBoundsException e) {
                    System.err.println(
                            "Atrapat l'error ArrayIndexOutOfBoundsException");
                    e.printStackTrace();
                    x--;
                } finally {
                    System.out.println("Està ja?");
                }
            }
            System.out.println("Ara ja està.");
        }
    }

