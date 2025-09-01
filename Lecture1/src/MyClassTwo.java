
public class MyClassTwo {

    static int staticVar = 50;

    int instanceVar = 100; // non-static instance variable, it cannot be accessed directly in static context

    public static void main(String[] args) {

        int a = 25;

        // a in stack and 25 in heap
        // literals - 25 is not going into memory until the program runs
        // What source file has is literals
        // Integral, Float Point, String Literal, Boolean Literal, Character Literal
        byte b = 25;
        long ll = 25L;
        short s = 789;
        short s1 = (short) 32768; // Explicit Type casted a int to short

        // Small size data type to high size data type conversion is implicit and is
        // possible
        System.out.println(a);
        System.out.println(b);
        System.out.println(ll);
        System.out.println(s);
        System.out.println(s1);

        float f = 98.9f;
        float f1 = (float) 98.9;
        System.out.println(f);
        System.out.println(f1);

        int decimalOne = 32;

        int hexOne = 0x32;

        int octalOne = 032;

        int binaryOne = 0b00100000;

        System.out.println(decimalOne);
        System.out.println(hexOne);
        System.out.println(octalOne);
        System.out.println(binaryOne);

        char ch1 = 'a';

        char ch2 = 062;

        char ch3 = 62;

        char ch4 = 0x12A;

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);

        System.out.println("System\tout");
        System.out.println("System\nout");
        System.out.println("System\bout");
        System.out.println("System\bout");
        System.out.println("System\"out");
        System.out.println("System\\out");

        // Local variable can never be static i.e. static int local = 30; raises error
        // In static method we can access only static data members directly, not non-static
        System.out.println("Static variable in main function : " + staticVar);

        // non-static method also cannot be accessed by static methods directly
        // myFunction(); // Cannot make a static reference to the non-static method myFunction() from the type MyClassTwo
        MyClassTwo obj = new MyClassTwo();
        obj.myFunction();
        System.out.println("Instance variable in main function can be accessed in static main method by creating an object of the class : " + obj.instanceVar);

        MyClassTwo obj2 = new MyClassTwo();
        obj2.instanceVar = 500;
        System.out.println("Instance variable in main function can be accessed in static main method by creating an object of the class : " + obj2.instanceVar);
        System.out.println("Instanace variable was changes but it was not changed for obj as well : " + obj.instanceVar);
        // Hence, non-static instance level variable exists for each object of the classs.
        // Static variable of a class is created only once in the memoy and is shared
        obj2.myFunction();

        MyClassTwo.staticVar = 50050;

        System.out.println("Static variable in main function after modification : " + obj.staticVar);
        System.out.println("Static variable in main function after modification : " + obj2.staticVar);
        System.out.println("Static variable in main function after modification : " + MyClassTwo.staticVar);

        // All the instance of a class will refer to the same static variable
    }

    void myFunction() {
        // Static variable can also be accessed in non-static method
        System.out.println("Static variable in myFunction : " + staticVar);

        // Non static method can access instance (non-static) variable
        System.out.println("Instance variable in myFunction : " + instanceVar);

    }
}
