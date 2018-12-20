

public class B2L4_inheritance {
    public static void main(String[] args){


        Student s1 = new Student();
        s1.setName("erwin");

        Teacher t1 = new Teacher();
        t1.setName("Henk");

        Parent Pt = new Parent();
        Pt.setName("Ed");
        Pt.setvote(true);
        Pt.getvote();

        adult at = new adult();
        at.setName("Sebastiaan");
        at.setcan_cook(false);
        at.getcan_cook();

        Trainer tr1 = new Trainer();
        tr1.setName("Frits");
        tr1.setSubject("Programming");

        System.out.println("\033[1;92m"+"hallo daar " );

        Person p1 = new Person();
        p1.setName("henkhenkhenkhenkhenkhenkhenk");




        Person[] people = {
                new Teacher(),
                new Student()

        };
        Teacher t = (Teacher)people[0];
        t.setName("Erwin");
        t.setIq(13);
        t.addDiploma("HBO gamedesign & Development (HKU)");

        Student s = (Student)people[1];
        s.setName("Hendrik");
        s.setIq(13);
        s.addCourse("PRO2");
        s.addDiploma("VMBO T");

        for (Person person : people) {
            System.out.println("De naam  van de volwassene  is " + at.getName() + " en kan " + at.getcan_cook() + " koken" );
            System.out.println("De naam van de ouder is " + Pt.getName() + " en stemt " + Pt.getvote() + " stemmen." );
            System.out.println(person.getName() + " has an IQ of " + person.getIq() + " and has the following diplomas " + person.getDiplomas());

        }

    }
}
