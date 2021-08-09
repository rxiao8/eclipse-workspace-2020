10.4 Creating Drawings

Drawing on a component since you cannot draw on a frame

```java
public class ChartComponent extends JComponent{ //to draw on component and this methods is called whenever the component needs to be repainted
    public void paintComponent(Graphics g){
        Drawing instructions
    }
}

//a object of type Graphics is passed adn the object stores the state: current color, font, etc
//g.fillRect(x, y, width, height) and g.drawRect() --> (x,y) is the upper-left corner
```

Note the coordinate system has the positive x-axis going to the right and positive y-axis going downward

```java
g.drawOval(x, y, width, height); //this will draw the rectangle around the oval
g.drawLine (x1, y1, x2, y2);
g.drawString ("Hello", x, y);
```

For color, use RGB color model by specifying the amount of primary colors used:

```java
Color magenta = new Color(255, 0, 255); //#'s go from 0-255
```

When setting a new color in graphics context, set the color of the Graphics object and then call the drawing method.

Call repaint() method after the state of a painted component is changed. Do not call the method (Graphics g) again since you don't have an object to pass through. 

Keep in mind, by default components have zero width and height.