public class Book {
/*Creati clasa Book cu urmatoarele fielduri: String name, String author, int TotalPageNumber, int CurrentPage si metodele
flipPageForward(), flipPageBackwards(), printBookState(). Metoda printBookState va printa starea cartii voastre sub forma
"cartea M, scrisa N,avand O pagini, este deschisa la pagina P".
Metodele flippageForward() si flipPageBackwards() vor modifica starea interna a cartii noastre.
HINT: Unei carti nu i se poate da pagina inapoi daca pagina curenta este 1.
De asemenea nu i se poate da o pagina iniante daca pagina curenta este ultima pagina. Creati o carte si rasfoiti-o.
*
*
* */
String name;
String author;
int totalPageNumber;
int currentPage;

public Book(String name, String author, int totalPageNumber){
    this.name = name;
    this.author = author;
    this.totalPageNumber=totalPageNumber;
    currentPage=1;
}

public void flipPageForward(){
if(currentPage == totalPageNumber) {
    System.out.println("Nu mai avem pagini de rasfoit");
}else{
    currentPage++;
    System.out.println("Am dat la pagina " + currentPage);
}
}
    public void flipPageBackwards(){
if(currentPage == 1){
    System.out.println("Nu avem cum sa dam pagini inapoi");
}else{
    currentPage--;
    System.out.println("Am dat la pagina " + currentPage);
}
    }

    public void printBookState(){
        System.out.println("Cartea " + name + " scrisa de " + author + " avand " + totalPageNumber + " este deschisa la pagina "
        + currentPage);
    }


    /*4. Pe baza exercitiului 3, creati in clasa Main o metoda care primeste ca parametru o carte si ii rasfoieste
    * toate paginile. Apelati metoda pentru 3 carti.*/

 }

