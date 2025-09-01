# Programming Languages

## Table of Contents

- [Programming Languages](#programming-languages)
  - [Table of Contents](#table-of-contents)
  - [Introduction](#introduction)
  - [Classification of Programming Languages](#classification-of-programming-languages)
    - [Machine Language](#machine-language)
    - [Assembly Language](#assembly-language)
    - [High-Level Language](#high-level-language)
  - [Types of Programming Languages](#types-of-programming-languages)
    - [Procedural Language](#procedural-language)
    - [Functional Language](#functional-language)
    - [Object-Oriented Language](#object-oriented-language)
    - [Scripting Language](#scripting-language)
  - [Typing System](#typing-system)
    - [Statically Typed Languages](#statically-typed-languages)
    - [Dynamically Typed Languages](#dynamically-typed-languages)
  - [Classification of C++, Java, and Python](#classification-of-c-java-and-python)
  - [Examples](#examples)
    - [C++ Example](#c-example)
    - [Java Example](#java-example)
    - [Python Example](#python-example)
  - [Conclusion](#conclusion)

---

## Introduction

Programming languages are the medium through which humans communicate instructions to computers. They allow developers to write programs to solve real-world problems. These languages are broadly classified based on their **level of abstraction**, **programming paradigm**, and **typing discipline**.

---

## Classification of Programming Languages

### Machine Language

- Low-level language.
- Written in binary digits (**0s and 1s**).
- Directly understood by the computer.
- Needs **no translation**.

✅ Example:

```bash
10110000 01100001
```

---

### Assembly Language

- A type of low-level language.
- Uses **symbolic instructions** instead of binary.
- Requires an **assembler** to convert to machine code.
- Hardware specific.

✅ Example (x86 Assembly):

```asm
MOV AX, 5
ADD AX, 10
```

---

### High-Level Language

- **Developer friendly** and closer to human language.
- Needs a **compiler** or **interpreter**.
- Independent of hardware.

✅ Example (C++):

```cpp
int sum = 5 + 10;
```

---

## Types of Programming Languages

| Type                | Characteristics                                                                 | Examples           |
| ------------------- | ------------------------------------------------------------------------------- | ------------------ |
| **Procedural**      | Step-by-step, structured, uses functions.                                       | C, FORTRAN         |
| **Functional**      | Computations are treated as functions. Emphasizes immutability.                 | Python, Haskell    |
| **Object-Oriented** | Uses classes and objects, supports inheritance, encapsulation, polymorphism.    | Java, C++          |
| **Scripting**       | Interpreted, executes one command at a time, often for automation or web tasks. | Python, JavaScript |

---

### Procedural Language

- Program is divided into procedures (functions).
- Step-by-step execution.
- Easy to debug and maintain.

✅ Example (C):

```c
#include <stdio.h>
int add(int a, int b) {
    return a + b;
}
int main() {
    printf("%d", add(5, 3));
    return 0;
}
```

---

### Functional Language

- Every computation is expressed as a function.
- Functions take arguments and return values.
- Encourages **reusability**.

✅ Example (Python):

```python
def square(x):
    return x * x

print(square(5))  # Output: 25
```

---

### Object-Oriented Language

- Organizes code using **classes and objects**.
- Features: Inheritance, Encapsulation, Polymorphism.

✅ Example (Java):

```java
class Car {
    String brand;
    Car(String brand) {
        this.brand = brand;
    }
    void display() {
        System.out.println("Car Brand: " + brand);
    }
}
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW");
        c1.display();
    }
}
```

---

### Scripting Language

- Interpreted (runs line by line).
- Used for automation, web scripting, quick tasks.

✅ Example (Python):

```python
for i in range(3):
    print("Hello, Script!")
```

---

## Typing System

| Typing System         | Description                                                                | Example Languages  |
| --------------------- | -------------------------------------------------------------------------- | ------------------ |
| **Statically Typed**  | Variable type known at **compile time**. Errors caught early.              | C++, Java          |
| **Dynamically Typed** | Variable type determined at **runtime**. More flexibility but error-prone. | Python, JavaScript |

---

### Statically Typed Languages

- Type of each variable must be **declared explicitly**.
- Errors caught at compile time.

✅ Example (C++):

```cpp
int x = 10;   // Must declare type
```

---

### Dynamically Typed Languages

- Type of variable determined **at runtime**.
- More flexibility, but may lead to runtime errors.

✅ Example (Python):

```python
x = 10      # Integer
x = "text"  # Now a string
```

---

## Classification of C++, Java, and Python

| Feature                  | **C++**                              | **Java**                              | **Python**                               |
| ------------------------ | ------------------------------------ | ------------------------------------- | ---------------------------------------- |
| **Level**                | High-Level (with low-level features) | High-Level                            | High-Level                               |
| **Paradigm**             | Procedural + Object-Oriented         | Object-Oriented (Strict)              | Object-Oriented + Functional + Scripting |
| **Typing**               | Statically Typed                     | Statically Typed                      | Dynamically Typed                        |
| **Compiled/Interpreted** | Compiled                             | Compiled to bytecode + JVM interprets | Interpreted                              |
| **Ease of Use**          | Moderate (complex syntax)            | Easier than C++, strict syntax        | Very easy, beginner-friendly             |
| **Use Cases**            | System programming, Game dev, OS dev | Enterprise apps, Android apps         | AI/ML, Web dev, Scripting, Automation    |

---

## Examples

### C++ Example

```cpp
#include <iostream>
using namespace std;

int main() {
    int a = 5, b = 3;
    cout << "Sum: " << a + b << endl;
    return 0;
}
```

### Java Example

```java
public class Main {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println("Sum: " + (a + b));
    }
}
```

### Python Example

```python
a, b = 5, 3
print("Sum:", a + b)
```

---

## Conclusion

Programming languages can be classified based on **level, paradigm, and typing system**.

- **C++** combines low-level and high-level features with static typing.
- **Java** is purely object-oriented and statically typed, widely used in enterprise systems.
- **Python** is versatile, dynamically typed, and supports multiple paradigms (OOP, functional, scripting).

Each has its strengths, and the choice depends on the application domain.
