# Adapter Design Pattern 
I have created some example on adapter design pattern in this repo.

## Definition of Adapter design pattern
The Adapter design pattern, a concept from software design, acts like a bridge 
between two incompatible interfaces. This pattern involves a single class, 
known as the adapter, which joins functionalities of independent or incompatible 
interfaces. Here's a more detailed breakdown:

### Purpose:
The primary purpose of the Adapter pattern is to allow the existing classes to work
together without modifying their source code. This is particularly useful in 
situations where you have to integrate new components into an existing system that expect
different interfaces.

### How It Works:
The adapter class implements the interface that is expected by the client while wrapping
the "adaptee" object. The adapter translates or maps the client's calls to the adaptee's 
interface. In essence, the adapter acts as a translator between the client and the adaptee.

### Use Cases:
It's commonly used when new components need to be integrated into existing systems and 
when there is a need to create reusable classes that cooperate with classes which don't 
necessarily have compatible interfaces.

### Types:
- Class Adapter: Uses inheritance to adapt one interface to another.
- Object Adapter: Uses composition to combine the adaptee's interface with the adapter's.

### Advantages:
- increases the reusability of existing classes.
- Provides a clear separation of concerns by decoupling the client and the adaptee.
- Offers flexibility since the adaptation of the functionality is done at runtime.

### Disadvantages:
- Can lead to a more complex code structure.
- Overuse can make the code hard to understand for new developers.

### Example in Programming:
Imagine a scenario where an application uses a third-party library to process data,
but the library's method expects a different format than what the application uses.
An adapter class can be created to convert the application's data format to the format 
expected by the library method, enabling the two to work together seamlessly.

## Examples
- Example 1: i have created an example using school assignement [Example 1](./src/main/example1/School.java)
- Example 2: i have created using Phone and charger [Example 2](./src/main/example2/Main.java)
- Example 3: i have created another example Book Manager [Example 3](./src/main/example3/Main.java)
- Example 4: And the best for me converting xml documents to Json [XML To Json](./src/main/XmlToJson/Main.java)
