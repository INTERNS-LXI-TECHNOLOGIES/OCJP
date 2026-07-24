# Chapter 5 Workshop: Methods

This workshop is built directly from Chapter 5, “Methods,” and follows the chapter’s learning order.

## Chapter 5 Objectives
- Create and use methods.
- Identify correct and incorrect method declarations.
- Understand access modifiers and optional specifiers.
- Use local, instance, static, and final variables correctly.
- Use varargs correctly.
- Understand static members, initializers, and imports.
- Understand pass-by-value and return values.
- Use autoboxing and unboxing.
- Understand and apply method overloading.

## Prerequisites
- Basic Java class structure and main method from earlier chapters.
- Basic variables, operators, and simple statements.

---

## Learning Path
1. Level 1 — Absolute Beginner
2. Level 2 — Basic Understanding
3. Level 3 — Concept Application
4. Level 4 — Multi-Concept Programming
5. Level 5 — Debugging
6. Level 6 — Output Prediction
7. Level 7 — OCJP Exam Level
8. Level 8 — Expert Challenge

---

# Section 1: Designing Methods

## 1.1 Simple Explanation
A method is a named block of code that performs a task. It can be called from other methods.

```java
public class NapExample {
    public static void nap(int minutes) {
        System.out.println("Sleeping for " + minutes + " minutes");
    }

    public static void main(String[] args) {
        nap(10);
    }
}
```

## 1.2 Deep Concept Explanation
A method declaration contains several pieces: access modifier, optional specifier, return type, name, parameter list, optional exception list, and body.

The method signature is the method name plus parameter list. It identifies how the method can be called.

## 1.3 Internal JVM Behavior
When a method is called, the JVM creates a new stack frame for that method. The method executes and then returns to the caller. If the method has a return type other than void, it must return a value of a compatible type.

## 1.4 Oracle Certification Rules
- A method must have a return type.
- If the return type is void, a return statement without a value is optional.
- A method declaration cannot place the access modifier after the return type.
- The method body must be enclosed in braces, unless the method is abstract.

## 1.5 Common Mistakes
- Missing parentheses.
- Using the wrong order of modifiers.
- Forgetting to include a return statement for non-void methods.
- Declaring two methods with the same signature in the same class.

## 1.6 Memory Trick
Think: “Access, Specifier, Return, Name, Parameters, Body.”

## 1.7 Real-World Usage
Methods break a program into reusable tasks such as reading input, validating data, and printing summaries.

## 1.8 Beginner Exercise
Write a method named `greet` that prints `Hello`. Call it from `main()`.

## 1.9 Intermediate Exercise
Create a method `calculateDistance(int speed, int time)` that prints `distance = speed * time`.

## 1.10 Advanced Exercise
Create a class with three methods:
- `start()`
- `pause()`
- `stop()`
Call them in a sequence from `main()`.

## 1.11 Expert Exercise
Identify which of the following declarations compile:

```java
public class MethodCheck {
    public void m1() {}
    public final void m2() {}
    public static final void m3() {}
    public modifier void m4() {}
    public void final m5() {}
}
```

## 1.12 Incomplete Program
Problem: Complete the method declaration and call it properly.

```java
public class MethodFill {
    public static void main(String[] args) {
        // call the method here
    }

    public static void sayHello() {
        System.out.println("Hello");
    }
}
```

Hint: Write the method call inside `main()`.

Solution:
```java
public class MethodFill {
    public static void main(String[] args) {
        sayHello();
    }

    public static void sayHello() {
        System.out.println("Hello");
    }
}
```

## 1.13 Debugging Exercise
```java
public class BrokenMethod {
    public static void main(String[] args) {
        showMessage()
    }

    public static void showMessage() {
        System.out.println("Done");
    }
}
```

Fix the missing semicolon.

## 1.14 Output Prediction
```java
public class MethodOutput {
    public static void printValue() {
        System.out.print("A");
    }

    public static void main(String[] args) {
        printValue();
        printValue();
    }
}
```

Expected output: `AA`

## 1.15 OCJP-Style MCQ
Which statement is true?
A. A method signature includes the return type.
B. A method signature includes the method name and parameter list.
C. A method body is optional.
D. A private method can be called from another class.

Correct answer: B.

