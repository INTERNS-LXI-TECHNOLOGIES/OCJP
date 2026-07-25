# Solutions and Explanations for Chapter 5 Practice

This file provides teacher-style answers and reasoning for the incomplete Java exercises.

## 07_Beginner_FillInTheBlank.java

### Solution
```java
public class BeginnerFillInTheBlank {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int[] copyArray(int[] values) {
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i];
        }
        return result;
    }

    static void printEven(int[] values) {
        for (int value : values) {
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }
    }
}
```

### Explanation
- `add` and `multiply` are simple arithmetic methods.
- `copyArray` creates a new array and copies every element.
- `printEven` uses a loop and a condition to print only even values.

---

## 08_Intermediate_AccessAndStatic.java

### Solution
```java
class StudentRecord {
    private String name;
    protected int grade;
    static int totalStudents;

    StudentRecord(String name, int grade) {
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    private String getName() {
        return name;
    }

    protected int getGrade() {
        return grade;
    }

    static int getTotalStudents() {
        return totalStudents;
    }
}
```

### Explanation
- `private` members are accessible only inside the class.
- `protected` members are accessible in the same package and subclasses.
- `static` members belong to the class and are shared across all instances.

---

## 09_Advanced_OverloadingVarargs.java

### Solution
```java
public class AdvancedOverloadingVarargs {
    static void show(int value) {
        System.out.println("int");
    }

    static void show(long value) {
        System.out.println("long");
    }

    static void show(Integer value) {
        System.out.println("Integer");
    }

    static int sum(int... values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    static void changeName(StringBuilder name) {
        name.append(" Jr.");
    }
}
```

### Explanation
- The compiler chooses the most specific overload.
- `int...` accepts zero or more ints.
- `StringBuilder` is mutated because the object is changed, not the reference.

---

## 10_Expert_OracleStyle.java

### Solution
```java
public class ExpertOracleStyle {
    static int count = 0;
    static {
        count = 5;
    }

    static void test(int x) {
        System.out.println("int");
    }

    static void test(Integer x) {
        System.out.println("Integer");
    }

    static void test(String... values) {
        System.out.println(values.length);
    }

    static void changeValue(final int x) {
        // x = 7; // compile-time error
    }

    public static void main(String[] args) {
        test(10);
        test("a", "b");
        System.out.println(count);
    }
}
```

### Explanation
- A `final` parameter cannot be reassigned.
- `test(10)` uses the `int` overload.
- `test("a", "b")` uses the varargs overload.

---

## Common Oracle Exam Thinking Tips

- Prefer the most specific overload.
- Remember that primitives are passed by value.
- Remember that object references are also passed by value.
- Static members belong to the class, not to one object.
- `final` variables cannot be reassigned after initialization.
- Unboxing a `null` wrapper throws `NullPointerException`.
