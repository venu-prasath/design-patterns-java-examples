## Prototype Design Pattern

The Prototype design pattern is a creational pattern that allows an object to create customized copies of itself without knowing the details of how the objects are created. This pattern is particularly useful when the construction of a new object is more efficient by copying an existing object than by creating a new instance from scratch.

Key Concepts
Prototype: An interface that defines the method for cloning itself.
Concrete Prototype: Implements the cloning method to make a copy of itself.
Client: Creates a new object by asking a prototype to clone itself.
The pattern leverages the use of a clone() method to create a copy of an existing object. This approach simplifies the creation of objects, especially when dealing with complex object structures that require significant resources to create from scratch.

Purpose
The Prototype pattern is used to:

Avoid subclasses of an object creator in the client application, like the abstract factory pattern does.
Avoid the inherent cost of creating a new object in the standard way (e.g., using the new keyword) when it is prohibitively expensive for a given application.

### Resources
1. [Design Patterns](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
2. [refactoring.guru](https://refactoring.guru/design-patterns/prototype)