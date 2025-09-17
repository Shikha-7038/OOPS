// 3. Create a Person class with a copy constructor that clones another person's attributes.

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(Person ref){
        this.name = ref.name;
        this.age = ref.age;
    }
    void displayDetails(){
        System.out.println("------------------------------");
        System.out.println("Name of the Person :"+name);
        System.out.println("Age of the Person :"+age);
        System.out.println("------------------------------");
    }
    public static void main(String[] args){
        Person p1 = new Person("Priya",18);
        p1.displayDetails();

        Person p2 = new Person(p1);
        p2.displayDetails();
    }
}
