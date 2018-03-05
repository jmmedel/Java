
/*
Java - Object and Classes
Java is an Object-Oriented Language. As a language that has the Object-Oriented feature, Java supports the following fundamental concepts −

Polymorphism
Inheritance
Encapsulation
Abstraction
Classes
Objects
Instance
Method
Message Parsing
In this chapter, we will look into the concepts - Classes and Objects.

Object − Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behaviors – wagging the tail, barking, eating. An object is an instance of a class.

Class − A class can be defined as a template/blueprint that describes the behavior/state that the object of its type support.

Objects in Java
Let us now look deep into what are objects. If we consider the real-world, we can find many objects around us, cars, dogs, humans, etc. All these objects have a state and a behavior.

If we consider a dog, then its state is - name, breed, color, and the behavior is - barking, wagging the tail, running.

If you compare the software object with a real-world object, they have very similar characteristics.

Software objects also have a state and a behavior. A software object's state is stored in fields and behavior is shown via methods.

So in software development, methods operate on the internal state of an object and the object-to-object communication is done via methods.
*/

/**
 * Java_Object_and_Classes
 */
public class Java_Object_and_Classes {

// Classes in Java
/*
A class is a blueprint from which individual objects are created.

Following is a sample of a class.
Local variables − Variables defined inside methods, constructors or blocks are called local variables. The variable will be declared and initialized within the method and the variable will be destroyed when the method has completed.

Instance variables − Instance variables are variables within a class but outside any method. These variables are initialized when the class is instantiated. Instance variables can be accessed from inside any method, constructor or blocks of that particular class.

Class variables − Class variables are variables declared within a class, outside any method, with the static keyword.

A class can have any number of methods to access the value of various kinds of methods. In the above example, barking(), hungry() and sleeping() are methods.

Following are some of the important topics that need to be discussed when looking into classes of the Java Language.
*/

String bread;
int age;
String colorl;
void barking()
{

}
void hungry(){

}
void sleeping()
{
    
}
    public static void main(String[] args) {
        System.out.println("Heelo world");
    }
    
}

