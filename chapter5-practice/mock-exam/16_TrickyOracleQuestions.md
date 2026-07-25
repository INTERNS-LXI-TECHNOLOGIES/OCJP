# Tricky Oracle-Style Questions for Chapter 5

These questions are sourced strictly from `chapter5.txt` and designed to trap you the way the real Oracle exam does. Each question targets a specific concept from the chapter. Answers with explanations are at the bottom.

---

## Question 1 — Optional Specifier Ordering (Source: "Exercise" class example)

Which of the following method declarations compile? (Choose all that apply)

A. `public final void eat() {}`
B. `final public void eat() {}`
C. `public void final eat() {}`
D. `void public final eat() {}`
E. `final void public eat() {}`

---

## Question 2 — Method Naming Rules (Source: "BeachTrip" class example)

Which of the following are valid method names? (Choose all that apply)

A. `swim()`
B. `_()`
C. `8swim()`
D. `$swim()`
E. `swim$()`

---

## Question 3 — Method Signature (Source: "Trip" class example)

Which of the following pairs of methods are valid overloads of each other?

A. `void fly(int numMiles)` and `void fly(int numKilometers)`
B. `void fly(int numMiles)` and `void fly(short numFeet)`
C. `void fly(int numMiles, short numFeet)` and `void fly(short numFeet, int numMiles)`
D. `void fly(int numMiles)` and `int fly(int numMiles)`

---

## Question 4 — Local vs Instance Variable (Source: "Lion" class example)

What is the output?

```java
public class Lion {
   private String name = "Leo";
   public Lion() {
      String name = "Simba";
   }
   public static void main(String[] args) {
      System.out.println(new Lion().name);
   }
}
```

A. Leo
B. Simba
C. null
D. Compilation fails

---

## Question 5 — Effectively Final (Source: "zooAnimalCheckup" example)

Which of the following local variables are effectively final? (Choose all that apply)

```java
public void check() {
   int a = 5;
   final int b = 10;
   int c = 15;
   c = 20;
   int d = 25;
   d++;
}
```

A. `a`
B. `b`
C. `c`
D. `d`

---

## Question 6 — Final Instance Variable Initialization (Source: "PolarBear" class example)

Which of the following compile? (Choose all that apply)

A.
```java
public class PolarBear {
   final int age;
   public PolarBear() { age = 5; }
}
```

B.
```java
public class PolarBear {
   final int age;
   public PolarBear(int x) { }
}
```

C.
```java
public class PolarBear {
   final int age = 5;
   public PolarBear() { age = 10; }
}
```

D.
```java
public class PolarBear {
   final int age;
   { age = 5; }
}
```

---

## Question 7 — Varargs Must Be Last (Source: "VisitAttractions" class example)

Which method declarations compile? (Choose all that apply)

A. `public void visit(String... attractions, int count)`
B. `public void visit(int count, String... attractions)`
C. `public void visit(String... attractions, String... names)`
D. `public void visit(String... attractions)`

---

## Question 8 — Varargs and null (Source: "DogWalker" class example)

What is the output?

```java
public class DogWalker {
   public static void walkDogs(String... dogs) {
      System.out.println(dogs.length);
   }
   public static void main(String[] args) {
      walkDogs(null);
   }
}
```

A. 0
B. 1
C. NullPointerException
D. Compilation fails

---

## Question 9 — Private Access (Source: "FatherDuck/BadDuckling" example)

What happens?

```java
package pond.duck;
public class FatherDuck {
   private String noise = "quack";
   private void quack() {
      System.out.println(noise);
   }
}

package pond.duck;
public class BadDuckling {
   public void makeNoise() {
      FatherDuck d = new FatherDuck();
      d.quack();               // Line A
      System.out.println(d.noise); // Line B
   }
}
```

A. Both Line A and Line B compile
B. Only Line A compiles
C. Only Line B compiles
D. Neither Line A nor Line B compiles

---

## Question 10 — Protected Access Gotcha (Source: "Swan" class example)

What happens?

```java
package pond.swan;
import pond.shore.Bird;
public class Swan extends Bird {
   public void helpOtherBirdSwim() {
      Bird other = new Bird();
      other.floatInWater();      // Line A
      System.out.print(other.text); // Line B
   }
}
```

