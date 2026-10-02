# Java File Handling / I/O Streams

[Basics](#basics) | [File Class](#file-class) | [Character Streams](#character-streams) | [Byte Streams](#byte-streams) | [Serialization](#serialization) | [Quick Revision](#quick-revision)

---

## Basics

### What is I/O Stream?

An I/O stream is used to transfer data from one location to another.

- Input Stream → reads data
- Output Stream → writes data

Java provides the `java.io` package for file handling.

### Important interview point

Streams are used to work with data from files, keyboards, network sockets, and memory.

---

## File Class

The `File` class is used to:

- access file/folder paths
- create files and folders
- check existence
- list files and drives
- get file size and disk space

### Import

```java
import java.io.*;
```

### Important methods

| Method | Description |
| --- | --- |
| `exists()` | checks whether file/folder exists |
| `mkdir()` | creates a single folder |
| `mkdirs()` | creates multiple folders |
| `createNewFile()` | creates a new file |
| `listRoots()` | gets available drives |
| `getTotalSpace()` | returns total storage |
| `getFreeSpace()` | returns free storage |
| `length()` | returns file size in bytes |

### Example: get list of drives

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

### Example: create folder

```java
import java.io.*;

public class CreateFolderApplication {
    public static void main(String[] args) {
        File f = new File("D:\\demo");

        if (f.exists()) {
            System.out.println("Folder already exists");
        } else {
            boolean created = f.mkdir();

            if (created) {
                System.out.println("Folder created");
            } else {
                System.out.println("Not created");
            }
        }
    }
}
```

### Example: create file

```java
import java.io.*;

public class CreateFileApplication {
    public static void main(String[] args) throws Exception {
        File f = new File("D:\\demo\\resume.txt");

        if (f.exists()) {
            System.out.println("File already exists");
        } else {
            boolean created = f.createNewFile();

            if (created) {
                System.out.println("File created");
            } else {
                System.out.println("File not created");
            }
        }
    }
}
```

### Important interview point

`File` is used for file metadata and path operations, not for reading or writing data.

---

## Character Streams

Character streams are used for text data such as:

- `.txt`
- `.csv`
- source code
- character-based content

Main classes:

- `Writer`
- `Reader`

### Writer class methods

| Method | Use |
| --- | --- |
| `write(int)` | writes one character |
| `write(char[])` | writes character array |
| `write(String)` | writes a string |
| `append()` | adds at the end |
| `flush()` | clears the buffer |
| `close()` | closes the stream |

### FileWriter

`FileWriter` is used to write character/text data.

- Write mode: overwrites old content
- Append mode: adds new content at the end

### Example: write text with FileWriter

```java
import java.io.*;
import java.util.Scanner;

public class SaveFileApplication {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("D:\\demo\\first.txt", true);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        String data = sc.nextLine();

        fw.write(data);
        fw.close();

        System.out.println("Saved successfully");
    }
}
```

### BufferedWriter

`BufferedWriter` writes data line by line and is more efficient than `FileWriter`.

```java
import java.io.*;
import java.util.Scanner;

public class SaveFileApplication {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("D:\\demo\\second.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

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

### Reader class methods

| Method | Use |
| --- | --- |
| `read()` | reads one character |
| `read(char[])` | reads data into a char array |
| `read(char[], off, len)` | reads a specific number of characters |

### FileReader

`FileReader` reads character data from a file.

```java
import java.io.*;

public class ReadFileApp {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("D:\\demo\\second.txt");

        int data;
        while ((data = fr.read()) != -1) {
            System.out.print((char) data);
        }

        fr.close();
    }
}
```

### BufferedReader

`BufferedReader` reads a file line by line using `readLine()`.

```java
import java.io.*;

public class ReadFileApp {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new FileReader("D:\\demo\\second.txt")
        );

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
```

### Important interview point

`BufferedReader` is better for reading text line by line, while `FileReader` is lower-level character reading.

---

## Byte Streams

Byte streams are used for binary data such as:

- image files
- audio files
- video files
- PDF files
- executable files

Main classes:

- `OutputStream`
- `InputStream`

### OutputStream

Used to write byte data.

Methods:

- `write(int)`
- `write(byte[])`
- `flush()`
- `close()`

### FileOutputStream

Writes byte data to a file.

```java
import java.io.*;
import java.util.Scanner;

public class StreamApplication {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("D:\\demo\\sample.txt");

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

### InputStream

Used to read byte data.

Methods:

- `read()`
- `read(byte[])`
- `readAllBytes()`
- `readNBytes()`

### FileInputStream

```java
import java.io.*;

public class ReadStreamApp {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("D:\\demo\\sample.txt");

        int data;
        while ((data = fin.read()) != -1) {
            System.out.print((char) data);
        }

        fin.close();
    }
}
```

### Example: copy a file

```java
import java.io.*;

public class CopyFileApp {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("D:\\a.png");
        FileOutputStream fout = new FileOutputStream("D:\\copy.png");

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

### Important interview point

Character streams are for text; byte streams are for binary data.

---

## Serialization

Serialization means converting an object into a byte stream so it can be saved in a file or sent over a network.

To serialize an object, the class must implement:

```java
Serializable
```

`Serializable` is a marker interface, meaning it has no methods.

### Serialization example

```java
import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    int sal;
}

public class SerializeApplication {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee();
        emp.id = 1;
        emp.name = "ABC";
        emp.sal = 10000;

        ObjectOutputStream out = new ObjectOutputStream(
            new FileOutputStream("D:\\emp.txt")
        );

        out.writeObject(emp);
        out.close();
    }
}
```

### Deserialization

Deserialization is the reverse process: reading an object back from a file or stream.

```java
import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    int sal;
}

public class DeserializeApplication {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
            new FileInputStream("D:\\emp.txt")
        );

        Employee emp = (Employee) in.readObject();
        System.out.println(emp.id + " " + emp.name + " " + emp.sal);
        in.close();
    }
}
```

### Transient keyword

`transient` prevents a variable from being serialized.

```java
class Employee implements Serializable {
    int id;
    transient String password;
}
```

If an object is serialized, the `password` field will not be stored.

### Important interview point

Only non-transient, serializable fields are saved during object serialization.

---

## Quick Revision

| Class | Purpose |
| --- | --- |
| `File` | manages files and folders |
| `FileWriter` | writes text data |
| `BufferedWriter` | writes text efficiently line by line |
| `FileReader` | reads text data |
| `BufferedReader` | reads text line by line |
| `FileOutputStream` | writes byte data |
| `FileInputStream` | reads byte data |
| `ObjectOutputStream` | serializes objects |
| `ObjectInputStream` | deserializes objects |

### Summary

- `File` manages file/folder metadata.
- Character streams handle text.
- Byte streams handle binary data.
- `Serializable` is required for object serialization.
- `transient` skips fields during serialization.

---

## Final exam tip

Before answering any Java file-handling question, first identify:

- text vs binary data
- read vs write operation
- character stream vs byte stream
- object serialization requirement

This helps you choose the correct class quickly in exams and interviews.
