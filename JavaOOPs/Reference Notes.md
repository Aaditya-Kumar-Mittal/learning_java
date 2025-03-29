# Java Object-Oriented Programming (OOP) Concepts

<!-- markdownlint-disable MD024-->

## Table of Contents

- [Java Object-Oriented Programming (OOP) Concepts](#java-object-oriented-programming-oop-concepts)
  - [Table of Contents](#table-of-contents)
  - [1. Class](#1-class)
  - [2. Object](#2-object)
  - [3. Encapsulation](#3-encapsulation)
  - [4. Inheritance](#4-inheritance)
  - [5. Polymorphism](#5-polymorphism)
  - [6. Abstraction](#6-abstraction)
  - [7. Methods: Overloading, Signature, and Mutability](#7-methods-overloading-signature-and-mutability)
    - [7.1 Method Overloading](#71-method-overloading)
      - [Example](#example)
    - [7.2 Method Signature](#72-method-signature)
      - [Example](#example-1)
    - [7.3 Mutability in Methods](#73-mutability-in-methods)
      - [**Mutable Objects**](#mutable-objects)
      - [**Immutable Objects**](#immutable-objects)
    - [Summary](#summary)
  - [8. Packages, Imports and ClassPath](#8-packages-imports-and-classpath)
    - [8.1 Packages](#81-packages)
      - [Creating a Package](#creating-a-package)
    - [8.2 Importing Packages](#82-importing-packages)
      - [Importing a Single Class](#importing-a-single-class)
      - [Importing All Classes from a Package](#importing-all-classes-from-a-package)
    - [8.3 ClassPath](#83-classpath)
      - [Setting ClassPath](#setting-classpath)
    - [Summary](#summary-1)

## 1. Class

- A **class** is a blueprint for creating objects.
- It defines the properties (fields/attributes) and behaviors (methods) of an object.
- Example:

```java
class Car {
    String brand;
    int speed;

    void showDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}
```

## 2. Object

- An **object** is an instance of a class.
- It represents a real-world entity with its own values and behaviors.
- Example:

```java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an object
        myCar.brand = "Toyota";
        myCar.speed = 120;
        myCar.showDetails();
    }
}
```

## 3. Encapsulation

- **Encapsulation** is the process of wrapping data (variables) and methods together into a single unit (class).
- It helps in **data hiding** by making fields private and providing public getter/setter methods.
- Example:

```java
class Person {
    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}
```

## 4. Inheritance

- **Inheritance** allows one class (child/subclass) to acquire the properties and methods of another class (parent/superclass).
- It promotes code **reusability**.
- You can create an instance of a subclass as a reference to the superclass, which inherits properties and methods from the superclass.
- Example:

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

## 5. Polymorphism

- **Polymorphism** allows the same method to have different behaviors in different classes.
- It is achieved through **method overriding** and **method overloading**.
- Example of Method Overriding:

```java
class Parent {
    void show() {
        System.out.println("Parent class");
    }
}
class Child extends Parent {
    void show() {
        System.out.println("Child class");
    }
}
```

- Example of Method Overloading:

```java
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

## 6. Abstraction

- **Abstraction** is the process of hiding implementation details and showing only functionality.
- It is achieved using **abstract classes** and **interfaces**.
- Example:

```java
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}
```

## 7. Methods: Overloading, Signature, and Mutability

### 7.1 Method Overloading

Method Overloading allows multiple methods in a class to have the same name but with different parameters (different number or types of parameters). It improves code readability and reusability.

#### Example

```java
class Calculator {
    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters (overloaded version)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters (overloaded version)
    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));         // Calls add(int, int)
        System.out.println(calc.add(5, 10, 15));     // Calls add(int, int, int)
        System.out.println(calc.add(5.5, 2.3));      // Calls add(double, double)
    }
}
```

**Explanation:**

- The `add` method is overloaded to handle different types and numbers of arguments.
- The compiler determines which method to invoke based on the method signature.

---

### 7.2 Method Signature

A **method signature** consists of:

- Method name
- Number of parameters
- Type of parameters
- Order of parameters

The return type is **not** a part of the method signature.

#### Example

```java
void greet(String name)      // Method Signature: greet(String)
int sum(int a, int b)       // Method Signature: sum(int, int)
double multiply(double x, int y) // Method Signature: multiply(double, int)
```

**Key Points:**

- Changing only the return type does **not** count as method overloading.
- The method name and parameter list must be different for overloading to occur.

---

### 7.3 Mutability in Methods

Mutability refers to whether an object's state can be changed after it's created.

#### **Mutable Objects**

Mutable objects allow modification of their fields.

Example:

```java
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void changeName(String newName) {
        this.name = newName;
    }
}

public class MutabilityExample {
    public static void main(String[] args) {
        Person p = new Person("Alice");
        System.out.println(p.name);  // Alice
        p.changeName("Bob");
        System.out.println(p.name);  // Bob
    }
}
```

**Explanation:**

- The `Person` object allows modification of the `name` field, making it **mutable**.

#### **Immutable Objects**

Immutable objects do not allow modification after creation.

Example:

```java
final class ImmutablePerson {
    private final String name;

    ImmutablePerson(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

public class ImmutableExample {
    public static void main(String[] args) {
        ImmutablePerson p = new ImmutablePerson("Alice");
        System.out.println(p.getName()); // Alice
        // p.name = "Bob"; // Error! Cannot modify
    }
}
```

**Explanation:**

- The `ImmutablePerson` class is **immutable** because:
  - Fields are `private final`.
  - No setter methods are provided.
  - The object state cannot be changed after creation.

---

### Summary

- **Method Overloading** allows multiple methods with the same name but different parameters.
- **Method Signature** consists of the method name and parameter list (return type does not matter).
- **Mutability** defines whether an object's state can be changed.
  - **Mutable objects** allow changes.
  - **Immutable objects** do not allow modifications.

## 8. Packages, Imports and ClassPath

Here is the **"8. Packages, Imports, and ClassPath"** section in Markdown format:

### 8.1 Packages

- A **package** in Java is a way to group related classes, interfaces, and sub-packages together. It helps in organizing code and avoiding name conflicts.
- Packages are hierarchical, meaning they can have sub-packages within sub-packages.
-

#### Creating a Package

To create a package, use the `package` keyword at the beginning of a Java file.

```java
package com.example.utilities;

public class MathHelper {
    public static int square(int num) {
        return num * num;
    }
}
```

**Explanation:**

- The package name is `com.example.utilities`, following Java's hierarchical naming convention.
- This class can now be used in other programs by importing it.

---

### 8.2 Importing Packages

To use a class from another package, you need to import it using the `import` statement.

#### Importing a Single Class

```java
import com.example.utilities.MathHelper;

public class Main {
    public static void main(String[] args) {
        int result = MathHelper.square(5);
        System.out.println("Square of 5: " + result);
    }
}
```

#### Importing All Classes from a Package

```java
import com.example.utilities.*;

public class Main {
    public static void main(String[] args) {
        int result = MathHelper.square(5);
        System.out.println("Square of 5: " + result);
    }
}
```

**Key Points:**

- `import com.example.utilities.MathHelper;` imports only the `MathHelper` class.
- `import com.example.utilities.*;` imports all classes from the `utilities` package.

---

### 8.3 ClassPath

**ClassPath** is the location where Java searches for compiled `.class` files while running a program.

#### Setting ClassPath

1. **Using Command Line**

   - Compile:

     ```sh
     javac -d . MathHelper.java
     ```

   - Run:

     ```sh
     java com.example.utilities.MathHelper
     ```

2. **Setting ClassPath Manually**

   - You can set the `CLASSPATH` environment variable:

     ```sh
     export CLASSPATH=/path/to/classes
     ```

   - Or specify it during execution:

     ```sh
     java -cp /path/to/classes com.example.utilities.Main
     ```

---

### Summary

- **Packages** organize Java classes into namespaces to prevent conflicts.
- **Imports** allow using classes from other packages.
- **ClassPath** defines where Java looks for `.class` files during compilation and execution.
