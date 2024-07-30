Factory Method Pattern: Define an interface for creating an object, but let subclasses alter the type of objects that will be created.

Flexible Object Creation: Allows the system to delegate the creation of objects to subclasses, making it easier to manage various types of educational materials or tools without modifying the core code. This supports flexibility and scalability in managing different types of educational resources or content.

**Usage**
- javac -source 1.8 -target 1.8 -d bin factory/*.java
- java -cp bin factory.FactoryMethodPatternMain.java 
