public class AbstractClass {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Queen q = new Queen();
        q.moves();


    }
}

// abstract class Animal {
//     void eat(){
//         System.out.println("animal eats");

//     }
//     abstract void walk();//abstract method don't have to define implementation iske subclass compulsarily have to define this method
// }

// class Horse extends Animal{
//     void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }

// class Chicken extends Animal{
//     void walk(){
//         System.out.println("walks on 2 legs");

//     }
// }
// ~~~~~~~~~~~~~~~~


interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}













//class x-> class A -> class B
//if object of class B is called then first X constructor will call then A then B


// ~~~~~~~~~~~~~~~~~~~~~~~
//interface -> is blueprint of class
//helps in implementing multiple inheritance
//total abstraction
//interface -> implements and class -> extends
//all methods are public ,abstract and without implementation
//used to achieve total abstraction
//variables in the interface are final,public and static
//brea implements herbivore,carnivore

// ~~~~~~~~~~~~~~~~~~~~~~~~~
// static keyword -> used to share the same variable and method of a given class
//jaise school ka name for each student object will be same  static String SchoolName; if s1.schoolName = "jmv" then sout(s2.SchoolName) ->jmv
//properties,functions,blocks,nested classes (class ka main function static hein kyuki program mein ek hin main function ho)
//memory mein ek hin baar create hoga bar bar create nhi hoga
//blocks -> 
// {
//     int a = b+c;
//     sout(a)
// }


// ~~~~~~~~~~~~~~~
// super keyword - used to refer immediately parent class object
//to access parent's properties
// to access parent's function
// to access papernt's constructor

//~~~~~~~~~~~~~~~~~~~~~~~~~~
// constructor chaining h.w

