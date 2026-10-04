public class Homework1 {
    public static void main(String[] args) {
        /**
         *Ունեք երկու ամբողջ թիվ x և y։
         *Գրել ծրագիր, որը if-ով կպարզի և կտպի՝ որը մեծ է։
         */
        int x = 10;
        int y = 20;
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x == y);

        /**
         * Օգտագործել for ցիկլ՝ տպելու համար առաջին 5 բնական թվերը (1, 2, 3, 4, 5)։
        */

        for (int i = 1; i <=5 ; i++) {
            System.out.println(i);
        }
        System.out.println("____________________");

        /**
         * Հայտարարեք երկու ամբողջ փոփոխական (int a = 5; int b = 7;) և տպեք դրանց գումարը։
         */
        int a =5;
        int b =7;
        int c = a+b;
        System.out.println(c);
        System.out.println("____________________");


        /**
         * Տրված է int n = 3;։ Օգտագործելով for ցիկլ, տպեք n-ի բազմապատկման աղյուսակը 1-ից մինչև 10։
         * օրինակ եթե n-ը 3 է՝
         * 3 * 1 = 3
         * 3 * 2 = 6
         * ...
         * 3 * 10 = 30
         */
        int n=3;
        for (int i = 1; i <=10; i++) {
            int m=n*i;
            System.out.println(n+"*"+i+"="+m);

        }

    }

}