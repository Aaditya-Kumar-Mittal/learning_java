# Java Basics – Entry Point, Main Method & Comments

## Table of Contents

- [Java Basics – Entry Point, Main Method \& Comments](#java-basics--entry-point-main-method--comments)
  - [Table of Contents](#table-of-contents)
  - [Installation Links](#installation-links)
  - [Entry Point of a Java Program](#entry-point-of-a-java-program)
  - [Function Signature of `main()`](#function-signature-of-main)
  - [Why `main()` is Public](#why-main-is-public)
  - [Why `main()` is Static](#why-main-is-static)
  - [Why `main()` Uses void](#why-main-uses-void)
  - [What is `main`?](#what-is-main)
  - [Execution Without `main()`](#execution-without-main)
  - [Comments in Java](#comments-in-java)
    - [Types of Comments](#types-of-comments)

---

## Installation Links

- **JDK (Java Development Kit):** [Download JDK](https://www.oracle.com/java/technologies/downloads/)
- **Java Official Documentation (Java SE 21):** [View Documentation](https://docs.oracle.com/en/java/javase/21/)
- **VS Code IDE:** [Download VS Code](https://code.visualstudio.com/download)
- **IntelliJ IDEA IDE:** [Download IntelliJ](https://www.jetbrains.com/idea/)
- **Eclipse IDE:** [Download Eclipse](https://www.eclipse.org/downloads/packages/)

---

## Entry Point of a Java Program

- The **entry point** of any Java program is the `main()` method.
- Execution begins from this method; without it, the **JVM (Java Virtual Machine)** will throw an error.
- A **daemon thread** is attached to the main method and continues execution until the program ends.
- If `main()` is not found, the program **cannot start execution**.

---

## Function Signature of `main()`

The standard declaration is:

```java
public static void main(String[] args)
```

- **public** → Access modifier, ensures JVM can call it from outside the class.
- **static** → Allows JVM to call the method without creating an object.
- **void** → No return value expected; program ends after execution.
- **main** → Method name recognized by JVM as the starting point.
- **String\[] args** → Parameter that stores command-line arguments.

---

## Why `main()` is Public

- The **JVM needs access** to invoke the method.
- If it were private/protected/default, JVM couldn’t reach it.
- **Global accessibility** ensures execution from any package/class.

---

## Why `main()` is Static

- Eliminates the need for object creation just to call `main()`.
- **Memory-efficient**: avoids unnecessary object allocation.
- JVM directly invokes the method using class reference.
- Being static means it is **class-related, not object-related**.

---

## Why `main()` Uses void

- The method doesn’t return any value to JVM.
- When `main()` finishes, the program terminates.
- Even if you write `return;` inside `main()`, it **returns nothing**.
- Returning a value would be **useless** because JVM cannot use it.

---

## What is `main`?

- **Identifier name** of the starting method.
- It is **not a keyword** in Java.
- JVM looks specifically for the method named `main`.

---

## Execution Without `main()`

- Java allows execution **without `main()` using static blocks** (before Java 8).
- **Static Block:** Executes once when the class is loaded into memory.
- Example:

```java
class JavaPlusDSA {
    static {
        System.out.println("Mai chala toh sbko current laga re!!!!");
    }
}
```

- On execution, this prints the statement even without `main()`.
- ⚠️ **Note:** From **Java 8 onwards**, this is no longer supported. JVM strictly requires `main()`.

---

## Comments in Java

- Comments are **non-executable statements** used to improve code readability.
- Useful for **documentation, explanation, and debugging assistance**.

### Types of Comments

1. **Single-line Comment**

   - Starts with `//`

   ```java
   // This is a single-line comment
   ```

2. **Multi-line Comment**

   - Starts with `/*` and ends with `*/`

   ```java
   /* This is a 
      multi-line comment */
   ```

3. **Documentation Comment (Javadoc)**

   - Starts with `/**` and ends with `*/`
   - Used for generating **API documentation**.

   ```java
   /**
    * This method prints Hello World
    * @param args command-line arguments
    */
   public static void main(String[] args) {
       System.out.println("Hello World");
   }
   ```

💡 **Fun Note:**

> *"Best use of comments is that you can comment the Bug in the program and the Bug will be resolved?"*
> Not really! The bug will disappear… but so will your job opportunity 😂
