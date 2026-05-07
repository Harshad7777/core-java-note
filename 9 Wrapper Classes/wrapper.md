
---

# 🔹 Wrapper Classes in Java

### ✔ Definition

Wrapper classes are **(inbuild)predefined classes in Java** that convert:

* **Primitive data type → Object (Reference data type)**
* **Object (Reference data type) → Primitive data type**

Example:

* `int` → `Integer`
* `float` → `Float`
* `char` → `Character`

---

# 🔹 Primitive Type Conversion

 primitive conversion means perform conversion between simple data type called as primitive conversion 
Like as int to float  ,float to int etc 


### 1. Implicit Conversion (Widening)

* Done automatically by compiler
* Smaller → Larger type

```java
int a = 100;
long b = a;   // implicit conversion
```

---

### 2. Explicit Conversion (Narrowing)

* Done manually using casting
* Larger → Smaller type

```java
long b = 20;
int a = (int) b;   // explicit conversion
```

---

# ⚠️ Important Correction

 you cannot directly cast a String to a primitive int using simple casting (int). This is because a String is a reference object, while an int is a primitive type.
To resolve this, Java provides Wrapper Classes (like Integer) that contain helper methods for these conversions.
------------------------------
## Understanding the Problem
In the code shown, int b = (int) s; fails because the compiler doesn't know how to mathematically "cast" text into a number.
## How to Fix It
You need to parse the string. Here are the three most common ways to convert a String to an integer:

| Method             | Code Example                      | Note                                            |
|---                 |---                                |---                                              |
| Integer.parseInt() | int b = Integer.parseInt(s);      | Returns a primitive int. Best for most cases.   |
| Integer.valueOf()  | Integer b = Integer.valueOf(s);   | Returns an Integer object.                      |
| Scanner class      | int b = new Scanner(s).nextInt(); | Useful if the string contains multiple numbers. |

## Corrected Code Example
```
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
## Key Concepts to Remember

* Wrapper Classes: Every primitive type has a corresponding class (e.g., int $\rightarrow$ Integer, double $\rightarrow$ Double).
* Parsing: This is the process of analyzing a string of symbols and converting them into a data format the program can use.
* NumberFormatException: If your string s contained letters (like "123a"), the methods above would throw this error because the text cannot be turned into a number.

Would you like to see how to handle cases where the string might contain non-numeric characters?

✔ Correct version:

* Primitive ↔ Wrapper conversion is **NOT done using casting**
* It is done using:

  * **Autoboxing**
  * **Unboxing**

  ![alt text](<WhatsApp Image 2026-05-05 at 10.27.13 AM.jpeg>)

---

# 🔹 Wrapper Class Conversion

### ✔ 1. Autoboxing

Primitive → Object(referencial datatype)

```java
int a = 100;
Integer b = a;   // correct (not Long)
```

⚠️ Your mistake:

```java
Long b = a;  // ❌ wrong (int → Integer, not Long)
```

---

### ✔ 2. Unboxing

Object(referencial datatype) → Primitive

```java
Integer b = 200;
int a = b;   // correct
```

⚠️ Your mistake:

```java
Int a = b;   // ❌ 'Int' is invalid, use 'int'
```

---

Sometime autoboxing and autounboxing not works when we have different type primitive data and different type of referential numeric data then we have Number class which provide some method to us for conversion between numeric reference and primitive type 

# 🔹 Number Class

* `Number` is an **abstract class**
* Parent of all numeric wrapper classes (`Integer`, `Float`, etc.)

### Useful Methods:
this method is used for convert referential numeric value to primitive data type 
```java
int intValue() 
float floatValue()
double doubleValue()
long longValue()
short shortValue()
byte byteValue()
```

Example:

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

# 🔹 valueOf() Method

* Converts primitive → object(Reference data type)

```java
int a = 10;
Integer i = Integer.valueOf(a);
String str = String.valuof(a);
Float f = Float.vlaueof(a);
```

---

# 🔹 parseXXX() Method

* Converts String → primitive

```java
String s = "1234";
int val = Integer.parseInt(s);
float f = Float.parseFloat(s);
System.out.println(val);  // 1234
System.out.println(f);    // 1234.0
```
⚠️ Important Points
1. String must be numeric
String s = "abc";
int val = Integer.parseInt(s); // ❌ Error

➡️ Throws: NumberFormatException

2. Float can accept decimal values
String s = "12.5";

float f = Float.parseFloat(s); // ✔ Works
int val = Integer.parseInt(s); // ❌ Error

3. No spaces allowed
String s = " 1234 ";
int val = Integer.parseInt(s); // ❌ Error

✔ Fix:

int val = Integer.parseInt(s.trim());

⚠️ May throw:

* `NumberFormatException`

---

# 🔹 String toString() Method

Convert any value → String

🔹 Example with Object

Integer obj = 100;
String s = obj.toString();
System.out.println(s);  // "100"

```java
int a = 10;
String s = String.valueOf(a);
```

---

# 🔹 String in Java

### ✔ Definition

* String is **immutable object in java**
* Once created, value **cannot change**
 when we perform any operation on string JVM create new object of string every time. Interally String is final class in JAVA.

 Note: every  “ “ in java consider as string object 

---

# 🔹 String Creation

### 1. Using Literal

```java
String s = "abc"; s = reference of string and abc = object;
```

* Stored in **String Constant Pool**

---

### 2. Using new keyword

```java
String s = new String("abc");
```

* Stored in **Heap**

---

# 🔹 String Constant Pool (SCP)

* Special memory inside heap
* Stores unique string literals

Example:

```java
String s1 = "abc";
String s2 = "abc";
```

✔ Both refer to **same object**

![alt text](image.png)

When we create string using initialization then string object get create in string constant pool and when we have string with same value then JVM create single object in string constant and pool and share its address in multiple reference and 
when we create object using a new keyword then JVM create new object every time in heap if string value is same or different 

---

# 🔹 Important String Methods

```java

length()
charAt(int index)
toUpperCase()
toLowerCase()
concat(String)
trim()
substring(int start)
substring(int start, int end)
split(String)
indexOf(String)
startsWith(String)
endsWith(String)
```

---

# 🔹 Immutability Example

```java
String s = "good";
s.toUpperCase();
System.out.println(s);
```

✔ Output: `good` (not changed)

Correct way:

```java
s = s.toUpperCase();
```

---

# 🔹 StringBuffer & StringBuilder

### ✔ Both are Mutable

* Can modify same object

---

### Example:

```java
StringBuffer sb = new StringBuffer("Good ");
sb.append(2026);
```

---

# 🔹 Difference: StringBuffer vs StringBuilder

| Feature      | StringBuffer | StringBuilder |
| ------------ | ------------ | ------------- |
| Thread Safe  | Yes          | No            |
| Speed        | Slower       | Faster        |
| Synchronized | Yes          | No            |

---

# 🔹 Difference: String vs StringBuilder

| Feature     | String        | StringBuilder |
| ----------- | ------------- | ------------- |
| Mutability  | Immutable     | Mutable       |
| Thread Safe | Yes           | No            |
| Creation    | Literal + new | Only new      |

---

# 🔹 Referential Conversion

### 1. Upcasting

* Child → Parent
* Automatic

```java
Animal a = new Dog();
```

---

### 2. Downcasting

* Parent → Child
* Requires casting

```java
Dog d = (Dog) a;
```

---