A. Both Line A and Line B compile
B. Only Line A compiles
C. Only Line B compiles
D. Neither Line A nor Line B compiles

---

## Question 11 — Protected Access with Subclass Reference (Source: "Goose" class example)

What happens?

```java
package pond.goose;
import pond.shore.Bird;
public class Goose extends Bird {
   public void helpOtherGooseSwim() {
      Bird other = new Goose();
      other.floatInWater();      // Line A
      System.out.print(other.text); // Line B
   }
}
```

A. Both Line A and Line B compile
B. Only Line A compiles
C. Only Line B compiles
D. Neither Line A nor Line B compiles

---

## Question 12 — Static Variable via null Reference (Source: "Snake" class example)

What is the output?

```java
public class Snake {
   public static long hiss = 2;
   public static void main(String[] args) {
      Snake s = null;
      System.out.println(s.hiss);
   }
}
```

A. 0
B. 2
C. NullPointerException
D. Compilation fails

---

## Question 13 — Static Variable Sharing (Source: "Snake" class example)

What is the output?

```java
public class Snake {
   public static long hiss = 2;
   public static void main(String[] args) {
      Snake.hiss = 4;
      Snake snake1 = new Snake();
      Snake snake2 = new Snake();
      snake1.hiss = 6;
      snake2.hiss = 5;
      System.out.println(Snake.hiss);
   }
}
```

A. 4
B. 5
C. 6
D. 2

---

## Question 14 — Static vs Instance Method Calls (Source: "Gorilla" class example)

Which lines fail to compile?

```java
1: public class Gorilla {
2:    public static int count;
3:    public static void addGorilla() { count++; }
4:    public void babyGorilla() { count++; }
5:    public void announceBabies() {
6:       addGorilla();
7:       babyGorilla();
8:    }
9:    public static void announceBabiesToEveryone() {
10:      addGorilla();
11:      babyGorilla();
12:   }
13:   public int total;
14:   public static double average = total / count;
15: }
```

A. Line 7 only
B. Line 11 only
C. Lines 11 and 14
D. Lines 7 and 14

---

## Question 15 — Static Final Array Contents (Source: "ZooInventoryManager" class example)

Does the following compile?

```java
import java.util.*;
public class ZooInventoryManager {
   private static final String[] treats = new String[10];
   public static void main(String[] args) {
      treats[0] = "popcorn";
   }
}
```

A. Yes, because array contents can be modified even if the reference is final
B. No, because `treats` is `final` and cannot be modified
C. Yes, but only because it is in `main()`
D. No, because arrays cannot be `static final`

---

## Question 16 — Static Final Initialization (Source: "Panda" class example)

Which lines fail to compile?

```java
1: public class Panda {
2:    final static String name = "Ronda";
3:    static final int bamboo;
4:    static final double height;
5:    static { bamboo = 5; }
6: }
```

A. Line 2 only
B. Line 3 only
C. Line 4 only
D. Lines 2 and 4

---

## Question 17 — Static Initializer Reassignment (Source: lines 14–23 example)

Which lines fail to compile?

```java
1: private static int one;
2: private static final int two;
3: private static final int three = 3;
4: private static final int four;
5: static {
6:    one = 1;
7:    two = 2;
8:    three = 3;
9:    two = 4;
10: }
```

A. Lines 4, 8, and 9
B. Lines 8 and 9 only
C. Lines 4 and 9 only
D. Line 9 only

---

## Question 18 — Static Import Syntax (Source: "BadZooParking" class example)

Which lines fail to compile?

```java
1: import static java.util.Arrays;
2: import static java.util.Arrays.asList;
3: static import java.util.Arrays.*;
4: public class BadZooParking {
5:    public static void main(String[] args) {
6:       Arrays.asList("one");
7:    }
8: }
```

A. Lines 1 and 3 only
B. Lines 1, 3, and 6
C. Lines 3 and 6 only
D. Line 6 only

---

## Question 19 — Pass-by-Value with Primitives (Source: "newNumber" example)

What is the output?

```java
public static void main(String[] args) {
   int num = 4;
   newNumber(num);
   System.out.print(num);
}
public static void newNumber(int num) {
   num = 8;
}
```

