You shared detailed notes on **Java File Handling / I/O Streams**. Here’s a **clean, corrected, easy-to-study summary** (important exam/interview points).

# Java File Handling / I/O Streams

## What is I/O Stream?

**I/O Stream = Input / Output Stream**

A stream is used to transfer data from one location to another.

* **Input Stream** → Read data
* **Output Stream** → Write data

Java provides **java.io package** for file handling.

---

# 1. File Class

The `File` class is used to:

* Access file/folder path
* Create file
* Create folder
* Check file existence
* List files
* Get drive information

Import:

```java
import java.io.*;
```

---

## Important Methods of File Class

| Method            | Description                     |
| ----------------- | ------------------------------- |
| `exists()`        | Check file/folder exists or not |
| `mkdir()`         | Create single folder            |
| `mkdirs()`        | Create multiple folders         |
| `createNewFile()` | Create file                     |
| `listRoots()`     | Get drives/partitions           |
| `getTotalSpace()` | Total drive space               |
| `getFreeSpace()`  | Free drive space                |
| `length()`        | File size                       |

---

# 2. Get List of Drives

```java
import java.io.*;

public class DriveListApplication {
    public static void main(String[] args) {
        File[] drives = File.listRoots();

        for (File drive : drives) {
            long total = drive.getTotalSpace();
            long free = drive.getFreeSpace();

            System.out.println(
                drive + " Total: " +
                (total / 1073741824) + " GB | Free: " +
                (free / 1073741824) + " GB"
            );
        }
    }
}
```

---

# 3. Create Folder

```java
import java.io.*;

public class CreateFolderApplication {
    public static void main(String[] args) {
        File f = new File("D:\\demo");

        if (f.exists()) {
            System.out.println("Folder already exists");
        } else {
            boolean created = f.mkdir();

            if (created)
                System.out.println("Folder created");
            else
                System.out.println("Not created");
        }
    }
}
```

---

# 4. Create File

```java
import java.io.*;

public class CreateFileApplication {
    public static void main(String[] args) throws Exception {
        File f = new File("D:\\demo\\resume.txt");

        if (f.exists()) {
            System.out.println("File already exists");
        } else {
            boolean created = f.createNewFile();

            if (created)
                System.out.println("File created");
            else
                System.out.println("File not created");
        }
    }
}
```

---

# Text File Handling (Character Stream)

Used for:

* Text files
* Word documents
* CSV
* Character data

Classes:

* `Writer`
* `Reader`

---

# 5. Writer Classes

Writer classes write character/text data.

Examples:

* `FileWriter`
* `BufferedWriter`

---

## Important Methods of Writer Class

| Method          | Use                    |
| --------------- | ---------------------- |
| `write(int)`    | Write single character |
| `write(char[])` | Write character array  |
| `write(String)` | Write string           |
| `append()`      | Add data at end        |
| `flush()`       | Clear buffer           |
| `close()`       | Close stream           |

---

# 6. FileWriter Class

Used to write text data.

### Modes

### Write Mode

Old file data gets overwritten.

### Append Mode

New data added at end.

---

## FileWriter Example

```java
import java.io.*;
import java.util.Scanner;

public class SaveFileApplication {
    public static void main(String[] args) throws Exception {
        FileWriter fw =
            new FileWriter("D:\\demo\\first.txt", true);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data:");
        String data = sc.nextLine();

        fw.write(data);
        fw.close();

        System.out.println("Saved successfully");
    }
}
```

---

# 7. BufferedWriter

Used to write line by line.

Special method:

```java
newLine();
```

### Example

```java
import java.io.*;
import java.util.Scanner;

public class SaveFileApplication {
    public static void main(String[] args) throws Exception {
        FileWriter fw =
            new FileWriter("D:\\demo\\second.txt", true);

        BufferedWriter bw =
            new BufferedWriter(fw);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data:");
        String data = sc.nextLine();

        bw.write(data);
        bw.newLine();

        bw.close();

        System.out.println("Saved");
    }
}
```

---

# 8. Reader Classes

Reader classes read character data.

Examples:

* `FileReader`
* `BufferedReader`

---

## Important Reader Methods

| Method                   | Use                   |
| ------------------------ | --------------------- |
| `read()`                 | Read single character |
| `read(char[])`           | Read array            |
| `read(char[], off, len)` | Read specific size    |

---

# 9. FileReader

