10.3 Processing Text Input

Use text components instead of "showInputDialog of JOptionPane"

JTextField- reads a single line of text with a fixed width hard coded, and it returns its input as a String

```java
final int WIDTH = 10; //formating the JTextField component
rateField = new JTextField(WIDTH);
JLabel rateLabel = new JLabel("Interest Rate: ");

//from here, create listener class that reads and executes the methods
```

JTextArea- a section of multiple JTextFields. Specify the number of rows and columns.

```java
object.setText(var + "\r\n");
object.setEditable(false);
JScrollPane scroll = new JScrollPane(object);
```

The two components are subclasses of JTextComponent