A. 8
B. 4
C. 0
D. Compilation fails

---

## Question 20 — Pass-by-Value with String (Source: "Dog" class example)

What is the output?

```java
public class Dog {
   public static void main(String[] args) {
      String name = "Webby";
      speak(name);
      System.out.print(name);
   }
   public static void speak(String name) {
      name = "Georgette";
   }
}
```

A. Webby
B. Georgette
C. WebbyGeorgette
D. null

---

## Question 21 — Pass-by-Value with StringBuilder (Source: "Dog" class example)

What is the output?

```java
public class Dog {
   public static void main(String[] args) {
      var name = new StringBuilder("Webby");
      speak(name);
      System.out.print(name);
   }
   public static void speak(StringBuilder s) {
      s.append("Georgette");
   }
}
```

A. Webby
B. Georgette
C. WebbyGeorgette
D. null

---

## Question 22 — Ignored Return Values (Source: "ZooTickets" class example)

What is the output?

```java
public class ZooTickets {
   public static void main(String[] args) {
      int tickets = 2;
      String guests = "abc";
      addTickets(tickets);
      guests = addGuests(guests);
      System.out.println(tickets + guests);
   }
   public static int addTickets(int tickets) {
      tickets++;
      return tickets;
   }
   public static String addGuests(String guests) {
      guests += "d";
      return guests;
   }
}
```

A. 3abcd
B. 2abcd
C. 3abc
D. 2abc

---

## Question 23 — Autoboxing Limit: Long (Source: "badGorilla" example)

Does the following compile?

```java
Long badGorilla = 8;
```

A. Yes, because `8` is autoboxed to `Long`
B. Yes, because `8` is cast to `long`
C. No, because Java will not both cast and autobox at the same time
D. No, because `Long` cannot hold integer values

---

## Question 24 — Unboxing null (Source: "elephant" example)

What happens?

```java
Character elephant = null;
char badElephant = elephant;
```

A. Compiles and assigns `'\u0000'`
B. Compiles and assigns `null`
C. Throws `NullPointerException`
D. Compilation fails

---

## Question 25 — Autoboxing in Method Calls (Source: "Chimpanzee" class example)

Which lines fail to compile?

```java
1: public class Chimpanzee {
2:    public void climb(long t) {}
3:    public void swing(Integer u) {}
4:    public void jump(int v) {}
5:    public static void main(String[] args) {
6:       var c = new Chimpanzee();
7:       c.climb(123);
8:       c.swing(123);
9:       c.jump(123L);
10:    }
11: }
```

A. Line 7 only
B. Line 8 only
C. Line 9 only
D. Lines 8 and 9

---

## Question 26 — Autoboxing with Long Parameter (Source: "Gorilla" class example)

Does the following compile?

```java
public class Gorilla {
   public void rest(Long x) {
      System.out.print("long");
   }
   public static void main(String[] args) {
      var g = new Gorilla();
      g.rest(8);
   }
}
```

A. Yes, `8` is autoboxed to `Long`
B. Yes, `8` is cast to `long` then autoboxed
C. No, Java will not both cast and autobox at the same time
D. No, because `8` is not a valid argument

---

## Question 27 — Overloading: Return Type Irrelevance (Source: "Eagle" class example)

Does the following compile?

```java
public class Eagle {
   public void fly(int numMiles) {}
   public int fly(int numMiles) { return 1; }
}
```

A. Yes, because the return types differ
B. No, because the method signatures are the same — return type is irrelevant to overloading
C. Yes, because overloading allows different return types
D. No, because `fly` cannot return `int`

---

## Question 28 — Overloading: Parameter Names Don't Matter (Source: "Hawk" class example)

Which methods fail to compile?

```java
public class Hawk {
   public void fly(int numMiles) {}
   public static void fly(int numMiles) {}      // Line A
   public void fly(int numKilometers) {}         // Line B
}
```

A. Line A only
B. Line B only
C. Both Line A and Line B
D. Neither — both compile

---

## Question 29 — Overloading: Most Specific Match (Source: "Pelican" class example)

What is the output?

```java
public class Pelican {
   public void fly(String s) { System.out.print("string"); }
   public void fly(Object o) { System.out.print("object"); }
   public static void main(String[] args) {
      var p = new Pelican();
      p.fly("test");
      System.out.print("-");
      p.fly(56);
   }
}
```

