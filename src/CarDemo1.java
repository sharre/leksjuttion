public class CarDemo1 {
    public static void main(String[] args ){

        // en instans av klassen car
        Car1 c1 = new Car1();

        System.out.println(c1.modelName + "ägs av " + c1.owner);

        c1.modelName = "Volvo";
        System.out.println(c1.modelName + "ägs av " + c1.owner );

        //vi ska sälja bilen
        Person p1 = new Person();
        p1.firstName = "Sharmaarke";
        p1.lastName = "Shiik daahir";

        Person p2 = new Person();
        p2.firstName = "ilwad";
        p2.lastName = "Shiik daahir";

        //viktigt
        c1.owner = p2;
        System.out.println(c1.modelName + "ägs av " + c1.owner );

        //Volvo ägs av peron@3ajrnr3jf

        System.out.println(c1.modelName + "ägs av " + Person.getName (c1.owner) );

        // Byt ägare
        Person p3 = new Person();
        p3.firstName = "test";
        p3.lastName = "testson";

        //Data
        // bilen har en referens som heter c1
        //köparen har en referens som heter p3
        c1.owner = p3;
                System.out.println("Bilen ägs nu av" + c1.owner );

                //bilen ägs nu av person@

        //övning
        //Skriv ut ägarens förnamn (ej hela namnet)
        System.out.println("Bilen ägs av " + c1.owner.firstName);
        c1.owner = p1;


        System.out.println("Bilen ägs av " + c1.owner.firstName);

        // Arbeta med klassvariabler (statiska variabler)

        System.out.println(" ---- klassvariabler ----");
        System.out.printf("Pris exkl. moms: %,.0f kr \n", c1.price);
        System.out.println("momssatsen: %.0f%%/n " + Car1.moms * 100);

        c1.price = 100000; // utan moms(exkl. moms)
        //Pris inkl. moms = 100 000 * 1,25
        System.out.printf("Pris inkl. moms: %,.0f kr \n" , c1.price * (1+Car1.moms));

    }
}