---

# Section 2: Local, Instance, and Final Variables

## 2.1 Simple Explanation
A local variable is declared inside a method or block. An instance variable is declared inside a class but outside methods.

```java
public class Lion {
    int hunger = 4; // instance variable

    public int feedZooAnimals() {
        int snack = 10; // local variable
        return snack;
    }
}
```

## 2.2 Deep Concept Explanation
Local variables exist only inside the block where they are declared. Instance variables belong to each object of the class.

## 2.3 Internal JVM Behavior
Local variables are stored in the method’s stack frame and disappear when the method finishes. Instance variables are stored as part of each object in heap memory.

## 2.4 Oracle Certification Rules
- A local variable must be assigned before use.
- `final` local variables can be assigned only once.
- A `final` instance variable must be assigned either at declaration or during initialization.

## 2.5 Common Mistakes
- Using a local variable before assigning it.
- Trying to reassign a `final` variable.
- Confusing local and instance variables.

## 2.6 Memory Trick
Local = “lives in the method.” Instance = “lives in the object.”

## 2.7 Real-World Usage
A method may need temporary values such as counters or calculations, while an object may need values that remain across method calls.

## 2.8 Beginner Exercise
Create a class with one instance variable and one local variable. Print both values.

## 2.9 Intermediate Exercise
Create a method that stores a local variable and returns it.

## 2.10 Advanced Exercise
Create a class `Zoo` with an instance variable `animals` and a method that uses a final local variable.

## 2.11 Expert Exercise
Determine which of these compile:

```java
public void test(boolean flag) {
    final int x;
    if(flag) x = 5;
    System.out.println(x);
}
```

The code does not compile because `x` may not be assigned.

## 2.12 Incomplete Program
```java
public class FinalFill {
    private int count = 0;

    public void update() {
        final int value = 5;
        // change value here
    }
}
```

Hint: You cannot reassign a final variable.

## 2.13 Debugging Exercise
```java
public class FinalBug {
    public static void main(String[] args) {
        final int age = 10;
        age = 11;
    }
}
```

Fix the problem by removing the invalid reassignment.

## 2.14 Output Prediction
```java
public class VariableOutput {
    int x = 2;

    public void show() {
        int y = 3;
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        new VariableOutput().show();
    }
}
```

Expected output: `5`

## 2.15 OCJP-Style MCQ
Which variable is local?
A. A field declared in the class.
B. A variable declared inside a method.
C. A static variable.
D. A final instance variable.

Correct answer: B.

---

# Section 3: Varargs

## 3.1 Simple Explanation
A varargs parameter lets a method accept zero or more values of the same type.

```java
public class VarargsExample {
    public static void walk(int... steps) {
        System.out.println(steps.length);
    }

    public static void main(String[] args) {
        walk();
        walk(1, 2, 3);
    }
}
```

## 3.2 Deep Concept Explanation
Behind the scenes, varargs is treated as an array. The method receives an array of values.

## 3.3 Internal JVM Behavior
Java creates an array at runtime for the varargs values. The method uses the array like any other array.

## 3.4 Oracle Certification Rules
- A method can have at most one varargs parameter.
- The varargs parameter must be the last parameter.

## 3.5 Common Mistakes
- Putting the varargs parameter before another parameter.
- Trying to declare two varargs parameters.

## 3.6 Memory Trick
Think: “Varargs = variable number of arguments.”

## 3.7 Real-World Usage
Useful when a method should accept a flexible number of values, like a list of steps or scores.

## 3.8 Beginner Exercise
Write a method `sum(int... values)` and print the total.

## 3.9 Intermediate Exercise
Write a method that accepts an initial number and a varargs list.

## 3.10 Advanced Exercise
Create a `gradeReport` method that accepts any number of scores and prints the count and average.

## 3.11 Expert Exercise
Explain why this code does not compile:

```java
public void test(int... values, int start) {}
```

Because the varargs parameter must be the last parameter.

## 3.12 Incomplete Program
```java
public class VarargsFill {
    public static void main(String[] args) {
        printValues(1, 2, 3);
    }

    public static void printValues(int... values) {
        // print the length here
    }
}
```

Solution:
```java
System.out.println(values.length);
```

