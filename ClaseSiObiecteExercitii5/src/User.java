public class User {


    /*1. Creati clasa User, cu urm. fielduri: String username, String password
    Constructorul clasei va primi urmatorii parametrii: username, password, si confirmPassword
    In constructor se vor efectua urmatoarele verificari. Fiecare incalcare a acestor reguli, va afisa la consola un mesaj corespunzator:
    Usernameul trebuie sa aiba minim 7 caractere
    Parola trebuie sa aiba minim 8 caractere
    Parola trebuie sa contina cel putin doua cifre
    parola pasata ca parametru trebuie sa fie aceeasi cu parola confirmata
    Creati un user care sa respecte toate crintele aplicatiei
    Creati un user care sa incalce cate o cerinta a aplicatiei.

    */

    String username;
    String password;


    public User(String username, String password, String confirmPassword) {
        this.username = Character.MIN_VALUE;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
}
