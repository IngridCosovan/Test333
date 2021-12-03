public class Elev {




    String name;
    String grade;
    static  String school;


    public Elev(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public static void changeSchoolName(String newName){
school=newName;
    }

    public void changeSchoolName(){

    }
}
