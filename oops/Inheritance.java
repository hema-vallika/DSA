public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        // Dog bobby = new Dog();
        // bobby.eat();
        // bobby.legs = 4;
        // System.out.println("bobby have "+bobby.legs+" legs");
        Animal a1 = new Animal();
        a1.eat();
        Mammals m1 = new Mammals();
        m1.eat();//method override

    }
    
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

//derived class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swims in water");
//     }
// }

class Mammals extends Animal{
    int legs;
    void eat(){
        System.out.println("eats healthy things");
    }

}

class Dog extends Mammals{
    String beard;
}



//inheritance -> when properties and methods of base class are passed on to a derived class
//types of inheritance -> 1.single level inheritance 2.multi-level inheritance 3. hierarchy inheritance 4. hybrid inheritance
//1.single level inheritance --> base class -> derived class
//2.multi level inheritance ->base class -> derived class -> derieved class (ex. Animals -> mammals -> dogs)
//3.hierarchy  inheritance () -> base class -> derived class
                                                // -> derived class  

//4. Hybrid inheritance ->  combination of more than one inheritance
//java doesn't suport multiple inheritance (more than one base class and one derive class) however it can be implement through interfaces                        





// polymorphism -> trying to achieve the same thing in different ways
//types of polymorphism -> compile time/static polymorphism (method overloading) and run time /dynamic polymorphism (method overriding)
//method overloading-> same name but different parameters sum(int,int) , sum(float,float),sum(int,int,int) // parameter type or count should be different
//method overriding -> parent and child classes both contain the same function with a different defination




//package -> is a group of similar types of classes ,interfaces and sub-packages
//inbuilt packages -< Scanner class come from java.util.*
//user defined packages -< defined by user


//abstraction -> hiding all the unnecessary details and showing only the important parts to the user
//can be achieve through 1. abstaction classes 2. interfaces
//idea de dete hein lekin implementation nhi dete hein 
//abstract class A{
// }
//can't create an instance of abstract class
//can have abstract/non-abstract methods
//can have constructors
