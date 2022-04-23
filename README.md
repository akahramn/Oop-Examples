# Oop-Principles

1.Encapsulation

+ We can make a class read-only or write-only: for a read-only class, we should provide only a getter method. For a write-only class, we should provide only a setter method.
+ Control over the data: we can control the data by providing logic to setter methods, just like we restricted the stock keeper from assigning negative values in the above example.
+ Data hiding: other classes can’t access private members of a class directly.

2.Inheritance
+ Code reuse: the child class inherits all instance members of the parent class.
+ You have more flexibility to change code: changing code in place is enough.
+ You can use polymorphism: method overriding requires IS-A relationship.

3.Abstraction
+ In Java, we can achieve abstraction in two ways: abstract class (0 to 100%) and interface (100%).
+ They help us use multiple inheritance in Java.
+ They provide abstraction.
+ They provide loose coupling: objects are independent from one another.
+ If you want to define potentially required methods and common code, use an abstract class. If you just want to define a required method, use an interface.

4.Polymorphism
+ Polymorphism is the ability of an object to take on many forms.
+ In Java polymorphism is mainly divided into two types:
  + Compile-time Polymorphism.
    + Method Overloading: When there are multiple functions with the same name but different parameters then these functions are said to be overloaded. Functions can be overloaded by change in the number of arguments or/and a change in the type of arguments.
  + Runtime Polymorphism
    + It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding.