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

# Design Pattern used in Adapter design pattern
The Adapter design pattern primarily revolves around a few key design principles and patterns:

1. `Structural Pattern:` At its core, the Adapter pattern is a structural pattern. Structural patterns
are concerned with how classes and objects are composed to form larger structures. The Adapter pattern 
achieves this by creating an adapter class that bridges the gap between an interface and an implementation.
2. `Encapsulation:` The Adapter pattern uses encapsulation to hide the complexities of how the adapting process
is done from the client. The client interacts with the Adapter interface, and the adapter takes care of 
the details of interacting with the adaptee.
3. `Inheritance (for Class Adapters):` In the Class Adapter version, inheritance is used to adapt 
one interface to another. The Adapter class inherits from the Adaptee class (or classes) and also 
implements the Target interface. This way, it can override the behaviors of the Adaptee 
class and align them with the expectations of the Target interface.
4. `Composition (for Object Adapters):` The Object Adapter pattern uses composition. Here, the Adapter 
class contains an instance of the Adaptee class and delegates the client requests to this instance.
This approach adheres to the composition-over-inheritance principle, which favors composing objects 
over class inheritance.
5. `Polymorphism:` Polymorphism is used in the Adapter pattern to ensure that the adapter can 
be used in place of the target interface. The client code can remain the same as it calls the methods 
on the target interface, which are implemented by the adapter.
6. `Interface Segregation Principle:` In some cases, the Adapter pattern can be used to make an adaptee conform 
to a specific interface with fewer methods than the adaptee's full interface. This is in line with the Interface 
Segregation Principle, which states that no client should be forced to depend on methods it does not use.
7. `Single Responsibility Principle:` While not a design pattern, it's worth noting that the Adapter pattern
adheres to the Single Responsibility Principle. The adapter has the single responsibility of adapting 
the interface of an existing class without changing its source code.<br>
`These principles and patterns work together in the Adapter pattern to provide a means of integrating systems or 
components with incompatible interfaces. The focus is on achieving interoperability while maintaining code separation
and cleanliness.`