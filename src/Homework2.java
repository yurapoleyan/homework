public class Homework2 {
    public static void main(String[] args) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("_____");
        /**
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println("_____");
       /*
       "3"
        */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        /*
        "4"
         */
        System.out.println("----");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.println();

        }for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int e = 5; e >= 1; e--) {
                for (int r = 1; r <= 5 - i; r++) {
                    System.out.print(" ");
                }
                for (int t = 1; t <= i; t++) {
                    System.out.print("* ");

                }
                System.out.println();

            }

        }}}