# Mock Exam: Chapter 5 Methods (50 Questions)

These questions are designed to feel like real Oracle-style exam questions.

## 1. What is the output?
```java
public class Q1 {
    static void show(int x) { System.out.println("int"); }
    static void show(double x) { System.out.println("double"); }
    public static void main(String[] args) {
        show(5);
    }
}
```

## 2. What is the output?
```java
public class Q2 {
    static void show(Integer x) { System.out.println("Integer"); }
    static void show(Object x) { System.out.println("Object"); }
    public static void main(String[] args) {
        show(10);
    }
}
```

## 3. What is the output?
```java
public class Q3 {
    static void test(int... x) { System.out.println("A"); }
    static void test(int x) { System.out.println("B"); }
    public static void main(String[] args) {
        test(2);
    }
}
```

## 4. What is the output?
```java
public class Q4 {
    static void change(int x) { x = 10; }
    public static void main(String[] args) {
        int a = 5;
        change(a);
        System.out.println(a);
    }
}
```

## 5. What is the output?
```java
public class Q5 {
    static void change(StringBuilder s) { s.append("!"); }
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hi");
        change(s);
        System.out.println(s);
    }
}
```

## 6. What is the output?
```java
public class Q6 {
    static int x = 1;
    static { x = 2; }
    public static void main(String[] args) {
        System.out.println(x);
    }
}
```

## 7. What is the output?
```java
public class Q7 {
    public static void main(String[] args) {
        int x = 5;
        final int y = x;
        x = 6;
        System.out.println(y);
    }
}
```

## 8. What happens?
```java
public class Q8 {
    public static void main(String[] args) {
        Integer i = null;
        int x = i;
        System.out.println(x);
    }
}
```

## 9. What is the output?
```java
public class Q9 {
    static void m(String... s) { System.out.println("A"); }
    static void m(String[] s) { System.out.println("B"); }
    public static void main(String[] args) {
        m();
    }
}
```

## 10. What is the output?
```java
public class Q10 {
    static void m(Object o) { System.out.println("Object"); }
    static void m(String s) { System.out.println("String"); }
    public static void main(String[] args) {
        m(null);
    }
}
```

## 11. What is the output?
```java
public class Q11 {
    static int count = 0;
    static void inc() { count++; }
    public static void main(String[] args) {
        inc();
        inc();
        System.out.println(count);
    }
}
```

## 12. What is the output?
```java
public class Q12 {
    static void show(int... x) { System.out.println("A"); }
    static void show(long... x) { System.out.println("B"); }
    public static void main(String[] args) {
        show(1, 2, 3);
    }
}
```

## 13. What is the output?
```java
public class Q13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr.length);
    }
}
```

## 14. What is the output?
```java
public class Q14 {
    static void m(int x) { System.out.println("A"); }
    static void m(Integer x) { System.out.println("B"); }
    public static void main(String[] args) {
        m(10);
    }
}
```

## 15. What is the output?
```java
public class Q15 {
    static void m(int x, int y) { System.out.println("A"); }
    static void m(int... x) { System.out.println("B"); }
    public static void main(String[] args) {
        m(1, 2);
    }
}
```

## 16. What is the output?
```java
public class Q16 {
    static void show(int x) { System.out.println("int"); }
    static void show(Integer x) { System.out.println("Integer"); }
    public static void main(String[] args) {
        Integer a = 5;
        show(a);
    }
}
```

## 17. What is the output?
```java
public class Q17 {
    static void update(StringBuilder sb) {
        sb = new StringBuilder("New");
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Old");
        update(sb);
        System.out.println(sb);
    }
}
```

## 18. What is the output?
```java
public class Q18 {
    static int x = 5;
    static { x = 10; }
    public static void main(String[] args) {
        System.out.println(x);
    }
}
```

## 19. What is the output?
```java
public class Q19 {
    static void test(String... values) { System.out.println(values.length); }
    public static void main(String[] args) {
        test();
    }
}
```

## 20. What is the output?
```java
public class Q20 {
    final int value;
    Q20() { value = 5; }
    public static void main(String[] args) {
        Q20 obj = new Q20();
        System.out.println(obj.value);
    }
}
```

## 21. What happens?
```java
public class Q21 {
    static void m(final int x) {
        x = 7;
    }
}
```

## 22. What is the output?
```java
public class Q22 {
    static void show(Object o) { System.out.println("Object"); }
    static void show(String s) { System.out.println("String"); }
    public static void main(String[] args) {
        show(null);
    }
}
```

## 23. What is the output?
```java
public class Q23 {
    static void m(int... nums) { System.out.println(1); }
    static void m(long... nums) { System.out.println(2); }
    public static void main(String[] args) {
        m(1, 2, 3);
    }
}
```

## 24. What is the output?
```java
public class Q24 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb = null;
        sb.append("!");
    }
}
```

## 25. What is the output?
```java
public class Q25 {
    static void m(int x) { System.out.println("x"); }
    static void m(long x) { System.out.println("y"); }
    public static void main(String[] args) {
        m(5L);
    }
}
```

