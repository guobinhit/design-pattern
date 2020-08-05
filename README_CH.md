> **Notices**：If you want to read english `README`, please onclick [THERE](https://github.com/guobinhit/design-pattern/blob/master/README.md). 

# 设计模式

详细介绍了设计模式，并给出了大量的 Java 示例。

![author](https://img.shields.io/badge/author-chariesgavin-blueviolet.svg)![last commit](https://img.shields.io/github/last-commit/guobinhit/design-pattern.svg)![issues](https://img.shields.io/github/issues/guobinhit/design-pattern.svg)![stars](https://img.shields.io/github/stars/guobinhit/design-pattern.svg)![forks](https://img.shields.io/github/forks/guobinhit/design-pattern.svg)![license](https://img.shields.io/github/license/guobinhit/design-pattern.svg)


## 索引

- [单例模式](#单例模式)
- [装饰模式](#装饰模式)
- [观察者模式](#观察者模式)
- [代理模式](#代理模式)




## 单例模式

单例模式是一种软件设计模式，它将类的实例化限制为一个对象。当只需要一个对象来协调整个系统的操作时，这很有用。这个概念有时被推广到只有一个对象存在时操作更高效的系统，或者将实例化限制为特定数量的对象的系统。这个术语来自于数学的单例概念。单例模式的实现必须：

- 确保只有一个单例类的实例存在；并且
- 提供对该实例的全局访问。

> 单例设计模式解决了以下问题：

- 如何确保一个类只有一个实例？
- 如何让一个类的唯一实例更容易访问？
- 如何让类控制它的实例化？
- 如何限制类的实例数量？

通常，这是通过：

- 将类的所有构造函数声明为私有；以及
- 提供一个静态方法，该方法返回对实例的引用。

实例通常存储为私有静态变量；实例是在初始化变量时，在首次调用静态方法之前的某个时刻创建的。


## 装饰模式




## 观察者模式



## 代理模式



