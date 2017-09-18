# Design Pattern

Detail design pattern and give many demos of Java.
 


## Singleton Pattern

　　The singleton pattern is a software design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system. The concept is sometimes generalized to systems that operate more efficiently when only one object exists, or that restrict the instantiation to a certain number of objects. The term comes from the mathematical concept of a singleton.

> How to implement a  Singleton Pattern?

An implementation of the singleton pattern must:

- ensure that only one instance of the singleton class ever exists; and
- provide global access to that instance.

Typically, this is done by:

- declaring all constructors of the class to be private; and
- providing a static method that returns a reference to the instance.

The instance is usually stored as a private static variable; the instance is created when the variable is initialized, at some point before the static method is first called.



## Strategy Pattern

　　In computer programming, the strategy pattern (also known as the policy pattern) is a behavioural software design pattern that enables selecting an algorithm at runtime. The strategy pattern

- defines a family of algorithms,
- encapsulates each algorithm, and
- makes the algorithms interchangeable within that family.

　　For instance, a class that performs validation on incoming data may use the Strategy pattern to select a validation algorithm depending on the type of data, the source of the data, user choice, or other discriminating factors. These factors are not known until run-time and may require radically different validation to be performed. The validation algorithms (strategies), encapsulated separately from the validating object, may be used by other validating objects in different areas of the system (or even different systems) without code duplication.

> The Strategy design pattern solves problems like:

- How can a class use different algorithms?
- How can a class be configured with an algorithm?
- How can an algorithm be selected and exchanged at run-time?

Implementing algorithms directly within the class that requires them is inflexible because it commits the class to particular algorithms and makes it impossible to change an algorithm later independently from (without having to change) the class. This stops the class from being reusable if other algorithms are required. But Strategy Pattern makes a class independent of how an algorithm is implemented.

## ...  and on.