## 26. What is the output?
```java
public class Q26 {
    static void m(int x) { System.out.println("A"); }
    static void m(double x) { System.out.println("B"); }
    public static void main(String[] args) {
        m(2.0);
    }
}
```

## 27. What is the output?
```java
public class Q27 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = a;
        b[0] = 9;
        System.out.println(a[0]);
    }
}
```

## 28. What is the output?
```java
public class Q28 {
    static void test(int x) { System.out.println("int"); }
    static void test(short x) { System.out.println("short"); }
    public static void main(String[] args) {
        short s = 3;
        test(s);
    }
}
```

## 29. What is the output?
```java
public class Q29 {
    static void add(int... values) { System.out.println("varargs"); }
    static void add(int x, int y) { System.out.println("two args"); }
    public static void main(String[] args) {
        add(1, 2);
    }
}
```

## 30. What happens?
```java
public class Q30 {
    public static void main(String[] args) {
        Integer x = 10;
        int y = x;
        System.out.println(y);
    }
}
```

## 31. What is the output?
```java
public class Q31 {
    static int count = 0;
    static void inc() { count++; }
    public static void main(String[] args) {
        inc();
        System.out.println(count);
    }
}
```

## 32. What is the output?
```java
public class Q32 {
    static void show(StringBuilder name) {
        name.append("!");
    }
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Java");
        show(name);
        System.out.println(name);
    }
}
```

## 33. What is the output?
```java
public class Q33 {
    static int value = 0;
    static void change() { value = 10; }
    public static void main(String[] args) {
        change();
        System.out.println(value);
    }
}
```

## 34. What is the output?
```java
public class Q34 {
    static void print(int... nums) {
        System.out.println(nums.length);
    }
    public static void main(String[] args) {
        print();
    }
}
```

## 35. What is the output?
```java
public class Q35 {
    static void print(int x) { System.out.println("int"); }
    static void print(long x) { System.out.println("long"); }
    public static void main(String[] args) {
        print(5);
    }
}
```

## 36. What is the output?
```java
public class Q36 {
    static void print(Object o) { System.out.println("Object"); }
    static void print(String s) { System.out.println("String"); }
    public static void main(String[] args) {
        print("Hello");
    }
}
```

## 37. What happens?
```java
public class Q37 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = a;
        b = new int[]{3, 4};
        System.out.println(a[0]);
    }
}
```

## 38. What is the output?
```java
public class Q38 {
    static void change(int x) { x = 100; }
    public static void main(String[] args) {
        int x = 50;
        change(x);
        System.out.println(x);
    }
}
```

## 39. What is the output?
```java
public class Q39 {
    static void show(int... nums) { System.out.println(nums[0]); }
    public static void main(String[] args) {
        show();
    }
}
```

## 40. What is the output?
```java
public class Q40 {
    static void show(int x) { System.out.println(x); }
    static void show(double x) { System.out.println(x); }
    public static void main(String[] args) {
        show(1.5);
    }
}
```

## 41. What is the output?
```java
public class Q41 {
    static void show(String... values) {
        for (String v : values) System.out.print(v + " ");
    }
    public static void main(String[] args) {
        show("A", "B", "C");
    }
}
```

## 42. What is the output?
```java
public class Q42 {
    static void show(int x, int y) { System.out.println("A"); }
    static void show(int... x) { System.out.println("B"); }
    public static void main(String[] args) {
        show(1, 2);
    }
}
```

## 43. What is the output?
```java
public class Q43 {
    static int value = 0;
    static { value = 10; }
    public static void main(String[] args) {
        System.out.println(value);
    }
}
```

## 44. What is the output?
```java
public class Q44 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("A");
        sb.append("B");
        System.out.println(sb);
    }
}
```

## 45. What is the output?
```java
public class Q45 {
    static void print(int x) { System.out.println("int"); }
    static void print(long x) { System.out.println("long"); }
    public static void main(String[] args) {
        print(10L);
    }
}
```

## 46. What is the output?
```java
public class Q46 {
    static void print(int x) { System.out.println("int"); }
    static void print(Integer x) { System.out.println("Integer"); }
    public static void main(String[] args) {
        print(10);
    }
}
```

## 47. What happens?
```java
public class Q47 {
    public static void main(String[] args) {
        Integer x = null;
        System.out.println(x.toString());
    }
}
```

## 48. What is the output?
```java
public class Q48 {
    static void show(int x) { System.out.println("x"); }
    static void show(double x) { System.out.println("y"); }
    public static void main(String[] args) {
        show(7);
    }
}
```

## 49. What is the output?
```java
public class Q49 {
    static void show(String... x) { System.out.println("A"); }
    static void show(Object... x) { System.out.println("B"); }
    public static void main(String[] args) {
        show();
    }
}
```

## 50. What is the output?
```java
public class Q50 {
    static int x = 5;
    static void change() { x = 8; }
    public static void main(String[] args) {
        change();
        System.out.println(x);
    }
}
```
