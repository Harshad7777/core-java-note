# Java 8 (JDK 1.8) Features

[Interfaces](#interfaces) | [Functional Programming](#functional-programming) | [Built-in Functional Interfaces](#built-in-functional-interfaces) | [Stream API](#stream-api) | [Optional](#optional-class) | [Date and Time API](#date-and-time-api) | [Final Summary](#final-summary)

---

## Main Features

Java 8 introduced major improvements in functional programming and API design.

- interface static methods
- interface default methods
- functional interfaces
- lambda expressions
- built-in functional interfaces
- stream API
- optional class
- java.time API
- concurrent enhancements

---

## Interfaces

### 1. Static methods in interface

From Java 8, interfaces can have static methods.

```java
interface ABC {
    static void show() {
        System.out.println("Static method in interface");
    }
}

public class Test {
    public static void main(String[] args) {
        ABC.show();
    }
}
```

### 2. Default methods in interface

A default method provides a method body inside the interface.

```java
interface ABC {
    default void show() {
        System.out.println("Default method in interface");
    }
}

class MNO implements ABC { }

public class Test {
    public static void main(String[] args) {
        new MNO().show();
    }
}
```

### Why were default methods added?

- to avoid breaking existing code in the Collection Framework
- example: `Iterable.forEach()` was added in Java 8
- otherwise, all implementing classes would need to override the new methods

### Important interview point

Default methods help in backward compatibility.

---

## Functional Programming

### Functional interface

A functional interface has exactly one abstract method.

```java
@FunctionalInterface
interface Test {
    void show();
}
```

A functional interface can also contain:

- default methods
- static methods

### Why functional interfaces matter

They are used for lambda expressions.

### Lambda expression

A lambda is a short form of an anonymous class.

#### Syntax

```java
(parameter) -> expression
```

#### Example

```java
interface Test {
    void show();
}

public class Demo {
    public static void main(String[] args) {
        Test t = () -> System.out.println("Hello Lambda");
        t.show();
    }
}
```

#### Square example

```java
interface Square {
    int getSquare(int no);
}

public class Demo {
    public static void main(String[] args) {
        Square s = (no) -> no * no;
        System.out.println(s.getSquare(5));
    }
}
```

### Lambda with Runnable

```java
public class TestApp {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        });

        t.start();
    }
}
```

### Anonymous class vs lambda

#### Anonymous class

```java
Runnable r = new Runnable() {
    public void run() {
        System.out.println("Thread running");
    }
};
```

#### Lambda version

```java
Runnable r = () -> System.out.println("Thread running");
```

### Important interview point

Lambda expressions reduce boilerplate code and make Java more functional.

---

## Built-in Functional Interfaces

Package: `java.util.function`

### 1. Consumer

Consumer accepts an input and returns nothing.

```java
Consumer<Integer> c = x -> System.out.println(x);
c.accept(10);
```

Method:

```java
void accept(T t)
```

Used mostly in `forEach()`.

### 2. Predicate

Predicate checks a condition and returns true/false.

```java
Predicate<Integer> p = x -> x % 2 == 0;
System.out.println(p.test(10)); // true
```

Methods:

- `and()`
- `or()`
- `negate()`

Example:

```java
Predicate<Integer> p = x -> x >= 10 && x <= 20;
Predicate<Integer> p2 = p.negate();
```

### 3. Supplier

Supplier has no input and returns output.

```java
Supplier<Date> s = () -> new Date();
System.out.println(s.get());
```

Method:

```java
T get()
```

### 4. Function

Function takes an input and returns output.

```java
Function<Integer, Integer> f = x -> x * x;
System.out.println(f.apply(5));
```

Method:

```java
R apply(T t)
```

`andThen()` can be used to chain functions.

```java
f.andThen(f2);
```

### 5. BiFunction

BiFunction takes two inputs and returns one output.

```java
BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
```

### 6. BinaryOperator

BinaryOperator takes same type input and produces same type output.

```java
BinaryOperator<Integer> sum = (a, b) -> a + b;
```

---

## Stream API

### What is Stream?

Stream API is used to process collection data in a functional style.

### Why use Stream API?

- no modification of original collection
- faster processing
- cleaner code
- works well with lambda expressions

### Intermediate operations

These return a stream:

- `map()`
- `filter()`
- `flatMap()`
- `sorted()`
- `distinct()`

### Terminal operations

These produce the final result:

- `forEach()`
- `collect()`
- `count()`
- `reduce()`

### Example: map()

```java
List.of(10, 20, 30)
    .stream()
    .map(x -> x * x)
    .forEach(System.out::println);
```

### Example: filter()

```java
List.of(1, 2, 3, 4, 5)
    .stream()
    .filter(x -> x % 2 == 0)
    .forEach(System.out::println);
```

### Example: filter + map

```java
List.of(1, 2, 3, 4, 5)
    .stream()
    .filter(x -> x % 2 == 0)
    .map(x -> x * 10)
    .forEach(System.out::println);
```

### Example: flatMap()

```java
List<List<Integer>> list = List.of(
    List.of(1, 2, 3),
    List.of(4, 5, 6)
);

list.stream()
    .flatMap(l -> l.stream())
    .forEach(System.out::println);
```

### Other useful stream methods

```java
list.stream().distinct();
long c = list.stream().count();
List<Integer> newList = list.stream().collect(Collectors.toList());
int sum = list.stream().reduce(0, (a, b) -> a + b);

list.stream().allMatch(x -> x < 100);
list.stream().anyMatch(x -> x == 10);
Optional<Integer> o = list.stream().filter(x -> x == 10).findFirst();
```

### Important interview point

Stream API is used to process data declaratively and efficiently.

---

## Optional Class

### Purpose

It helps prevent `NullPointerException`.

### Creation

```java
Optional.empty();
Optional.of(value);
Optional.ofNullable(value);
```

### Common methods

```java
Optional<Integer> o = Optional.of(10);

o.get();
o.isPresent();
o.ifPresent(System.out::println);
o.orElse(0);
o.orElseThrow(() -> new RuntimeException());
o.map(String::toUpperCase);
o.filter(x -> x % 2 == 0);
```

### Important interview point

`Optional` is used to handle nullable values more safely.

---

## Date and Time API

Java 8 introduced the `java.time` package.

### LocalDate

```java
LocalDate d = LocalDate.now();
```

### LocalTime

```java
LocalTime t = LocalTime.now();
```

### LocalDateTime

```java
LocalDateTime dt = LocalDateTime.now();
```

### ZonedDateTime

```java
ZonedDateTime z = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
```

### Period

```java
Period p = Period.between(date1, date2);
p.getDays();
```

---

## Final Summary

Java 8 introduced:

- lambda expressions
- functional interfaces
- default and static methods in interfaces
- built-in functional interfaces
- stream API
- optional class
- date/time API

### Quick revision

| Feature | Purpose |
| --- | --- |
| Default method | add new method without breaking existing implementation |
| Static method | utility logic inside interface |
| Functional interface | single abstract method interface |
| Lambda expression | concise anonymous function |
| Predicate | true/false condition |
| Function | input to output |
| Consumer | consume input, no return |
| Supplier | provide output without input |
| Stream API | process collections functionally |
| Optional | handle null safely |

---

## Final Notes

Java 8 is mainly known for functional programming features.

- lambda replaces anonymous classes
- functional interface enables lambda
- stream API simplifies collection processing
- optional avoids null-related errors
- java.time is a modern replacement for date/time classes

This is the clean, revision-friendly summary of Java 8 features.
