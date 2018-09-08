package ClassObjects;


class Person {
    String name;
    String email;
    String phone;

    void walk(){
        System.out.println(name + " is walking");
    }

    void eat(){
        System.out.println(email);
    }


    void sleep(){
        System.out.println(name + " is sleeping");
    }
}

public class Demo {

    public static void main(String[] args) {

        // Instantiating an object
        Person person1 = new Person();

        // Define some properties.

        person1.name = "Joe";
        person1.email = "joe@testemail.com";
        person1.phone = "7897897894";

        // Abstraction

        person1.walk();
        person1.sleep();
        person1.eat();

        // Instantiating for a different object.

        Person person2 = new Person();

        // Define some properties.

        person2.name = "Manmohan";
        person2.email = "man@testemail.com";
        person2.phone = "8888889999";

        // Abstraction

        person2.walk();
        person2.sleep();
        person2.eat();


    }
}
