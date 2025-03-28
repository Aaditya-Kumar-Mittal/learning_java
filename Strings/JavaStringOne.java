class Student {

  String name;
  String address;
  int standard;
  int roll_number;
}

public class JavaStringOne {

  public static void main(String[] args) {

    // student1 is an object of the Student class
    // for primitive variables, the value is stored in the variable
    // when an object is created using the new keyword, the memory is allocated to
    // the object and the variable stores the address of the allocated memory
    Student student1 = new Student();
    student1.name = "John";
    student1.address = "New York";
    student1.standard = 11;
    student1.roll_number = 1;
    System.out.println(student1.name);
    System.out.println(student1.address);
    System.out.println(student1.standard);
    System.out.println(student1.roll_number);

    String sample_address = new String("New Delhi, India");
    System.out.println(sample_address);

    String a = new String("Ram");
    String b = new String("Ram");
    System.out.println(a == b); // We are comparing the address of the variables
    String c = "Ram";
    String d = "Ram";
    System.out.println(c == d); 

    // Here we have 4 String holding the same value, In heap, there is a portion called String pool, where the strings created with new keyword are stored. The variables point to that same memory location. 
  }
}