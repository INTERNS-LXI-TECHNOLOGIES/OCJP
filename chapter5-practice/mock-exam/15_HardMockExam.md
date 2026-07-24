# Hard Oracle-Style Mock Exam for Chapter 5

These questions are harder and intentionally deceptive.

## 1. What is the output?
```java
public class H1 {
    static void test(int x) { System.out.println("int"); }
    static void test(Integer x) { System.out.println("Integer"); }
    public static void main(String[] args) {
        test(10);
    }
}
```

## 2. What is the output?
```java
public class H2 {
    static void test(int... x) { System.out.println("A"); }
    static void test(Integer... x) { System.out.println("B"); }
    public static void main(String[] args) {
        test(1, 2, 3);
    }
}
```

## 3. What is the output?
```java
public class H3 {
    static void test(Object o) { System.out.println("Object"); }
    static void test(String s) { System.out.println("String"); }
    public static void main(String[] args) {
        test(null);
    }
}
```

## 4. What is the output?
```java
public class H4 {
    static void change(StringBuilder sb) {
        sb = new StringBuilder("New");
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Old");
        change(sb);
        System.out.println(sb);
    }
}
```

## 5. What happens?
```java
public class H5 {
    static void test(final int x) {
        x = 7;
    }
}
```

## 6. What is the output?
```java
public class H6 {
    static int count = 0;
    static { count = 10; }
    public static void main(String[] args) {
        System.out.println(count);
    }
}
```

## 7. What is the output?
```java
public class H7 {
    static void test(int... a) { System.out.println("A"); }
    static void test(long... a) { System.out.println("B"); }
    public static void main(String[] args) {
        test(1, 2, 3);
    }
}
```

## 8. What happens?
```java
public class H8 {
    public static void main(String[] args) {
        Integer i = null;
        int x = i + 1;
        System.out.println(x);
    }
}
```

## 9. What is the output?
```java
public class H9 {
    static void show(int x) { System.out.println("int"); }
    static void show(double x) { System.out.println("double"); }
    public static void main(String[] args) {
        show(1.0);
    }
}
```

## 10. What is the output?
```java
public class H10 {
    static void update(StringBuilder sb) {
        sb.append("!");
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hi");
        update(sb);
        System.out.println(sb);
    }
}
```