Used to read text file.

### Example

```java
import java.io.*;

public class ReadFileApp {
    public static void main(String[] args)
            throws Exception {

        FileReader fr =
            new FileReader("D:\\demo\\second.txt");

        int data;

        while ((data = fr.read()) != -1) {
            System.out.print((char) data);
        }

        fr.close();
    }
}
```

---

# 10. BufferedReader

Reads file line by line.

Special method:

```java
readLine();
```

Returns `null` when file ends.

### Example

```java
import java.io.*;

public class ReadFileApp {
    public static void main(String[] args)
            throws Exception {

        BufferedReader br =
            new BufferedReader(
                new FileReader("D:\\demo\\second.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
```

---

# Byte Stream (Binary Data)

Used for:

* Image
* Video
* Audio
* PDF
* Binary files

Classes:

* `OutputStream`
* `InputStream`

---

# 11. OutputStream

Used to write byte data.

Methods:

* `write(int)`
* `write(byte[])`
* `flush()`
* `close()`

---

# 12. FileOutputStream

Writes byte data.

### Example

```java
import java.io.*;
import java.util.Scanner;

public class StreamApplication {
    public static void main(String[] args)
            throws Exception {

        FileOutputStream fout =
            new FileOutputStream(
                "D:\\demo\\sample.txt");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data:");
        String data = sc.nextLine();

        byte[] b = data.getBytes();

        fout.write(b);
        fout.close();

        System.out.println("Saved");
    }
}
```

---

# 13. InputStream

Used to read byte data.

Methods:

* `read()`
* `read(byte[])`
* `readAllBytes()`
* `readNBytes()`

---

# 14. FileInputStream

### Example

```java
import java.io.*;

public class ReadStreamApp {
    public static void main(String[] args)
            throws Exception {

        FileInputStream fin =
            new FileInputStream(
                "D:\\demo\\sample.txt");

        int data;

        while ((data = fin.read()) != -1) {
            System.out.print((char) data);
        }

        fin.close();
    }
}
```

---

# 15. Copy Image/File

```java
import java.io.*;

public class CopyFileApp {
    public static void main(String[] args)
            throws Exception {

        FileInputStream fin =
            new FileInputStream("D:\\a.png");

        FileOutputStream fout =
            new FileOutputStream("D:\\copy.png");

        int data;

        while ((data = fin.read()) != -1) {
            fout.write(data);
        }

        fin.close();
        fout.close();

        System.out.println("Copied");
    }
}
```

---

# Serialization

Serialization = Converting object → file/network.

For this:
Class must implement:

```java
Serializable
```

It is a **marker interface** (no methods).

---

# 16. Serialization Example

```java
import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    int sal;
}

public class SerializeApplication {
    public static void main(String[] args)
            throws Exception {

        Employee emp = new Employee();
        emp.id = 1;
        emp.name = "ABC";
        emp.sal = 10000;

        ObjectOutputStream out =
            new ObjectOutputStream(
                new FileOutputStream(
                    "D:\\emp.txt"));

        out.writeObject(emp);
        out.close();
    }
}
```

---

# Deserialization

Deserialization = Reading object back from file.

---

# 17. Deserialization Example

```java
import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    int sal;
}

public class DeserializeApplication {
    public static void main(String[] args)
            throws Exception {

        ObjectInputStream in =
            new ObjectInputStream(
                new FileInputStream(
                    "D:\\emp.txt"));

        Employee emp =
            (Employee) in.readObject();

        System.out.println(
            emp.id + " " +
            emp.name + " " +
            emp.sal
        );

        in.close();
    }
}
```

---

# Transient Keyword

`transient` skips variable during serialization.

```java
class Employee implements Serializable {
    int id;
    transient String password;
}
```

If object is serialized, `password` will **not be stored**.

---

# Quick Difference

| Class                | Purpose              |
| -------------------- | -------------------- |
| `File`               | Manage files/folders |
| `FileWriter`         | Write text           |
| `BufferedWriter`     | Write line by line   |
| `FileReader`         | Read text            |
| `BufferedReader`     | Read line by line    |
| `FileOutputStream`   | Write bytes          |
| `FileInputStream`    | Read bytes           |
| `ObjectOutputStream` | Serialize object     |
| `ObjectInputStream`  | Deserialize object   |

This is the corrected, cleaner version of your **Java File Handling / IOStreams notes**.
