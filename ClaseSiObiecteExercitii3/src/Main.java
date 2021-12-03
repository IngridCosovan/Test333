public class Main {
    public static void main(String[] args) {
        Book christine = new Book("Christine", "Stephen King", 500);
       /* christine.flipPageBackwards();
        christine.flipPageForward();
        christine.flipPageForward();
        christine.flipPageForward();
        christine.flipPageForward();*/

        Book harryPotter = new Book("Harry Potter", "J.K. Rowling", 456);
        Book deVegheInLanulDeSecara = new Book("De veghe in lanl de secara", "J.D. Salinger", 200);
rasfoietseCartea(christine);
rasfoietseCartea(harryPotter);
rasfoietseCartea(deVegheInLanulDeSecara);
    }
    //book de mai jos este dar ca parametru
    //trebuie declarata static
        public static void rasfoietseCartea (Book book) {
            for (int i = book.currentPage; i <= book.totalPageNumber; i++) {
                book.flipPageForward();
            }
            book.printBookState();

        }
}