## 3.13 Debugging Exercise
```java
public class VarargsBug {
    public static void show(int... values) {
        System.out.println(values[1]);
    }

    public static void main(String[] args) {
        show(10);
    }
}
```

This causes an exception because index `1` does not exist.

## 3.14 Output Prediction
```java
public class VarargsOutput {
    public static void walk(int... steps) {
        System.out.println(steps.length);
    }

    public static void main(String[] args) {
        walk(1);
        walk(1, 2);
    }
}
```

Expected output:
```text
1
2
```

## 3.15 OCJP-Style MCQ
Which declaration is valid?
A. `void a(int... x, int y)`
B. `void b(int x, int... y)`
C. `void c(int... x, int... y)`
D. `void d(int[] x, int... y)`

Correct answer: B.

---

# Section 4: Access Modifiers

## 4.1 Simple Explanation
Access modifiers control who can access methods and fields.

## 4.2 Deep Concept Explanation
- `private`: same class only.
- Package access: same package only.
- `protected`: same package or subclass.
- `public`: anywhere.

## 4.3 Internal JVM Behavior
The compiler checks access rules at compile time. The JVM does not change access; it enforces the compiled structure.

## 4.4 Oracle Certification Rules
- `private` is the most restrictive.
- Package access is the default when no modifier is used.
- `protected` allows subclass access.
- `public` allows access from any class.

## 4.5 Common Mistakes
- Assuming a subclass in another package can access package members.
- Forgetting that `protected` is not the same as `public`.

## 4.6 Memory Trick
Think: Private = only me. Package = my package. Protected = my package and kids. Public = everyone.

## 4.7 Real-World Usage
Use access modifiers to hide implementation details and expose only what is needed.

## 4.8 Beginner Exercise
Create one `private` method and one `public` method in the same class and call both from `main()`.

## 4.9 Intermediate Exercise
Create two classes in the same package and test package access.

## 4.10 Advanced Exercise
Create a parent class and a child class in different packages to test `protected` access.

## 4.11 Expert Exercise
Explain why this code fails:
```java
class A { private void x() {} }
class B { void test() { new A().x(); } }
```

Because `x()` is private and cannot be accessed from class `B`.

## 4.12 Incomplete Program
```java
class Parent {
    void show() {
        System.out.println("Package access");
    }
}
```

Complete a child class in the same package that calls `show()`.

## 4.13 Debugging Exercise
```java
class Example {
    private void secret() {
        System.out.println("Secret");
    }

    public static void main(String[] args) {
        secret();
    }
}
```

Fix it by calling `new Example().secret();` from inside the same class or by changing the method access.

## 4.14 Output Prediction
```java
class AccessTest {
    public void a() { System.out.print("A"); }
    void b() { System.out.print("B"); }
}

public class Main {
    public static void main(String[] args) {
        AccessTest t = new AccessTest();
        t.a();
        t.b();
    }
}
```

Expected output: `AB`

## 4.15 OCJP-Style MCQ
Which access level is the most restrictive?
A. package
B. protected
C. private
D. public

Correct answer: C.

---

# Section 5: Static Members

## 5.1 Simple Explanation
A static member belongs to the class, not to each object.

```java
public class Penguin {
    static int count = 0;

    Penguin() {
        count++;
    }
}
```

## 5.2 Deep Concept Explanation
Static variables are shared by all instances. Static methods can be called without creating an object.

## 5.3 Internal JVM Behavior
Static members are stored with the class itself rather than per object.

## 5.4 Oracle Certification Rules
- Static methods cannot directly call instance methods without an object reference.
- Static methods cannot access instance variables directly.
- `main()` is static.

## 5.5 Common Mistakes
- Calling an instance method from a static method without an object.
- Expecting each object to have its own static variable.

## 5.6 Memory Trick
Static = “shared by the class.”

## 5.7 Real-World Usage
Counters and utility methods are common uses of `static` members.

## 5.8 Beginner Exercise
Create a static variable and increment it from `main()`.

## 5.9 Intermediate Exercise
Create a class with a static method that returns a value.

## 5.10 Advanced Exercise
Create a `Counter` class that counts how many objects are created.

## 5.11 Expert Exercise
Explain why this fails:
```java
public class Problem {
    int x = 5;
    public static void main(String[] args) {
        System.out.println(x);
    }
}
```

