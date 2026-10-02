# Wrapper Classes in Java

[Overview](#wrapper-classes-overview) | [Primitive Conversion](#primitive-conversion) | [Autoboxing & Unboxing](#autoboxing-and-unboxing) | [Number Class](#number-class) | [valueOf()](#valueof-method) | [parseXXX()](#parsexxx-method) | [String Conversion](#string-conversion) | [String Class](#string-class)

---

## Wrapper Classes Overview

Wrapper classes are predefined classes in Java that convert:

- primitive data type → object/reference type
- object/reference type → primitive data type

Examples:

- `int` → `Integer`
- `float` → `Float`
- `char` → `Character`

### Why use wrapper classes?

- collections like `ArrayList` store objects, not primitives
- helper methods are available for conversion
- they support autoboxing and unboxing

---

## Primitive Conversion

Primitive conversion means converting one primitive type into another.

### 1. Implicit Conversion (Widening)

Smaller type is automatically converted to larger type.

```java
int a = 100;
long b = a;   // implicit conversion
```

### 2. Explicit Conversion (Narrowing)

Larger type is converted to smaller type manually using casting.

```java
long b = 20;
int a = (int) b;   // explicit conversion
```

### Important correction

You cannot directly cast a `String` to a primitive `int` using simple casting.

```java
String s = "1234";
int b = (int) s;   // invalid
```

Use wrapper classes and parsing methods instead.

```java
public class CAPP
{
    public static void main(String[] args)
    {
        String s = "1234";
        int b = Integer.parseInt(s);
        System.out.println("b is : " + b);
    }
}
```

### Common conversion methods

| Method | Example | Result |
| ------ | ------- | ------ |
| `Integer.parseInt()` | `int b = Integer.parseInt(s);` | primitive int |
| `Integer.valueOf()` | `Integer b = Integer.valueOf(s);` | Integer object |
| `Scanner` | `int b = new Scanner(s).nextInt();` | primitive int |

> If the string contains non-numeric characters, `NumberFormatException` is thrown.

---

## Autoboxing and Unboxing

### Autoboxing

Primitive → object/reference type

```java
int a = 100;
Integer b = a;   // correct
```

### Unboxing

Object/reference type → primitive

```java
Integer b = 200;
int a = b;   // correct
```

### Important points

- `Long b = a;` is wrong because `a` is `int`, not `long`
- `Int a = b;` is wrong because `Int` is invalid; the primitive is `int`

Autoboxing and unboxing are automatic conversions introduced in Java 5.

---

## Number Class

`Number` is an abstract class and is the parent of all numeric wrapper classes such as:

- `Integer`
- `Float`
- `Double`
- `Long`
- `Short`
- `Byte`

### Useful methods

These methods convert numeric wrapper objects to primitive values.

```java
Integer obj = 100;

byte b = obj.byteValue();
short s = obj.shortValue();
int a = obj.intValue();
long l = obj.longValue();
float f = obj.floatValue();
double d = obj.doubleValue();
```

---

## valueOf() Method

`valueOf()` converts primitive values into wrapper objects.

```java
int a = 10;
Integer i = Integer.valueOf(a);
Float f = Float.valueOf(a);
String str = String.valueOf(a);
```

### Important point

- primitive → object/reference type
- used for conversion and object creation

---

## parseXXX() Method

`parseXXX()` converts a `String` into a primitive data type.

```java
String s = "1234";
int val = Integer.parseInt(s);
float f = Float.parseFloat(s);

System.out.println(val);  // 1234
System.out.println(f);    // 1234.0
```

### Important points

1. String must be numeric

```java
String s = "abc";
int val = Integer.parseInt(s); // throws NumberFormatException
```

2. Float can accept decimal values

```java
String s = "12.5";
float f = Float.parseFloat(s); // works
```

3. Spaces may cause problems

```java
String s = " 1234 ";
int val = Integer.parseInt(s); // invalid without trim()
```

Corrected version:

```java
int val = Integer.parseInt(s.trim());
```

---

## String Conversion

### toString() method

Used to convert values into a `String`.

```java
Integer obj = 100;
String s = obj.toString();
System.out.println(s);  // 100
```

### String.valueOf()

```java
int a = 10;
String s = String.valueOf(a);
```

This converts any primitive value into a String.

---

## String Class

### Definition

`String` is an immutable class in Java.

- once created, its value cannot be changed
- when modified, a new String object is created
- `String` is a final class

### Important point

Every value written in double quotes is treated as a `String` object.

```java
String s = "abc";
```

### String creation

#### 1. Using Literal

```java
String s = "abc";
```

- stored in String Constant Pool

#### 2. Using `new` keyword

```java
String s = new String("abc");
```

- stored in heap memory

---

## Final Revision

- Wrapper classes convert primitive types into objects and vice versa.
- `Autoboxing` → primitive to wrapper
- `Unboxing` → wrapper to primitive
- `Number` is the parent class for numeric wrapper classes.
- `valueOf()` converts primitive to object.
- `parseXXX()` converts String to primitive.
- `toString()` and `String.valueOf()` convert values to String.
- `String` is immutable and final.

### Quick memory rule

- primitive ↔ wrapper → autoboxing / unboxing
- String → primitive → `parseInt()`, `parseFloat()`, etc.
- primitive/object → String → `toString()`, `String.valueOf()`