A. string-object
B. object-object
C. string-string
D. object-string

---

## Question 30 — Overloading: Varargs vs Exact Match (Source: "Glider" class example)

What is the output?

```java
public class Glider {
   public static String glide(String s) { return "1"; }
   public static String glide(String... s) { return "2"; }
   public static String glide(Object o) { return "3"; }
   public static String glide(String s, String t) { return "4"; }
   public static void main(String[] args) {
      System.out.print(glide("a"));
      System.out.print(glide("a", "b"));
      System.out.print(glide("a", "b", "c"));
   }
}
```

A. 123
B. 142
C. 342
D. 242

---

## Question 31 — Varargs vs Array Overload (Source: "Toucan" class example)

Does the following compile?

```java
public class Toucan {
   public void fly(int[] lengths) {}
   public void fly(int... lengths) {}
}
```

A. Yes, because arrays and varargs are different
B. No, because varargs and arrays have the same method signature
C. Yes, because varargs is treated differently from arrays
D. No, because a class cannot have two `fly` methods

---

## Question 32 — Overloading Order: Primitives (Source: "Ostrich" class example)

What is the output?

```java
public class Ostrich {
   public void fly(int i) { System.out.print("int"); }
   public void fly(long l) { System.out.print("long"); }
   public static void main(String[] args) {
      var p = new Ostrich();
      p.fly(123);
      System.out.print("-");
      p.fly(123L);
   }
}
```

A. int-long
B. long-int
C. int-int
D. long-long

---

## Question 33 — Overloading: Autoboxing vs Primitive (Source: "Kiwi" class example)

Which method is called?

```java
public class Kiwi {
   public void fly(int numMiles) { System.out.print("int"); }
   public void fly(Integer numMiles) { System.out.print("Integer"); }
   public static void main(String[] args) {
      new Kiwi().fly(3);
   }
}
```

A. `fly(int numMiles)` — prints `int`
B. `fly(Integer numMiles)` — prints `Integer`
C. Ambiguous — compilation error
D. Neither — runtime error

---

## Question 34 — Overloading with CharSequence (Source: "Parrot" class example)

What is the output?

```java
import java.time.*;
import java.util.*;
public class Parrot {
   public static void print(List<Integer> i) { System.out.print("I"); }
   public static void print(CharSequence c) { System.out.print("C"); }
   public static void print(Object o) { System.out.print("O"); }
   public static void main(String[] args) {
      print("abc");
      print(Arrays.asList(3));
      print(LocalDate.of(2019, Month.JULY, 4));
   }
}
```

A. ICO
B. CIO
C. COI
D. IOC

---

## Question 35 — Autoboxing Array Initialization (Source: "winterHours/summerHours" example)

Which lines compile?

```java
1: Integer[] openingHours = { 9, 12 };
2: Double[] temperaturesAtZoo = { 74.1, 93.2 };
3: Integer[] winterHours = { 10.5, 17.0 };
4: Double[] summerHours = { 9, 21 };
```

A. Lines 1 and 2 only
B. Lines 1, 2, and 3
C. Lines 1, 2, and 4
D. All four lines

---

## Question 36 — Default Keyword Not Valid (Source: "ParkTrip" class example)

Which of the following is a valid access modifier for a method?

A. `default`
B. `package`
C. (omitted — package-private)
D. `friendly`

---

## Question 37 — Return Type and Unreachable Code (Source: "Hike" class example)

What happens?

```java
public int hike() {
   return 0;
   System.out.println("Done");
}
```

A. Compiles and returns 0
B. Compilation fails due to unreachable code
C. Compiles but throws an exception at runtime
D. Compiles and prints "Done"

---

## Question 38 — Return Type Casting (Source: "Measurement" class example)

What happens?

```java
public short calculate() {
   return 1 + 2;
}
```

A. Compiles — `1 + 2` is a compile-time constant of value 3, which fits in `short`
B. Compilation fails — `1 + 2` is an `int` and cannot be returned as `short`
C. Compiles — Java automatically narrows `int` to `short`
D. Compilation fails — `short` cannot be a return type

---

## Question 39 — Static Method Calling Instance Method (Source: "MantaRay" class example)

