10.1 Frame Windows

Graphical application shows interactive information within a frame. 

Use JFrame class

```java
import javax.swing.JFrame;

JFrame frame = new JFrame(); //instantiation

final int FRAME_WIDTH = 300;
final int FRAME_HEIGHT = 400;
frame.setSize (FRAME_WIDTH, FRAME_HEIGHT); //sets frame size

frame.setTitle("An empty frame"); //title bar

frame.setDefaultClostOperation(JFrame.EXIT_ON_CLOSE); //to exit program automatically or else it will keep running despite user closing the frame. DO NOT forget this!

frame.setVisible(true);
```

Swing is a GUI tool in java library and the "x" denotes that it was an extension before being added to the library.

Add components in panel--a container for other components before adding them onto the frame. Use JPanel()

```java
Jpanel panel = new JPanel();

JButton button = new JButton("Click me!");
JLabel label = new JLabel("Hello World");
panel.add(button);
panel.add(label);
frame.add(panel);
```

Use inheritance for complex frames with components as instance variables. Use helper methods and set frame size in constructors.

Helper methods are public and can be accessed across multiple classes, reducing the amount of code to write for repetitive tasks.

```java

```

