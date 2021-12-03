public class ExercitiiForLoop {
    public static void main(String[] args) {

        //1. Sa se printeze "Salut, ma numesc x si voi deveni programator" de 50 de ori
     /*   String mesaj = "Nume";
        for (int i=0 ; i<=50 ; i++){
            System.out.println("Salut, ma numesc " + mesaj + " si voi deveni programator");
        }*/

        //2. Sa se printeze toate numerele pare de la 3 la 50 pe acelasi rand
       /* for (int i=3 ; i<=50 ; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }*/

        //se mai poate face
/*
        for (int i=4; i<=50; i+=2){
            System.out.println(i);
        }*/


        //3. Sa se printeze toate numerele cuprinse in intervalul (0, 50) din 4 in 4.

        /* for (int i=0; i<=50; i+=4){
            System.out.println(i);
        }*/


        //4.Sa se printeze toate numerele divizibile cu 3 din intervalul (10, 100) pe acelasi rand.

        /* for (int i = 10; i <= 100; i++) {
            if (i%3 == 0) {
                System.out.print(i + " ");
            }
        }
*/
        //5.Sa se printeze toate numerele descrescator de la 100 la 0 inclusiv.

        for (int i=100; i>=0; i--){
            System.out.println(i);
        }



        //6. Sa se printeze toate numerele divizibile cu 5 descrescator de la 100 la 10 inclusiv.
      /*  for (int i = 100; i >= 10; i--) {
            if (i%5 == 0) {
                System.out.println(i);
            }
        }*/
    }
}
