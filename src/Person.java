import java.util.Calendar;

public class Person {
    //Instansvariabler / fält(field) / egenskaper / attribut
    String firstName;
    String lastName;
    String dateOfBirth; //yyyy-mm-dd
    double height;  // meter
    double weight; // kg
    // Metoder / Operationer / funktion
    /**
     * En Klassmetod om retunerar hela namnet
     * @param p en instans av klassen person
     * @return Namnet (förnamn + efternamn)
     */
    public static String getName(Person p){
        return p.firstName + " " + p.lastName;
    }
    public static void main(String[] args) {
        // write your code here
    }

    public static int getAge(Person p) {
        String calendar = Calendar.getInstance().getTime().toString();
        System.out.println(calendar);
        String thisYearString = calendar.substring(calendar.lastIndexOf(' ')+1);
        System.out.println(thisYearString);
        int thisYear = Integer.parseInt(thisYearString);
        System.out.println(thisYear);

        //hämta år från dateOfbirth (1996-01-13)
        String yearString = p.dateOfBirth.substring(0,4);
        int year = Integer.parseInt(yearString);

        int age = thisYear - year;

        return age;




    }
    /**
     * en klassmetod som beräknar kroppsmassindex
     * @param p är en refernsvariabel av typer Person
     * @return
     */public static double getBMI(Person p){

         return p.weight / (p.height* p.height);

    }
    /**
     * en klassmetod som returnerar viktklassen
     * @param p är en person
     * @return viktklassen
     *
     */
    public static String getBMICategory(Person p){
        double BMI = Person.getBMI(p);

        String category;
        if(BMI< 18.5)
            category = "undervikt";
        else if (BMI <= 25);
        category = "Normalvikt";
        else
        category = "Övervikt";

        return category;
    }
}