Because `main()` is static and cannot access an instance variable directly.

## 5.12 Incomplete Program
```java
public class StaticFill {
    static int total = 0;

    public static void main(String[] args) {
        // increment total here
        System.out.println(total);
    }
}
```

Solution: `total++;`

## 5.13 Debugging Exercise
```java
public class StaticBug {
    static void show() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        show();
    }
}
```

No bug; this works.

## 5.14 Output Prediction
```java
public class StaticOutput {
    static int count = 0;

    public StaticOutput() {
        count++;
    }

    public static void main(String[] args) {
        new StaticOutput();
        new StaticOutput();
        System.out.println(count);
    }
}
```

Expected output: `2`

## 5.15 OCJP-Style MCQ
Which statement is true?
A. Static methods can access instance variables without an object.
B. Static members belong to instances.
C. Static variables are shared by all instances.
D. Static methods cannot be called from `main()`.

Correct answer: C.

---

# Section 6: Static Initializers and Static Imports

## 6.1 Simple Explanation
Static initializers run when the class is first used.

```java
public class InitExample {
    static int value;

    static {
        value = 10;
    }
}
```

## 6.2 Deep Concept Explanation
A static initializer is a block that runs once when the class is loaded. It is useful for initializing static fields.

## 6.3 Internal JVM Behavior
The class loader loads the class and runs the static initializer before the class is used.

## 6.4 Oracle Certification Rules
- Static initializers run in the order they appear.
- Final static fields must be assigned before use.

## 6.5 Common Mistakes
- Forgetting that static initializers run only once.
- Assigning a final static field more than once.

## 6.6 Memory Trick
Static initializer = “setup once when the class starts.”

## 6.7 Real-World Usage
Initializing constants or shared data structures.

## 6.8 Beginner Exercise
Create a class with one static initializer that sets a static variable.

## 6.9 Intermediate Exercise
Use a static initializer to initialize two static variables.

## 6.10 Advanced Exercise
Create a class with a static initializer and print the values from `main()`.

## 6.11 Expert Exercise
Explain whether this compiles:
```java
public class InitCheck {
    static final int x;
    static { x = 3; }
}
```

Yes, because the final static variable is assigned once in a static initializer.

## 6.12 Incomplete Program
```java
public class InitFill {
    static int a;
    static int b;

    static {
        a = 1;
        // assign b here
    }
}
```

Solution: `b = 2;`

## 6.13 Debugging Exercise
```java
public class InitBug {
    static final int x;
    static { x = 3; x = 4; }
}
```

Fix the second assignment.

## 6.14 Output Prediction
```java
public class InitOutput {
    static int x = 1;
    static { x = 2; }

    public static void main(String[] args) {
        System.out.println(x);
    }
}
```

Expected output: `2`

## 6.15 OCJP-Style MCQ
Which statement is true about static initializers?
A. They run every time an object is created.
B. They run when the class is first used.
C. They are allowed only once per method.
D. They can replace constructors.

Correct answer: B.

---

# Section 7: Passing Data and Returning Values

## 7.1 Simple Explanation
Java uses pass-by-value. Values are copied into methods.

```java
public class PassByValue {
    public static void change(int x) {
        x = 10;
    }

    public static void main(String[] args) {
        int y = 5;
        change(y);
        System.out.println(y);
    }
}
```

## 7.2 Deep Concept Explanation
Changing the parameter inside the method does not change the caller’s variable. However, if you call a method on an object passed to the method, the object’s state can change.

## 7.3 Internal JVM Behavior
The method receives a copy of the value. For objects, the reference is copied, so the object can be mutated.

## 7.4 Oracle Certification Rules
- Assigning a new value to a parameter does not update the caller’s variable.
- Returning a value is the way to get data back from a method.

## 7.5 Common Mistakes
- Expecting a swapped value to change outside the method.
- Forgetting to use the method’s returned value.

## 7.6 Memory Trick
Pass-by-value = “copy in, not copy back.”

## 7.7 Real-World Usage
Methods often take input values and return computed results.

## 7.8 Beginner Exercise
Write a method that doubles a number and returns the result.

