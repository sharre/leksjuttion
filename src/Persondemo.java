public class Persondemo {
    public static void main(String[] args){
     //Skapa instanser av klassen Person
     Person p1; //p1 är en referansvariabler
     p1 = new Person();//ett objekt skapa

     //skriv objektet
        System.out.println(p1); //hash-kod Person@6d03e736
        System.out.println(p1.firstName); //null
        System.out.println(p1.lastName); //null
        System.out.println(p1.dateOfBirth);//null
        System.out.println(p1.height);//0.0
        System.out.println(p1.weight);//0.0

        //ändra namnet
        p1.firstName = "Sharmaarke";
        p1.lastName = "shiik daahir";

        //Skriv ut hela namnet med hjälp av en metod
        String name = Person.getName(p1);
        System.out.println(name);

        //System.out.println(Person.getName(p1));

        //arbeta med ålder
        p1.dateOfBirth = "1996-01-13";
        Person.getAge(p1);
        System.out.println("Ålder: " + Person.getAge(p1));

        //arbeta med BMI
        double BMI = Person.getBMI(p1);
        System.out.println(BMI);
        p1.height = 1.70;//m
        p1.weight = 79; //kg
        System.out.printf("BMI: %.2f \n" , Person.getBMI(p1));

        //visa viktklassen
        String viktklass = Person.getBMICategory(p1);
        System.out.println("Viktklass: " + viktklass);






    }

}
