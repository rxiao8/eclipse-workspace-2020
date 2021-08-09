10.2 Events and Event Handling

User is in control of the program, so Java must react to user-interface events.

User-interface events: key presses, mouse movement, button clicks, menu selections, etc.

Event Source- user-interface component that generates an event and is paired with event listeners. They are reporters that notifies their listeners--the audience.

Event Listener Objects- objects that contain instructions as to what to do when the events occur; this will specify the type of event the program focuses on

```java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //AWT is Abstract Window Toolkit
//Create a listener class implementing ActionListerner, construct an object of the class, and add that to the component/event source
```

Inner classes are common and they can use the methods and variables of the surrounding class. Though the variables they access from outside must be final.

Common Errors: forgetting to declare each method exactly specified in the interface and forgetting to attach listeners to event sources. DO NOT use frames as listeners!

Anonymous Inner Classes- helpful when you need objects/variables/methods once.

```java
button = new JButton("Add Interest"); //instead of instantiating a string and then a button
button.addActionListener (new ActionListener(){
    public void actionPerformed(ActionEvent event){
        double interest = balance * (1 + INTEREST_RATE);
        account.deposit(interest);
    }
})
    //instead of having to create a whole object of listener and then then to attach it in the .addActionListener
```







