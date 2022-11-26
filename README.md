The Mediator pattern enables decoupling of object by introducing a layer between so that the interaction bewtween objects happen via the layer.
In this case, instead of having a seperate method for flight and runway within the ConcreteMediator class, we define them as its own class and instead set the class itself as a private object type within the ConcreteMediator class.
Now we can differentiate the land() method depending on the class much more easily (and easier to change or add methods as well more suited for the class)
The advantage of this pattern limits subclassing. A mediator localizes behavior that otherwise be distributed among several objects. Changing this behavior requires subclassing Mediator only, Colleague classes can be reused as is.
The disadvantage of this pattern centralizes control. The mediator pattern trades complexity of interaction for complexity in the mediator. Because the mediator encapsulates protocols, it can become more complex than any
individual colleague.