Which lines fail to compile?

```java
1: public class MantaRay {
2:    private String name = "Sammy";
3:    public static void first() { }
4:    public static void second() { }
5:    public void third() { System.out.print(name); }
6:    public static void main(String args[]) {
7:       first();
8:       second();
9:       third();
10:    }
11: }
```

A. Line 5 only
B. Line 9 only
C. Lines 5 and 9
D. None — all compile

---

## Question 40 — Overloading: Varargs Come Last (Source: Table 5.6 example)

Given the following overloaded methods, which is called by `glide(1, 2)`?

```java
String glide(int i, int j)     // A
String glide(long i, long j)   // B
String glide(Integer i, Integer j) // C
String glide(int... nums)      // D
```

A. `glide(int i, int j)` — exact match
B. `glide(long i, long j)` — larger primitive
C. `glide(Integer i, Integer j)` — autoboxed
D. `glide(int... nums)` — varargs

---

# Answers

## Answer 1
**A, B** — The access modifier (`public`) and optional specifier (`final`) can appear in any order. Options C, D, and E place `final` or `public` in invalid positions (after the return type or in the wrong order relative to the return type).

## Answer 2
**A, B, D, E** — Method names follow Java identifier rules: letters, `$`, `_`, and digits (not first character). `8swim()` is invalid because it starts with a digit. `_()` is valid (single underscore as a method name is legal).

## Answer 3
**B, C** — Overloading requires different parameter lists (types, count, or order). Parameter names don't matter (so A and D are the same signature). B differs by type. C differs by order. D differs only by return type, which is not part of the signature.

## Answer 4
**A — Leo** — The `name` in the constructor is a local variable that shadows the instance variable. The instance variable `name` remains `"Leo"`.

## Answer 5
**A, B** — `a` is never reassigned (effectively final). `b` is explicitly `final`. `c` is reassigned (`c = 20`), so not effectively final. `d` is modified (`d++`), so not effectively final.

## Answer 6
**A, D** — A: final instance variable initialized in constructor — valid. B: final variable never initialized — fails. C: final variable initialized at declaration and again in constructor — fails (double assignment). D: final variable initialized in instance initializer — valid.

## Answer 7
**B, D** — Varargs must be the last parameter. A and C have varargs not in the last position. B has varargs last — valid. D has only varargs — valid.

## Answer 8
**C — NullPointerException** — Passing `null` to a varargs method is ambiguous; Java treats `null` as the array itself (a `String[]` of value `null`), and calling `.length` on it throws `NullPointerException`.

## Answer 9
**D — Neither compiles** — `private` members are only accessible within the same class. `BadDuckling` cannot call `quack()` or access `noise` even though it's in the same package.

## Answer 10
**D — Neither compiles** — Even though `Swan` extends `Bird`, accessing protected members through a `Bird` reference (not a `Swan` reference) from a different package is not allowed. The reference type must be the subclass.

## Answer 11
**D — Neither compiles** — Although the object is a `Goose`, it is stored in a `Bird` reference. Protected access requires the reference type to be the subclass (or same class), not just the actual object type.

## Answer 12
**B — 2** — Static variables are resolved by the reference type, not the object. `s` is `null`, but since `hiss` is static, Java uses the type `Snake` and does not throw `NullPointerException`.

## Answer 13
**B — 5** — `hiss` is static, so there is only one copy. The last assignment (`snake2.hiss = 5`) wins. All the `Snake` instances share the same variable.

## Answer 14
**C — Lines 11 and 14** — Line 11: a static method cannot call an instance method (`babyGorilla()`). Line 14: a static variable initializer cannot reference an instance variable (`total`).

## Answer 15
**A — Yes** — `final` only prevents reassignment of the reference variable. Modifying the contents of the array is allowed.

## Answer 16
**C — Line 4 only** — `height` is declared `static final` but never initialized anywhere. `name` is initialized at declaration (valid). `bamboo` is initialized in a static block (valid).

## Answer 17
**A — Lines 4, 8, and 9** — Line 4: `four` is never initialized. Line 8: `three` was already initialized at declaration — cannot reassign. Line 9: `two` was already assigned in the static block (line 7) — cannot reassign a `final`.