## 7.9 Intermediate Exercise
Write a method that changes a `StringBuilder` passed as a parameter and observe the effect.

## 7.10 Advanced Exercise
Create a method `swap(int a, int b)` and show that the original values do not change.

## 7.11 Expert Exercise
What is the output?
```java
public class ReturnTest {
    public static int add(int x) {
        x++;
        return x;
    }

    public static void main(String[] args) {
        int y = 2;
        add(y);
        System.out.println(y);
    }
}
```

Output: `2`

## 7.12 Incomplete Program
```java
public class ReturnFill {
    public static int addOne(int x) {
        // return x + 1 here
    }
}
```

Solution: `return x + 1;`

## 7.13 Debugging Exercise
```java
public class ReturnBug {
    public static int getValue() {
        return;
    }
}
```

Fix by returning an integer value.

## 7.14 Output Prediction
```java
public class ReturnOutput {
    public static String greet(String name) {
        name = "Hello " + name;
        return name;
    }

    public static void main(String[] args) {
        String x = "Sam";
        String y = greet(x);
        System.out.println(x + " " + y);
    }
}
```

Expected output: `Sam Hello Sam`

## 7.15 OCJP-Style MCQ
Which statement is true?
A. Java uses pass-by-reference.
B. Java uses pass-by-value.
C. Parameters always change the caller’s variables.
D. Methods cannot return values.

Correct answer: B.

---

# Section 8: Autoboxing and Unboxing

## 8.1 Simple Explanation
Autoboxing converts a primitive to a wrapper class. Unboxing converts a wrapper back to a primitive.

```java
int x = 5;
Integer y = x; // autoboxing
int z = y;     // unboxing
```

## 8.2 Deep Concept Explanation
The compiler automatically converts between a primitive and its wrapper type when needed.

## 8.3 Internal JVM Behavior
The compiler inserts the necessary wrapper conversion calls at compile time.

## 8.4 Oracle Certification Rules
- `int` can be autoboxed to `Integer`.
- A wrapper can be unboxed to a primitive.
- Unboxing a null reference causes `NullPointerException`.

## 8.5 Common Mistakes
- Expecting both boxing and widening to happen automatically at once.
- Unboxing a null value.

## 8.6 Memory Trick
Box = wrap, Unbox = unwrap.

## 8.7 Real-World Usage
Useful when passing primitives to methods that expect wrapper types.

## 8.8 Beginner Exercise
Write a method that accepts an `Integer` and print its value.

## 8.9 Intermediate Exercise
Pass an `int` to a method expecting `Integer`.

## 8.10 Advanced Exercise
Create a method that accepts `Long` and call it with an `int`.

## 8.11 Expert Exercise
Explain why this does not compile:
```java
public void test(Long x) {}

public static void main(String[] args) {
    new Example().test(8);
}
```

Because Java will not both autobox and widen at the same time.

## 8.12 Incomplete Program
```java
public class BoxFill {
    public static void print(Integer value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        // call print with an int here
    }
}
```

Solution: `print(5);`

## 8.13 Debugging Exercise
```java
public class BoxBug {
    public static void main(String[] args) {
        Integer x = null;
        int y = x;
    }
}
```

Fix by avoiding unboxing a null value.

## 8.14 Output Prediction
```java
public class BoxOutput {
    public static void main(String[] args) {
        int a = 3;
        Integer b = a;
        int c = b;
        System.out.println(c);
    }
}
```

Expected output: `3`

## 8.15 OCJP-Style MCQ
What happens with `Integer x = null; int y = x;`?
A. It prints `null`.
B. It compiles and assigns `0`.
C. It throws `NullPointerException`.
D. It causes a compiler warning only.

Correct answer: C.

---

# Section 9: Method Overloading

## 9.1 Simple Explanation
Overloading means creating multiple methods with the same name but different parameter lists.

```java
public class Bird {
    public void fly(int miles) {}
    public void fly(short feet) {}
}
```

## 9.2 Deep Concept Explanation
Overloading is based on the method signature, which uses the method name and parameter list. Return type and access modifier do not matter.

## 9.3 Internal JVM Behavior
The compiler chooses the most specific overloaded method at compile time.

## 9.4 Oracle Certification Rules
- Methods can be overloaded by changing the parameter list.
- The parameter types and order matter.
- Changing only the return type does not overload a method.

