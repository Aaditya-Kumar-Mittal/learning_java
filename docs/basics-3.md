# Java Fundamentals – Compilation, Data Types, Variables, Literals & Type Conversion

## Table of Contents

- [Java Fundamentals – Compilation, Data Types, Variables, Literals \& Type Conversion](#java-fundamentals--compilation-data-types-variables-literals--type-conversion)
  - [Table of Contents](#table-of-contents)
  - [Generating Byte Code in a Separate Directory](#generating-byte-code-in-a-separate-directory)
  - [Data Types in Java](#data-types-in-java)
    - [Primitive Data Types](#primitive-data-types)
    - [Non-Primitive Data Types](#non-primitive-data-types)
  - [Constants in Java](#constants-in-java)
  - [Variables in Java](#variables-in-java)
    - [Local Variable](#local-variable)
    - [Instance Variable](#instance-variable)
    - [Static Variable](#static-variable)
    - [Rules for Naming Variables](#rules-for-naming-variables)
  - [Literals in Java](#literals-in-java)
    - [1. Integral Literals](#1-integral-literals)
    - [2. Floating-Point Literals](#2-floating-point-literals)
    - [3. Character Literals](#3-character-literals)
    - [4. String Literals](#4-string-literals)
    - [5. Boolean Literals](#5-boolean-literals)
  - [Mixed Mode Operations](#mixed-mode-operations)
  - [Java Keywords](#java-keywords)
  - [Type Conversion in Java](#type-conversion-in-java)
    - [Widening or Automatic Conversion](#widening-or-automatic-conversion)
    - [Narrowing or Explicit Conversion](#narrowing-or-explicit-conversion)
    - [Type Promotion in Expressions](#type-promotion-in-expressions)
    - [Automatic Type Promotion](#automatic-type-promotion)
  - [Unicode System in Java](#unicode-system-in-java)
    - [Before Unicode](#before-unicode)
    - [Unicode Range](#unicode-range)

---

## Generating Byte Code in a Separate Directory

Java allows us to control **where the compiled `.class` files are generated** using the `-d` option with `javac`.

1. **To create a class file in the same package:**

   ```bash
   javac -d . Aaditya.java
   ```

2. **To create a class file in a different directory (e.g., bin):**

   ```bash
   javac -d ../bin Aaditya.java
   ```

3. **Running byte code from a different package:**

   - Set the **classpath** to the directory containing the class file.

   ```bash
   set classpath=../bin;
   java mypackage.Aaditya
   ```

   ```bash
   java -cp ../bin MyClassTwo
   ```

4. **Alternate way (without setting permanent classpath):**

   ```bash
   java -classpath ../bin mypackage.Shashwat
   ```

---

## Data Types in Java

Java is a strongly typed language. Every variable must be declared with a **data type**.

### Primitive Data Types

Primitive data types are built-in and represent raw values. They **do not provide additional methods**.

| Data Type | Size    | Range                                                   |
| --------- | ------- | ------------------------------------------------------- |
| byte      | 1 byte  | -128 to 127                                             |
| short     | 2 bytes | -32,768 to 32,767                                       |
| int       | 4 bytes | -2,147,483,648 to 2,147,483,647                         |
| long      | 8 bytes | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float     | 4 bytes | Fractional numbers (6–7 decimal digits)                 |
| double    | 8 bytes | Fractional numbers (15 decimal digits)                  |
| boolean   | 1 bit   | `true` or `false`                                       |
| char      | 2 bytes | Single character / ASCII / Unicode (range: 0 to 65,535) |

### Non-Primitive Data Types

These are **user-defined/reference types** stored in heap memory. They refer to a memory location (object reference).

Examples include:

1. Class
2. Object
3. String
4. Array
5. Interface

---

## Constants in Java

- A **constant** is a variable whose value cannot be changed once assigned.
- Declared using the **`final` keyword**.

Example:

```java
final int SPEED_LIMIT = 120;
```

🔹 Constants are cached by JVM, improving performance.

---

## Variables in Java

A **variable** is a named memory location used to store data.

Types of variables:

### Local Variable

- Declared inside a method.
- Accessible only within that method.
- Cannot be declared as `static`.

```java
void display() {
    int x = 10; // local variable
    System.out.println(x);
}
```

### Instance Variable

- Declared inside a class but **outside methods**.
- Belongs to a specific object instance.
- Can have access modifiers.

```java
class Student {
    int age; // instance variable
}
```

### Static Variable

- Declared with the `static` keyword.
- Belongs to the class, **shared among all objects**.
- Memory allocated only once when the class is loaded.

```java
class Student {
    static String school = "ABC School"; // static variable
}
```

### Rules for Naming Variables

1. Can contain letters, digits, `_`, and `$`.
2. Must begin with a **letter**.
3. Cannot contain whitespace.
4. Case-sensitive. (`myVar` ≠ `myvar`)
5. Reserved keywords cannot be used.
6. Best practice: Start with lowercase letter (`studentName`).

---

## Literals in Java

A **literal** is a fixed value directly assigned to a variable.

### 1. Integral Literals

- **Decimal:**

  ```java
  int x = 101;
  ```

- **Octal (prefix `0`):**

  ```java
  int x = 0146;
  ```

- **Hexadecimal (prefix `0x` or `0X`):**

  ```java
  int x = 0x123Face;
  ```

- **Binary (prefix `0b` or `0B`):**

  ```java
  int x = 0b1111;
  ```

🔹 By default, literals are `int`. Use `L/l` for long.

### 2. Floating-Point Literals

- Must be in **decimal form only**.
- By default, literals are `double`. Use `f/F` for float.

```java
double d = 123.456;
float a = 101.23f;
```

### 3. Character Literals

- **Single character:**

  ```java
  char ch = 'a';
  ```

- **Integral value (Unicode):**

  ```java
  char ch = 62;
  ```

- **Unicode representation:**

  ```java
  char ch = '\u0061'; // 'a'
  ```

- **Escape sequence:**

  ```java
  char ch = '\n';
  ```

### 4. String Literals

- Any sequence of characters inside **double quotes**.

```java
String s = "Hello World";
```

### 5. Boolean Literals

```java
boolean flag = true;
```

---

## Mixed Mode Operations

Java allows **mixing of characters and integers** in expressions.

Example:

```java
System.out.println('A' + 10); // Prints 75 (Unicode of A = 65)
```

---

## Java Keywords

- Reserved words with predefined meaning.
- Cannot be used as identifiers.
  Examples: `int`, `class`, `boolean`, `return`, `static`, `public`.

---

## Type Conversion in Java

### Widening or Automatic Conversion

- Small data type → Large data type.
- Done automatically by JVM.

```java
int x = 10;
double y = x; // widening
```

### Narrowing or Explicit Conversion

- Large data type → Small data type.
- Must use **type casting**.

```java
double d = 100.5467;
long l = (long)d; // narrowing
```

⚠️ Data loss may occur.

```java
int i = 257;
byte b = (byte)i; // b = 1 (257 % 256)
```

### Type Promotion in Expressions

1. **Implicit:**

   - byte/short/char → int
   - If one operand is `long/float/double`, entire expression promoted.

   ```java
   byte a = 10, b = 20;
   int c = a * b; // promoted to int
   ```

2. **Explicit:**

   - If storing in a smaller type, use casting.

   ```java
   int result = (int)(10.5 + 20);
   ```

### Automatic Type Promotion

- Happens when a method expects higher datatype and smaller is passed.

```java
void display(double x) { ... }
display(5); // int promoted to double
```

---

## Unicode System in Java

- Java uses **Unicode** (2 bytes per character).
- Supports most world languages.

### Before Unicode

- **ASCII** – U.S. English
- **ISO 8859-1** – Western Europe
- **KOI-8** – Russian
- **GB18030/BIG-5** – Chinese

### Unicode Range

- Lowest value: `\u0000`
- Highest value: `\uFFFF`

Example:

```java
char ch = '\u0041'; // 'A'
```

---
