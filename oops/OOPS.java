public class OOPS {
    public static void main(String[] args) {
        // objects -> real world entities (like pen,watch,animals)
        // class  -> group of these entities

        // Pen p1 = new Pen();//created a Pen object called p1
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(6);
        // System.out.println(p1.getTip());
        
        Student s1 = new Student();
        s1.name = "hema";
        s1.roll = 18;
        // Student s2 = new Student();

        // System.out.println(s1.name);
        s1.password = "abcd";
        Student s2 = new Student(s1);
        s2.password="xyz";
        System.out.println(s2.name);


    
       
    }

}






class Pen{
     private String color;
     private int tip;

    String getColor(){
        return this.color; //this refers to current object
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}


class Student{
    String name;
    int roll;
    String password;
    //shallow copy constructor
    Student(Student s1){
        this.name=s1.name;
        this.roll=s1. roll;
        //if u take array or linkedlist then adress will be pass and changes will encounter shallow copy
    }

    Student(){
        System.out.println("constructor is called .....");
    }
   Student(String name){
    this.name = name;

   }

   
}

//encapsulation -> wrapping up of data and methods under a single unit .(this single unit is class)
//also implements data handling (using access modifiers for sensitive-> private /default/protected)

//constructor -> which is invoked automatically at the time of object creation
//constructors have the same name as class or structure
//constructors don't have a return type (not even void)
//constructors are only called once,at object creation
//memory allocation happens when constructor is called
//types of constructor --> parameterized , non parameterized,copy constructor
//constructor overloading (ex- polymorphism) -> same name but diff parameters (different function)
//copy constructor ->ek obj ki sare properties ko dusre obj mein copy kar dena obj2 = copy(obj1)
//shallow and deep copy~~~~~~~~~~~~~
//shallow -> refrence pass and changes will reflect
//deep -> new object / array and changes will not reflect


//Destructors -> garbage collector (jo bhi variable,array,obj program mein kahi use nhi ho rha hein to ye automatic delete kardeta hein)