## 9.5 Common Mistakes
- Thinking return type changes make a new overload.
- Expecting methods with the same parameter types but different names to be overloaded.

## 9.6 Memory Trick
Overload = “same name, different input.”

## 9.7 Real-World Usage
`println()` and `append()` are good examples of overloaded methods.

## 9.8 Beginner Exercise
Create two overloaded methods named `printValue` that take `int` and `String`.

## 9.9 Intermediate Exercise
Create overloaded methods for `move(int)` and `move(int, int)`.

## 9.10 Advanced Exercise
Create overloaded `calculate` methods using `int`, `double`, and `String` parameters.

## 9.11 Expert Exercise
Explain why this does not compile:
```java
public class OverloadError {
    public void test(int x) {}
    public int test(int x) { return 1; }
}
```

Because the method signatures are the same.

## 9.12 Incomplete Program
```java
public class OverloadFill {
    public static void main(String[] args) {
        print(5);
        print("Hello");
    }

    public static void print(int value) {
        System.out.println(value);
    }

    // add overload for String here
}
```

Solution:
```java
public static void print(String value) {
    System.out.println(value);
}
```

## 9.13 Debugging Exercise
```java
public class OverloadBug {
    public void show(int x) {}
    public void show(int x) {}
}
```

Fix by changing one signature.

## 9.14 Output Prediction
```java
public class OverloadOutput {
    public static void print(int x) { System.out.print("int"); }
    public static void print(String x) { System.out.print("string"); }

    public static void main(String[] args) {
        print(5);
        print("5");
    }
}
```

Expected output: `intstring`

## 9.15 OCJP-Style MCQ
Which pair is a valid overload?
A. `void m(int x)` and `void m(int y)`
B. `void m(int x)` and `int m(int x)`
C. `void m(int x)` and `void m(String x)`
D. `void m(int x)` and `void m()`

Correct answer: C and D are both overloads; if one answer is required, C is the best example.

---

# Build-Up Programming Journey

## Stage 1: Method Basics
Create a class with a `greet()` method and call it from `main()`.

## Stage 2: Add a Local Variable
Add a local variable inside `greet()` and print it.

## Stage 3: Add a Static Counter
Add a static counter to track how many times `greet()` is called.

## Stage 4: Add Varargs
Change `greet()` to accept a varargs list of names and print them.

## Stage 5: Add Overloading
Add overloaded `greet()` methods for `String` and `int`.

---

# Final Chapter Mastery Challenge

## Scenario
You are building a simple zoo greeting system.

### Requirements
- Create a class `ZooGreeting`.
- Add a `public static void greet(String name)` method.
- Add an overloaded `greet(int count)` method.
- Use a local variable inside `greet(String)`.
- Use a static counter to track how many greetings were made.
- Use a `final` local variable in one method.
- Use a varargs method to greet multiple visitors.
- Include one `private` helper method.

### Tasks
1. Write the class.
2. Call the methods from `main()`.
3. Predict the output.
4. Debug one intentionally broken version.
5. Answer three OCJP-style questions about the code.

### Starter Code
```java
public class ZooGreeting {
    static int count = 0;

    public static void greet(String name) {
        // add local variable and print message
    }

    public static void greet(int count) {
        // print the number
    }

    private static void showCount() {
        // print count
    }

    public static void main(String[] args) {
        // call methods here
    }
}
```

### Reflection Questions
- Why does the static counter share values between calls?
- Why does a local variable disappear after the method ends?
- Why is `greet(String)` different from `greet(int)`?
- Which methods are overloaded?

---

# Review Checklist
- I can declare a valid method.
- I know the difference between local and instance variables.
- I can explain the difference between `private`, package, `protected`, and `public`.
- I can identify when a method is static and when it is instance-based.
- I can explain pass-by-value.
- I can describe autoboxing and unboxing.
- I can recognize overloaded methods.

---

# Mini Practice Quiz
1. Which part of a method signature is used to determine overloading?
2. What is the difference between a local variable and an instance variable?
3. Which access modifier is the most restrictive?
4. Which keyword makes a variable unchangeable after assignment?
5. What is the output of a method call that uses a varargs parameter with no values?