## Answer 18
**B — Lines 1, 3, and 6** — Line 1: static imports are for static members, not classes. Line 3: the syntax is `import static`, not `static import`. Line 6: `Arrays` class is not imported (only `asList` was imported), so `Arrays.asList("one")` fails.

## Answer 19
**B — 4** — Java is pass-by-value. The method parameter `num` is a copy. Reassigning it to 8 does not affect the original variable.

## Answer 20
**A — Webby** — Strings are immutable and pass-by-value applies to the reference. Reassigning `name` inside `speak()` does not affect the caller's variable.

## Answer 21
**C — WebbyGeorgette** — The `StringBuilder` reference is passed by value (a copy of the reference), but both references point to the same object. Calling `append()` modifies the shared object.

## Answer 22
**B — 2abcd** — `addTickets(tickets)` returns 3 but the return value is ignored, so `tickets` stays 2. `addGuests(guests)` returns "abcd" and the result is assigned to `guests`. Output: `2abcd`.

## Answer 23
**C — No** — Java will autobox `8` to `Integer` or cast it to `long`, but will not do both (cast to `long` AND autobox to `Long`) at the same time.

## Answer 24
**C — NullPointerException** — Unboxing `null` to a primitive throws `NullPointerException` at runtime.

## Answer 25
**C — Line 9 only** — `c.climb(123)`: int is implicitly cast to long — valid. `c.swing(123)`: int is autoboxed to Integer — valid. `c.jump(123L)`: a long cannot be implicitly narrowed to int — fails.

## Answer 26
**C — No** — `8` is an `int`. Java will autobox it to `Integer` or cast it to `long`, but will not do both (cast to `long` then autobox to `Long`) simultaneously.

## Answer 27
**B — No** — Overloading is determined by the method signature (name + parameter list). Return type is irrelevant. These two methods have the same signature, so it's a duplicate method declaration.

## Answer 28
**C — Both Line A and Line B** — Line A: you cannot have a static and instance method with the same signature. Line B: parameter names don't matter — `int numMiles` and `int numKilometers` are the same signature.

## Answer 29
**A — string-object** — `fly("test")` matches the `String` parameter (most specific). `fly(56)` has no `int` match, autoboxes to `Integer`, still no match, falls to `Object`.

## Answer 30
**B — 142** — `glide("a")` matches the single `String` (exact). `glide("a", "b")` matches the two-`String` version (exact). `glide("a", "b", "c")` has no exact match, so varargs is used.

## Answer 31
**B — No** — Java treats varargs as arrays internally, so both methods have the same signature `fly(int[])`. You cannot overload with the same parameter list.

## Answer 32
**A — int-long** — `fly(123)` matches `int` exactly. `fly(123L)` matches `long` exactly.

## Answer 33
**A — `fly(int numMiles)`** — Java prefers the exact primitive match over autoboxing. Autoboxing only happens when no primitive match exists.

## Answer 34
**B — CIO** — `print("abc")`: String implements CharSequence → C. `print(Arrays.asList(3))`: returns `List<Integer>` → I. `print(LocalDate.of(...))`: not a CharSequence or List → O.

## Answer 35
**A — Lines 1 and 2 only** — Line 3: `10.5` and `17.0` are `double` literals, cannot be autoboxed to `Integer`. Line 4: `9` and `21` are `int` literals, cannot be autoboxed to `Double` (Java won't both cast and autobox).

## Answer 36
**C — (omitted — package-private)** — There is no `default` or `package` keyword in Java. Package-private access is indicated by the absence of any access modifier.

## Answer 37
**B — Compilation fails** — The `return` statement is the last statement, making the `System.out.println` unreachable. The compiler rejects unreachable code.

## Answer 38
**A — Compiles** — `1 + 2` is a compile-time constant expression equal to 3, which fits within the range of `short`. The compiler allows this implicit narrowing for constant expressions.

## Answer 39
**B — Line 9 only** — Line 5 is a valid instance method. Line 9: `main()` is static and cannot call the instance method `third()` without a reference to an instance.

## Answer 40
**A — `glide(int i, int j)`** — Java follows the overload resolution order: exact match first, then larger primitive, then autoboxed, then varargs. `glide(1, 2)` has an exact `int` match.
