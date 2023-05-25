package chapter9_Inheritance;

public class InheritanceTest {
    public static void main(String arg[]) {
        //Person p=new Person();
        //String pText=p.print();
        //System.out.println(pText);

        //Employee e=new Employee();
        //String eText=e.print("thara");
        //System.out.println(eText);


            Mother mom = new Mother();
            mom.setName("Anne");

            System.out.println(mom.getName()+ " is a " + mom.getGender());

    }
}
