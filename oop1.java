public class oop1 {
    public static class Person{
        String name;
        int age;
        void sayHi(){
            System.out.println(name+" ["+age+"] says Hi!");
        }
        Person(){}
        Person(String name,int age){
            this.name=name;
            this.age=age;
        }
    }
    public static void main(String[] args){
        Person P1=new Person();
        P1.name="Harsh";
        P1.age=18;
        Person P2=new Person("Weeny",42);
       
        P1.sayHi();
        P2.sayHi();
        
        // swap(P1,P2);
        // P1.sayHi();
        // P2.sayHi();
    }
    // public static void swap(Person p1,Person p2){
    //     int age=p1.age;
    //     p1.age=p2.age;
    //     p2.age=age;
    //     p2=new Person();
    //     String name=p1.name;
    //     p1.name=p2.name;
    //     p2.name=name;
    // }
    
}
