public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if(age < 0) throw new IllegalArgumentException("Age cannot be negative");
        if(age > 120) throw new IllegalArgumentException("Age cannot be greater than 120");
        if(age < 18) throw new IllegalArgumentException("Age must be at least 18");
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}
