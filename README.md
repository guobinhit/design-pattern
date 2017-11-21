> **Notices**：If you want to read chinese `README`, please onclick [THERE](https://github.com/guobinhit/design-pattern/blob/master/README_CH.md). 

# Design Pattern

Detail design pattern and give many demos of Java.
 
## Index

- [Singleton](#singleton)
- [Strategy](#strategy)
- [Observer](#observer)
- [Decorator](#decorator)
- [Adapter](#adapter)
- [Facade](#facade)
- [Builder](#builder)
- [Iterator](#iterator)



## Singleton

　　The singleton pattern is a software design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system. The concept is sometimes generalized to systems that operate more efficiently when only one object exists, or that restrict the instantiation to a certain number of objects. The term comes from the mathematical concept of a singleton. An implementation of the singleton pattern must:

- ensure that only one instance of the singleton class ever exists; and
- provide global access to that instance.

> The Singleton design pattern solves problems like:

- How can it be ensured that a class has only one instance?
- How can the sole instance of a class be accessed easily?
- How can a class control its instantiation?
- How can the number of instances of a class be restricted?

Typically, this is done by:

- declaring all constructors of the class to be private; and
- providing a static method that returns a reference to the instance.

The instance is usually stored as a private static variable; the instance is created when the variable is initialized, at some point before the static method is first called.



## Strategy

　　The strategy pattern (also known as the policy pattern) is a behavioural software design pattern that enables selecting an algorithm at runtime. The strategy pattern

- defines a family of algorithms,
- encapsulates each algorithm, and
- makes the algorithms interchangeable within that family.

　　For instance, a class that performs validation on incoming data may use the Strategy pattern to select a validation algorithm depending on the type of data, the source of the data, user choice, or other discriminating factors. These factors are not known until run-time and may require radically different validation to be performed. The validation algorithms (strategies), encapsulated separately from the validating object, may be used by other validating objects in different areas of the system (or even different systems) without code duplication.

> The Strategy design pattern solves problems like:

- How can a class use different algorithms?
- How can a class be configured with an algorithm?
- How can an algorithm be selected and exchanged at run-time?

Implementing algorithms directly within the class that requires them is inflexible because it commits the class to particular algorithms and makes it impossible to change an algorithm later independently from (without having to change) the class. This stops the class from being reusable if other algorithms are required. But Strategy Pattern makes a class independent of how an algorithm is implemented.

## Observer

　　The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.

> The Observer design pattern solves problems like:

- How can a one-to-many dependency between objects be defined without making the objects tightly coupled?
- How can one be ensured that when one object changes state an open-ended number of dependent objects are updated (synchronized) automatically?
- How can an object notify an open-ended number of other objects?

Defining a one-to-many dependency between objects by defining one object (subject) that updates the state of dependent objects directly is inflexible because it commits (tightly couples) the subject to particular dependent objects and makes it impossible to change the objects (add new ones or remove existing ones) independently from (without having to change) the subject. This stops the subject from being reusable, and it makes the subject hard to test. Tightly coupled objects are hard to implement, change, test, and reuse because they refer to and know about many different objects.


# Decorator

　　The decorator pattern (also known as Wrapper, an alternative naming shared with the Adapter pattern) is a design pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. The decorator pattern is often useful for adhering to the Single Responsibility Principle, as it allows functionality to be divided between classes with unique areas of concern.

> What problems can the Decorator design pattern solve?

- Responsibilities should be added to (and removed from) an object dynamically at run-time.
- A flexible alternative to subclassing for extending functionality should be provided.

When using subclassing, different subclasses extend a class in different ways. But an extension is bound to the class at compile-time and can't be changed at run-time.

# Adapter

　　The adapter pattern is a software design pattern (also known as Wrapper, an alternative naming shared with the Decorator pattern) that allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code. An example is an adapter that converts the interface of a Document Object Model of an XML document into a tree structure that can be displayed.

> The Adapter design pattern solves problems like:

- How can a class be reused that does not have an interface that a client requires?
- How can classes that have incompatible interfaces work together?
- How can an alternative interface be provided for a class?

Often an (already existing) class can't be reused only because its interface doesn't conform to the interface clients require.

> The Adapter design pattern describes how to solve such problems:

- Define a separate `Adapter` class that converts the (incompatible) interface of a class (`Adaptee`) into another interface (`Target`) clients require.
- Work through an `Adapter` to work with (reuse) classes that do not have the required interface.

The key idea in this pattern is to work through a separate Adapter that adapts the interface of an (already existing) class without changing it. Clients don't know whether they work with a `Target` class directly or through an `Adapter` with a class that has not the `Target` interface.

# Facade

　　The facade pattern (also spelled façade) is a software design pattern commonly used with object-oriented programming. The name is an analogy to an architectural façade. A facade is an object that provides a simplified interface to a larger body of code, such as a class library. A facade can

- make a software library easier to use, understand, and test, since the facade has convenient methods for common tasks,
- make the library more readable, for the same reason,
- reduce dependencies of outside code on the inner workings of a library, since most code uses the facade, thus allowing more flexibility in developing the system,
- wrap a poorly designed collection of APIs with a single well-designed API.

The Facade design pattern is often used when a system is very complex or difficult to understand because the system has a large number of interdependent classes or its source code is unavailable. This pattern hides the complexities of the larger system and provides a simpler interface to the client. It typically involves a single wrapper class that contains a set of members required by client. These members access the system on behalf of the facade client and hide the implementation details.

> What problems can the Facade design pattern solve? 

- To make a complex subsystem easier to use, a simple interface should be provided for a set of interfaces in the subsystem.
The dependencies on a subsystem should be minimized.
- Clients that access a complex subsystem directly refer to (depend on) many different objects having different interfaces (tight coupling), which makes the clients hard to implement, change, test, and reuse.

> What solution does the Facade design pattern describe?

Define a Facade object that

- implements a simple interface in terms of (by delegating to) the interfaces in the subsystem and
- may perform additional functionality before/after forwarding a request.

This enables to work through a Facade object to minimize the dependencies on a subsystem.

## Builder

　　The builder pattern is an object creation software design pattern. Unlike the abstract factory pattern and the factory method pattern whose intention is to enable polymorphism, the intention of the builder pattern is to find a solution to the telescoping constructor anti-pattern that occurs when the increase of object constructor parameter combination leads to an exponential list of constructors. Instead of using numerous constructors, the builder pattern uses another object, a builder, that receives each initialization parameter step by step and then returns the resulting constructed object at once.

> The Builder design pattern solves problems like: 

- How can a class (the same construction process) create different representations of a complex object?
- How can a class that includes creating a complex object be simplified?

Creating and assembling the parts of a complex object directly within a class is inflexible. It commits the class to creating a particular representation of the complex object and makes it impossible to change the representation later independently from (without having to change) the class.

> The Builder design pattern describes how to solve such problems:

- Encapsulate creating and assembling the parts of a complex object in a separate `Builder` object.
- A class delegates object creation to a `Builder` object instead of creating the objects directly.

A class (the same construction process) can delegate to different `Builder` objects to create different representations of a complex object.


## Iterator

　　The iterator pattern is a design pattern in which an iterator is used to traverse a container and access the container's elements. The iterator pattern decouples algorithms from containers; in some cases, algorithms are necessarily container-specific and thus cannot be decoupled.

> What problems can the Iterator design pattern solve?

- The elements of an aggregate object should be accessed and traversed without exposing its representation (data structures).
- New traversal operations should be defined for an aggregate object without changing its interface.

Defining access and traversal operations in the aggregate interface is inflexible because it commits the aggregate to particular access and traversal operations and makes it impossible to add new operations later without having to change the aggregate interface.

> What solution does the Iterator design pattern describe?

- Define a separate (iterator) object that encapsulates accessing and traversing an aggregate object.
- Clients use an iterator to access and traverse an aggregate without knowing its representation (data structures).

Different iterators can be used to access and traverse an aggregate in different ways.


----------

**Reference**: The content of above comes from [Wikipedia](https://en.wikipedia.org/wiki/Design_pattern).
