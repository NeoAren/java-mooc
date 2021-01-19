# Part 04 - 08 - Decreasing counter

This exercise consists of multiple parts. Each part corresponds to one exercise point.

The exercise template comes with a partially executed class `decreasingCounter`.

The following is an example of how the main program uses the decreasing counter:

```java
public class MainProgram {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
```

The program above should have the following print output.

```
value: 10
value: 9
value: 8
```

### Part 1

Implement the `decrement()` method in the class body in such a way that it decrements the `value` variable of the object it's being called one by one. Once you're done with the `decrement()` method, the main program of the previous example should work to produce the example output.

### Part 2

Implement the `decrement()` in such a way that the counter's value never becomes negative. This means that if the value of the counter is 0, it cannot be decremented. A conditional statement is useful here.

```java
public class MainProgram {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(2);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
```

Prints:

```
value: 2
value: 1
value: 0
value: 0
```

### Part 3

Create the method `public void reset()` for the counter that resets the value of the counter to 0. For example:

```java
public class MainProgram {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
```

Prints:

```
value: 100
value: 0
value: 0
```
