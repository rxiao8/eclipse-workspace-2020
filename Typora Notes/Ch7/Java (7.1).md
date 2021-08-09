# **7.1 Reading and Writing Text Files :file_cabinet:**

** **

- read and write files

- encrypt data

- report and recover file issues

  ------

  

​	Scanner class is used to receive user console input, but in order to read files off of hard drives the Scanner class relies of File class: deals with files and directories. 

``` java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Scanner;


//The Scanner method reads the txt file sent by File method:


File inputFile = new File("input.txt"); //constructing a File object
Scanner in = new Scanner(inputFile); //uses File object to construct Scanner object. Notice how we do not use "System.in" as we are not receiving console inputs. 

Scanner in = new Scanner(System.in); 
String upToSpace = in.next();//to read input up to first space
String line = in.nextLine();//to read multiple lines of text
int num = in.nextInt();//to read numbers and store them in int variables
double fraction = in.nextDouble();//to read numbers and store them in double variables
```

​	To output files, use PrintWriter class which is an upgraded version of PrintStream class (System.out) and we can apply stream methods onto PrintWriter objects. Keep in mind when you run this, an existing file will have its contents removed before new data is added and a nonexistent file will start with a clean slate.

```java
PrintWriter out = new PrintWriter("output.txt"); //this outputs the file
out.println();
out.printf();

//Close your methods or else the processed output would not be saved
in.close(); //Close your Scanner!
out.close(); //Close your output!
```

What does the error "FileNotFoundException" mean?

The file you want to input does not exist or cannot be opened (due to illegal issues or are not allowed to create one in that location). 

​	We need to terminate main() if this happens:

``` java
public static void main(String[] args) throws FileNotFoundException
```

How to deal with Backlashes:

```java
String literal = "c:\\homework\\input.dat" //uses the backlashes TWICE since a single \ is an escape character and deals with formatting
//however, do single slash if suppling file name to a program
```

Interesting way to read WebPages:

```java
public static void main(String[] args) IOException 

String address = "url"; 
URL pageLocation = new URL (address);
Scanner in = new Scanner (pageLocation.openStream());
```

How to do pop up File Dialog Boxes:

```java
import java.io.JFileChooser;

Basically, you create an object and call the methods
    
    
JFileChooser chooser = new JFileChooser(); //create a file chooser object
Scanner in = null; //disregard placement of box
if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){ //or showSaveDialog(null); approve option if a file was selected and a cancel option if user canceled selection
    File selectedFile = chooser.getSelectedFile(); //file was chosen
    in = new Scanner(selectedFile);
}
```

Reading and Writing Binary Data for files without characters (unsigned and signed integers):

```java
URL imageLocation = new URL("url.gif"); //Create URL object
InputStream in = imageLocation.openStrem(); //reads the binary data

FileOutputStream out = new FileOutputStream(".gif"): //to write binary data

//can use a loop to copy bytes from input stream to output stream
```

