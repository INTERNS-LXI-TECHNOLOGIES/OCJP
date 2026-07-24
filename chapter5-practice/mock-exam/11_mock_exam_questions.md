# Chapter 5 Mock Exam Questions

These questions are designed to feel close to Oracle-style reasoning questions based on Chapter 5 concepts.

## Question 1
Which of the following method declarations is valid?

A. `public void test(int... a, int b)`
B. `public void test(int a, int... b)`
C. `public void test(int... a, int... b)`
D. `public void test(int[] a, int... b)`

## Question 2
Which statement is true about static methods?

A. They can access instance variables directly.
B. They belong to each object instance.
C. They can be called without creating an object.
D. They cannot be called from main().

## Question 3
What is the output of the following code?

```java
public class MockExamOne {
    static int count = 0;

    public MockExamOne() {
        count++;
    }

    public static void main(String[] args) {
        new MockExamOne();
        new MockExamOne();
        System.out.println(count);
    }
}
```

A. 0
B. 1
C. 2
D. Compilation error

## Question 4
What happens with this code?

```java
public class MockExamTwo {
    public static void main(String[] args) {
        Integer x = null;
        int y = x;
    }
}
```

A. It prints null
B. It throws NullPointerException
C. It compiles and assigns 0
D. It causes only a warning

## Question 5
Which of the following is a valid overload?

A. `void m(int x)` and `int m(int x)`
B. `void m(int x)` and `void m(String x)`
C. `void m(int x)` and `void m(int y)`
D. Both B and C

## Question 6
Which of the following is the most restrictive access modifier?

A. public
B. protected
C. private
D. package-private
