package question2;

public class c {

    public String toString() {
        return "c";
    }

    public void method() {
        System.out.println("c 1");
    }

    public void method2() {
        System.out.println("c 2");
    }


    /* method of showing the polymorphism */
    public void showPolymorphism(c poly) { //parameter is class c.

        System.out.println("Name of class : " + poly.getClass().toString()); //print real name of class
        System.out.println("toString method : " + poly.toString()); //print and call toString.

        System.out.print("method() : "); //print and call method()
        poly.method();

        System.out.print("method2() : "); //print and call method2()
        poly.method2();
    }

    public static void main(String[] args) {

        /* creat each class */
        a classA = new a();
        b classB = new b();
        c classC = new c();
        d classD = new d();

        System.out.println("==============  classA  ===============");
        classC.showPolymorphism(classA); //pass classA into showPolymorphism method of class C
        System.out.println("==============  classB  ===============");
        classC.showPolymorphism(classB); //pass classB into showPolymorphism method of class C
        System.out.println("==============  classC  ===============");
        classC.showPolymorphism(classC); //pass classC into showPolymorphism method of class C
        System.out.println("==============  classD  ===============");
        classC.showPolymorphism(classD); //pass classD into showPolymorphism method of class C

        //I used one method, it calls other method by polymorphism.
    }
}
