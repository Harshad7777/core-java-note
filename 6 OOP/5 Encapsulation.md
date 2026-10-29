
## Q16. What is Encapsulation and What are its Benefits?

**Encapsulation** is the process of **hiding data and implementation details** from outside access. Its main goal is **data security**. 

### How to achieve Encapsulation?

To achieve encapsulation:

1. Declare variables/data as **`private`**.
2. Provide **public methods** such as getters and setters to access or modify the data.
3. Put required validation or logic inside those methods.

```java
class Student {

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

Now outside code cannot directly do:

```java
// student.id = 10;       // ❌ private
```

Instead, it uses:

```java
Student s = new Student();

s.setId(10);
s.setName("Rahul");

System.out.println(s.getId());
System.out.println(s.getName());
```

So the data is accessed **through controlled public methods**.

---

## Benefits of Encapsulation

### 1. Data Security

Private data cannot be directly accessed from outside the class.

```java
private int fees;
```

The user must access it through methods. 

### 2. Controlled Access

We can decide **how data should be accessed or modified**.

For example:

```java
public void setFees(int fees) {

    if (fees >= 0) {
        this.fees = fees;
    }
}
```

Here, the method controls what value can be assigned.

### 3. Data Hiding

The internal implementation is hidden from the outside code.

The outside code only needs to know:

```java
s.setFees(10000);
```

It does not need to know how `setFees()` internally handles the value.

---

# Your `Candidate` Example

Your notes use a `Candidate` POJO class as an example of encapsulation. 

```java
class Candidate {

    private String name;
    private int id;
    private int fees;
    private boolean status;
    private boolean readyStatus;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getFees() {
        return fees;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setReadyStatus(boolean readyStatus) {
        this.readyStatus = readyStatus;
    }

    public boolean isReadyStatus() {
        return readyStatus;
    }
}
```

Notice the important pattern:

```text
private variable
       ↓
public getter/setter
       ↓
controlled access
```

For example:

```java
private int fees;
```

cannot be accessed directly outside `Candidate`.

Instead:

```java
setFees(10000);   // set value
getFees();        // get value
```

Your `AdmissionProcess` also accesses candidate data through methods such as `getName()`, `getId()`, `setReadyStatus()`, `setFees()`, and `setStatus()` rather than directly accessing the private variables. 

### ⭐ Short Interview Answer

> **Encapsulation is the process of hiding data and implementation details from outside access. We achieve encapsulation by declaring data members as private and providing public getter and setter methods for controlled access. The main benefits are data hiding, data security, and controlled access to data.** 


Yes — this is a good **Q16 interview-ready version**. It keeps the main points from your notes: **data hiding, `private` variables, public getters/setters, controlled access, and POJO example**. 

### ⭐ Remember this formula

```text
Encapsulation
      ↓
private data
      ↓
public getter/setter
      ↓
controlled access
      ↓
data security
```

### One-line example

```java
private int fees;

public void setFees(int fees) {
    if (fees >= 0) {
        this.fees = fees;
    }
}

public int getFees() {
    return fees;
}
```

**Interview keywords:**
`private` → **Data Hiding** → `getter/setter` → **Controlled Access** → **Data Security**

### Admission Process Example

Consider a college admission project with two user roles:

- Admin
- Counceller

Candidate records include an ID, name, qualification, branch, fees paid, contact details, email, and status.

```java
import java.util.Scanner;

class Candidate {
    private String name;
    private int id;
    private int fees;
    private boolean status;
    private boolean readyStatus;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getFees() {
        return fees;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setReadyStatus(boolean readyStatus) {
        this.readyStatus = readyStatus;
    }

    public boolean isReadyStatus() {
        return readyStatus;
    }
}

class AdmissionProcess {

    private Candidate cand[];

    void sendToCounceller(Candidate... cand) {
        this.cand = cand;
    }

    void councelling() {

        boolean b = false;

        Scanner xyz = new Scanner(System.in);

        do {
            System.out.println("\nEnter your choice");
            System.out.println("1: Follow up");
            System.out.println("2: Exit");

            int choice = xyz.nextInt();
            xyz.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter candidate name:");
                    String name = xyz.nextLine();

                    System.out.println("Enter candidate id:");
                    int id = xyz.nextInt();

                    for (int i = 0; i < cand.length; i++) {

                        if (cand[i].getName().equals(name)
                                && cand[i].getId() == id) {

                            cand[i].setReadyStatus(true);

                            System.out.println(
                                "Candidate is ready for admission."
                            );

                            break;
                        }
                    }

                    break;

                case 2:
                    b = true;
                    break;

                default:
                    System.out.println("Wrong choice");
            }

            if (b) {
                break;
            }

        } while (true);
    }
    void admission() {

        for (int i = 0; i < cand.length; i++) {

            if (cand[i].isReadyStatus()) {

                cand[i].setFees(10000);
                cand[i].setStatus(true);
            }
        }
    }

    void displayData(String loginType) {

        if (loginType.equals("admin")) {

            System.out.println("\nAdmin Data");
            System.out.println("ID\tName\tFees");

            for (int i = 0; i < cand.length; i++) {

                if (cand[i].isStatus()) {

                    System.out.println(
                        cand[i].getId() + "\t"
                        + cand[i].getName() + "\t"
                        + cand[i].getFees()
                    );
                }
            }
        }
        else if (loginType.equals("counceller")) {

            System.out.println("\nCounceller Data");
            System.out.println("ID\tName\tFees");

            for (int i = 0; i < cand.length; i++) {

                if (!cand[i].isStatus()) {

                    System.out.println(
                        cand[i].getId() + "\t"
                        + cand[i].getName() + "\t"
                        + cand[i].getFees()
                    );
                }
            }
        }

        else {
            System.out.println("Invalid login");
        }
    }
}

public class AdmissionProcessApplication {

    public static void main(String x[]) {

        AdmissionProcess ap = new AdmissionProcess(); 

        Candidate c[] = new Candidate[5];
 
        Scanner xyz = new Scanner(System.in);

        for (int i = 0; i < c.length; i++) {
 
            c[i] = new Candidate();

            System.out.println("\nEnter candidate name:"); 
            String name = xyz.nextLine();

            System.out.println("Enter candidate id:");
            int id = xyz.nextInt();
            xyz.nextLine();

            c[i].setName(name);
            c[i].setId(id);
            c[i].setFees(0);
            c[i].setReadyStatus(false);
            c[i].setStatus(false);
        }

        ap.sendToCounceller(c);

        ap.councelling();

        ap.admission();

        ap.displayData("counceller");

        // To display Admin data:
        // ap.displayData("admin");
    }
}
```