> **Notices**：If you want to read chinese `README`, please onclick [THERE](https://github.com/guobinhit/design-pattern/blob/master/README_CH.md). 

# Design Pattern

Detail design pattern and give many demos of Java.

![author](https://img.shields.io/badge/author-chariesgavin-blueviolet.svg)![last commit](https://img.shields.io/github/last-commit/guobinhit/design-pattern.svg)![issues](https://img.shields.io/github/issues/guobinhit/design-pattern.svg)![stars](https://img.shields.io/github/stars/guobinhit/design-pattern.svg)![forks](https://img.shields.io/github/forks/guobinhit/design-pattern.svg)![license](https://img.shields.io/github/license/guobinhit/design-pattern.svg)


## Index

- [Singleton](#singleton)
- [Strategy](#strategy)
- [Decorator](#decorator)
- [Observer](#observer)



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


## Decorator

The decorator pattern (also known as Wrapper, an alternative naming shared with the Adapter pattern) is a design pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. The decorator pattern is often useful for adhering to the Single Responsibility Principle, as it allows functionality to be divided between classes with unique areas of concern.

> What problems can the Decorator design pattern solve?

- Responsibilities should be added to (and removed from) an object dynamically at run-time.
- A flexible alternative to subclassing for extending functionality should be provided.


## Observer

The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.

> The Observer design pattern solves problems like:

- How can a one-to-many dependency between objects be defined without making the objects tightly coupled?
- How can one be ensured that when one object changes state an open-ended number of dependent objects are updated (synchronized) automatically?
- How can an object notify an open-ended number of other objects?



----------

**Reference**: The content of above comes from [Wikipedia](https://en.wikipedia.org/wiki/Design_pattern).
